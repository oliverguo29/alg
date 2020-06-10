class _9_isPalindrome {
    public boolean isPalindrome(int x) {
        String  sb = new StringBuilder(x + "").reverse().toString();
        return  (x+"").equals(sb);
    }
}