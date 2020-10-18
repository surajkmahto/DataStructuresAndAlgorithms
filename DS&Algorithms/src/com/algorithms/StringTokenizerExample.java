package com.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//{"name":"John", "age":31, "city":"New York"}

public class StringTokenizerExample {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> tokens = new ArrayList<>();
        String delim = ",";
        StringTokenizer st = new StringTokenizer(str, delim);
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken());
        }
        System.out.println("Tokens::" + tokens.toString());

    }
}
