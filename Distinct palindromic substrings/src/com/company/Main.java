package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> generatedSubStr = new ArrayList<>();


        for(int i=0;i<input.length();i++){
            for(int j=input.length();j>i;j--){
                generatedSubStr.add(input.substring(i,j));
            }
        }

        for (String s : generatedSubStr) {
            if(checkIfPalindrome(s)){
                System.out.println(s);
            }
        }
    }

    private static boolean checkIfPalindrome(String s){
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        return s.compareTo(String.valueOf(b)) == 0;
    }
}
