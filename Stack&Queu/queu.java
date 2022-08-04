public class queu {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public Node front;
    public  Node rear;

    void enqueu(int data){
        Node newnode= new Node(data);
        if (rear ==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }

    void dequeue(){
        if (front ==null){
            System.out.println("empty");
        }
        front=front.next;
        if (front==null){
            rear=null;
        }
    }





    public  void display(){
        Node current=front;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;

        }


    }
}
