package com.ojas.collnSet;

public class Demo {

	public static void main(String[] args) {
		// int num1 = 20;
		// double num2 = 0;
		// if (num1 >= 20)
		// num2 = 1.5;
		// if (num1 < 30)
		// num2 = 2;
		// System.out.println("Value of num2 is " + num2);
		// int num1 = 25;
		// int num2 = 34;
		// if (num1 / 3 >= num2 / 4) {
		// num1 = num1 + 1;
		//
		// } else {
		// num2 = num2 + 1;
		// }
		// System.out.println(num1 + "," + num2);

		// int a = 12 * 3 - 9 / 2;
		// int b = 14 * 4 + 175 / 8;
		// if (a++ % 2 == 0) {
		// if (b-- % 4 == 0) {
		// System.out.println("a = " + a + " b = " + b);
		// } else {
		// System.out.println("a = " + a + " b = " + b);
		// }
		// } else {
		// System.out.println("a = " + a + " b = " + --b);
		// }
		// int num1=0,num2=5;
		// if ((num1 / num2 == 5) && (num1 + num2) > 5) {
		// System.out.println("1");
		// } else if ((num1 - num2) >= 1 || (num1 % num2) == 0) {
		// System.out.println("2");
		// } else {
		// System.out.println("3");
		// }

		// int i = -1, j = -1;
		// switch (i) {
		// case -1:
		// j = 1;
		// case 2:
		// j = 2;
		// break;
		// default:
		// j = 0;
		// }
		// System.out.println("j = " + j);
		// float k=12.0f;

		// double i;
		// char j = 'b';
		//
		// switch (j) {
		// case 'a':
		// case 'A':
		// i = 7.5;
		// break;
		// case 'b':
		// case 'B':
		// i = 5.5;
		// break;
		//
		// case 'c':
		// case 'C':
		// i = 2.5;
		// break;
		//
		// default:
		// i = 0.5;
		// }
		// System.out.println(i);
		/*
		 * practise display the maximum number out of the given three numbers.
		 */
		// Display biggest no:==> int num1=3,num2=4,num3=1;
		int num1 = 4, num2 = 4, num3 = 1;
		int output = (num1 < num2) ? 4 : ((num2 > num3) ? 4 : 1);
		System.out.println(output);
		/////
		int k = 1;
		switch (k) {
		default:
			System.out.println("Hello");
		case 1:
			System.out.println("Welcome");
		case 2:
			System.out.println("To");
		case 3:
			System.out.println("Infosys");
			break;
		}

		/*
		 * Create a new Java project with "AddressDetails.java" file and
		 * implement a Java code to display your address.
		 */
		// class Tester {
		// public static void main(String[] args) {
		String DoorNo = "D089", Street = "St. Louis_Street", City = "Springfield";
		int ZIPCode = 62729;
		System.out.println("Door No: " + DoorNo + "\n" + "Street: " + Street + "\n" + "City: " + City + "\n"
				+ "ZIP Code: " + ZIPCode);
		// }
		// }

		/*
		 * Implement a program to find the area of a circle by using the formula
		 * given below and display the calculated area.
		 */
		// class Tester {
		// public static void main(String[] args) {
		double pi = 3.14;
		int radius = 4, radius1 = 10;
		double output1 = pi * radius * radius;
		double output_ = pi * radius1 * radius1;
		System.out.println(output + "\n" + output_);
		// }
		// }

		/*
		 * Implement a program to convert temperature from Fahrenheit to Celsius
		 * degree by using the formula given below and display the converted
		 * value.
		 */
		// class Tester {
		// public static void main(String[] args) {
		int F = 32, _F = 50;
		double C = ((F - 32) / 9) * 5;
		double Celsius = ((_F - 32) / 9) * 5;
		System.out.println("Current Celsius \'(C)\' is: " + C);
		System.out.println("Current Celsius \'(C)\' is: " + Celsius);
		// }
		// }

		/*
		 * Implement a program to display the sum of two given numbers if the numbers are same.
		 *  If the numbers are not same, display the double of the sum.
		 */
		
				int numberOne = 6, numberTwo = 5;
				if (numberOne == numberTwo) {
					System.out.println("Expected output is: " + (numberOne + numberTwo));

				} else {
					System.out.println("Expected output is: " + (2 * (numberOne) + 2 * (numberTwo)));
				}
	

		
				int numberThree = 5, numberFour = 5;
				if (numberThree == numberFour) {
					System.out.println("Expected output is: " + (numberThree + numberFour));

				} else {
					System.out.println("Expected output is: " + (2 * (numberThree) + 2 * (numberFour)));
				}
				
		/*coefficients.
Implement a program to solve a quadratic equation*/	
				
//				class Tester {
//					public static void main(String[] args) {
						  int a=1;
				        int b=4;
				        int c=6;
				        double root,root1,root2;
				        int descriminator=(b*b-(4*a*c));
				        
				        if(descriminator==0){
				        root=(-b + descriminator)/2*a;
				         System.out.println("the roots of the equation is:"+ root);
				         }
				         else if(descriminator>0){
				         root1=(-b + descriminator)/2*a;
				          root2=(-b - descriminator)/2*a;
				         System.out.println("the first root is:"+root1);
				         System.out.println("the second root is:"+root2);
				         }
				         else{
				         System.out.println("The equation has no real root");
				         } 
//					}
//				}



	}

}
