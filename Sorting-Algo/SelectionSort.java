class SelectionSort {
    public int[] sortArray(int[] nums) {
      
        int n = nums.length; //length of an array
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(nums[j] < nums[minIndex] ){ //Finding smallest element
                    minIndex = j;  //finding the index of smallest element with respect to a[i] element
                } 
            }
            int temp = nums[minIndex]; //Swapping 
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums; //After sorting returing the sorted array
             
    }
}
/* Time Complexity
Best case time complexity is O(n^2)
Average case time complexity is O(n^2)
Worst case time complexity is O(n^2)
*/
