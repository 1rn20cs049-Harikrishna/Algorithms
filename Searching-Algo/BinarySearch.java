class BinarySearch {
  //nums is an sorted array(ascending)
    public int search(int[] nums, int target) { //method to search the target element
        int first = 0; //starting index of an array 
        int last = nums.length-1;  // last index of an array
      
        while(first <= last){
            int mid = (first+last)/2; //finding middle index of an array

            if( nums[mid] == target){
                return mid; //if target element is present in an given array it returns the index of that element 
            } else if(nums[mid] < target){
                first = mid+1;
            } else{
                last = mid-1;
            }
        }
        return -1; //return -1 if target element not present in the given array
    }
}

/* Time complexity 
  Average Case Time Complexity of Binary Search is O(logn).
  Worst Case Time Complexity of Binary Search is O(logn).
  Best Case Time Complexity of Binary Search is O(1).
 */
  
