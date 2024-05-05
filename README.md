TITLE: CodTech IT Solutions Internship - Task Documentation: “Calculator” 
Using JAVA
INTERN INFORMATION: 
Name: Bijje Purushotham
ID:COD7108
INTRODUCTION
This Java program is a simple calculator that performs basic arithmetic operations: 
addition, subtraction, multiplication, division, and exponentiation. It uses a Scanner 
object to take input from the user for selecting the operation and providing the numbers.
Here's a breakdown of the program:
1. It imports the Scanner class from the java.util package to enable user input.
2. It defines a class named calculator.
3. Inside the main method, it declares variables operator, n1, and n2 to store the 
operator selection and the two numbers for the operation, respectively.
4. It starts an infinite loop (while(true)) to continuously prompt the user for input 
until they choose to quit.
5. Inside the loop, it presents the user with a menu of operations to choose from 
and prompts them to enter an operator.
6. If the user selects the "quit" option (option 6), it prints a goodbye message and 
exits the program.
7. Otherwise, it prompts the user to enter two numbers for the selected operation.
8. Based on the selected operator, it performs the corresponding arithmetic 
operation using a switch statement.
 For addition, it adds the two numbers.
 For subtraction, it subtracts the second number from the first.
 For multiplication, it multiplies the two numbers.
 For division, it divides the first number by the second.
 For exponentiation, it raises the first number to the power of the second using 
Math.pow.
9. It prints the result of the operation.
10 . If the user enters an invalid operator, it displays an error message and prompts 
the user to choose again.
This program provides a simple interactive way for users to perform basic arithmetic 
calculations using Java.
2
Implementation
1. Importing the Scanner class: The program begins by importing the Scanner 
class from the java.util package. This class is used to take input from the 
user via the console.
2. Defining the calculator class: The program defines a class named 
calculator. In Java, everything is defined within a class, and the main 
method is the entry point for execution.
3. Declaring Variables: Inside the main method, the program declares 
variables operator, n1, and n2 to store the operator selection and the two 
numbers for the operation, respectively. These variables are used to hold 
user input and perform calculations.
4. Starting an Infinite Loop: The program starts an infinite loop (while(true)) 
to continuously prompt the user for input until they choose to quit. This 
loop structure ensures that the program keeps running until explicitly 
stopped.
5. Presenting User with a Menu: Inside the loop, the program presents the 
user with a menu of operations to choose from using System.out.println() 
statements. This menu includes options for addition, subtraction, 
multiplication, division, exponentiation, and quitting the calculator.
6. Prompting for Operator Selection: After displaying the menu, the program 
prompts the user to enter an operator selection using the Scanner.nextInt() 
method. The selected operator is stored in the operator variable.
7. Handling Quit Option: If the user selects the "quit" option (option 6), the 
program prints a goodbye message and exits the loop using the break 
statement.
8. Prompting for Numbers: If the user selects an arithmetic operation (options 
1-5), the program prompts the user to enter two numbers for the operation 
using System.out.println() statements. The entered numbers are stored in 
the variables n1 and n2.
9. Performing Arithmetic Operations: Based on the selected operator, the 
program performs the corresponding arithmetic operation using a switch 
statement. Depending on the operator, it adds, subtracts, multiplies, 
divides, or exponentiates the two numbers and stores the result in the result 
variable.
10.Printing the Result: After performing the operation, the program prints the 
result of the operation using System.out.println().
3
11.Handling Invalid Operator: If the user enters an invalid operator (other than 
1-6), the program displays an error message using System.out.println() and 
prompts the user to choose again.
This program provides a basic interactive calculator interface where users 
can perform arithmetic calculations by selecting options from a menu. It utilizes 
user input, conditional statements, loops, and arithmetic operations to achieve 
its functionality.
CONCLUSION
 The provided Java program is a simple calculator that allows users to 
perform basic arithmetic operations such as addition, subtraction, 
multiplication, division, and exponentiation. It follows a structured 
approach by using a Scanner object to take user input and a switch 
statement to perform the corresponding operation based on the user's 
selection.
 The program is designed to run indefinitely until the user chooses to quit. 
It presents the user with a menu of operations, prompts for their choice, 
and executes the selected operation on two input numbers. The program 
handles invalid input gracefully by displaying an error message and 
prompting the user to choose again.
 Overall, this program demonstrates fundamental concepts of Java 
programming, including user input/output, conditional statements, looping 
structures, and basic arithmetic operations. It provides a simple yet 
interactive interface for performing calculations and can serve as a 
foundation for more complex calculator applications.
4
OUTPUT
Microsoft Windows [Version 10.0.22631.3527]
(c) Microsoft Corporation. All rights reserved.
C:\Users\user>cd C:\Users\user\Desktop\internship\03-internship
C:\Users\user\Desktop\internship\03-internship>javac calculator.java
C:\Users\user\Desktop\internship\03-internship>java caluclator
Error: Could not find or load main class caluclator
Caused by: java.lang.ClassNotFoundException: caluclator
C:\Users\user\Desktop\internship\03-internship>java calculator
1-addition
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
1
enter the firstNumber
20
enter the seconndNumber
30
result 50
5
1-addition
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
2
enter the firstNumber
55
enter the seconndNumber
30
result 25
1-addition
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
3
enter the firstNumber
85
enter the seconndNumber
2
result 170
1-addition
6
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
4
enter the firstNumber
100
enter the seconndNumber
5
result 20
1-addition
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
5
enter the firstNumber
12
enter the seconndNumber
6
result 2985984.0
1-addition
2- subtraction
7
3-multiplication
4-division
5-exponentiation
6-quit.
please select operator
6
Calculator is exiting. Goodbye!
enter the firstNumber
85
enter the seconndNumber
56
Invalid choice. Please choose again.
Enter Operator is not vaild
1-addition
2- subtraction
3-multiplication
4-division
5-exponentiation
6-quit.
please select operato
