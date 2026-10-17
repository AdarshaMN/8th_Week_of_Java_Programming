public class SelectionSort {
    
    static void slectionSort(int[] nums)
    {

        for(int i = 0; i < nums.length-1; i++)
        {
            int minValue = nums[i];
            int minIndex = 0;
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j] < minValue)
                {
                    minValue = nums[j];
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        for(int i: nums)
        {
            System.out.print(i + " ");
        }
    }

    //Insertion Sort
    static void insertionSort(int[] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key)
            {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int i: nums)
        {
            System.out.print(i + " ");
        }
    }

    static void twoPointer(int[] nums)
    {
        int i = 0;
        int j = nums.length-1;

        while(i < j)
        {
            if(nums[i] > nums[j])
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            j--;
        }
        for(int s: nums)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        int nums[] = {5,1,1,2,0,0};
        //slectionSort(nums);
        //insertionSort(nums);
        twoPointer(nums);
    }
}
