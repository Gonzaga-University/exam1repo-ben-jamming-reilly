package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    // This class needs some comments
    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
        // This intializes the variables
    }


}

public class Main {
    // This is the main function
    // This is where the program goes Bleep Bloop
    // I like line comments
    public static void main(String args[]) {
        System.out.println("Starting app");
        System.out.println("Bleep Bloop");
        Adder adder = new Adder(10, 20);

        System.out.println("App finished.");
    }
}