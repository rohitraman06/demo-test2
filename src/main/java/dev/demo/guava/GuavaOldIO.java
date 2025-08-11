package dev.demo.guava;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class GuavaOldIO {
    public static String readOrCreate(File file) throws IOException {
        if (!file.exists()) {
            Files.write("default content", file, Charset.forName("UTF-8"));
        }
        return Files.toString(file, Charset.forName("UTF-8"));
    }
}
