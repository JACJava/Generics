package com.monotonic.generics._2_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen2 = new ArrayList<>();  //don't need to specify "person" in the arraylist, take it from definition

        madMen2.add(donDraper);
        madMen2.add(peggyOlson);
        madMen2.add(donDraper); //duplicate

        //Use For Each Loop
        System.out.println();
        System.out.println("*** Loop over the array list using for each loop (shows duplicates) ***");

        int i1 = 0;
        for(Person person : madMen2) {
            System.out.println("Person "+i1+":  "+person);
            i1++;
        }

        //Sets only allow unique items
        Set<Person> madMen = new HashSet<>();

        // add elements in the same way as a List
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(donDraper); //duplicate

        //Use For Each Loop
        System.out.println();
        System.out.println("*** Loop over the hash set using for each loop (does not show duplicates) ***");

        int i2 = 0;
        for(Person person : madMen) {
            System.out.println("Person "+i2+":  "+person);
            i2++;
        }

        // madMen.get(0) compile error -- there is not get

        // check to see what's in the set
        System.out.println();
        System.out.println("*** See what's in the set ***");
        System.out.println("Don is in the set? " + madMen.contains(donDraper));
        System.out.println("Bert is in the set? " + madMen.contains(bertCooper));

    }
}
