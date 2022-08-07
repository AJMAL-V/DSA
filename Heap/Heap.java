import java.lang.reflect.Array;
import java.util.*;

public class Heap {
    List<Integer> heap=new ArrayList<>();
    public  Heap(){

    }
    public Heap(List<Integer> array){
        buildHeap(array);

    }
    private void buildHeap(List<Integer> array){
        heap=array;
        for (int i=parent(heap.size()-1);i>=0;i--){
            ShiftDown(i);
        }

    }
    private  void  ShiftDown(int currentIndex){
        int endIndex=heap.size()-1;
        int leftIndex=leftChild(currentIndex);
        while (leftIndex<=endIndex){
            int rightIndex=rightChild(currentIndex);
            int idxToShift;
            if (rightIndex<=endIndex && heap.get(rightIndex)<heap.get(leftIndex)){
                idxToShift=rightIndex;
            }else {
                idxToShift=leftIndex;
            }
            if (heap.get(currentIndex)>heap.get(idxToShift)){
                Collections.swap(heap,currentIndex,idxToShift);

                currentIndex=idxToShift;
                leftIndex=leftChild(currentIndex);

            }else{
                return;
            }
        }


    }
    private  void  shiftUp(int currentindex){
        int parentindex=parent(currentindex);
        while (currentindex>0 &&heap.get(parentindex)>heap.get(currentindex) ){
            Collections.swap(heap,currentindex,parentindex);
            currentindex=parentindex;
            parentindex=parent(currentindex);
        }

    }
    public int peek(){
        return  heap.get(0);

    }
    public void remove(){
        Collections.swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        ShiftDown(0);


    }
    private void insert(int value){
        heap.add(value);
        shiftUp(heap.size()-1);

    }
    private int parent(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return (i*2)+1;

    }
    private int rightChild(int i){
        return (i*2)+2;
    }
    public void dispay(){
        for (int i=0;i<heap.size();i++){
            System.out.println(heap.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>(Arrays.asList(2,1,2));
        Heap heap=new Heap(array);
    }
}
