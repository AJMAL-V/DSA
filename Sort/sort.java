public class sort {
    public  static  int[] insertionSort(int array[]){
        for (int i=1;i<=array.length-1;i++){
            int current=array[i];
            int j=i-1;
          while (j>0 && array[j]>current){
              array[j+1]=array[j];
              j=j-1;
          }
          array[j+1]=current;
        }
        return array;
    }
    public static int[] quickSort(int array[]){
        quickSortHelper(array,0,array.length-1);
    }
    public  static  int[] quickSortHelper(int [] array,int startIndex, int endIndex){
        if (startIndex>=endIndex){
            return;
        }
        int pivotIdx=startIndex;
        int leftIdx=startIndex+1;
        int rightIdx=endIndex;
        while (leftIdx<=rightIdx){
            if (array[leftIdx]>array[pivotIdx] && array[rightIdx]<array[pivotIdx]){
                 swap(array,leftIdx,rightIdx);
                 leftIdx++;
                 rightIdx--;
            }
            if (array[leftIdx]<=array[pivotIdx]){
                leftIdx++;
            }
            if (array[rightIdx]<=array[pivotIdx]){
                rightIdx--;
            }
        }
        swap(array,rightIdx,leftIdx);
        quickSortHelper(array,startIndex+1,rightIdx-1)
    }
    private static void swap(int [] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {

    }
}
