package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public String bandName;

    public CD(String aTitle, String aBandName) {
        super(aTitle);
        bandName = aBandName;
    }

    @Override
    public void spinDisc() {
        System.out.println("CD music is playing");
    }
}
