package com.monotonic.generics._6_compatibility.a_raw_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode
{
    public static void main(String[] args)
    {
        //"client" code dependent on list code
        System.out.println("*** Client code dependent on list code ***");
        List list2 = new ArrayList();
        list2.add("abc");
        list2.add(1);
        list2.add(new Object());

        //Pre-java5 when generics were added
        Iterator iterator2 = list2.iterator();
        while(iterator2.hasNext()){
            final Object element = iterator2.next();
            System.out.println("Element of List2 is:  "+element);
        }

        //"client" code dependent on list code
        System.out.println("*** Added <Object> ***");
        List<Object> list3 = new ArrayList();
        list3.add("abc");
        list3.add(1);
        list3.add(new Object());

        //Pre-java5 when generics were added
        Iterator iterator3 = list3.iterator();
        while(iterator3.hasNext()){
            final Object element = iterator3.next();
            System.out.println("Element of List3 is:  "+element);
        }

        //raw types lets strings in there...unsafe scenarios
        System.out.println("*** Added <String> ***");

        //gives ClassCastException  -- raw type to non-raw type
        List<String> strings4 = list2;

        for (String elem : strings4){
            System.out.print("Element of Strings4 is:  "+elem);
        }

        //Pre-java5 when generics were added
        Iterator iterator4 = strings4.iterator();
        while(iterator4.hasNext()){
            final Object element = iterator4.next();
            System.out.println("Element of Strings4 (again) is:  "+element);
        }


        /*
        List<Object> values = new ArrayList();
        values.add("abc");
        values.add(1);
        values.add(new Object());

        List rawtype = values;
        List<String> strings = rawtype;

        for(String element : strings)
        {
            System.out.println(element);
        }

        Iterator iterator = values.iterator();
        while (iterator.hasNext())
        {
            Object element = iterator.next();
            System.out.println(element);
        }

        */
    }
}
