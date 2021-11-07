package com.company;
import java.util.*;

// lab04. Omenyuk Vyacheslav Igorovich
/* Using the program for solving the problem of laboratory work №3, in accordance with the applied problem to provide processing of user commands in the form of a text menu:

   data entry;
   data viewing;
   performing calculations;
   display of the result;
   program completion, etc.
   Provide processing of command line parameters to determine the mode of operation of the program:

   parameter "-h" or "-help": information about the author of the program, purpose (individual task), detailed description of operating modes (menu items and command line parameters) is displayed;
   parameter "-d" or "-debug": during the operation of the program additional data is displayed, which facilitates the debugging and verification of the program: diagnostic messages, intermediate values ​​of variables, values ​​of temporary variables, etc.*/

class Main{

      public static void main(String[] args) {


          // debug -h -help
    	  if(args.length > 0) {
    		  if(args[0].equals("-h") || args[0].equals("-help")) {
    			  System.out.println("\nCreator of the program MR.NEKTO. A program that displays the number of lines you specify. ");
    			  System.out.println("Splits your lines into two groups, one of which is less than the average and the other is greater than the average.");
    			  System.out.println("The program displays the number of characters in a line and the sum of the number of characters in lines.");
    		      System.out.println("If you want to stop program just write any word in Count word");
    		  }
    	  }
    	  // debug -d -debug
    	  if(args.length > 0) {
              		  if(args[0].equals("-d") || args[0].equals("-debug")) {
              			  System.out.println("\nJust for Fun .GLHF ");
              		  }
              	  }


    	  // StringBuilder
    	  StringBuilder stringBuilder = new StringBuilder("Help");
    	  System.out.println("\nStringBuilder = " + stringBuilder.length());

    	  Scanner input = new Scanner(System.in);
    	  System.out.print("Count word = ");
    	  int N = input.nextInt();

    	  String[] arrString = new String[N]; // ARRAY string
    	  for(int i = 0;i < N;i++) {
    		  System.out.print("Element " + (i+1) + ": ");
    		  arrString[i] = input.next();
    	  }
    	  	System.out.println(arrString);

    	  String[] arrLess = new String[N]; // Array Group Less
    	  String[] arrUpper = new String[N]; // Array Group Upper
    	  int countAll = 0; // variable sum word
    	  int lta = 0; // variable Less
    	  int uta = 0; // variable Upper

    	  // cycl for counting length
    	  for(int i = 0;i < arrString.length;i++) {
    		  System.out.printf("%s = ",arrString[i]);
    		  int count = 0;
    		  for(int j = 0;j < arrString[i].length();j++) {
    				  count++;
    				  countAll++;
    		  }
    		  System.out.println(count);
    	  }
    	  int average = countAll / N;
    	  System.out.printf("Count all elements = %d\n",countAll);
    	  System.out.printf("Average = %d\n",average);
    	  for(int i = 0;i < arrString.length;i++) {
    	  // If less
    	  if(average > arrString[i].length()) {
    		  lta++;
    		  arrLess[i] = arrString[i];
    		  System.out.printf("Less = %s\n",arrString[i]);
    	  }
    	  // If more
    	  else {
    		  uta++;
    		  arrUpper[uta] = arrString[i];
    		  System.out.printf("Upper = %s\n",arrString[i]);
    	  }
    	  }
    	  System.out.printf("Less than average = %d\n",lta);
    	  System.out.printf("Upper than average = %d\n",uta);
    	  for(int i = 0;i < arrUpper.length;i++) {
    		  System.out.printf("Group Array Upper = %s\n",arrUpper[i]);
    		  System.out.printf("Group Array Less = %s\n",arrLess[i]);
    	  }

    	  System.out.printf("Program sucsesful");
      }
      }
