package com.monotonic.generics._2_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        // Generic Type with two type parameters
        // Want to look up Mad Man characters by name

        // generic put method - parameterized by both key and value
        Map<String, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);

        //Print out unique element
        System.out.println();
        System.out.println("*** Print unique element in madMen Hashmap ***");
        System.out.println(madMen);

        //Look up the name
        System.out.println();
        System.out.println("*** Look up that name ***");
        System.out.println(madMen.get("Don Draper"));

        // overwrite previous entry!
        madMen.put(donDraper.getName(), peggyOlson);

        //Look up the name -- shows Peggy!
        System.out.println();
        System.out.println("*** Look up that name ***");
        System.out.println(madMen.get("Don Draper"));

        //But we don't want to do that, so put everything back correctly
        System.out.println();
        System.out.println("*** But we don't want to do that, so put everything back correctly ***");
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyOlson.getName(), peggyOlson);
        madMen.put(bertCooper.getName(), bertCooper);
        System.out.println(madMen);

        //Use For Each Loop
        System.out.println();
        System.out.println("*** Iterate over the map with .keyset() and print out the name ***");

        int i = 0;
        for(String name : madMen.keySet()) {
            System.out.println("Person "+i+":  "+name);
            i++;
        }

        //Use For Each Loop with values, which returns the collection
        System.out.println();
        System.out.println("*** Iterate over the map with .values() and print out the object values ***");

        int i2 = 0;
        for(Person person : madMen.values()) {
            System.out.println("Person "+i2+":  "+person);
            i2++;
        }

        //Maybe you want both!
        System.out.println();
        System.out.println("*** Iterate over the map and print out names and values with .entrySet() ***");

        int i3 = 0;
        for(Map.Entry<String, Person> entry : madMen.entrySet()) {
            System.out.println("Person "+i3+":  "+entry);
            i3++;
        }

        //Get the name and the value
        System.out.println();
        System.out.println("*** Iterate over the map and print out names and values separately with .getKey() and .getValue() ***");

        int i4 = 0;
        for(Map.Entry<String, Person> entry : madMen.entrySet()) {
            System.out.println("Person Key "+i4+":  "+entry.getKey());
            System.out.println("Person Value "+i4+":  "+entry.getValue());
            i4++;
        }

    }
}
