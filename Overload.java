class Overloaddemo
{
 void test()
 {
  System.out.println("No parameter");
 }
 void test(int a)
 {
  System.out.println("a=" +a);
 }
 void test(int a, int b)
 {
  System.out.println("a=" +a + "b=" +b);
 }
}
class Overload
{
 public static void main(String args[])
 {
  Overloaddemo obj = new Overloaddemo();
  obj.test();
  obj.test(10);
  obj.test(15,20);
 }
}