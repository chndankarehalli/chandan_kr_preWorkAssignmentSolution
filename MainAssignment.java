//package in.gl.preWorkAssignmentSolution;

import java.util.Scanner;

public class MainAssignment {

  // function to checkPalindrome
  public void checkPalindrome() {
    String original, reverse="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check if it is a palindrome or not");
    original=sc.nextLine();
    int length=original.length();
    for (int i=length-1; i>=0; i--)
      reverse=reverse+original.charAt(i);
    if (original.equals(reverse))
      System.out.println("Entered string/number is a palindrome.");
    else
      System.out.println("Entered string/number isn't a palindrome.");
    //sc.close();
  }

//--------------------------------------------------------------------------------------

  // function to printPattern
  public void printPattern() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the pattern number:");
    int patternNumber = sc.nextInt();
    for (int i = patternNumber; i >= 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
   // sc.close();
  }

//--------------------------------------------------------------------------------------

  // function to check no is prime or not
  public void checkPrimeNumber() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to check prime or not:");
    int inputNumber = sc.nextInt();
    boolean isItPrime = true;

    if (inputNumber <= 1) {
      isItPrime = false;
      System.out.println(inputNumber + " is not a prime number");
    } else {
      for (int i = 2; i <= inputNumber / 2; i++) {
        if ((inputNumber % i) == 0) {
          isItPrime = false;
          break;
        }
      }

      if (isItPrime == true) {
        System.out.println(inputNumber + " is a prime number.");
      } else {
        System.out.println(inputNumber + " is not a prime number.");
      }
    }
   // sc.close();
  }

//--------------------------------------------------------------------------------------

  // function to print Fibonacci Series
  public void printFibonacciSeries() {
    System.out.println("Enter the seeries length: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int first = 0, second = 1;
    int counter = 0;

    System.out.println("Fibonacci seeries of length " + n + " is");

    while (counter < n) {

      System.out.print(first + " ");

      int num = second + first;
      first = second;
      second = num;
      counter++;
    }
    //sc.close();
  }

//--------------------------------------------------------------------------------------

  public static void main(String[] args) {
    MainAssignment obj = new MainAssignment();


    int choice;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("\n Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
          + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
          + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
      System.out.println();

      choice = sc.nextInt();
      switch (choice) {
      case 0:
        choice = 0;
        break;
      case 1: {
        obj.checkPalindrome();
      }
        break;
      case 2: {
        obj.printPattern();
      }
        break;
      case 3: {
        obj.checkPrimeNumber();
      }
        break;
      case 4: {
        obj.printFibonacciSeries();
      }
        break;
      default:
        System.out.println("Invalid choice. Enter a valid no.\n");
      }
    } while (choice != 0);
    System.out.println("Exited Successfully!!!");
    sc.close();
  }
}