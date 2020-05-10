package MayLeetCoding;

import java.util.HashMap;
import java.util.Map.Entry;

class TownJudge {

    public static int findJudge(int N, int[][] trust) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < trust.length; i++) {
            int[] pair = trust[i];

            if (map1.containsKey(pair[1]))
                map1.replace(pair[1], map1.get(pair[1]) + 1);
            else
                map1.put(pair[1], 1);

            map2.put(pair[0], 1);
        }

        for (Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue().equals((Integer) (N - 1)) && (!map2.containsKey(entry.getKey())))
                ans = entry.getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] trust = new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };

        System.out.println(findJudge(N, trust));
    }
}