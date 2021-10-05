package com.perscholas.java_basics;

import java.util.Arrays;

public class Main {

    /*
 Write a program that creates an array of integers
 with a length of 3. Assign the values 1, 2, and 3
 to the indexes. Print out each array element.
 */ public void intList() {
        int[] list = new int[3];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        System.out.println(Arrays.toString(list));
    }
    /*
     Write a program that returns the middle element in an array.
     Give the following values to the integer array: {13, 5, 7, 68, 2}
     and produce the following output: 7
     */
    //int[] intArray = {13, 5, 7, 68, 2};
      //  System.out.println(intArray[2]);
    public void intArray() {
        int[] intArray = {13, 5, 7, 68, 2};
         System.out.println(intArray[2]);
    }
    /*
      Write a program that creates an array of String type and initializes
      it with the strings “red”, “green”, “blue” and “yellow”. Print out
      the array length. Make a copy using the clone( ) method.
      Use the Arrays.toString( ) method on the new array to
      verify that the original array was copied.
      */
    public void stringArray()
    {
        String[] strings = {"red", "green", "blue", "yellow"};
        System.out.println(strings.length);
        String[] clone = strings.clone();
        System.out.println(Arrays.toString(clone));
    }

     /*
      Write a program where you create an integer array with a length
      of 5. Loop through the array and assign the value of the loop
      control variable (e.g., i) to the corresponding index in the array.
      */

    public void ArrayLength()
    {
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = i;
            System.out.println(intArray[i]);
        }
    }

    /*
      Write a program where you create an integer array of 5 numbers.
      Loop through the array and assign the value of the loop control
      variable multiplied by 2 to the corresponding index in the array.
      */
    public void ArrayDoubled(int[] intArray)
    {
        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = (i * 2);
            System.out.println(intArray[i]);
        }
    }

    /*
      Write a program where you create an array of 5 elements.
      Loop through the array and print the value of each element,
      except for the middle (index 2) element.
      */

    public void Array(String[] sArray)
    {
        for(int i = 0; i < sArray.length; i++)
        {
            if(i == 2)
                continue;
            System.out.println(sArray[i]);
        }
    }

    /*
      Write a program that creates a String array of
      5 elements and swaps the first element with the
      middle element without creating a new array.
      */
    public void swapArray(String[] myArray){
        String swap = myArray[0];
        myArray[0] = myArray[2];
        myArray[2] = swap;
        System.out.println(Arrays.toString(myArray));

    }

    public static void main(String[] args) {

        Main main = new Main();
       // main.intList();
       // main.intArray();
       // main.stringArray();
        //
        // main.ArrayLength();
        //int [] intArray = new int[5];
        //main.ArrayDoubled(intArray);

        String[] sArray = {"A", "B", "C", "D", "E"};
        main.swapArray(sArray);
      //  main.Array(sArray);


    }//end main
}//end class
