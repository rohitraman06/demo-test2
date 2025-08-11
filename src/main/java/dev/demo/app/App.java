package dev.demo.app;

import dev.demo.jackson1.Jackson1Bridge;
import dev.demo.guava.GuavaOldIO;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        String json = "{\"a\": 5, \"b\": 10}";
        int sum = Jackson1Bridge.sumAB(json);
        System.out.println("Sum from Jackson1: " + sum);
        String data = GuavaOldIO.readOrCreate(new File("example.txt"));
        System.out.println("File content: " + data);
    }
}
