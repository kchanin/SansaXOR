package com.chanin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases > 0){
            long altAnswer = 0;
            int num = scanner.nextInt();
            if (num % 2 != 0) {
               for (long i = 0; i < num; i++) {
                   long temp = scanner.nextLong();
                    if (i % 2 == 0) altAnswer ^= temp;
                }
            }else {
                for (int i = 0; i < num; i++){scanner.nextLong();
            }}
            System.out.println( altAnswer);
            testCases--;
        }


    }
}
