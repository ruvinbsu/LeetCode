package com.leetcode.datastructure.twodimensionalarray;

/**
 * Created by ruvinyusubov on 02/12/2017.
 */
public class NumberofIslands_200_dfs {
    boolean[][] visited;
    int vSize;
    int hSize;

    public int numIslands(char[][] grid) {
        vSize = grid.length;

        if (vSize == 0) {
            return 0;
        }

        hSize = grid[0].length;

        visited = new boolean[vSize][hSize];
        int numOfIslands = 0;

        for (int i = 0; i < vSize; i++) {
            for (int j = 0; j < hSize; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    numOfIslands++;
                    dfs(i, j, grid);
                }
            }
        }

        return numOfIslands;
    }

    public void dfs(int i, int j, char[][] grid)
    {
        visited[i][j] = true;

        if (i + 1 < vSize && !visited[i + 1][j] && grid[i + 1][j] == '1') {
            dfs(i + 1, j, grid);
        }

        if (j + 1 < hSize && !visited[i][j + 1] && grid[i][j + 1] == '1') {
            dfs(i, j + 1, grid);
        }

        if (i - 1 >= 0 && !visited[i - 1][j] && grid[i - 1][j] == '1') {
            dfs(i - 1, j, grid);
        }

        if (j - 1 >= 0 && !visited[i][j - 1] && grid[i][j - 1] == '1') {
            dfs(i, j - 1, grid);
        }
    }
}
