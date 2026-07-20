 class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                seenDigit = true;
            } else if (ch == '+' || ch == '-') {
                // Signs can only appear at the very beginning
                // or immediately after an exponent 'e'/'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (ch == 'e' || ch == 'E') {
                // Exponent is only valid if we have seen a digit before it
                // and haven't already seen an exponent
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                seenDigit = false; // Reset to ensure an integer follows the exponent
            } else if (ch == '.') {
                // A dot is only valid if we haven't seen a dot or an exponent yet
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
            Normally I can help with things like this, but I don't seem to have access to that content. You can try again or ask me for something else.