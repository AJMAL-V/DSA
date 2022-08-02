import java.util.HashSet;
import java.util.Set;

public class dsa_array {
    public static void main(String arg[]){
        int array[]={1,6,2,6,6,6,3};
        int target=6;
         numberchange(array,target);


    }
    public  static void twoNumberSum(int [] array,int target){
//        time=n*n space=1
         for(int i=0;i<array.length;i++){
             for(int j=i+1;j<array.length;j++){
                 if(array[i]+array[j]==target){
                     System.out.println(
                             array[i]+"+"+array[j]+"="+target
                     );
                 }
             }
         }
    }
    public static  void sum(int arr[],int target){
//        time=n space=n
        Set<Integer> nums=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int match=target-num;
            if(nums.contains(match)){
                System.out.println(match+" "+num);
            }else {
                nums.add(num);
            }
        }
    }
    public static  void numberchange(int arr[],int target){
        int j=arr.length-1;
        for(int i=0;i<j-1;i++){
            if(arr[i]==target){
                    int temp;
                    if(arr[j]==target){
                        temp=arr[i];
                        arr[i]=arr[j-1];
                        arr[j-1]=temp;

                    }else {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }
                    j--;

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
