
import java.io.*;
import static java.lang.System.exit;
//import java.util.Scanner;

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
	static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in) );
	
	
public static void main(String args[])throws IOException
{
 Main obj = new Main();

                

                


do{
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();


try{
choice = Integer.parseInt(sc.readLine());
}
catch(Exception e)
{
    System.out.println("Please Enter a integer number from the above choices");
}

switch (choice) {
case 0: {
System.out.println("Exited Successfully!!!");
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
break;

}


 

case 4: {

 

obj.printFibonacciSeries();
break;

}

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);



//sc.close();

}

    private void checkPalindrome() 
    { //To change body of generated methods, choose Tools | Templates.
        System.out.println("Please Enter Number to check");
        int num=0;
        try{
        num=Integer.parseInt(sc.readLine());
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
        catch(Exception e)
        {
            System.out.println("Please enter an Integer number");
          
        }
        
        
        
        
    }

    private void printPattern() { //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Second");
    System.out.println("pLease enter the pattern row number");
    int num=0;
   try{
        num=Integer.parseInt(sc.readLine());
         for(int i=0;i<num;i++)
    {
        for(int j=0;j<num-i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
        }
        catch(Exception e)
        {
            System.out.println("Please enter an Integer number");
      
        }
   
    
    }
    private void checkPrimeNumber() {//To change body of generated methods, choose Tools | Templates.
        //System.out.println("Third");
        System.out.println("pLease enter a number to Check Prime or Composite");
        int num=0;
    try{
        num=Integer.parseInt(sc.readLine());
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
        catch(Exception e)
        {
            System.out.println("Please enter an Integer number");           
        }
    
    }
    

    private void printFibonacciSeries() { 
        System.out.println("Please enter the limit of Fibonacci series");
        int num=0;
        try
        {
        num=Integer.parseInt(sc.readLine());
         int first=0,second=1,sum;
        System.out.print(first+ " "+second+" ");
        for(int i=2;i<num;i++)
        {
            sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
            
            
        }
        System.out.println("");
    }
        
        catch(Exception e)
        {
            System.out.println("Please enter a Ineteger number as input");
        
        }
       
}
}
	

