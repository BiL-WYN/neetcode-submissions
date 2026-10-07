class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sStr = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sStr.containsKey(s.charAt(i))) {
                sStr.put(s.charAt(i), 1);
            } else {
                sStr.put(s.charAt(i), sStr.get(s.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> tStr = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!tStr.containsKey(t.charAt(i))) {
                tStr.put(t.charAt(i), 1);
            } else {
                tStr.put(t.charAt(i), tStr.get(t.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : sStr.entrySet()) {
            if (!entry.getValue().equals(tStr.get(entry.getKey()))) {
                return false;
            }
        }

        return true;





    }
}
