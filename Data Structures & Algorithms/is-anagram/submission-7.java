class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        s = Arrays.toString(sChar);
        t = Arrays.toString(tChar);

        if(s.equals(t)){return true;}
        return false;

    }
}
