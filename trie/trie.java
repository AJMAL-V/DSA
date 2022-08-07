import java.util.HashMap;
import java.util.Map;

public class trie {
    static class trieNode{
        Map<Character,trieNode> children=new HashMap<>();

    }
      trieNode root=new trieNode();
    char endSymbol='*';
        public trie(String str){
            populateSuffixTrie(str);
        }
        public  void  populateSuffixTrie(String str){
            for (int i=0;i<str.length();i++){
                insertSubstring(i,str);
            }
        }
        public void  insertSubstring(int i,String str){
            trieNode node=root;
            char letter=str.charAt(0);
             for (int j=i;j<str.length();j++){
                 if (!node.children.containsKey(letter)){
                     trieNode newnode= new trieNode();
                     node.children.put(letter,newnode);
                 }
                  node=   node.children.get(letter);

             }
             node.children.put(endSymbol,null);
    }
    public boolean contains(String str){
            trieNode node=root;
            for (int i=0;i<=str.length();i++){
                char letter=str.charAt(i);
                if (!node.children.containsKey(letter)) {
                    return false;
                }
                 node=node.children.get(letter);
                }
            return  node.children.containsKey(endSymbol);
    }

    public static void main(String[] args) {
        trie Trie=new trie("manna");
        System.out.println( Trie.contains("manna"));


    }
}
