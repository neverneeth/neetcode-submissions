class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqs = new int[26];
        int maxFreq = 0;
        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            char curr = s.charAt(r);
            freqs[curr - 'A']++;
            maxFreq = Math.max(maxFreq, freqs[curr - 'A']);
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                freqs[leftChar - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}