package Listes;

public class LinkedList<T> implements Lists<T> {
    int nbObject =0 ;
    Node tail=new Node(null);
    Node head=new Node(null);
    public LinkedList() {

        head.setNext(tail);
    }
    public void set(int index,T element){
        Node next=head;
        if(index==0)
            head.setContenu(element);
        if(nbObject==1)
        {
            tail.setContenu(element);
        }
        if(index<=nbObject && index>0){
            for(int i =0;i<index;i++){
                next=next.getNext();
            }
            next.setContenu(element);
        }

    }

    public void add(int index, T element) {
        Node next = head;
        if(index==0){
            next.setContenu(element);
            next.setNext(head);
            head=next;
        }

        if (index > 0&&index<nbObject) {
            for (int i = 1; i < index; i++) {
                next = next.getNext();
            }
            Node<T> tempo2 = next.getNext();
            next.setNext(new Node<T>(element));
            next.getNext().setNext(tempo2);
        }
        nbObject++;
    }


    public T get(int index) {
        Node next = head;
        if(index<=nbObject) {
            for (int i = 0; i < index; i++) {
                next = next.getNext();
            } return (T) next.getContenu();

        }
        else return null;

    }

    public void add(T element) {
        if(nbObject<=0)
        {
            head.setContenu(element);
            nbObject++;
        }
        else if (nbObject==1){
            tail.setContenu(element);
            nbObject++;
        }

        else{
            Node<T> next=head;
            for(int i =0; i<nbObject-1;i++){
                next=next.getNext();
            }
            next.setNext(new Node<T>(element));
            next.getNext().setNext(tail);
            nbObject++;


        }


    }

    public void remove(int index) {
        Node next=head;
        if(index==0){
            next=head.getNext();
            head=next;
        }
        else if(nbObject==-1)
        {
            head.setNext(null);
        }
        else if(index<nbObject){
            for(int i =0; i<index-1;i++){
                next=next.getNext();
            }
            Node tempo2=next.getNext();
            next.setNext(tempo2.getNext());
        }

    }

    public void clear(){

        nbObject=0;
    }

    public int size(){
        int taille =nbObject;
        return taille;
    }
}
