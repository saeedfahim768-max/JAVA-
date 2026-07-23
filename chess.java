class Solution {
    public boolean squareIsWhite(String coordinates) {

        int first = coordinates.charAt(0);
        int second = coordinates.charAt(1);

        int sum = first + second;

        if (sum % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}