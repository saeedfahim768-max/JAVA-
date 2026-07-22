class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        
        // Count how many uppercase letters are in the string
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitals++;
            }
        }

        // Case 1: All letters are capitals (e.g., "USA")
        if (capitals == word.length()) return true;

        // Case 2: All letters are lowercase (e.g., "leetcode")
        if (capitals == 0) return true;

        // Case 3: Only the first letter is capital (e.g., "Google")
        if (capitals == 1 && Character.isUpperCase(word.charAt(0))) return true;

        // Otherwise, capital usage is invalid (e.g., "FlaG")
        return false;
    }
}