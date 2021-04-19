import java.util.Scanner;

class Node{
    int value=0;
    Node next_node;

    Node(int value){
        this.value=value;
        next_node=null;
    }
}

public class Set_circular_list {
    Node head=null;
    Scanner in = new Scanner(System.in);
    public Set_circular_list(){
       head=null;
    }

    public void add(){
    if(head==null){
        System.out.print("inserisci valore della testa--> ");
        int x=in.nextInt();
        head= new Node(x);
    }
    else{
        Node temp=this.head;
        while(temp.next_node!=null){
            temp=temp.next_node;
        }
        System.out.print("inserisci numero Nodo --> ");
        int k=in.nextInt();
        temp.next_node=new Node(k);
    }
}

    public void remove(){
        Node temp=this.head;
        int i=0;
        System.out.print("quale nodo vuoi eliminare? in posizione -->");
        int pos=in.nextInt();
        while(temp.next_node != null && i!=pos){
           i+=1;
           
        }
    }

    public void circular_list(){
        Node temp=this.head;
        while(temp.next_node!=null){
            temp=temp.next_node;
        }
        temp.next_node=head;
    }

    public void non_circular_list(){
        Node temp=this.head;
        while(temp.next_node!=this.head){
            temp=temp.next_node;
        }
        temp.next_node=null;
    }

    public void get_once(){
        circular_list();
        Node temp=head;
        int i=0;
        do{
            i+=1;
            System.out.println("Nodo --> "+i+" Numero --> "+temp.value);
            temp=temp.next_node;
        }while(temp!=head);
        non_circular_list();
    }

    public void infinity_get(){
        circular_list();
        Node temp=this.head;
        int i=0;
        //int h=100;
        while(temp!=null){
            //if(i!=h){
            i+=1;
            System.out.println("Nodo --> "+i+" Numero --> "+temp.value);
            temp=temp.next_node;
            }
          // else break;
        //}
        //non_circular_list();
    }
}
