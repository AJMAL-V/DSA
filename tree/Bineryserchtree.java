public class Bineryserchtree {
   static class  Node{
        int data;
        Node left,right;

        public  Node(int item){
            data=item;
        }
    }
    Node root;
   public  void insert(int data){
       Node curentnode=root;
       if (curentnode==null){
           root=new Node(data);
           return;
       }
       while (true){
           if (data<curentnode.data){
               if (curentnode.left==null){
                   curentnode.left=new Node(data);
                   break;
               }else {
                   curentnode=curentnode.left;
               }

           }else {
               if (curentnode.right==null){
                   curentnode.right=new Node(data);
                   break;
               }else {
                   curentnode=curentnode.right;
               }

           }
       }
   }
   public  boolean contains(int data){
       Node curentnode=root;
       while (curentnode!=null){
           if (data<curentnode.data){
               curentnode=curentnode.left;
           }else if(data>curentnode.data) {
              curentnode=curentnode.right;
           }else {
               return true;
           }
       }
       return false;

   }
   public void remove(int data){
       removeHelper(data,root,null);

   }
   private void  removeHelper(int data, Node currentnode,Node parentNode){
       while (currentnode!=null){
           if (data<currentnode.data){
               parentNode=currentnode;
               currentnode=currentnode.left;
           } else if (data>currentnode.data) {
               parentNode=currentnode;
               currentnode=currentnode.right;
               
           }else {
               if (currentnode.left!=null && currentnode.right!=null){
                 currentnode.data=    getMinValue(currentnode.right);
                 removeHelper(currentnode.data,currentnode.right,currentnode);
               }        else {
                   if (parentNode==null){
                       if (currentnode.right==null){
                           root=currentnode.left;
                       }else {
                           root=currentnode.right;
                       }
                   }else {
                       if (parentNode.left==currentnode){
                           if (currentnode.right==null){
                               parentNode.left=currentnode.left;
                           }else{
                               parentNode.left=currentnode.right;
                           }
                       }else {
                           if (currentnode.right==null){
                               parentNode.right=currentnode.left;
                           }else{
                               parentNode.right=currentnode.right;
                           }
                       }
                   }
               }
               break;
           }

       }
   }
   public  int getMinValue(Node curentNode){
       if (curentNode.left==null){
           return  curentNode.data;
       }else {
         return   getMinValue(curentNode.left);
       }
   }
   public void inOrder(){
         inOrderHelper(root);
   }
    public void inOrderHelper(Node node){
       if (node!=null){
           inOrderHelper(node.left);
           System.out.print(node.data+" ");
           inOrderHelper(node.right);
       }

    }
   public void preOrder(){
        preOrderHelper(root);
   }
    public void preOrderHelper(Node node){
        if (node!=null){
            System.out.print(node.data+" ");
            preOrderHelper(node.left);

            preOrderHelper(node.right);
        }

    }
   public void postOrder(){
           postOrderHelper(root);
   }
    public void postOrderHelper(Node node){
        if (node!=null){
            postOrderHelper(node.left);

            postOrderHelper(node.right);
            System.out.print(node.data+" ");
        }

    }
   public static  void  main(String arg[]){
       Bineryserchtree tree=new Bineryserchtree();
       tree.insert(10);
       tree.insert(12);
       tree.remove(12);

       tree.insert(13);
       System.out.println( tree.contains(12));




   }

}
