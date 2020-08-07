package main;

import java.util.HashMap;


public class GeneCounter {
    /***
     * Counts number of nitrogenous bases in string that represents a gene
     * @param dna
     * @return Number of nitrogenous bases in HashMap
     */
    public HashMap<String, Integer> geneCount(String dna) {
        //A, T, G, C = nitrogenous bases
        HashMap<String, Integer> baseMap = new HashMap<>();
        for (int i = 0; i < dna.length(); i++) {
            String c = String.valueOf(dna.charAt(i));
            int count = baseMap.getOrDefault(c, 0);
            baseMap.put(c, count + 1);
        }
        mapPrint(baseMap);
        return baseMap;
    }
    public void mapPrint(HashMap<String, Integer> baseMap){
        System.out.printf("A: %d, T: %d, G: %d, C: %d." ,baseMap.get("A"),baseMap.get("T"),baseMap.get("G"),baseMap.get("C"));
    }
}
