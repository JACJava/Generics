package com.monotonic.generics._2_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        //List<Person> madMen = new ArrayList<Person>();  //list is a generic interface, create a list of Person objects
        List<Person> madMen = new ArrayList<>();  //don't need to specify "person" in the arraylist, take it from definition

        madMen.add(peggyOlson);
        madMen.add(donDraper);

        System.out.println();
        System.out.println("*** Print out array list ***");
        System.out.println(madMen);

        // Lists auto-resize, with generic add method
        madMen.add(new Person("Bert Cooper", 100));

        // Compile Error:  add should add a Person, not some Object
        //madMen.add(new Object());

        System.out.println();
        System.out.println("*** Adding new element with autosizing ***");
        System.out.println(madMen);

        // We can query for size
        System.out.println();
        System.out.println("*** Can query information about the array list ***");
        System.out.println("Size of Array List is:  "+madMen.size());

        // We can select specific elements
        System.out.println();
        System.out.println("*** Can select specific elements of the array list ***");
        System.out.println("First Element of the Array List is:  "+madMen.get(0));
        System.out.println("Second Element of the Array List is:  "+madMen.get(1));
        System.out.println("Third Element of the Array List is:  "+madMen.get(2));


        // Lists have order, we retrieve elements by index
        System.out.println();
        System.out.println("*** Loop over the array list with int and size of array ***");
        for (int i = 0; i < madMen.size(); i++)
        {
            // Generic get method
            Person person = madMen.get(i);
            System.out.println("List item number "+i+":  "+person);
        }

        //Call iterator method over the person array list
        System.out.println();
        System.out.println("*** Loop over the array list using Iterator method ***");
        final Iterator<Person> iterator = madMen.iterator();

        int i2 = 0;
        while (iterator.hasNext()){
            final Person person = iterator.next();
            System.out.println("Person "+i2+":  "+person);
            i2++;
        }

        //Use For Each Loop
        System.out.println();
        System.out.println("*** Loop over the array list using for each loop***");

        int i3 = 0;
        for(Person person : madMen) {
            System.out.println("Person "+i3+":  "+person);
            i3++;
        }


        // Can still add duplicates though
        madMen.add(peggyOlson);
    }
}
