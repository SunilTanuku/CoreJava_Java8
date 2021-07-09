package com.sunil.java8;

import java.util.Optional;

 // used to deal with null pointer exception
public class  MyOptional {
    public static void main(String a[]){
        String[] str = new String[10];
        System.out.println(str[1]);
        Optional checkNull = Optional.ofNullable(str[1]);
        System.out.println(checkNull);
        //isPresent checks for any content inside.if it has any content returns true else false
        // in this case isPresent returns false
        if(checkNull.isPresent()){
            System.out.println("Checknull is not null");
        }else {
            System.out.println("CheckNull is null");
        }
     }

}
