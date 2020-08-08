package main.testing;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import main.GeneCounter;
import main.WordNest;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.util.HashMap;

        import static junit.framework.TestCase.*;

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

    //word = "incredible"
    //nest = "increinincrincredibleediblecredibledible"
    @Test
    public void WordNestTest(){
        WordNest tester = new WordNest();
        String word = "incredible";
        String trueNest = "increinincrincredibleediblecredibledible";
        String falseNest = "increinnincrincredibleediblecredibledible";

        assertTrue(tester.nestChecker(word, trueNest));
        assertFalse(tester.nestChecker(word, falseNest));

        word = "shape";
        falseNest = "shapshapeshapee";
        assertFalse(tester.nestChecker(word, falseNest));
    }
}
