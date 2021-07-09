package com.sunil.java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyPractiseInterface {
    public int FI1(int a);

    // public void FI2();
    public static void main(String a[]) {
        MyPractiseInterface i = n -> n + 5;
        int a1 = i.FI1(50);
        System.out.println(a1);
    }
}

@FunctionalInterface
interface MyPractiseInterface2 {
    void fi2();

    public static void main(String[] args) {
        MyPractiseInterface2 pi = () -> System.out.println("Hellooo");

    }
}

@FunctionalInterface
interface MyINterface3 {
    int interface3(int a, int b);

    public static void main(String argss[]) {
        MyINterface3 intr = (int a, int b) -> a + b;
        int x = intr.interface3(10, 20);

    }
}

class EmployeeTest {


    int eno = 456;
    String name = "Sunil";

    public EmployeeTest(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    public String toString() {
        return eno + " : " + name;
    }

    public static void main(String argsf[]) {

        String sunil = "sunil";
        String sunil2 = "sunil";
        String sunil3 = sunil;
         sunil = "abc";
        System.out.println(sunil3);
        System.out.println(sunil3 == sunil2);
        System.out.println(sunil3.equals(sunil2));
        //    ArrayList<Employee> emp = new ArrayList<Employee>();
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(2135, "sunil"));
        emp.add(new Employee(8513, "aunil"));
        emp.add(new Employee(5213, "r2454"));
        emp.add(new Employee(9816, "cunil"));
        emp.add(new Employee(2161, "dfenil"));
        emp.add(new Employee(1196, "fwrt4"));
        System.out.println("Before Sorting" + emp);
        Collections.sort(emp, (e1, e2) -> (e1.eno > e2.eno) ? 1 : (e1.eno < e2.eno) ? 1 : 0);
        emp.stream().map(e->e.EmployeeName).collect(Collectors.toList());
        System.out.println("After srorting " + emp);

    }
}

class   FIThread {
    public static void main(String args[]) {
        Runnable r = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("run thread ======");
            }
        };
        Thread tr = new Thread(r);
        tr.start();
    }

}

interface LeftTest {
    default void m1() {
        System.out.println("am from left m1 method");
    }
    void m2();
}

interface RightTest {
    default void m1() {
        System.out.println("am from default right method");
    }
    void m2();
}

class SampleTest implements LeftTest, RightTest {
    public static void main(String sunil[]) {
        SampleTest st = new SampleTest();
        st.m1();
    }

    @Override
    public void m1() {
        LeftTest.super.m1();
        RightTest.super.m1();
    }

    @Override
    public void m2() {

    }
}

interface myInterface {
    void m1();

    void m2();

    public static void main(String argss[]) {
        Runnable r = () -> {

        };

    }
}


interface methodReference {

    void m2();
}

class methodReferenceImplementation implements methodReference {
    public void m2() {
        System.out.println("Implemented m2 method");
    }

    static void m1() {
        System.out.println("Im from mi method");
    }

    public static void main(String oo[]) {
        methodReference mr = methodReferenceImplementation::m1;
        mr.m2();
    }
}

class forEach {
    public void each() {
        ArrayList<String> emp = new ArrayList<>();
        emp.add("1");
        emp.add("2");
        emp.add("3");
        emp.forEach(e -> System.out.println(e));
    }

    public static void main(String arr[]) {
        forEach e = new forEach();
        e.each();
    }

}

class Predicate123 {
    public void myPredicate() {
        //   List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 67, 8, 9, 9, 0);
        List<Integer> elements = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            elements.add(i);
        }
        //Predicate p = x ->x>5;
        Predicate<Integer> predicate = x -> x > 5;
        Predicate<Integer> predicate2 = y -> y < 10;

        List<Integer> filteredList = elements.stream().filter(predicate.negate()).collect(Collectors.toList());
        List<Integer> filteredListStream = elements.parallelStream().filter(predicate.and(predicate2)).collect(Collectors.toList());
        List<Integer> mapFilter = elements.stream().map(e -> e * e).filter(predicate2).collect(Collectors.toList());
        System.out.println("filtered list with stream " + filteredList);
        System.out.println("paralel stream  " + filteredListStream);
        System.out.println("map " + mapFilter);
        Predicate<Integer> test = i -> i % 2 == 0;
        System.out.println("test is " + test.test(10));

    }

    public static void main(String argg[]) {
        Predicate123 p = new Predicate123();
        p.myPredicate();
    }
}

/*
class FunctionTest{
    Function<Integer,Integer> fan =t->t*t;

    fan.apply

    f.apply(10);
    Function<String,Integer> str = s->s.length();
    str.apply("snil");

}*/
class OPtionalCheck {
    void OptionalCHeck() {
        List<Integer> elements = Arrays.asList(1, 2, 3);
        Optional checkNull = Optional.ofNullable(elements.get(5));
        if (checkNull.isPresent()) {
            System.out.println("PResent");
        } else {
            System.out.println("not present");
        }
    }

    public static void main(String aaaaa[]) {
        OPtionalCheck op = new OPtionalCheck();
        op.OptionalCHeck();
    }
}