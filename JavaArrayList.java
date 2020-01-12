package com.hackerrank.JavaChallenges.JavaChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        ArrayList[] list = new ArrayList[20002];



        //create the number n arrays
        for(int i = 0; i < n; i++) {
            list[i] = new ArrayList();
            int d = scr.nextInt();

            for(int j = 1; j<=d; j++) {
                int val = scr.nextInt();
                list[i].add(val);
            }
        }
        int q = scr.nextInt();

        for(int i = 1; i<=q; i++) {
            int x,y;
            x = scr.nextInt();
            y = scr.nextInt();
            try {
                System.out.println(list[x].get(y-1));
            } catch (Exception e)
            {
                System.out.println("Error!");
            }
        }

    }
}
