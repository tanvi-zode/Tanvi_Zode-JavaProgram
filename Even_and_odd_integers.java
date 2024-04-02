//Write a program to count the number of even and odd integers in a given array of integers.


class Even_and_odd_integers{
  public static void main (String[] args)
  {
     int arr[] = {1, 20, 60, 31, 75, 40, 80};
     int n = arr.length;
     int countEven = 0, countOdd = 0;

     for(int i=0; i<n; i++){
         if((arr[i] % 2 )== 0)
           countEven += 1;

         else
           countOdd += 1;
     }
     System.out.println("Even Elements count : "+ countEven);
     System.out.println("Odd Elements count : "+ countOdd);
  }
}