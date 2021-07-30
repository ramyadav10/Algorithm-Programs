package com.algorithm;

public class PrimeNumber {

   public static void main(String[] args) {
        System.out.println("Prime numbers between range of 0 - 1000 Numbers");
        primeOrNot(0, 1000);
    }

    public static void primeOrNot(int low, int high) {
        while (low < high) {
        int flag = 0;
            if (low <= 1) {
                ++low;
                continue;
            }

            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.print(low+" ");

            low++;
        }
    }
}