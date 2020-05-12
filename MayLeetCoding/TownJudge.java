import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/*

There is an array containing numbers 1 to N. There is one town judge in these people. There is exactly one judge.
The judge trusts no one.
Everyone trusts the judge.
There is exactly one judge.

The trust array contains pairs [a, b] which means that person a trusts person b.
Find the judge and return the number. If not possible, or there is no judge, return -1.

*/
class TownJudge {

    public static int findJudge(int N, int[][] trust) {
        /*
         * HashMap<Integer, Integer> map1 = new HashMap<>(); HashMap<Integer, Integer>
         * map2 = new HashMap<>(); int ans = -1; for (int i = 0; i < trust.length; i++)
         * { int[] pair = trust[i];
         * 
         * if (map1.containsKey(pair[1])) map1.replace(pair[1], map1.get(pair[1]) + 1);
         * else map1.put(pair[1], 1);
         * 
         * map2.put(pair[0], 1); }
         * 
         * for (Entry<Integer, Integer> entry : map1.entrySet()) { if
         * (entry.getValue().equals((Integer) (N - 1)) &&
         * (!map2.containsKey(entry.getKey()))) ans = entry.getKey(); }
         * 
         * return ans;
         */

        // Alternate solution without using HashMap
        int[] count = new int[N];
        int[] trusted = new int[N];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];

            count[a - 1]++;
            trusted[b - 1]++;
        }

        System.out.println(Arrays.toString((count)));
        System.out.println(Arrays.toString(trusted));

        for (int i = 0; i < N; i++)
            if (count[i] == 0 && trusted[i] == N - 1)
                return i + 1;

        return -1;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] trust = new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };

        System.out.println(findJudge(N, trust));
    }
}