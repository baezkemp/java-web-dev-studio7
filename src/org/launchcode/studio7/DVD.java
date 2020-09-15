package org.launchcode.studio7;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.

    public DVD(String name, int storageCapacity, int runtime, String mediaType, int copyrightYear) {
        super(name, storageCapacity, runtime, mediaType, copyrightYear);
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public void startDisc() {
        System.out.println("***");
        if (this.getMediaType().equals("Movie")){
            System.out.println("The " + this.getName() + " DVD has a " + this.getMediaType() + ". Press play to watch.");
        } else {
            System.out.println("The " + this.getName() + " DVD has " + this.getMediaType() + ". Press play to review.");
        }
    }

    @Override
    public void playDisc() {
        if (this.getMediaType().equals("Movie")) {
            System.out.println("I hope you have your popcorn ready. The " + this.getName() + " movie is " + this.age() + " years old and is " + this.getRuntime() + " minutes long.");
        } else {
            System.out.println("Enjoy the show!");
        }
    }

    @Override
    public void stopDisc() {
        System.out.println("Be kind, rewind.");
        System.out.println("***");
    }
}
