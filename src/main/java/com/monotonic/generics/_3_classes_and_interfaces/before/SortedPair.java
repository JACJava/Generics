package com.monotonic.generics._3_classes_and_interfaces.before;

public class SortedPair<T extends Comparable<T>> //type bounds -- compiler knows that anything we're passing is a class that implements the comparable interface
{
    private final T first;
    private final T second;

    public SortedPair(T left, T right)
    {
        if (left.compareTo(right) < 0) //if left is lower, put left in the first slot and put right in the second
        {
            first = left;
            second = right;
        }
        else //put righthand argument in first slot, then left is the second
        {
            first = right;
            second = left;
        }
    }

    public T getSecond()
    {
        return second;
    }

    public T getFirst()
    {
        return first;
    }
}
