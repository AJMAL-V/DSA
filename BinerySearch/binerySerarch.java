public class binerySerarch {
    public static int bineryIter(int [] array,int target){
        int satrtIdex=0;
        int endIdex=array.length-1;
        while (satrtIdex<=endIdex){
            int middle=satrtIdex+(endIdex-satrtIdex)/2;
            if(array[middle]==target){
                return middle;
            } else if (array[middle]>target) {
                endIdex=middle-1;
            }
            else if (array[middle]<target) {
                satrtIdex=middle+1;
            }

        }
        return -1;

    }
    public  static  int bineryRecu(int [] array,int target){
       return binRecuHelp(array,target,0,array.length-1)
    }
    public  static  int binRecuHelp(int array[],int target,int startIdx,int endIdx){
        int middle=startIdx+(endIdx-startIdx)/2;

        if (startIdx>endIdx){
            return -1;
        }
        if(array[middle]==target){
            return middle;
        }
        else if (array[middle]>target) {

           return binRecuHelp(array,target,startIdx,middle-1);
          }
        else  {
          return   binRecuHelp(array,target,startIdx,middle+1);
        }


    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        System.out.println(bineryIter(array,2));
    }


}
