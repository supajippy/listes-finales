package Listes;

public class File <T>{
    LinkedList<T> chaine=new LinkedList<>();


    public void add(T element){
        chaine.add(element);
    }
    public T remove(){
        Node next= chaine.head;
        chaine.remove(0);
        return  (T) next.getContenu();
    }
    public Node peek(){
        return chaine.head;
    }
    public void clear(){
        chaine.clear();;
    }
    public int size(){
        return chaine.size();
    }
}
