class Nopattern
{
  public static void main(String args[])
  {
   int i,j,count=0;
   for(i = 0; i <= 5; i++)
    {
     for(j = 1; j <= i; j++)
      {
        System.out.print(count);
        count=1-count;
       }
       count=i%2;
      System.out.println();
    }
  }
}