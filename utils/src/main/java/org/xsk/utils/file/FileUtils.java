package org.xsk.utils.file;

import java.io.File;
import java.io.IOException;

public class FileUtils {

    /**
     * 创建文件
     * @param path
     * @return
     */
    public static File createFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
    
}
