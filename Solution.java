class Solution {
    public String largestOddNumber(String num) {
        char max = '0';
        String s="";
//condition 
        if(num.charAt(num.length()-1) % 2 != 0)
        return num;
        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i) % 2 != 0) {
                    if (num.charAt(i) > max) {
                        max = num.charAt(i);
                    }
            }
          
            s = String.valueOf(max);
        }
         
        return s;
    }
}
