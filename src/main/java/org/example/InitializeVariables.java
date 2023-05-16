package org.example;

public class InitializeVariables {

    static int myStaticInt = 39;
    int myNonstaticInt = 14;
    {
        myNonstaticInt = 24;
    }

    // ============================ Constructor ==============================
    public  InitializeVariables (int myNonstaticInt){
        this.myNonstaticInt = myNonstaticInt;
    }

    //================== Overloaded Method 2nd Constructor ======================
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