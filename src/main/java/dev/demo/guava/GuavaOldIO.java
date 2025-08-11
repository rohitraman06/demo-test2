package dev.demo.guava;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class GuavaOldIO {
    public static String readOrCreate(File file) throws IOException {
        if (!file.exists()) {
            Files.asCharSink(file, Charset.forName("UTF-8")).write("default content");
        }
        return Files.asCharSource(file, Charset.forName("UTF-8")).read();
    }
}