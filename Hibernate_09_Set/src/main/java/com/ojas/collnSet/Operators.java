package com.ojas.collnSet;

public class Operators {

	public static void main(String[] args) {
				// Shift operator (<< and >>) is used to move the left operands value by
				// the number of bits specified.
//				int a = 10;
//				int b = 20;
//				System.out.println(a << 2); // left-shift operator moves the value to
//											// the left side
//				System.out.println(b >> 3); // right-shift operator moves the value to
//											// the right side
//
//				// Unsigned right shift operator(>>>)
//				System.out.println(a >> 2);
//				System.out.println(a >>> 2);
				// works in the same way for positive numbers

//				int c = -1;
//				System.out.println(c >> 2);
//				System.out.println(c >>> 2);

				// There is no unsigned left shift operator(<<<). The below line leads
				// to an error
				// System.out.println(a<<<2);

				// Bitwise operators are used to perform manipulation of individual bits

				// Logical OR(||) does not check second condition if first is true
				// Bitwise OR(|) always checks both conditions even if first condition
				// is true or false
//				System.out.println(a | b);

				// Logical AND(&&) does not check second condition if first is false
				// Bitwise AND(&) checks both conditions even if first condition is true
				// or false
//				System.out.println(a & b);
				

				int variableOne = 10;
				float variableTwo = variableOne;
				System.out.println(variableOne);
				System.out.println(variableTwo);
				/* Here, a variable of data type having smaller range is automatically
				 accommodated in a variable of data type having bigger range. This is
				 known as widening.*/

				/* When we try to accommodate a variable of data type having bigger
				 range into a data type having smaller range, it leads to an error.*/
				float variableThree = 12.5f;
				int variableFour = (int) variableThree; // comment this line or fix the error
													// to execute the code successfully
				System.out.println(variableThree);
				System.out.println(variableFour); // comment this line or fix the error
													// to execute the code successfully

				/* Since our assignment is leading to loss of data, we need to
				explicitly specify that the data needs to be converted to a data type
				/having smaller range.
				 This is known as explicit typecasting.*/
				int variableFive = (int) variableThree;
				System.out.println(variableFive);
				
				short number = 32767; 
				short numberTwo = (short)(number + 1); 
				System.out.println("number 2 is: " +numberTwo);

				
				int i = 10;int discountPercentage = 10;
				double totalPrice = 200;
				double priceAfterDiscount = totalPrice * (1 - ((double)discountPercentage / 100)); 
				System.out.println(priceAfterDiscount);
//				if(i) {
//					System.out.println("Hello"); 
//				} 
//				else { 
//					System.out.println("Bye"); 
//				}
		
				
						String customerType = "Regular";
						int quantity = 2;
						int unitPrice = 10;
						int totalCost = 0;
						int discount = 5;
						totalCost = unitPrice * quantity;
						if (customerType == "Regular") {
							totalCost = totalCost - (totalCost * discount / 100);
							System.out.println("You are a regular customer and eligible for 5% discount");
						}
						System.out.println("Total cost: " + totalCost);
						
						
						//////////////////////////
//						
//								String customerType = "Regular";
//								int quantity = 3;
//								int unitPrice = 10;
//								int discount = 5;
								int deliveryCharge = 5;
//								int totalCost = unitPrice * quantity;
								if (customerType == "Regular") {
									totalCost = totalCost - (totalCost * discount / 100);
									System.out.println("You are a regular customer and eligible for 5% discount");
									System.out.println("The total cost to be paid is " + totalCost);
								} else if (customerType == "Guest") {
									totalCost = totalCost + deliveryCharge;
									System.out.println("You need to pay an additional delivery charge of $5");
									System.out.println("The total cost to be paid is" + totalCost);
								} else // If there is only one statement inside a block, {} is optional
									System.out.println("Invalid customer type");
						
//////////////////////////////////////

		}

}