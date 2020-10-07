package main.java;

public class DefaultInitialization {
    //instance variable have default value
// number defaults to zero
// char defaults to NULL
    int number;
    char letter;

    public static void main(String[] args) {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        System.out.println("number: " + defaultInitialization.number);
        System.out.print("char: " + defaultInitialization.letter);
    }
}