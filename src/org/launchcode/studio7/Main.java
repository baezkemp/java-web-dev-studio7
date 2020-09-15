package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc myCD = new CD ("Random", 3000, 67, "Music", 2015);
        BaseDisc myCD2 = new CD ("School Stuff", 3000, 0,"Data", 2007);
        BaseDisc myDVD = new DVD ("Nadia", 5, 100, "Movie", 1984);
        BaseDisc myDVD2 = new DVD ("Wedding", 5, 0, "Pictures", 2010);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.startDisc();
        myCD.playDisc();
        myCD.stopDisc();
        myCD2.startDisc();
        myCD2.playDisc();
        myCD2.stopDisc();
        myDVD.startDisc();
        myDVD.playDisc();
        myDVD.stopDisc();
        myDVD2.startDisc();
        myDVD2.playDisc();
        myDVD2.stopDisc();

    }
}
