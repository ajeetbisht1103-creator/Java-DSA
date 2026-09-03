class MaxConsecutiveOnes{
    public static int MaxConsecutiveOnes(int[] arr){
    int count1=0;
    int max=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1)
        {
            count1++;
        }
        else
        {
            count1=0;
        }
        max=Math.max(count1,max);
    }
    return max;
    }
}
public class MaxConsecutiveOnes{
    public static void main(String [] args){
        int[] arr={1, 1, 0, 1, 1, 1};
        System.out.println(MaxConsecutiveOnes(arr));
    }
}
