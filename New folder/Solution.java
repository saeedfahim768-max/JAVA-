class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        long reversed = 0; // Use long to safely handle potential integer overflow

        // Reverse the entire number
        while (x > 0) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x /= 10;
        }

        // Check if the completely reversed number matches the original input
        return original == reversed;
    }
}