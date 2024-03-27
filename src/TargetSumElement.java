public class TargetSumElement {


    public static int[] getTargetSum(int [] arr,int[] range){
        int length= arr.length;
        int target=range[1];
        int [] result=new int [3];
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        result[0]=arr[i];
                        result[1]=arr[j];
                        result[2]=arr[k];
                        break;
                    }
                }

            }

        }
        System.out.println(result);
        return result;


    }

    public static void main(String[] args) {
        int [] arr={8,2,4,5,1};
        int [] target ={7,11};
        int[] targetSum = getTargetSum(arr,
                target);
        for (int i =0 ; i<targetSum.length;i++){
            System.out.println(targetSum[i]);
        }
    }
}
