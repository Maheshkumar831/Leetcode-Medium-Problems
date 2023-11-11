class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;
        String temp="";
        String res="";
        while(left<=right){            //dry run
            char ch=s.charAt(left);//t
            if(ch!=' '){
                temp+=ch;//the,sky
            }
            else if(ch ==' '){
                if(!res.equals("")){
                res=temp+" "+res;//the,sky the,is sky the,blue is sky the
            }
                else{
                    res+=temp;//the
                }
                temp="";
            }
            left++;
        }
        if(!temp.equals("")){
            if(!res.equals(" ")){
                res=temp+" "+res;
            }
            else{
                res+=temp;
            }
        }
        res=res.replaceAll(" +"," ");
        return res.trim();
    }
}

 -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  
       String str[]=s.split("\\s");             //TC:O(N)    SC:O(N)
       int n=str.length;
       String str2="";
       for(int i=n-1;i>=0;i--){
           str2+=str[i]+" ";
       }
       str2=str2.replaceAll(" +"," ");
       return str2.trim();
        
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
       Stack<String>st=new Stack<>();     //Using stack           //TC:O(N)    SC:O(N)
        s+=" ";
        int n=s.length();
        String str="";
        String res="";
        for(int i=0;i<n;i++){
            if(s.charAt(i) ==' '){
                st.push(str);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        while(st.size()!=1){
            res+=st.peek()+" ";
            st.pop();
        }
        res+=st.peek();
        res=res.replaceAll(" +"," ");
        return res.trim();
---------------------------------------------------------------------------------------------------------------------------------------
  /*
  Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 
  */
        
