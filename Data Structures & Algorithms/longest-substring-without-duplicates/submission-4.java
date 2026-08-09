class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>(); //track letters seen already
        // dynamic sliding window
        int l = 0, maxLength = 0;
        // edge cases
        if(s.length() == 0) {return 0;}
        if(s.length() == 1) {return 1;}
        // add first char to hash
        seen.add(s.charAt(0));
        for (int r = 1; r < s.length(); r++) {
            // check if right character is duplicate, increment l if yes
            while ((seen.contains(s.charAt(r)))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1); // ensure + 1 to length
        }
        return maxLength;
    }
}
