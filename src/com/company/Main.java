package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        while (true){
            for (int i = 0; i < 5; i++) {
                try {
                    listA.add((new BufferedReader(new InputStreamReader(System.in))).readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(listA);
            for (int i = 0; i < 5; i++) {
                try {
                    listB.add((new BufferedReader(new InputStreamReader(System.in))).readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(listB);
            break;
        }
        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


        System.out.println(listC);

    }
}
