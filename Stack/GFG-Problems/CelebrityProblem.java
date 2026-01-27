public class CelebrityProblem {
    public static int checkCelebrity(int[][] matrix) {
        int n = matrix.length; // num of rows in matrix

        int[] indegree = new int[n];
        int[] outdegree = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = matrix[i][j];

                outdegree[i] += x;
                indegree[j] += x;
            }
        }

        for (int a = 0; a < n; a++) {
            if (indegree[a] == n && outdegree[a] == 1) {
                return a;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 }
        };
        int result = checkCelebrity(matrix);
        System.out.println("Celebrity is at index: " + result);
    }
}