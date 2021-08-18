package com.sunil.java8;

import com.sun.applet2.Applet2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyFunctionalInterface {
    //A method with single parameter
    public int incrementByFive(int a);

    //   }
    //  class Example {
    public static void main(String args[]) {
        // lambda expression with single parameter num
        MyFunctionalInterface f = num -> num + 5;
        int a = f.incrementByFive(22);
        System.out.println("Output is " + a);
    }
}

@FunctionalInterface
interface SampleInterface {
    public void m1();

}

/* class SampleInterface2 implements SampleInterface {
    public void m1(){
        System.out.println("Hi ! I am from m1");             // this method is not neede in functional interfaces .
    }
 }*/
class Test {

    public static void main(String a[]) {
        SampleInterface i = () -> System.out.println("HI");  // () is the argument in the parent method, if it has arguments then use (a,b)
        i.m1();

    }
}

@FunctionalInterface
interface MyInterface {
    public void add(int a, int b);
    // public void mul(int c , int d);
}

class Implementation {
    public static void main(String args[]) {
        MyInterface i = (a, b) -> System.out.println(a + b);
        i.add(10, 20);
        // if return type of add is int follow below code
        // MyInterface i = (a,b) -> (a+b);
        //int c = i.add(11,12)
        //System.out.println(c);
    }
}

/*
n -> return n*n;   - invalid . return should always encode between {}
n->{return n*n;};  - valid
n->}{n*n};  - invalid
*/

// To call Lambda Functions we should go for FunctionalInterfaces(SingleAbstract Methods)

interface DefaultInterface {

    public void method1(int x, int y);

    default void defaultMethod() {
        System.out.println("I am from default method");
    }

    static void staticMethod() {
        System.out.println("I am from Static method ");
    }

}

class DefaultMetod {

    public static void main(String args[]) {
        DefaultInterface i = (x, y) -> System.out.println(x + y);
        i.method1(30, 40);
        i.defaultMethod();
        DefaultInterface.staticMethod();

    }
}

@FunctionalInterface
interface inter {
    public void firstInterface();

    default void abstractMethod123() {
        System.out.println("default method");
    }

    static void staticMethod123() {
        System.out.println("static method ");
    }
}

class implementtation {
    public static void main(String[] args) {
        inter i = () -> System.out.println("Hello world");
        inter.staticMethod123();
        i.abstractMethod123();
    }
}

interface left{
        default void m1(){
            System.out.println("left method");
        }
}
interface right{
    default void m1(){
        System.out.println("right method");
    }
}

class Sunilxys implements left,right{
    public static void main(String[] args) {
        Sunilxys s = new Sunilxys();
        s.m1();

    }

    @Override
    public void m1() {
        left.super.m1();
        right.super.m1();
    }
}

class IndirecThreadImplementation{    // anonymmus inner class
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child");
            }
        });
            t.start();
        System.out.println("main method");
    }
}

class lamdaExp{       // lambda expression
    public static void main(String[] args) {
        new Thread(()->
        {System.out.println("New thread created");}).start();
     }
    }

class anonymusClass{  // anonymmus class
    public static void main(String[] args) {    
        new Thread(new Runnable() {
            @Override
            public void run() {

            }

    });


    }
}




class ThreadTest {

     public static void main(String[] args) {   // lambda expression
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0)
                    System.out.println("even thread" + i);
            }
        };
        Thread t = new Thread(r);
         t.start();
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                System.out.println("Odd threads" + i);
        }
    }


}

class MyThreadxyz extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println("Even threads  " + i);
        }
    }

}

class MyThread2 {
    public static void main(String[] args) {
        MyThreadxyz t = new MyThreadxyz();
        t.start();
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd theread  " + i);
            }
        }
    }
}

interface sampleInterface {
    public void firstMethod(int a);

    default int firstDefailtMethod(int a, int b) {
        return a * b;
    }

    default int secondDefaultMethod(int a, int b) {
        return a + b;
    }

    static void firstStatic(int a, int b) {
        System.out.println(a + b * a);
    }

    static void secondStatic(int a, int b) {
        System.out.println("i don know what to do");
    }
}

class MyClass {
    public static void main(String[] args) {
        sampleInterface s = (x) -> System.out.println("hello workd");
        int pr = s.firstDefailtMethod(7, 8);
        System.out.println(pr);
        int sec = s.secondDefaultMethod(7, 8);
        sampleInterface.firstStatic(7, 8);
        sampleInterface.secondStatic(5, 6);
    }
}


@FunctionalInterface
interface A {
    public void a();
}

@FunctionalInterface
        // If @FunctionInteface is defined and child class contains the same method as Parent then it is valid
        // if there is another method defined in child class with @Fi then it is not valid since it has 2 abstract methods
        //  if @Fi is not declared then its like any other method so any methods can be implemented
interface B extends A {
    public void a();
    //   public void as();
}

class Employee {
    int eno = 456;
    String EmployeeName = "Dummy";

    public Employee(int eno, String EmployeeName) {
        this.EmployeeName = EmployeeName;
        this.eno = eno;
    }
    public String getName(){
        return EmployeeName;
    }
/*    public void setName(String EmployeeName){
        this.EmployeeName = EmployeeName;

    }*/
    public String toString() {
        return eno + ":" + EmployeeName;        // by default e prints object.so u need to override object with toString method
        //  which prints output in string format.
    }

    public static void main(String arfs[]) {
        // Employee e = new Employee(123,"Sunil");
        //  System.out.println(e);   // output is Java8.Employee@1b6d3586 which isobject because of by default

        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee(2135, "sunil"));
        emp.add(new Employee(8513, "aunil"));
        emp.add(new Employee(5213, "r2454"));
        emp.add(new Employee(9816, "cunil"));
        emp.add(new Employee(2161, "dfenil"));
        emp.add(new Employee(1196, "fwrt4"));
/*Employee[] emp = {new Employee(123,"sdw"),
                  new Employee(333,"dfwdf")
                    };*/
        System.out.println("Befre Sorting" + emp);

        Collections.sort(emp, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
        System.out.println("After Sorting" + emp);
        System.out.println(emp.stream().map(Employee::getName).collect(Collectors.toSet()));

    }
}


class Person{
    String name = "";
    String id = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

   // public void setId(String id) {
        //this.id = id;
    //}

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name +":"+id;
    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("sunil","anirfwrfl"));
        person.add(new Person("adfaf","anrrfwl"));
        person.add(new Person("viosnfgw","iofr"));
        person.add(new Person("vaonfg","oerq"));
        person.add(new Person("vkanrfoer","ioerq"));
        System.out.println("Before sorting "+ person);
        Collections.sort(person,(e1,e2)->e1.getName().compareTo(e2.getName()));
        System.out.println("After srting "+ person);
        System.out.println(person.stream().map(Person::getId).collect(Collectors.toList()));
    }

}


// Example for RUN thread *******
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println("child thread");
    }

    public static void main(String a[]) {
        MyRunnable t = new MyRunnable();
        Thread r = new Thread(t);
        r.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("MainThread");
        }
    }
}

// The above code can be modified into below using functional interfaces
// U need not implement Runnable Interface , u can directly implement in run methiod
class implementingThreadWithLamda {
    public static void main(String abc[]) {
        Runnable r = () -> {
            for (int i = 0; i <= 10; i++)
                if (i % 2 == 0)
                    System.out.println("even  Threads " + i);
        };
        Runnable r2 = () -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("odd number of threads " + i);
                }
            }
        };
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        for (int i = 0; i <= 10; i++)
            System.out.println("Main Thread");

    }
}
