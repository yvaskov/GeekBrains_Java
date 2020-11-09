package Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SequenceCount {

    public int sequenceCount(Path path, String sequence) throws IOException {

        BufferedReader reader = Files.newBufferedReader(path);
        StringBuilder str = new StringBuilder();
        int count = 0;
        int readChar;
        while ((readChar = reader.read()) != -1) {
            if (str.length() < sequence.length()) {
                str.append((char) readChar);
                continue;
            }
            if (str.toString().equals(sequence)) {
                count++;
            }
            str.deleteCharAt(0);
            str.append((char) readChar);
        }
        if (str.toString().equals(sequence)) {
            count++;
        }
        return count;
    }
}
