import java.util.Scanner;

public class day_8_NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2. Maximum of Three Numbers

            /*int a, b, c;
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
            System.out.print("Enter third number: ");
            c = sc.nextInt();
            int max;
            if(a >= b && a >= c) {
                max = a;
            } else if(b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println("Maximum number is: " + max);
        }*/

        // 3. Prime Number Checker

           /* int n;
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            boolean prime = true;
            if(n <= 1) {
                prime = false;
            } else {
                for(int i = 2; i <= n/2; i++) {
                    if(n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if(prime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }*/

        // 4. Fibonacci Sequence Generator

           /* int terms;
            System.out.print("Enter number of terms: ");
            terms = sc.nextInt();
            int f = 0, g = 1;
            System.out.print("Fibonacci sequence: ");
            for(int i = 1; i <= terms; i++) {
                System.out.print(f + " ");
                int next = f + g;
                f = g;
                g = next;
            }
            System.out.println();
        }*/

        // 5. Palindrome Checker

            /*System.out.print("Enter a string: ");
            String str = sc.next();
            String rev = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if(str.equals(rev)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }*/

        // 6. Factorial Using Recursion (but here without recursion, inside main only)

            /*int n;
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }*/

        // 7. GCD and LCM Calculator

            /*int x, y;
            System.out.print("Enter first number: ");
            x = sc.nextInt();
            System.out.print("Enter second number: ");
            y = sc.nextInt();
            int a = x, b = y;
            while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int gcd = a;
            int lcm = (x * y) / gcd;
            System.out.println("GCD: " + gcd);
            System.out.println("LCM: " + lcm);
        }*/

        // 8. Temperature Converter
            /*System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
            int choice = sc.nextInt();
            if(choice == 1) {
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                double f = (c * 9/5) + 32;
                System.out.println("Fahrenheit: " + f);
            } else if(choice == 2) {
                System.out.print("Enter Fahrenheit: ");
                double f = sc.nextDouble();
                double c = (f - 32) * 5/9;
                System.out.println("Celsius: " + c);
            } else {
                System.out.println("Invalid choice.");
            }
        }*/

        // 9. Basic Calculator
            /*System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Choose operation (+ - * /): ");
            char op = sc.next().charAt(0);
            double result = 0;
            if(op == '+') {
                result = num1 + num2;
            } else if(op == '-') {
                result = num1 - num2;
            } else if(op == '*') {
                result = num1 * num2;
            } else if(op == '/') {
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero not allowed.");
                }
            } else {
                System.out.println("Invalid operator.");
            }
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}*/


    }}