package com.lc.lc804;

import java.util.TreeSet;

public class LC_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mores = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        TreeSet<String> treeSet = new TreeSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
               String more = mores[word.charAt(i)-'a'];
               sb.append(more);
            }
            treeSet.add(sb.toString());
        }
        return treeSet.size();
    }
}
