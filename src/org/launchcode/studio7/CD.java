package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Implement your custom interface.

    public CD(String name, int storageCapacity, int runtime, String mediaType, int copyrightYear) {
        super(name, storageCapacity, runtime, mediaType, copyrightYear);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public void startDisc() {
        System.out.println("***");
        System.out.println("The " + this.getName() +" CD has "+this.getMediaType()+".");
                if (this.getMediaType().equals("Music")){
                    System.out.println("Press play to listen.");
                } else {
                    System.out.println("Select file to review.");
                }
    }

    @Override
    public void playDisc() {
        if (this.getMediaType().equals("Music")){
            System.out.println("Don't forget your headphones!");
        } else {
            System.out.println("Save often!");
        }
    }

    @Override
    public void stopDisc() {
        System.out.println("Goodbye.");
        System.out.println("***");
    }
}
