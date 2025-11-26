package Poo.PRACTICA_P2_Reader_Book_BookList;

public class Book {

    //propietats
    public enum Genere{NOVELA, POESIA, ECONIMIA}

    private Genere genere;
    private String titol;
    private String autor;
    private String isbn;
    private int numPagines;

    //constructor

    public Book(String titol, String autor, String isbn){
        this.titol= titol;
        this.autor= autor;
        this.isbn= isbn;
        numPagines= 0;
        genere = Genere.NOVELA;

    }

    public Book(String titol, String autor, String isbn, Genere genere, int numPagines){
        this.titol= titol;
        this.autor= autor;
        this.isbn= isbn;
        this.genere= genere;
        this.numPagines= numPagines;
    }

    //setter

    public void setTitol(String titol){
        this.titol= titol;
    }
    public void setGenere(Genere genere){
        this.genere= genere;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    public void setIsbn(String isbn){
        this.isbn= isbn;
    }
    public void setNumPagines(int numPagines){
        this.numPagines= numPagines;
    }

    //getters

    public String getTitol(){
        return titol;
    }
    public String getAutor(){
        return autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public Genere getGenere(){
        return genere;
    }
    public int getNumPagines(){
        return numPagines;
    }

    public String toString(){
        return titol;
    }
    public boolean equals(Object o ){

        return true;
    }
}
