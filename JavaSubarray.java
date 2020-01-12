package com.hackerrank.JavaChallenges.JavaChallenges;

//Give a number of n integers, find and print its number of negative subarrays on a new line

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // n is a lenght of an array
        int n = scr.nextInt();
        // Step1: populate the nums array with scanner input
        int[] nums = new int[n];
        for(int i = 0; i <n; i++) {
            nums[i] = scr.nextInt();
        }
        scr.close();

        // counter for negative sums
        int counter = 0;
        //Step2:find subarrays of nums array
        // outer loop to find starting point
        for(int i = 0; i < n; i++) {
            //middle loop to find end point
            for(int j = i; j < n; j++) {
                //sum of elems in subarrray
                int sum = 0;
                //inner loop to select elements form i to j
                for(int k =i; k <=j; k++ ) {
                    //Step3; if the sum of nums in subarray is negative, increase the counter
                    sum += nums[k];
                }
                    if(sum < 0) {
                        counter++;

                }
            }
        }
        //Step4: print out the counter
        System.out.println(counter);


    }
}
