package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] A={"bella","label","roller"};
        List<String> r = new ArrayList<>();
        HashMap<Character, Integer> hmind = new HashMap<>();
        HashMap<Character, Integer> hmall = new HashMap<Character, Integer>();

        for (int i = 0; i < A.length; i++) {
            char[] chars=A[i].toCharArray();
            for (char c: chars ) {
                if (hmind.containsKey(c)) {
                    hmind.put(c, hmind.get(c) + 1);
                }else {
                    hmind.put(c, 1);
                }
            }
            if (i == 0) {
                hmall = (HashMap) hmind.clone();
            } else {
                for (char c:hmall.keySet()) {
                    if (hmind.containsKey(c)) {
                        hmall.put(c, Math.min(hmind.get(c), hmall.get(c)));
                    } else {
                        hmall.put(c,0);
                    }
                }
            }
            hmind.clear();

        }



        for (char c:hmall.keySet() ) {
            for (int i = 0; i < hmall.get(c); i++) {
                r.add(String.valueOf(c));
            }
            System.out.println(c + ":" + hmall.get(c));
        }
        for (String c:r  ) {
            System.out.println(c);
        }

    }
}
