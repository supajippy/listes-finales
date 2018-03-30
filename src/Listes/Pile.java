package Listes;

public class Pile<T>{
    LinkedList<T> chaine =new LinkedList<>();

    public void push(T element) {
        chaine.add(0,element);
    }
    public T pop(T element){
        T next=chaine.get(0);
        chaine.remove(0);
        return next;
    }
    public T peek(){
        return chaine.get(0);
    }
    public void clear(){
        chaine.nbObject=0;
    }
    public int size(){
        return chaine.nbObject;
    }

}
