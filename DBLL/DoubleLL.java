public class DoubleLL {

    class Node{
        int data;
        Node next;
        Node prev;
       Node(int data){
            this.data=data;
        }

    }
    public Node head=null;
    public  Node tail=null;

    public  void  addNode(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
        }else {
            tail.next=newnode;
            newnode.prev=tail;
        }
        tail=newnode;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }}
        public void displayReverse(){
            Node temp=tail;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.prev;

            }
    }
    public  static  void  main(String arg[]){
        DoubleLL list=new DoubleLL();
        list.addNode(5);
        list.addNode(6);
        list.addNode(2);
        list.addNode(3);
        list.display();
        list.displayReverse();

    }
}
