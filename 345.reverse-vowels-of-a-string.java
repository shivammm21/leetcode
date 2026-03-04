/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {

    private boolean isVowel(char ch){


        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;

        return false;
    } 

    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length()-1;

        StringBuilder sb = new StringBuilder(s);

        //AceCreIm
        //l
        //      r

        while(left < right){

            if(isVowel(s.charAt(left)) && isVowel(s.charAt(right))){

                sb.setCharAt(left,s.charAt(right));
                sb.setCharAt(right,s.charAt(left));

                left++;
                right--;
            }

            if(!isVowel(s.charAt(left))) left++;

            if(!isVowel(s.charAt(right))) right--;

        }

        return sb.toString();
        
    }
}
// @lc code=end

