package com.example.controller;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class test{

    protected void method1(){
        System.out.println("abc");
    }



    /*public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        oddeven(list, n-> n%2==0);

        List<String> lists = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
        System.out.println("before " + lists);
        shorting(lists);
    }*/

    /*private static void oddeven(List<Integer> list, Predicate<Integer> predicate){

        for (Integer in : list){
            if (predicate.test(in)){
                System.out.println("even : "+in);
            }else {
                System.out.println("odd : " + in);
            }
        }
    }*/


   /* private static void shorting(List<String> stringList){

        List<String> sorted =  stringList.stream().sorted().collect(Collectors.toList());

        System.out.println("sorted --" + sorted);
    }*/



}