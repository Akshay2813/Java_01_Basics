package com.java.basics.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnBasicMap {

    public static void main(String[] args) {

        Map<String, Integer> tempMap_1 = new HashMap<>();
        tempMap_1.put("E", 100);
        tempMap_1.put("A", 200);
        tempMap_1.put("D", 300);
        tempMap_1.put("C", 400);
        tempMap_1.put("B", 500);
        System.out.println(tempMap_1);  //{A=200, B=500, C=400, D=300, E=100}


        Map<String, Integer> tempMap_2 = new TreeMap<>();
        tempMap_2.put("E", 100);
        tempMap_2.put("A", 200);
        tempMap_2.put("D", 300);
        tempMap_2.put("C", 400);
        tempMap_2.put("B", 500);
        System.out.println(tempMap_2);  //{A=200, B=500, C=400, D=300, E=100}

        Map<String, Integer> tempMap_3 = new LinkedHashMap<>();
        tempMap_3.put("E", 100);
        tempMap_3.put("A", 200);
        tempMap_3.put("D", 300);
        tempMap_3.put("C", 400);
        tempMap_3.put("B", 500);
        System.out.println(tempMap_3);  //{E=100, A=200, D=300, C=400, B=500}


        for (Map.Entry<String, Integer> m : tempMap_1.entrySet()) {
            System.out.println("Key = " + m.getKey() + "--" + "value = " + m.getValue());
        }
        for (String s1 : tempMap_1.keySet()) {
            System.out.println(s1);
        }
        for (Integer v1 : tempMap_1.values()) {
            System.out.println(v1);
        }
    }


}
