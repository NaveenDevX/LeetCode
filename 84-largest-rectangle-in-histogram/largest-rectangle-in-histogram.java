class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = s.peek();
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            s.pop();
        }
        
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = s.peek();
            }
            s.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            if (currArea > maxArea) {
                maxArea = currArea;
            }
        }

        return maxArea;
    }
}
