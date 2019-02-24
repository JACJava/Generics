package com.monotonic.generics._3_classes_and_interfaces.before;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>
{
    public int compare(final Person left, final Person right)
    {
        System.out.println("In the before AgeComparator.  "+"Left is:  "+left+" and Right is:  "+right);

        return Integer.compare(left.getAge(), right.getAge()); //lowest to highest

        // return -1 * Integer.compare(left.getAge(), right.getAge()); //highest to lowest
    }
}
