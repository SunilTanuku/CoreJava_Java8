package com.sunil.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class ForEach {
public static void main(String a[]) {

    List<String> elements = new ArrayList<String>();
    elements.add("1");
    elements.add("2");
    elements.add("3");
    elements.add("4");
    elements.forEach(e -> System.out.println(e));

    List<Integer> myList = Arrays.asList(2,334,545,234,6454,343);
  //  myList.stream().filter(e->e%2 == 0).collect(Collectors.toList());
   // myList.stream().filter(e->e%3==0).forEach(System.out::println);
  //  List<Integer> m = myList.stream().map(e->e*2).collect(Collectors.toList());
    //System.out.println(m);

}
}
