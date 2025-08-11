package dev.demo.tests;

import dev.demo.guava.GuavaOldIO;
import org.junit.Test;
import java.io.File;
import static org.junit.Assert.*;

public class GuavaOldIOTest {
    @Test
    public void readsFile() throws Exception {
        String s = GuavaOldIO.readOrCreate(new File("g.txt"));
        assertTrue(s.length() > 0);
    }
}
