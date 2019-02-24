package com.monotonic.generics._2_collections;

import java.util.Arrays;

public class TheArrayProblem
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        Person[] madMen = { donDraper, peggyOlson };

        System.out.println(madMen);  //wow!  no easy toString implementation

        System.out.println(Arrays.toString(madMen)); //have to use static class and call toString method

        //  madMen[2] = bertCooper; Index out of bounds

        madMen = add(new Person("Bert Cooper", 100), madMen); //so create a method

        System.out.println(Arrays.toString(madMen));

        madMen = add(peggyOlson, madMen);

        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(Person person, Person[] array)
    {
        int length = array.length;
        Person[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = person;
        return newArray;
    }
}
