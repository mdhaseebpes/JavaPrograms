package DataStructure;

//https://leetcode.com/problems/number-of-islands/

class Solution24 {
    
    void dfs(char[][] grid, int i, int j)
    {
        int n = grid.length;
        int m = grid[0].length;
        
        if(i>=n || i<0 || j>=m || j<0 || grid[i][j]!='1')
        {
            return;
        }
        
        grid[i][j] = '2';
        
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
    
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return count;
        
    }
}