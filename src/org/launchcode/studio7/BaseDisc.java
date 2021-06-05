package org.launchcode.studio7;

abstract class BaseDisc {

    public String title;

    public BaseDisc(String aTitle){
        title = aTitle;
    }

   public static String stopped = "Disc has stopped spinning";

    public static void stopDisc() {
        System.out.println(stopped);
    }

}
