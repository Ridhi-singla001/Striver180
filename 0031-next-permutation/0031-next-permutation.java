class Solution {
    public void nextPermutation(int[] nums) {
    int n = nums.length;
    
    // Step 1: Find the break point
    int ind = -1; // Break point
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            ind = i; // Index i is the break point
            break;
        }
    }

    // If the break point does not exist
    if (ind == -1) {
        // Reverse the whole array
        reverseArray(nums, 0, n - 1);
        return;
    }

    // Step 2: Find the next greater element and swap it with nums[ind]
    for (int i = n - 1; i > ind; i--) {
        if (nums[i] > nums[ind]) {
            swap(nums, i, ind);
            break;
        }
    }

    // Step 3: Reverse the right half
    reverseArray(nums, ind + 1, n - 1);
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

private void reverseArray(int[] nums, int start, int end) {
    while (start < end) {
        swap(nums, start, end);
        start++;
        end--;
    }
}

}