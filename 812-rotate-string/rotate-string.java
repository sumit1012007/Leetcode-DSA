class Solution {
    public static boolean rotateString(String str, String goal) {

        if (str.length() != goal.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {

            if (sb.toString().equals(goal)) {
                return true;
            }

            char ch = sb.charAt(0);

            sb.deleteCharAt(0);

            sb.append(ch);
        }

        return false;
    }
}