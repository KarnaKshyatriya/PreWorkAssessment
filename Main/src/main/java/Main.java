
import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toast
 */



class Main
{
	private static int choice;
	static Scanner sc = new Scanner(System.in);
	
	
public static void main(String args[])
{
 Main obj = new Main();

                

                

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {
case 0: {

exit(0);

break;

}

case 1: {

obj.checkPalindrome();
break;

}



 

case 2: {

 

obj.printPattern();
break;

}



 

case 3: {

obj.checkPrimeNumber();

}


 

case 4: {

 

obj.printFibonacciSeries();
break;

}

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

//sc.close();

}

    private void checkPalindrome() 
    { //To change body of generated methods, choose Tools | Templates.
        System.out.println("Please Enter Number to check");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str2+=str.charAt(i);
            
        }
        if(str.equals(str2))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
        
        
    }

    private void printPattern() { //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Second");
    System.out.println("pLease enter the pattern row number");
    int num=sc.nextInt();
    for(int i=0;i<num;i++)
    {
        for(int j=0;j<num-i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    }
    private void checkPrimeNumber() {//To change body of generated methods, choose Tools | Templates.
        //System.out.println("Third");
        System.out.println("pLease enter a number to Check Prime or Composite");
    int num=sc.nextInt();
    int flag=0;
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            flag=1;
            break;
        }
        else
            flag=2;
    }
        
        if(flag==2)
            System.out.println("Prime Number");
        else
           System.out.println("Not Prime Number"); 
    }
    

    private void printFibonacciSeries() { //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Fourth");\
        System.out.println("Please enter the limit of Fibonacci series");
        int num=sc.nextInt();
        int first=0,second=1,sum;
        System.out.print(first+ " "+second+" ");
        for(int i=2;i<num;i++)
        {
            sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
            
        }
        System.err.println("");
    }
	

}
