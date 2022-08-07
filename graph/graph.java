import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class graph {
    private Map<Integer, List<Integer>> map=new HashMap<>();
         private  void  addVertex(Integer data){
             map.put(data,new ArrayList<>());
         }
    public void  insert(Integer vertex,Integer edge, boolean isBidirection){
        if (!map.containsKey(vertex)){
              addVertex(vertex);
        }
        if (!map.containsKey(edge)){
            addVertex(edge);
        }
        map.get(vertex).add(edge);
        if (isBidirection){
            map.get(edge).add(vertex);
        }
    }
    public  void  display(){
             for (Integer x:map.keySet()){
                 System.out.print(x+" : ");
                 for (Integer y:map.get(x)){
                     System.out.print(y+" ");
                 }
                 System.out.println();
             }
    }

    public static void main(String[] args) {
        graph graph=new graph();
        graph.insert(3,4,true);
        graph.display();
    }
}
