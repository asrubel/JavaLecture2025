package khai.dict.java._03_data_types;

import khai.dict.java._02_java_intro.MyClass;

public class Main {
    public static void main(String[] args) {
        stage1();

        primitiveDataTypesExample();

        referenceDataTypesExample();

        stringDataTypeExample();

        MyClass.main(args);
    }

    public static void stage1() {
        System.out.println("My first project");
    }

    public static void primitiveDataTypesExample() {
        System.out.println("Different primitive data types");

        short num = 100;
        int num2 = num;

        int num3 = 50;
        char char1 = 'a';
        System.out.println(num3);
        System.out.println(char1);

        char char2 = (char) num3;
        System.out.println(char2);

        int num4 = (int) char2;
        System.out.println(num4);
    }

    public static void referenceDataTypesExample() {
        System.out.println("Different reference data types");

        Integer num = 100;
        int num2 = num;
        System.out.println(num.intValue());
        System.out.println(num.hashCode());
        System.out.println(num.toString());
        System.out.println(num2);

        Object obj = num;
        System.out.println(obj);
        System.out.println(obj.getClass());
    }

    public static void stringDataTypeExample() {
        System.out.println("String data type");
        String str = "Hello";
        System.out.println(str);

        str = "World";
        System.out.println(str);

        final String CONST = "CONST";
        System.out.println(CONST);

        String str2 = "Hello " + str + " -> " + CONST;
        System.out.println(str2);
    }
}
