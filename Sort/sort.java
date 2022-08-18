import java.util.Arrays;
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
       return quickSortHelper(array,0,array.length-1);
    }
    public  static  int[] quickSortHelper(int [] array,int startIndex, int endIndex){
        if (startIndex>=endIndex){
            return array;
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
        return quickSortHelper(array,startIndex+1,rightIdx-1);

    }
    private static void swap(int [] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static int[] mergeSort(int [] array){
        if (array.length<=1){
            return array;
        }
        int middleIdx=array.length/2;


        int[] firstHalf=Arrays.copyOfRange(array,0,middleIdx);
        int[] secondHalf=Arrays.copyOfRange(array,middleIdx,array.length);
        return join(mergeSort(firstHalf),mergeSort(secondHalf));
    }
    private static int[]join(int[ ]firstHalf,int[] lastHalf){
        int [] newArray= new int[firstHalf.length+lastHalf.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<firstHalf.length && j<lastHalf.length){
            if (firstHalf[i]<=lastHalf[j]){
                newArray[k++]=firstHalf[i++];

            }else {
                newArray[k++]=lastHalf[j++];


            }
        }
        while (i<=firstHalf.length){
            newArray[k++]=firstHalf[i++];
        }
        while (i<=lastHalf.length){
            newArray[k++]=lastHalf[j++];
        }
        return newArray;
    }


}
