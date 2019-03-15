package com.monotonic.generics._7_reflection.b_reflecting_types;

import java.util.ArrayList;
import java.util.List;

public class ReifiableExamples
{
    public static void main(String[] args)
    {
        System.out.println("int class is:  "+int.class);

        System.out.println("String class is:  "+String.class);

        List<?> wildcards = new ArrayList<>();
        System.out.println("Wildcards class is:  "+wildcards.getClass());

        List raw = new ArrayList();
        System.out.println("Class is:  "+raw.getClass());

        System.out.println(raw.getClass() == wildcards.getClass());

        System.out.println(int[].class);
        System.out.println(List[].class);
    }
}
