public class CheckStraightLine {

    /*
     * You are given a set of coordinates, as a 2d array. Find whether the points
     * lie on the same line. I used the simple formula for the slope of a line to
     * chec whether the points lie on the same line or not.
     */

    public static double findSlope(int[] set1, int[] set2) {
        return ((double) set1[1] - (double) set2[1]) / ((double) set1[0] - (double) set2[0]);
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2)
            return true;

        int n = coordinates.length;
        double slope = findSlope(coordinates[0], coordinates[1]);

        for (int i = 1; i <= n - 2; i++) {
            if (slope != findSlope(coordinates[i], coordinates[i + 1]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = new int[][] { { -4, -3 }, { 1, 0 }, { 3, -1 }, { 0, -1 } };

        System.out.println(checkStraightLine(coordinates));
    }
}