package randomzier;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrimeRanndomizer1 {
	
	static boolean a;
	static Queue<Boolean> queue1 = new PriorityQueue<Boolean>();
	
	public static Queue<Boolean> checkPrime(int n){  
		
		  int i,m=0,flag=0;      
		  m=n/2;      
		  if(n==0||n==1){  
		   //System.out.println(n+" is not prime number");      
		  a = false;
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     //System.out.println(n+" is not prime number");      
		     a= false;
		     flag=1;      
		     break;      
		    }      
		   }      
	   if(flag==0)  { 
		   //System.out.println(n+" is prime number"); 
		   a=true;
	   }  
	   queue1.add(a);
	   }
		return queue1;
		  
	}  
			
		
}
