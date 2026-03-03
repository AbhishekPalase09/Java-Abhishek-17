import java.util.*;

class Solution {
    public int reverse(int x) {
       
        int result = 0;
        while(x !=0){
            int digit = x%10;
             result = result *10 + digit;
            x = x/10;
        
        }
        return result;
    }
}
