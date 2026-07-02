class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char a : s.toCharArray()) {
            freq[a - 97]++;
        }
        for (char b : t.toCharArray()) {
            freq[b - 97]--;
        }

        for (int i = 0 ; i < 26 ; i++) {
            if (freq[i] != 0) return false;
        }

        return true;
    }
}
