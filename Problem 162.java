// 162. Find Peak Element

class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        int low = 0, high = l;

        if(l==1)
            return 0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid-1>=0 && mid+1<l){
                if(nums[mid]>nums[mid-1] && nums[mid]> nums[mid+1])
                    return mid;
                else if(nums[mid+1]>nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            if(mid-1<0){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }

            if(mid+1>=l){
                if(nums[mid] > nums[mid-1]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return 0;
    }
}

//beata 100% runtime