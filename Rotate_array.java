//Program to rotate array elements left by 1 position


class Rotate_array {
  public static void main(String[] args) {
    
    int [] numbers = new int [] {2, 4, 6, 8, 10, 12};

    int n = 2;
    System.out.println("Given array is: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }

    for(int i = 0; i < n; i++){
      int j, firstElement;
      
      firstElement = numbers[0];
      for(j = 0; j < numbers.length-1; j++){
        numbers[j] = numbers[j+1];
      }
      numbers[j] = firstElement;
    }
    System.out.println();
    System.out.println("Array after "+n+" left rotations: ");
    for(int i = 0; i< numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }
}  