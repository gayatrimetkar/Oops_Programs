class Stringdemo
{
  public static void main(String args[])
  {
    String str1 = "Seize the day";
    String str2 = new String();
    String str3 = new String(str1);
    String str4 = "Day of the seize";
    String str5 = "Seize the day";
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);
    System.out.println("str3: " + str3);
    System.out.println("str4: " + str4);
    System.out.println("str5: " + str5);
    System.out.println();
    System.out.println("length of str1 is" + str1.length());
    System.out.println("length of str2 is" + str2.length());
    System.out.println();
    System.out.println("Index of 'e' is str4: " + str4.indexOf('e'));
    System.out.println("Char at pos 3 in str1: " + str1.charAt(3));
    System.out.println("Substring 6 to 8 of str1: " + str1.substring(6,8));
    if(str1==str5)
     {
       System.out.println("str1 and str5 refer to the " + "same object");
     }
    if(str1!=str3)
     {
       System.out.println("str1 and str3 don't refer to " + "the same object");
     }
    if(str1.equals(str3))
     {
       System.out.println("str1 and str3 contain the" + "same chars");
     }
     System.out.println();
     str2 = str1.toUpperCase();
     System.out.println("str2 now is: " + str2);
     str5 = str1.replace('e','X');
     System.out.println("str5 is now: " + str5);
    if(str1==str5)
     {
       System.out.println("str1 and str5 refer to the" + "same object");
     }
    else
     {
       System.out.println("str1 and str5 don't refer to" + "the same object");
     }
  }
}