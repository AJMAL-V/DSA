public class dsa_array {
    public static void main(String arg[]){
        int array[]={1,2,3,4,5,6,7,8,9};
        int target=10;
        twoNumberSum(array,target);


    }
    public  static void twoNumberSum(int [] array,int target){
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
}
