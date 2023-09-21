class infinite{

    static void searchinfinite(int arr[],int target){
        int low = 0;
        int right=1;

        while(arr[right]<target){
            low=right;
            right=right*2;
        }

        boolean b=search(arr,target);
        System.out.println(b);


    }

  static boolean search(int[] nums, int target) {

        int low=0,high=nums.length-1;
     

        while(low<=high)
        {
          int mid =(low+high)/2;
            if(nums[mid]==target)
                return true;

            if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }
        
        return false;
    }



    public static void main(String[] args) {
        int arr[] = {9,2,3,12,54,12,0,34,45,78,89,56,43} ; 
        int l=0;
        int r=arr.length-1;
        int target=100;

        searchinfinite(arr,target);
        
        
        
         
    }
}