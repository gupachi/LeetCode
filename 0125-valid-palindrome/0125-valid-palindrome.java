class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        if(s == null){
            return false;
        }
        while(start <= end){
        char chead = s.charAt(start);
        char cEnd = s.charAt(end);
        if (!Character.isLetterOrDigit(chead)) {
        		start++;
        	} else if(!Character.isLetterOrDigit(cEnd)) {
        		end--;
        	} else {
if (Character.toLowerCase(chead) != Character.toLowerCase(cEnd)) {
        			return false;
        		}
        		start++;
                end--;
        	}
        }
        
     return true;
    }
}
