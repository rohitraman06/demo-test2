package dev.demo.jackson1;

import org.codehaus.jackson.map.ObjectMapper;
import java.util.Map;

public class Jackson1Bridge {
    public static int sumAB(String json) throws Exception {
        ObjectMapper m = new ObjectMapper();
        Map<?,?> map = m.readValue(json, Map.class);
        int a = Integer.parseInt(map.get("a").toString());
        int b = Integer.parseInt(map.get("b").toString());
        return a + b;
    }
}
