package MayLeetCoding;

/*
LeetCode challenge for 6th May 2020. You are given a string and you have to return the index of the first non repeatinf character.
 */

class FirstUniqueCharacter {
    public static int firstUniqueChar(String s) {
        int[] cnt_arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt_arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (cnt_arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueChar(s));
    }
}