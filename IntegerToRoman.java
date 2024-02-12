class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res="";
        for(int i=0;i<val.length;i++){
            if(num>=val[i]){
                int q=num/val[i];//1
                num=num%val[i];//8
                for(int j=0;j<q;j++){
                    res+=map.get(val[i]);
                }
            }
            
        }
        return res;
    }
}

/*
Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 
*/
