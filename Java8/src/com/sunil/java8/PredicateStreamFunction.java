package com.sunil.java8;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import javax.jnlp.IntegrationService;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// predicate returns boolean .it is functional interface which accepts arguments and returns boolean
// usually it is applied in filter for collection of objects

//methods are Predicate in filter'
// Predicate.and()
//Predicate.or()
//Predicate.negate()
//Predicate.test()
//Predicate in chaining
//Predicate in Object
//Predicate FucntionalInterface contains only one method that is Test()

public class PredicateStreamFunction {
    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> finalList = list.stream().filter(e -> e > 5).collect(Collectors.toList());
        System.out.println("Just Stream " + finalList);

        List<Integer> list2 = Arrays.asList( 3,2,4,1,55,65,1,7);
        List<Integer> myList = list2.stream().sorted((i1,i2)->i1>i2?1:i1<i2?-1:0).collect(Collectors.toList());
        List<Integer> myList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> myList3 = list2.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        Integer myList4 = list2.stream().sorted().max((i1,i2)->-i1.compareTo(i2)).get();
        List<Integer> mylist5 = list2.stream().distinct().collect(Collectors.toList());
        long mylist6 = list2.stream().distinct().count();

        Integer[] i55 =list2.stream().toArray(Integer[]::new); // conveting list for array
        Stream.of(i55).forEach(System.out::println);
        System.out.println("disinct "+mylist5);
        System.out.println(myList4);
        Stream<String> s =  Stream.of("1","2","3","4","5","6","6");
        List<String> myEven;
       // myEven = s.map(e->e%2 == 0).sorted().collect(Collectors.toList());
         myEven= s.sorted((i1,i2)->i1.compareTo(i2)).distinct().filter(e->e.equals("3")).collect(Collectors.toList());
        System.out.println("soreted string  "+ myEven);
        String s2 = "abc";
         s2.concat("xys");
         System.out.println(s2);
         List<String> flatMaplist = Arrays.asList("sunil durga dutt","tata comsutamce servoce",";ooking for job");
        List<String> finalFlat =  flatMaplist.stream().flatMap((String x)->{
            String[] arr = x.split(" ");                    // one to many relation u can write complex logic inside
            return Arrays.asList(arr).stream();

        }).collect(Collectors.toList());


        //complex flat map

        List<String> words = Arrays.asList("JavaDevJournal","Java");
    /*  Stream<String> id = words.stream().map(e->e.split("")).flatMap(Arrays::stream).distinct().sorted();
        System.out.println(id);*/
       List<String> id =  words.stream().flatMap((String se)->{
                    String[] splits = se.split("");
                    return Arrays.asList(splits).stream();
                }).distinct().collect(Collectors.toList());
        System.out.println("id ===== "+id);
        List<Integer> xlist = Arrays.asList(21,34,1,56,8,45,4,3);
        System.out.println(xlist.size());
        System.out.println(xlist.get(0));
        Integer myInt = xlist.stream().min((i1,i2)->i1.compareTo(i2)).get();  // min returns first value and max returns the last value ;
        System.out.println("Minimum value is "+myInt);
        Optional<Integer> findFirst  = xlist.stream().sorted().skip(xlist.size()-2).findFirst();
        System.out.println("second lrgest "+findFirst);



        System.out.println("My soreted list "+ myList);
        Predicate<Integer> predicate = x -> x > 5;
        long predicateList = list.parallelStream().filter(predicate).count();
        //collect(Collectors.toList());
        System.out.println("filterList is -- " + predicateList);

        Predicate<Integer> p1 = x -> x > 4;
        Predicate<Integer> p2 = y -> y < 8;
        List<Integer> andList = list.stream().filter(p1.and(p2)).collect(Collectors.toList());
        System.out.println("andOrList is -- " + andList);

        Predicate<Integer> negateCheck = x -> x > 4;
        List<Integer> negateList = list.stream().filter(negateCheck.negate()).collect(Collectors.toList());
        System.out.println("negateList is -- " + negateList);

        List<Integer> squareList = list.parallelStream().map(x -> x * x).filter(p -> p > 25).collect(Collectors.toList());
        System.out.println("squareList is -- " + squareList);
// parellel stream is faster than stream .By default compiler opts for stream'

        //Test Check
        Predicate<Integer> pt = i -> i % 2 == 0;
        System.out.println(pt.test(10));
        System.out.println(pt.test(11));
        Predicate<String> st = si -> si.length() > 5;
        System.out.println(st.test("Sunil"));

//You are given a input and asked to perform operation and the output may not be boolean
//then go for Funtion

//THe default method in Function is apply
 //           ip      rt
    Function<Integer,Integer> f = i->i*i;
    System.out.println(f.apply(5));
    System.out.println(f.apply(4));

    Function<String,Integer> f2 = i->i.length();
    System.out.println(f2.apply("SUNILDURGADUTT"));
    Function<Integer,Integer> f3 = i->i*3;
        System.out.println(f3.apply(9));



    }
}

class Student{
    String name = "";
    int marks = 0;
    String grade = "";
    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
/*    public String toString(){
        return name +":"+grade;
    }*/
    public static void main(String a[]){
        Function<Student,String> st = i->{
            String grade = "";
            if(i.marks>80) return grade= "Dist";
            else if(i.marks>70) return grade = "A";
            else if(i.marks >60) return grade = "B";
            else  grade= "FAIL";
            return grade;
        };

        ArrayList<Student> s2 = new ArrayList<>();
                                  s2.add(new Student("abc",80));
                                  s2.add(new Student("xyz",60));    // if u are using array list use toString method since it displays object type
                                  s2.add(new Student("asd",20));    // if it is string array u need not use toString

        System.out.println("Names of students "+s2.stream().map(Student::getName).collect(Collectors.toList()));
/*Student[] s2 = {new Student("abc",80),
};
         for(Student s3 : s2){
            System.out.println(s3.name);
            System.out.println(s3.grade);
            System.out.println(st.apply(s3));
        }*/

    }
}

/* class Consumer{
    public static void main(String a[]){
        Consumer s= p->s. System.out.println(p);
        s.accept("Hi");
        s.
     }
 }*/
