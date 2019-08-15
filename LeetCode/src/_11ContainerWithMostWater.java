class _11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int area=0;
        int h;
        int width;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                width= j-i;
                h=Math.min(height[i],height[j]);
                area= width*h;
                max=Math.max(max,area);
            }

        }


        return max;
    }
}