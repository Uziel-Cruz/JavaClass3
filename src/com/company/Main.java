package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	//TASK1 –SIMPLE CALCULATOR, USING FROM INPUT -OUTPUT OPERATIONS-------------------------------------------------

        //float firstNumber, secondNumber, sum, substraction, product, quotient;
        //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("The program calculates sum, difference, product and quotient for two number.");
        //System.out.println("Enter the first number (and press Enter): ");
        //firstNumber = Float.parseFloat(br.readLine());
        //System.out.println("Enter the second number (and press Enter): ");
        //secondNumber = Float.parseFloat(br.readLine());

        //sum = firstNumber + secondNumber;
        //substraction = firstNumber - secondNumber;
        //product = firstNumber * secondNumber;
        //quotient = firstNumber / secondNumber;

        //System.out.printf("You entered two numbers, the first is: " + "%2.2f", firstNumber);
        //System.out.printf(" and the second is: " + "2.2f", secondNumber);

        //System.out.println();

        //System.out.printf("Sum=" + "%2.2f, \n", + sum);
        //System.out.printf("Difference=" + "%2.2f, \n", + substraction);
        //System.out.printf("Product=" + "%2.2f, \n", + product);
        //System.out.printf("Quotient=" + "%2.2f, \n", + quotient);

    //Task 2 -CALCULATION OF THE BMI INDEX (IF-ELSE-IF LADDER)--------------------------------------------------------

       // float height, weight, bmi;
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // System.out.println("The program will calculate your BMI");
       // System.out.println("Enter your height in cm (and press Enter): ");
       // height = Float.parseFloat(br.readLine())/100;
       // System.out.println("Enter your weight (and press Enter): ");
      //  weight = Float.parseFloat(br.readLine());

      //  bmi = (float) (weight / (Math.pow(height, 2)));
      //  System.out.printf("Your BMI is: " + "2.2f, \n", bmi);

       // if (bmi<16){
       //     System.out.println("You are starving");
       // } else if((bmi >=16)&&(bmi < 16.99)){
         //   System.out.println("You're emaciated");
      //  } else if((bmi >=17)&&(bmi < 18.49)){
         //   System.out.println("You're underweight");
      //  }else if((bmi >=18.50)&&(bmi < 22.99)){
         //   System.out.println("You are in the low range of the norm");
       // }else if((bmi >=23)&&(bmi < 24.99)){
         //   System.out.println("You're in the high range of the norm");
       // }else if((bmi >=25)&&(bmi < 27.49)){
          //  System.out.println("You are overweight (pre-obese)");
       // }else if((bmi >=27.50)&&(bmi < 29.99)){
         //   System.out.println("You're overweight");
      //  }else if((bmi >=30)&&(bmi < 34.99)){
           // System.out.println("You have 1st degree obesity");
       // }else if((bmi >=35)&&(bmi < 39.99)){
          //  System.out.println("You have 2nd degree obesity");
       // } else if ((bmi > 40)){
           // System.out.println("You have 3rd degree obesity");
       // }

    //TASK 3 CALCULATION OF THE ELEMENTS OF THE EQUATIONSQUARE (USING THE SWITCH INSTRUCTIONS)-------------------------

        //double a, b, c, delta, x1, x2; char rootsNumber = 0;

       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("The program calculates the roots of the equation ax^2+bx+c = 0 ");
        //System.out.println("Enter the value of a and press Enter: ");
       // a = Double.parseDouble(br.readLine());

       // if (a==0){
           // System.out.println("Illegal value for a");
       // }else{
           // System.out.println("Enter the value of b and press Enter:");
          //  b = Double.parseDouble(br.readLine());
           // System.out.println("Enter the value of c and press Enter:");
          //  c = Double.parseDouble(br.readLine());

           // delta = pow(b,2)-4*a*c;
           // if (delta < 0) rootsNumber =0;
            //if (delta == 0) rootsNumber =1;
            //if (delta > 0) rootsNumber =2;

           // switch (rootsNumber){
            //    case 0:
                 //   System.out.println("There are no real roots"); break;
              //  case 1:{
                //    x1 = -b/(2*a);
                  //  System.out.printf("For a = " + "%4.2f,",a);
                   // System.out.printf("For b = " + "%4.2f,",b);
                   // System.out.printf("For c = " + "%4.2f,",c);
                   // System.out.print("the trinomial has one double root = ");
                   // System.out.printf("%4.2f.\n", x1 );
               // }break;
               // case 2: {
                   // x1 = (-b - sqrt(delta)) / (2 * a);
                   // x2 = (-b + sqrt(delta)) / (2 * a);
                  //  System.out.printf("For a = " + "%4.2f,", a);
                   // System.out.printf("For b = " + "%4.2f,", b);
                  //  System.out.printf("For c = " + "%4.2f. \n", c);
                  //  System.out.print("x1 = ");
                  //  System.out.printf("%4.2f.\n", x1);
                  //  System.out.print("x2 = ");
                  //  System.out.printf("%4.2f.\n", x2);
              //  }break;
                }

          //TASK 4 SUMMARY OF EVEN NUMBERS FROM 1 TO 100- USING A FOR LOOP------------------------------------------

              //int even = 100 ; i++){
              //  if (i%2 ==0) {
               //     even += i;
               // }
           // }
             // System.out.println("The sum of even numbers from 1 to 100 is: " + even);

         //TASK 5 FINDING THE BIGGEST AND THE SMALLEST NUMBERS FROM THE SET OF NUMBERS DRAWN BY A LOOP WHILE---------------

           // int collectionSize = 10, i = 1;
           // int number, min = 101, max = 0;
           // System.out.println("The program draws " + collectionSize + "integers numbers from 1 to 100");
           // System.out.println("and finds the smalles and greatest of them");

          //  Random r = new Random();
           // System.out.print("Drawn: ");

           // while (i <= collectionSize)

  //  {
       // number = Math.round((r.nextInt(100) + 1));
       // System.out.print(number + ", ");

        //if (number < min) min = number;
        //if (number > max) max = number;
       // i++;
    //}
            //System.out.println("");
           // System.out.printl n("The llargest number in the collection is: " + max);
           // System.out.println("The smallest number in the set is: " + min);

    }
}
