package dev.demo.tests;

import dev.demo.jackson1.Jackson1Bridge;
import org.junit.Test;
import static org.junit.Assert.*;

public class Jackson1BridgeTest {
    @Test
    public void sumsValues() throws Exception {
        String json = "{\"a\": 3, \"b\": 7}";
        assertEquals(10, Jackson1Bridge.sumAB(json));
    }
}
