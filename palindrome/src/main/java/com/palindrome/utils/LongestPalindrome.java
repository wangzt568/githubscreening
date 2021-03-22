package com.palindrome.utils;

import org.springframework.stereotype.Component;

@Component
public class LongestPalindrome {

    public String searchLongestPalindrome(String s) {
        if((s == null) || (s.length() == 0)) return "";
        int maxLen = 0, index = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = extendPalindrome(s,i,i);
            int len2 = extendPalindrome(s,i,i+1);
            if(maxLen < Math.max(len1, len2)) {
                index = len1 > len2 ? i - len1 / 2 : i - len2 / 2 + 1;
                maxLen = Math.max(len1, len2);
            }
        }
        return s.substring(index, index + maxLen);
    }

    private int extendPalindrome(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - (i + 1);
    }
}
