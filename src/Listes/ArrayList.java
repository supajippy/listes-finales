package Listes;

public class ArrayList<T> implements Lists<T> {

    private T[] tableau;
    private int nombreObjet, grosseur;

    public ArrayList(int taille) {
        this.grosseur = taille;
        tableau = (T[]) new Object[taille];
    }

    public void set(int index, T element) {
        if (index >= 0 && tableau.length >= index) {
            tableau[index] = element;
        }
    }

    public void add(int index, T element) {

        grosseur = tableau.length;
        if (grosseur <= 0) {
            grosseur = 1;
        }
        if (index < grosseur && index >= 0) {
            if (nombreObjet >= grosseur - 2) {
                grosseur *= 2;
                T[] temporaire = (T[]) new Object[grosseur];
                for (int i = 0; i < nombreObjet; i++) {
                    temporaire[i] = tableau[i];
                    tableau = temporaire;
                }

                for (int i = nombreObjet; i > index; i--) {
                    tableau[i] = tableau[i - 1];
                }
                tableau[index] = element;
                nombreObjet++;
                grosseur++;
            }
        }
    }

    public T get(int index) {
        T variable = null;
        variable = tableau[index];
        return variable;

    }

    public void add(T element) {



        if (nombreObjet < grosseur) {
            tableau[nombreObjet] = element;
        } else

        if (grosseur <= 0) {
            grosseur = 1;
            tableau[nombreObjet] = element;
        } else {
            grosseur *= 2;
            T[] temporaire = (T[]) new Object[grosseur];
            for (int i = 0; i < nombreObjet; i++) {
                temporaire[i] = tableau[i];

            }
            tableau = temporaire;
            tableau[nombreObjet] = element;
        }
        nombreObjet++;
    }

    public void remove(int index) {
        nombreObjet--;
        int taille = tableau.length;
        tableau[index] = null;
        for (int i = index; i < taille - 1; i++) {
            tableau[i] = tableau[i + 1];
        }
    }

    public void clear() {
        nombreObjet = 0;
        grosseur = 0;

    }

    public int size() {
        int taille = tableau.length;
        return taille;
    }
}
