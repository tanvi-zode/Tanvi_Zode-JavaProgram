//Check Whether or Not the Number is a Palindrome

class Palindrome
{
  public static void main(String[] args)
  {
    
    int num = 3553;
    int reversedNum = 0;
    int remainder;
    
    int originalNum = num;
    

    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}