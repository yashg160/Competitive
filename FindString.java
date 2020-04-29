
public class FindString {
    /**
     * Return the index of the first occurrence of needle in haystack, or -1 if
     * needle is not part of haystack.
     * 
     * 
     */
    public static void main(String[] args) {
        String needle = "ll";
        String haystack = "hello";
        int index = 0;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String subseq = haystack.substring(i, i + needle.length());
            if (needle.equals(subseq)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}