public class contiginiousSumArr {

    public  static int sbarrsum(int [] arr){
        int maxSum=0;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+= arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum =0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int []arr ={1,2,3,4,-1,3};
        int sbarrsum = sbarrsum(arr);
        System.out.println(sbarrsum);
    }
}
