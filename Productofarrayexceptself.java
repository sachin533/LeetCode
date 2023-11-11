import java.util.*;

class Solution {

  public int[] productExceptSelf(int[] nums) {
    // Create an array for left products
    int[] left = new int[nums.length];
    left[0] = 1;

    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    // Create an array for right products
    int[] right = new int[nums.length];
    right[nums.length - 1] = 1;

    for (int i = nums.length - 2; i >= 0; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    // Multiply left and right products to get the final result
    int[] ans = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      ans[i] = left[i] * right[i];
    }

    return ans;
  }
}
