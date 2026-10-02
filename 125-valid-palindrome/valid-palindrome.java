class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int k=s.length();
        int i=0;
        int  j=k-1;
        if(k==0) return true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}