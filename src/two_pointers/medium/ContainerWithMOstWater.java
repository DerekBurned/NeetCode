package two_pointers.medium;

public class ContainerWithMOstWater {
    public static void main(String[] args) {
      int [] heights =   {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }

    public static  int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, best = 0;
        while (l < r) {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            best = Math.max(best, area);
            if (heights[l] <= heights[r]) l++;
            else r--;
        }
        return best;
    }
}
