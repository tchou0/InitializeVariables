package org.example;

public class InitializeVariables {

    /*
     * There are three types of variables in Java:
     *
     *
     * "local" or "automatic" variables declared in a function
     * This is the heart of procedural coding
     * All methods are separate
     * You can use your local variables without thinking about other methods
     *
     *
     * non-static "instance" variables that are replicated in
     * each instance of a class
     * This is the heart of OOP
     * All objects are separate
     * You can use your instance variables without thinking about other objects
     *
     *
     * static "class" variables that are not replicated.
     * A single variable is shared by all instances
     * Useful for constants like Math.PI
     * You can use your class variables without thinking about other classes
     */


//========= Initialization at point of declaration works for all three types ==========
    static int myStaticInt = 39;
    // non-static "instance" variables have a lot of ways
    // to initialize them!!!  %^}

    // 1. initialization at point of declaration
    int myNonstaticInt = 14;

    // 2. The non-static initializer block
    {
        myNonstaticInt = 24;
    }

    // 3. ============================ Constructor ==============================
    public  InitializeVariables (int myNonstaticInt){
        this.myNonstaticInt = myNonstaticInt;
    }

    //4. ================== Overloaded Method 2nd Constructor ======================
    public InitializeVariables(){
        myNonstaticInt = 352897;
    }

    public static void main(String[] args) {

        int myLocal = 12;

        // using the class as a datatype for getting nonstatic variables
        // using the second Constructor
        InitializeVariables iv1 = new InitializeVariables();

        //===================== Using the first Constructor ==========================
        InitializeVariables iv2 = new InitializeVariables(2);
        InitializeVariables iv3 = new InitializeVariables(3);


        System.out.println(myLocal);
        System.out.println(InitializeVariables.myStaticInt);
        System.out.println(iv1.myNonstaticInt);
        System.out.println(iv2.myNonstaticInt);
        System.out.println(iv3.myNonstaticInt);
    }
}