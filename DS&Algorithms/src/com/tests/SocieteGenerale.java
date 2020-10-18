package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Set;

public class SocieteGenerale {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t,n,m,query;
        t=Integer.parseInt(bufferedReader.readLine());
        while(t-- > 0){
            Set<Integer> finalSet = new TreeSet<>();
            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            n = Integer.parseInt(stringTokenizer.nextToken());
            m = Integer.parseInt(stringTokenizer.nextToken());
            StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine());
            while(n-- > 0){
                setA.add(Integer.parseInt(stringTokenizer2.nextToken()));
            }
            StringTokenizer stringTokenizer3 = new StringTokenizer(bufferedReader.readLine());
            while(m-- > 0){
                setB.add(Integer.parseInt(stringTokenizer3.nextToken()));
            }
            query=Integer.parseInt(bufferedReader.readLine());
            switch (query){
                case 1:
                    finalSet.addAll(setA);
                    finalSet.retainAll(setB);
                    break;

                case 2:
                    finalSet.addAll(setA);
                    finalSet.addAll(setB);
                    break;

                case 3:
                    finalSet.addAll(setA);
                    finalSet.addAll(setB);
                    setA.retainAll(setB);
                    finalSet.removeAll(setA);
                    break;

                case 4:
                    finalSet.addAll(setA);
                    finalSet.removeAll(setB);
                    break;

                case 5:
                    finalSet.addAll(setB);
                    finalSet.removeAll(setA);
                    break;

                default:
                    break;
            }
            String ans= finalSet.toString();
            System.out.println("{" + ans.substring(1,ans.length()-1) + "}");
        }
    }
}
