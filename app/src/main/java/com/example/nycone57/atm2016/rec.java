package com.example.nycone57.atm2016;

/**
 * Created by NYC ONE57 on 11/4/2016.
 */
public class rec {
    public rec(){}

    void myMethod( long counter)
    {
        if(counter == 0)
            return;
        else
        {
            System.out.println("hello" + counter);
            myMethod(--counter);
            System.out.println(""+counter);
            return;
        }
    }
    int myFactorial( int integer)
    {
        if( integer == 1)
            return 1;
        else
        {
            return(integer*(myFactorial(integer-1)));
        }

    }

    public static void main(String args[]){
        rec d = new rec();

        System.out.print(d.myFactorial(3));
    }
}


