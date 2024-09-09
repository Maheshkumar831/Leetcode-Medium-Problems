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
