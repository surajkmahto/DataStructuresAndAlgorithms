package TopDSQuestions;

public class SubArrayWithAGivenSum {
    public static void main(String[] args) {
        int arr[] = {23, 15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        printSubArrayIndexes(arr,sum);
    }

    private static void printSubArrayIndexes(int[] arr, int sum) {
        int curr_sum = arr[0],start =0;
        int flag = 0;
        for(int i=1;i<=arr.length;i++){
            while(curr_sum>sum){
                curr_sum = curr_sum-arr[start];
                start++;
            }

            if (curr_sum == sum)
            {
                flag = 1;
                System.out.println("Sum found between indexes " + start + " and " + (i-1));
            }
            if(i<arr.length)
                curr_sum = curr_sum+arr[i];

        }
        if(flag==0){
            System.out.println("No SubArray Found");
        }
    }
}
