package com.monotonic.generics._4_methods;

import java.util.ArrayList;
import java.util.Comparator;
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

        // have to cast this as a Person cuz it just resturns Object
        final Person youngestCastMember2 =
                (Person) min2(madMen, new AgeComparator());

        System.out.println();
        System.out.println("*** With min2 method ***");
        System.out.println(youngestCastMember2);

        final Person youngestCastMember = min(madMen, new AgeComparator());

        System.out.println();
        System.out.println("*** With min method ***");
        System.out.println(youngestCastMember);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println();
        System.out.println("*** Now min with Integers ***");

        //did this one myself!!!!
        final int minNum = min(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        System.out.println(minNum);

        //code from tutorial:
        System.out.println();
        System.out.println("*** Now min with Integers Using Tutorial Code ***");
        System.out.println(min(numbers, Integer::compare));

    }


    // write min in the generic way -- by name (string) or age (integer)

    public static Object min2(List values, Comparator comparator) {
        if (values.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        // then loop over the list of values and incrementally find the lowest element
        // then return lowest element
        Object lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++){
            final Object element = values.get(i);

            if (comparator.compare(element, lowestElement) < 0){
                lowestElement = element;
            }
        }
        return lowestElement;
    }


    public static <T> T min(List<T> values, Comparator<T> comparator)
    {
        if (values.isEmpty())
        {
            throw new IllegalArgumentException("Unable to find the minimum of an empty list");
        }

        T lowestFound = values.get(0);

        for (int i = 1; i < values.size(); i++)
        {
            final T element = values.get(i);
            if (comparator.compare(element, lowestFound) < 0)
            {
                lowestFound = element;
            }
        }

        return lowestFound;
    }

}
