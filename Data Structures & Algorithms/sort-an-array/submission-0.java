class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
        
    }

    private void mergeSort(int[] nums, int st, int end)
    {

         if (st >= end)
            return;

        int mid = (st+end)/2;
        mergeSort(nums,st,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,st,mid,end);
    }

    private void merge(int[] arr,int l,int m,int r)
    {
         ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }


        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    
    }
}