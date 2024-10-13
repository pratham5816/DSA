package javaDSAfreeCodeCamp.Graph;

public class numberofIslands {

    public int numIslands(char[][] grid){
        int noOfislands = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m;m++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid , i , j , visited);
                    noOfislands++;
                }
            }
        }

        return noOfislands;
    }

    public void dfs(char[][] grid , int row , int col , boolean[][] visited){
        if(row < 0 || col < 0 || row > grid.length || col > grid[0].length || visited[row][col] || grid[row][col] == '0'){
            return;
        }

        visited[row][col] = true;
        dfs(grid , row , col - 1 , visited);
        dfs(grid , row + 1, col , visited);
        dfs(grid , row , col + 1, visited);
        dfs(grid , row - 1 , col , visited);
    }
}
