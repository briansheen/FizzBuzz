package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int n = 15;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n){
        List<String> solution = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            if(i%3==0 && i%5!=0){
                solution.add("Fizz");
            } else if(i%5==0 && i%3!=0){
                solution.add("Buzz");
            } else if(i%5==0 && i%3==0){
                solution.add("FizzBuzz");
            } else {
                solution.add(Integer.toString(i));
            }
        }
        return solution;
    }
}
