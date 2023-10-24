class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       //transpose
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n/2;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[i][n-j-1];
               matrix[i][n-j-1]=temp;
           }
       }
       
       
    }
}
       
       
 /*int start=0;  //it's also worked.
       int end=n-1;
       while(start<end){
           for(int i=0;i<n;i++){
               int temp=matrix[i][start];
               matrix[i][start]=matrix[i][end];
               matrix[i][end]=temp;
               
           }
           start++;
           end--;
        }      
       
       
Optimal approach    
       
1 2 3
4 5 6
7 8 9

transpose
1 4 7
2 5 8
3 6 9

swap
t=00=1
00=02=7
02=t=1
7 4 1
8 5 2
9 6 3   


You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 
 -----------------------------------------------------------------------------------      
    Brute force approach-does not work this problem becaz this problem required print the  same array.   
       int n=matrix.length;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][n-1-i]=matrix[i][j];
            
            }

            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[j][n-1-i];
            }

            
        }
       
        //System.out.println(Arrays.deepToString(arr));
        
        
    }
}

[0][0]=[0][2]        [1][0]=[0][1]      [2][0]=[0][0]
[0][1]=[1][2]        [1][1]=[1][1]      [2][1]=[1][0]
[0][2]=[2][2]        [1][2]=[2][1]      [2][2]=[2][0]*/
