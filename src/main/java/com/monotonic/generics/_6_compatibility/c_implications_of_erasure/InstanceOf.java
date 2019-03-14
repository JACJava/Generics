package com.monotonic.generics._6_compatibility.c_implications_of_erasure;

public class InstanceOf<T>
{
    public boolean equals(Object o)
    {
        // Banned
        if (o instanceof InstanceOf/*<T>*/)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println(new InstanceOf<>() instanceof Object);
    }


}
