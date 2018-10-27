package com.self.rnd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name ?" );
        String name = System.console().readLine();

        if(name.toUpperCase().equals("SUBODH")){
            System.out.println("Welcome buddy !.. What can I do for you ?");
        }
        else{
            System.out.println("Sorry..dont recognize you. Application aborting...");
        }
    }
}
