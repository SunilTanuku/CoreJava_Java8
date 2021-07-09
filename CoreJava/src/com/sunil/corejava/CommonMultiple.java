package com.sunil.corejava;

import java.util.*;
public class CommonMultiple {

    public void commonMultiple(){

        Scanner c = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = c.nextInt();
        System.out.println("Enter second number");
        int b = c.nextInt();
        int count =0;
        for(int i=1;i<10;i++){
            if(a%i == 0 && b%i == 0){
                count++;
                System.out.println("Common factors for "+a+ " and "+ b + "are"+ i);
            }

        }
        System.out.println("And count is "+count);

    }

public static void main(String a[]){
    CommonMultiple cm = new CommonMultiple();
    cm.commonMultiple();
}

}
