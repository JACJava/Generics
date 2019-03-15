package com.monotonic.generics._7_reflection.b_reflecting_types;

import java.util.ArrayList;
import java.util.List;

public class NonReifiableExamples<T>
{
    public static void main(String[] args)
    {
        new NonReifiableExamples<String>().main();
    }

    private void main()
    {
        // System.out.println(T.class);

        List<String> strings = new ArrayList<>();
        System.out.println(strings.getClass());
        List<Integer> integers = new ArrayList<>();
        List raw = new ArrayList();

        System.out.println(strings.getClass() == integers.getClass());
        System.out.println(raw.getClass() == integers.getClass());

        List<? extends Number> numbers = new ArrayList<>();
        System.out.println(numbers.getClass());
        System.out.println(numbers.getClass() == integers.getClass());
    }
}
