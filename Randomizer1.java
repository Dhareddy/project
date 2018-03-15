package randomzier;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Randomizer1 {

	static Queue<Boolean> p; 
	
	public static Queue<Integer> sendingRandomNumber(){
			
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
          int randomN = objGenerator.nextInt(100);
          //System.out.println("Random No : " + randomN);  
          
          queue.add(randomN);
       
        }
        return queue;
	}
	
	public static void main(String args[]){
		Queue<Integer> q1  = Randomizer1.sendingRandomNumber();
		
			for(int q2:q1){
				 p = PrimeRanndomizer1.checkPrime(q2);
			}
			for(boolean p1:p){
				System.out.println(p1);
			}
			
	}	
}




	