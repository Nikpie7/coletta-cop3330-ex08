/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "How many people? " );
        int numPeople = Integer.parseInt( scan.nextLine() );

        System.out.print( "How many pizzas do you have? " );
        int numPizza = Integer.parseInt( scan.nextLine() );

        System.out.print( "How many slices per pizza? " );
        int numSlices = Integer.parseInt( scan.nextLine() );

        int slicesPerPerson = (numPizza * numSlices) / numPeople;
        int leftoverPieces = (numPizza * numSlices) % numPeople;

        //output printing, adjusting for pluralization
        if ( numPeople == 1 )
            System.out.print( numPeople + " person with " );
        else
            System.out.print( numPeople + " people with ");

        if ( numPizza == 1 )
            System.out.print( numPizza + " pizza (");
        else
            System.out.print( numPizza + " pizzas (");

        if ( numSlices * numPizza == 1 )
            System.out.println( (numSlices * numPizza) + " slice)" );
        else
            System.out.println( (numSlices * numPizza) + " slices)" );

        if ( slicesPerPerson == 1 )
            System.out.println( "Each person gets " + slicesPerPerson + " piece of pizza." );
        else
            System.out.println( "Each person gets " + slicesPerPerson + " pieces of pizza." );

        if ( leftoverPieces == 1 )
            System.out.println( "There is " + leftoverPieces + " leftover piece." );
        else
            System.out.println( "There are " + leftoverPieces + " leftover pieces." );
    }
}
