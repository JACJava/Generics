package com.monotonic.generics._3_classes_and_interfaces.before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples
{

    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        System.out.println();
        System.out.println("*** Print out array list BEFORE Sorting by Age ***");
        System.out.println(madMen);
        System.out.println();

        System.out.println("*** Sort by Age ***");
        Collections.sort(madMen, new AgeComparator());

        System.out.println();
        System.out.println("*** Print out array list AFTER Sorting by Age ***");
        System.out.println(madMen);

        System.out.println();
        System.out.println("*** Sort by Age in Reverse by using ReverseComparator ***");
        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));

        System.out.println();
        System.out.println("*** Print out array list AFTER Sorting by Age in Reverse ***");
        System.out.println(madMen);


        /*
        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));

        System.out.println(madMen);

        */
    }

}
