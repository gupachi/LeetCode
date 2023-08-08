class Solution {
    public String finalString(String s) {
     StringBuffer ns = new StringBuffer();
    
     for(char c : s.toCharArray()) { 
     if( c == 'i'){
        ns.reverse(); 
     }
     else{
        ns.append(c);
     }
    }
        return ns.toString();
}
}