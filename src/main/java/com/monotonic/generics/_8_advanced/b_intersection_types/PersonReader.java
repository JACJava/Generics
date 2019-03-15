package com.monotonic.generics._8_advanced.b_intersection_types;

import com.monotonic.generics._8_advanced.Person;

import java.io.*;

public class PersonReader
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PersonReader reader = new PersonReader();

        DataInputStream stream = new DataInputStream(new FileInputStream(
            "src/main/resources/person"));
        Person person = reader.read(stream);
        System.out.println(person);

        RandomAccessFile randomAccessFile = new RandomAccessFile(
            "src/main/resources/person", "rw");
        person = reader.read(randomAccessFile);
        System.out.println(person);
    }

    public <T extends DataInput & Closeable> Person read(final T source)
    {
        try(T input = source)
        {
            return new Person(input.readUTF(), input.readInt());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
