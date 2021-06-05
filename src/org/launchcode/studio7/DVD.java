package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    String genre;

    public DVD(String aTitle, String aGenre ){
        super (aTitle);
        title = aTitle;
        genre = aGenre;
    }

    @Override
    public void spinDisc() {
      System.out.println("DVD is spinning around" );
    }




    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
