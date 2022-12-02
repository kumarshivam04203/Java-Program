public class Arrays1{
    public static int search(int nums[], int target){
        //search min element
        int min=minSearch(nums);
        if(nums[min]<=target && target<= nums[nums.length-1]){
            return search(nums,min, nums.length-1, target);
        }else{
            return search(nums,0, min, target);
        }
    }
    //binary search find target, left and right
    public static int search(int nums[], int left, int right, int target){
        int l= left;
        int r= right;

        while(l<=r){
            int mid = 1+(r-1)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static int minSearch(int nums[]){
        int left=0;
        int right=nums.length-1;
        
        while(left<right){
            int mid= left+(right+left)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if(nums[left]<=nums[mid] && nums[mid]>nums[right]){
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,5,4,6,8};
        //for(int i=0; i<nums.length; i++){
        System.out.print(search(nums, 0, nums.length, 2));
       // }
       
    }
}