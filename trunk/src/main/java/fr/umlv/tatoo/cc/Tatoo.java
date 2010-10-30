package fr.umlv.tatoo.cc;

public class Tatoo {
  // update4
  private Tatoo() {
    // can't be instantiated
  }
  
  public enum Status {
    ALPHA, BETA, RC, RELEASE;
  }
  
  public static String version() {
    return "Tatoo version "+major()+'.'+minor()+
      ' '+status().name().toLowerCase()+' '+revision()
      +" ("+date()+')';
  }
  
  public static int major() {
    return 5;
  }
  
  public static int minor() {
    return 0;
  }
  
  public static Status status() {
    return Status.BETA;
  }
  
  public static int revision() {
    try {
      return Integer.parseInt(shrink(11,"$Revision: 2052 $"));
    } catch (NumberFormatException e) {
      return -1;
    }
  }
  
  public static String date() {
    return shrink(7,"$Date: 2010-04-13 15:37:23 +0300 (Tue, 13 Apr 2010) $");
  }
  
  private static String shrink(int index,String text) {
    return text.substring(index,text.length()-2);
  }
}
