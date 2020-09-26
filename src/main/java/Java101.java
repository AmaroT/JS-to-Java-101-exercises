package main.java;

import java.util.Scanner;

public class Java101 {
//    public static void main(String[] args) {
//        System.out.println("Hello, world");
//    }
//    Test
    public static boolean isGreaterThan007(double a, double b) {
        return(a > b);
    }
    //Exercise 2
    //Create a variable named fruits and assign it to an array of strings containing the following fruits.
    // mango, banana, guava, kiwi, strawberry
//    String[] fruits = new String[] {"mango", "banana", "guava", "kiwi", "strawberry"};

    //Exercise 3
    //Create a var name vegatable and assign it to an array of fruits containing the following vegatable names as strings:
    //eggplant, broccoli, cauliflower, and zucchini

//    String[] vegetables = new String[] {"eggplant", "broccoli", "carrot", "cauliflower", "zucchini"};


    //Exercise 4
    //Create a variable named numbers and assign it to an array of numbers: 1,2,3,4,5,6,7,8,9,10
//    String[] numbers =  new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    //Exercise 5
    // Add a string "tomato" to the end of the fruits array.
    //*Hint* Recommend finding and using a built-in JS operations to add to an array rather than recreating the array.
    //*Hint* in Java, find and use a different way to work around this...

//    ArrayList<String> mFruits = new ArrayList<String>();
//    mFruits.add("mango");
//    mFruits.add("banana");
//    mFruits.add("guava");
//    mFruits.add("kiwi");
//    mFruits.add("strawberry");
//    mFruits.add("tomato");

    //Exercise 6 :
    //add the string tomato onto the end of vegatables array.
//    ArrayList<String> mVegetables = new ArrayList<String>();
//    mVegetables.add("eggplant");
//    mVegetables.add("broccoli");
//    mVegetables.add("carrot");
//    mVegetables.add("cauliflower");
//    mVegetables.add("zucchini");
//    mVegetables.add("tomato");

    //Exercise 7:
    //Given the array of numbers defind below, reverse the array of numbers that you created above.
//    public static void main (String[] args){
//        ArrayList obj = new ArrayList();
//        //Declaring arraylist without any initial size
//        ArrayList<Integer> mNumbers = new ArrayList<Integer>();
//
//        //Appending elements at the end of the list
//        mNumbers.add(1);
//        mNumbers.add(2);
//        mNumbers.add(3);
//        mNumbers.add(4);
//        mNumbers.add(5);
//        mNumbers.add(6);
//        mNumbers.add(7);
//        mNumbers.add(8);
//        mNumbers.add(9);
//        mNumbers.add(10);
//        System.out.println("Elements before reversing: " + mNumbers);
//        Collections.reverse(mNumbers);
//        System.out.println("Elements after reversing: " + mNumbers);
//
//    }
    //Exercise 8:
    // Sort the Vegetables in alphabetical order.
//    public static void main(String[] args) {
//        String[] strArr = new String[] {"broccoli", "carrot", "cauliflower", "eggplant", "eggplant", "tomato","zucchini"};
//        System.out.println("Sorting the array in alphabetical order...");
//        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
//        for(int a = 0; a < strArr.length; a++){
//            System.out.println(strArr[a]);
//        }
    //Exercise 9 :
    //Write the code necessary to sort the fruits in reverse alphabetical order
//    public static void main(String[]args){
//        String[] strArr = new String[] {"mango","banana", "guava", "kiwi", "strawberry"};
//        System.out.println("Sorting the array in reverse alphabetical order...");
//        Arrays.sort(strArr, Collections.reverseOrder());
//        for(int a = 0; a < strArr.length; a++){
//            System.out.println(strArr[a]);
//        }
    //Exercise 10:
    // Write the code necessary to produce a single array that hold all fruits then all vegetables in the order as they were sorted above.

//    public static void main(String[] args) throws Exception{
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("mango", "banana", "guava", "kiwi", "strawberry"));
//        ArrayList<String> vegetables = new ArrayList<>(Arrays.asList("eggplant", "broccoli", "carrot", "cauliflower", "zucchini"));
//
//        fruits.addAll(vegetables); //Merging both lists
//        System.out.println(fruits);
//    }
    //Exercise 11:
    //Write a function definiton for a function named addOne that takes in a number and returns that number plus one

    public static int sum(int a, int b) {
        return a + b;
    }
    //Exercise 12
    //Write a function definition name isPositive that takes in a number and returns true or false if that number is positive
//    public static void main(String[]args){
//       int number = 100;
//       if(number > 0){
//           System.out.println(number + " is a positive number.");
//       } else if (number < 0){
//           System.out.println(number + " is a negative number.");
//       } else {
//           System.out.println(number + " is neither positive or negative");
//       }
//    }
    //Exercise 13
    //Write a function definition that takes in a number and returns true or False if that number is negative

