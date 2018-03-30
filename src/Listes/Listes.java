package Listes;

public interface Lists<T> {
    void add(int index, T element);
    T get(int index);
    void add(T element);
    void remove(int index);
    void clear();
    int size();
}
