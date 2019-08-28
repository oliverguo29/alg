class _771JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        int sum=0;
        char[] jew = J.toCharArray();
        char[] stone = S.toCharArray();

        for(int i=0;i<stone.length;i++){
            for(int j=0;j<jew.length;j++){
                if(stone[i]==jew[j]){
                    sum++;
                }
            }
        }

        return sum;
    }
}