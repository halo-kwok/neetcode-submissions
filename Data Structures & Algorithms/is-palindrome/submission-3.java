class Solution {
    public boolean isPalindrome(String s) {
        // two pointers
        int l = 0;
        int r = s.length() - 1;
        // could copy string and turn it all lowercase lol
        String newString = s.toLowerCase();
        boolean anyAlphaNum = false;
        for (int i = 0; i < newString.length(); i++) {
            if (isAlphanum(newString.charAt(i))) {anyAlphaNum = true; break;}
        }
        if(anyAlphaNum == false) {return true;}
        while (l < r) {
            // skip over char, increase l and decrease r if not alphnum
            // skip before comparing
            while (!(isAlphanum(newString.charAt(l))) || !(isAlphanum(newString.charAt(r)))) {
                if (isAlphanum(newString.charAt(l))== false) {l++; }
                if (!(isAlphanum(newString.charAt(r)))) {r--;}
            }
            // if left and right letters are unequal, return false immediately
            if (newString.charAt(l) != newString.charAt(r)) {return false;}
            //ensure that pointers converge
            l++;
            r--;
        }
        return true;
    }
    public static boolean isAlphanum(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
           (ch >= 'A' && ch <= 'Z') || 
           (ch >= '0' && ch <= '9');
    }
}
