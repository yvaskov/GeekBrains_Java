package Lesson09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class JoinFiles {

    public void joinTextFiles(Path dir, Path toFile) throws IOException {
        Files.createFile(toFile);
        BufferedWriter writer = Files.newBufferedWriter(toFile, StandardCharsets.UTF_8);
        for (File file : dir.toFile().listFiles()) {
            if (!file.isDirectory()) {
                Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8).transferTo(writer);
            }
        writer.close();
        }
    }
}
