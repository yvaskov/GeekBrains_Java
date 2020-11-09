package Lesson09;

import java.io.File;

public class DeleteDirectory {

    public void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] filesInDir = dir.listFiles();
            if (filesInDir == null) {
                dir.delete();
                return;
            }
            for (File file : filesInDir) {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
