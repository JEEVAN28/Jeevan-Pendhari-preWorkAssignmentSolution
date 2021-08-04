import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {

        	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
        						+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
        						+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

        	System.out.println();

        	choice = sc.nextInt();

        	switch (choice) {
        	case 0:
        		choice = 0;
        		break;
        	case 1: {
        		obj.checkPalindrome();
        		}break;
        	case 2: {
        		obj.printPattern();
        		}break;
        	case 3: {
        		obj.checkPrimeNumber();
        		}break;
        	case 4: {
        		obj.printFibonacciSeries();
        		}break;
        	default:
        		System.out.println("Invalid choice. Enter a valid no.\n");
        		}
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

	}
		
	
	public void checkPalindrome(){
		  
		  Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter Value to check Palindrome");
			  // It is the number variable to be checked for palindrome
			  int r,sum=0,enteredVal; 
			  // Read Value from Scanner
			  int pNo=scanner.nextInt();  
			  enteredVal=pNo;    
			  while(pNo>0){
			   //getting remainder by dividing 10
			   r=pNo%10;    
			   // multiply reminder by 10 and add mod value
			   sum=(sum*10)+r;    
			   // finally divide by 10 to original entered value
			   pNo=pNo/10;    
			  }    
			  if(enteredVal==sum)    
			   System.out.println("Entered Number is Palindrome");    
			  else    
			   System.out.println("Entered Number is Not Palindrome");
			  
			  System.out.println();
			
	}

	
	public void checkPrimeNumber(){
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter Value to check Prime Number");  
		  // Read Value from Scanner
		  int primeNo=scanner.nextInt();  
		  
		  int i,halfNo=0,flag=0; 
		  // divide prime number by 2
		  halfNo=primeNo/2;   
		  // if entered value is 1 or 0 then it is not prime number
		  if(primeNo==0||primeNo==1){  
		   System.out.println(primeNo+" is not prime number");      
		  }else{  
			  // check any value above 1
		   for(i=2;i<=halfNo;i++){      
		    if(primeNo%i==0){      
		     System.out.println(primeNo+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(primeNo+" is prime number"); }  
		  }//end of else  
		  System.out.println();
		  
		} 
	
	public void printFibonacciSeries(){
		  
		  Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter Value for Fibonacci Series");  
			  // Read Value from Scanner
			  int count=scanner.nextInt();  
			  int i;
			  int first=0,n2=1,n3; 
			  
			  
			  //by default first two numbers are 0,1 (hardcoded),
			  System.out.print(first+" "+n2);
			  
			  i=2;
			  // starting loop from 2 because 0 and 1 are already printed
			  do {
			    // Add first + n2
				   n3=first+n2;    
				   // display series value
				   System.out.print(" "+n3);
				   // set n2 value to first and n3 value to n2
				   first=n2;    
				   n2=n3;    
				   ++i;
			  }while(i<count);    
			  System.out.println();
			  
		 
		}
	
	public void printPattern(){
		  
		  Scanner scanner = new Scanner(System.in);
		    
		  System.out.println("Enter Value to draw Star Pattern");  
		  // Read Value from Scanner
		  int pNo=scanner.nextInt();  
		  int star=pNo;
		  
		  while(pNo>0){
		   while (star>0) {
			   System.out.print("*");
			   //reduce star by 1
			   star--;
		   }
		   // reduce input value by one
		   pNo--;
		   // set next star value
		   star=pNo;
		   // line feed
		   System.out.println();  
		  }
		  
		  System.out.println();
		  
		 
		}  
}

