class Solution {
    
    public int[][] solution(int[][] arr1, int[][] arr2)
    {
        int r1 = arr1.length;
        int r2 = arr2.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;

        int[][] answer = new int[r1][c2]; // 예) 3x2 2x2 행렬이면 2개의 값을 가진 3개의 행렬이 나옴
        
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                for (int k = 0; k < c1; k++)
                {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
