public class stqu {

    static class Node{
        int data;
        Node next;
      public Node(int data){
            this.data=data;
        }
    }
    public  Node top;

    public  void  push(int data){
        Node newnode=new Node(data);
        if (top != null) {
            newnode.next = top;
        }
        top=newnode;
    }
    public  void display(){
        Node current=top;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;

        }


    }
    public void pop(){

         if(top==null){
             System.out.println("stack is underflow");
             return;
         }
         top=top.next;

    }
    public  static  void  main( String[]arg){
      queu list=new queu();
      list.enqueu(10);
      list.enqueu(12);
      list.enqueu(24);
      list.enqueu(35);
      list.display();
      list.dequeue();
      list.display();

    }}







