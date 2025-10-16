package com.java.company;

import java.util.*;
import java.util.stream.Collectors;

public class EPAM {

    public static void main (String[] args) {
        List<String> nameList = Arrays.asList("Apple", "cat", "bat", "lion", "deer");

//        3: (cat, bat)

        //I program  IInd about JsonArray and fetch its value
        makeLengthHashMap(nameList);

        List<Integer> li = Arrays.asList(1,2,3,4,5,6);

        makeEvenNumberSquareListUsingStream(li);


        Person p1 = new Person("Akshay", 30 );
        Person p2 = new Person("Ajay", 27 );
        Person p3 = new Person("Amruta", 27 );

        List<Person> p = Arrays.asList(p1,p2,p3);

        makeMapforSameAgeGroup(p);



    }

    public static void makeMapforSameAgeGroup(List<Person> persons)
    {
        Map<Integer,List<String> > mp = new HashMap<>();
        for(Person p : persons)
        {
            List<String> li = mp.getOrDefault(p.getAge(), new ArrayList<>());
            li.add(p.getName());
            mp.put(p.getAge(), li);
        }
        System.out.println(mp);
    }

    public static void makeLengthHashMap(List<String> nameList) {
        Map<Integer, List<String>> mp = new HashMap<>();
        for(String str : nameList)
        {
            List<String> tempList= mp.getOrDefault(str.length(), new ArrayList<>());
            tempList.add(str);
            mp.put(str.length(), tempList);
        }
        System.out.println(mp);
    }

    public static void makeEvenNumberSquareListUsingStream(List<Integer> li)
    {
       List<Integer> ansList =  li.stream()
                .filter(n -> (n%2==0))
                .map(n -> (n*n))
                .collect(Collectors.toList());

                System.out.println(ansList);
    }
}


class Person{

    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