//    public static void main(String[] args) {
//        int number = -100;
//        if(number > 0){
//            System.out.println(number + " is a positive number");
//        } else if(number < 0) {
//            System.out.println(number + " is a negative number");
//        } else{
//            System.out.println(number + " is neither a negative or a positive number");
//        }
//    }

    //Exercise 14:
    // Write a function definition named isOdd that takes in a number and true or false if that number is odd

//    public static void main(String[] args) {
//        int num;
//        System.out.println("Enter an Integer number: ");
//        //Input by user
//        Scanner input = new Scanner(System.in);
//        num = input.nextInt();
//        //If number is divisible by 2 then it's an even number, else odd number
//        if(num % 2 == 0){
//            System.out.println("The number you have entered is even");
//        } else {
//            System.out.println("The number you have entered is odd");
//        }
//    }

    //Exercise 15
    //Write a program to check if the number entered is odd
//    public static void main(String[] args) {
//        int num;
//        System.out.println("Enter an Integer number: ");
//        Scanner input = new Scanner(System.in);
//        num = input.nextInt();
//        // If number is divisible by 1 then it's an odd number, else even
//        if(num % 2 != 0){
//            System.out.println("The number you've entered is odd");
//        } else {
//            System.out.println("The number you've entered is even");
//        }
//    }

    //Exercise 16
    //Write a Java program that is able to return a user input and SOUT the input
//    public static void main(String[] args) {
//        int num;
//        float fnum;
//        String str;
//        Scanner in = new Scanner(System.in);
//        //String input
//        System.out.println("Enter a string: ");
//        str = in.nextLine();
//        System.out.println("Input String is: " +str);
//        //Integer input
//        num = in.nextInt();
//        System.out.println("Input integer is : " + num);
//        //Float Number
//        System.out.println("Enter a float number: ");
//        fnum = in.nextFloat();
//        System.out.println("Input Float number is: " +fnum);
//    }
    //Exercise 17:
    //Write a Java program that takes in a number and checks it if is a postive and an odd number
//    public static void main(String[] args) {
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        num = scan.nextInt();
//        scan.close();
//        if(num > 0 && num % 2 != 0){
//            System.out.println("The Integer you have entered is a positive and an odd number");
//        }
//    }

    //Exercise 18:
    //Write a Java program that takes in a number and checks if it is a positive and even
//    public static void main(String[] args) {
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        num = scan.nextInt();
//        scan.close();
//        if(num > 0 && num % 2 == 0){
//            System.out.println("The integer you have entered is a positive and is even");
//        }else{
//            System.out.println("not a positive and an even number");
//        }
//    }
    //Exercise 19:
    //Write a Java Program that checks the input to see if the number is a negative and it is odd
//    public static void main(String[] args) {
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        num = scan.nextInt();
//        scan.close();
//        if(num < 0 && num != 0){
//            System.out.println("The input is a negative and and odd number");
//        } else{
//            System.out.println(" The input is not a negative and not a odd number");
//        }
//    }
    //Exercise 20
    //Write a Java Program that checks the user input is a negative and even
//    public static void main(String[] args) {
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        num = scan.nextInt();
//        scan.close();
//        if(num < 0 && num % 2 == 0){
//            System.out.println("The integer is a negative and is even");
//        } else{
//            System.out.println("The integer is not a negative and not even");
//        }
//    }
    //fizzbuzz 1
//    public static void main(String[] args) {
//        int n = 100;
//        //loop for 100 times
//        for(int i = 1; i <=n; i++){
//            if(i % 15 == 0){
//                System.out.println("Fizzbuzz" + " ");
//                //number divisible by 5, print 'Buzz'
//                //in place of the number
//            } else if (i % 5 == 0){
//                System.out.println("Buzz" + " ");
//
//                //number divisible by 3, print 'Fizz'
//                //in place of number
//            } else if (i % 3 == 0){
//                System.out.println("Fizz" + " ");
//
//                //number divisible by 15(divisible by
//                //by both 3 & 5), print 'FizzBuzz' in
//                //place of the number
//            } else {
//                System.out.println(i + " ");
//            }
//        }
//    }
    //Fizzbuzz 2
//    public static void main(String[] args) {
//        int n = 100;
//        //loop for 100 times
//        for(int i = 1;i <= n;i++){
//            //if divisible by both 3 && 5
//            if(i % 15 == 0) {
//                System.out.println("Fizzbuzz");
//
//                //if divisible by 5
//            }else if(i % 5 == 0){
//                    System.out.println("Buzz");
//
//                    //if divisible by 3
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else{
//                System.out.println(i);
//            }
//        }
//    }
    //Fizzbuzz 3
    public static void main(String[] args) {
        int n = 100;
        //loop for 100 times
        for(int i = 1; i <= n;i++){
            //if divisible by 15
            if(i % 15 == 0){
                System.out.println("FizzBuzz");

                //If divisible by 3
            } else if(i % 3 == 0){
                System.out.println("Fizz");

                // if divisible by 5
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }

        }
    }

}








