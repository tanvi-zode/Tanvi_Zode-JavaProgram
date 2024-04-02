// Write the code to find the Fibonacci series upto the nth term.


class Fibonacci
{
  public static void main(String[] args)
  {

    int n = 10; 
    int firstno = 0;
    int secondno = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstno + ", ");

      int nextTerm = firstno + secondno;
      firstno = secondno;
      secondno = nextTerm;
    }
  }
}