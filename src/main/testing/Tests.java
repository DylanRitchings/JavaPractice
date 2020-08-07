package main.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.GeneCounter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Tests {
    @Test
    public void GeneCounterTest(){
        GeneCounter tester = new GeneCounter();
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("A",6);
        baseMap.put("T",4);
        baseMap.put("G",5);
        baseMap.put("C",7);
        assertEquals(baseMap, tester.geneCount("ATCGAACCGTACGGCATGCTCA"));
    }
}
