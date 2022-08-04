public class singleLinkedList {
    class Node{
        int data;
        Node next;
         Node (int data){
             this.data=data;
         }

    }
    public  Node head=null;
    public  Node tail=null;
     public void  addNode(int data){
         Node newNode= new Node(data);
         if (head==null){
             head=newNode;
         }else {
             tail.next=newNode;
         }
         tail=newNode;
     }
     public  void  delete(int data){
         Node temp=head,prev=null;
         if (temp!=null && temp.data==data){
             head=temp.next;
             return;
         }
         while (temp!=null && temp.data!=data){
             prev=temp;
             temp=temp.next;
         }
         if (temp==null){
             return;
         }
         if (temp==tail){
             tail=prev;
             tail.next=null;
             return;
         }
         prev.next=temp.next;
     }
     public void  display(){
         if (head==null){
            System.out.println("empty");
            return;
         }
         Node temp=head;
         while (temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }

     }
     public  void  insertAfter(int nextTo,int data){
         Node newnode=new Node(data);
         Node temp=head;
         while (temp!=null && temp.data != nextTo){
             temp=temp.next;
         }
         if(temp==null){
           return;
         }
         if (temp==tail){
             tail.next=newnode;
             tail=newnode;
             return;
         }
         newnode.next=temp.next;
         temp.next=newnode;

     }
     public void removeDuplicate(){
         Node current=head;
         while (current!=null){
             Node next=current.next;
             while (next!=null && next.data==current.data){
                 next=next.next;
             }
             current.next=next;
                     if(current==tail && current.data== next.data){
                         tail=current;
                         tail.next=null;
                     }
                     current=next;
         }
     }
     public  static void main(String arg[]){
         singleLinkedList List=new singleLinkedList();
         List.display();
         List.addNode(10);
         List.addNode(20);
         List.display();
         List.delete(20);
         List.insertAfter(10,35);
         List.display();
     }
}
