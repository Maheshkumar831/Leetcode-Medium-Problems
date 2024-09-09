class Solution {
    public String convert(String s, int numRows) {
        int n=numRows;
        Character arr[][]=new Character[n][s.length()];
        int row=0;
        int col=0;
        int curr=0;
       
        while(curr<s.length()){
            while(row<n&&curr<s.length()){
                arr[row++][col]=s.charAt(curr++);

            }
            col++;
            row=Math.max(0,row-2);
            while(row>0&&curr<s.length()){
                arr[row--][col++]=s.charAt(curr++);
            }
        }
      //System.out.println(Arrays.deepToString(arr));
       String str="";
        for(int i=0;i<n;i++){
            for(int j=0;j<s.length();j++){
                if(arr[i][j]!=null)
                    str+=arr[i][j];
            }
        }
        System.out.println(str);
        return str;






    }
}
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
*/
