package Listes;

public class Node<T> {
    private T contenu=(T)null;
    private Node<T> next=null;

    public Node(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public Node<T> getNext() {return next;}


    public void setNext(Node next) {
        this.next = next;
    }
}
