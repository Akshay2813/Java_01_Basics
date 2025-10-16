//package com.java.basics.revision;
//
//import java.util.*;
//
//public class R6_listMap {
//
//    public static void main(String[] args)
//    {
//
//        List<Integer> li = new ArrayList<>(2);
//
//      li.add(100);
//      li.add(200);
//        li.set(0,10);
//        li.set(1,20);
//        for(int i=0; i<li.size();i++)
//        {
//            System.out.println(li.get(i));
//        }
////        li.set(0,10);
////        li.set(1,20);
//
//        //Arr to lIst
//        Integer[] arr= {100,200,300, 400};
//        List<Integer> li1= Arrays.asList(arr);
//
//        //List to arr
//
//        Integer[] arr1 = li.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(arr1));
//
//
//        Map<String,Integer> mp = new HashMap<>();
//        mp.put("Akshay", 30);
//        mp.put("Ammtua", 27);
//        mp.put("Ajay", 28);
//
//        for(Map.Entry<String,Integer> e : mp.entrySet())
//        {
//            System.out.println( e.getKey() +"::" + e.getValue());
//        }
//
//        for(String s: mp.keySet())
//        {
//            System.out.println(s + "::" + mp.get(s));
//        }
//
////        for(Integer i : mp.values())
////        {
////            System.out.println(mp.get(i) +"::" + i);
////        }
//
//        String s="122";
//        Integer i = Integer.valueOf(s);  //string to ewarpper
//        int i = Integer.parseInt(s); // string to primitive
//
//
//        int i1=1000;
//        String s= Integer.toString(i1);
//        Integer i2 = 1000;
//        int i4 = i2.intValue();
//
//    }
//}
