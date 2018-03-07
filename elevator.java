import java.util.*;

						  
public class elevator  {
	
	public static void main (String [] args) throws InterruptedException {
		 //list of all the floors in the building excluding 1; used temporarily for the upMain arraylist
		 ArrayList <Integer> up = new ArrayList<Integer>();
		 
		 //list of the floors in which the elevator will stop
		 ArrayList <Integer> upMain = new ArrayList<Integer>();
		 
		 //list of floors in which the elevator will stop and will not stop while going up
		 ArrayList <list> comb = new ArrayList<list>();
		 
		 //list of all the floors in the building excluding 1; used temporarily for the downMain arraylist
		 ArrayList <Integer> down = new ArrayList <Integer>();
		 
		 //list of the floors in which the elevator will stop 
		 ArrayList <Integer> downMain = new ArrayList <Integer>();
		 
		 //list of floors in which the elevator will stop and will not stop while going down
		 ArrayList <list> dow  = new ArrayList <list>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to go up? (yes/no) ");
		String line = input.nextLine
			
		//condition to end the do while loop
		boolean doAgain = false;
		if (line.equals("yes")) {

		do {
			
		comb.clear();
		dow.clear();
		
		comb.add(new list(2, false));
		comb.add(new list(3, false));
		comb.add(new list(4, false));
		comb.add(new list(5, false));
		comb.add(new list(6, false));
		comb.add(new list(7, false));
		comb.add(new list(8, false));
		comb.add(new list(9, false));
		comb.add(new list(10, false));
		comb.add(new list(11, false));
		comb.add(new list(12, false));
		
		up.add(2);
		up.add(3);
		up.add(4);
		up.add(5);
		up.add(6);
		up.add(7);
		up.add(8);
		up.add(9);
		up.add(10);
		up.add(11);
		up.add(12);
		
		randomFloor(up, upMain, 3);
		
		selectionSort(upMain);
		
		
		integrate(upMain, comb);
		
		
		
		dow.add(new list(12, false));
		dow.add(new list(11, false));
		dow.add(new list(10, false));
		dow.add(new list(9, false));
		dow.add(new list(8, false));
		dow.add(new list(7, false));
		dow.add(new list(6, false));
		dow.add(new list(5, false));
		dow.add(new list(4, false));
		dow.add(new list(3, false));
		dow.add(new list(2, false));
		
		down.add(2);
		down.add(3);
		down.add(4);
		down.add(5);
		down.add(6);
		down.add(7);
		down.add(8);
		down.add(9);
		down.add(10);
		down.add(11);
		down.add(12);
	
		randomFloor(down, downMain, 6);
		
		selectionSortDescending(downMain);
		
	
		
		integrate(downMain, dow);
		
	

			//stops the thread for 2 seconds after the print statement		
			System.out.println("Starting at floor 1");
			Thread.sleep(2000);
			elevatorUp(comb);
			//stops the thread for 2 seconds when elevator goes from up to down
			Thread.sleep(2000);
			elevatorDown(dow);
			System.out.println("Now back at floor 1");
			
			System.out.println();
			
			System.out.println("Would you like to run the elevator again? (Yes/no)");	
			String in = input.nextLine();
			
			
			if (in.equals("yes")) {
				doAgain = true;
			}
			else
			{
				doAgain = false;
			}
			
			
		} while (doAgain == true);
				

		
		}
	}
	
	//stores the floors in which the elevator will stop from upMain list to comb list by changing boolean value
	//true = elevator will stop ; false = elevator will not stop
	public static void integrate( ArrayList <Integer> upMain, ArrayList<list> comb) {
		for(int i = 0; i < comb.size(); i++ ) {
		
			if (upMain.contains(comb.get(i).getInt())) {
				comb.get(i).change(true);
				
				}	
			}
		}
	
	//
	public static void randomFloor(ArrayList <Integer> a, ArrayList <Integer> b, int c) {
		for (int i = 0; i < 11 - c; i++ ) {
			Collections.shuffle(a);
			b.add(i, a.get(0));
			a.remove(0);
		}
	}
	
	public static void selectionSort(ArrayList <Integer> a) {
		 int n = a.size();
		 
	       
	        for (int i = 0; i < n-1; i++)
	        {
	            
	            int min = i;
	            for (int j = i+1; j < n; j++)
	                if (a.get(j) < a.get(min))
	                    min = j;
	
	            int temp = a.get(min);
	            a.set(min, a.get(i));
	            a.set(i, temp);
	        }
	}
	
	public static void selectionSortDescending(ArrayList <Integer> a) {
		 int n = a.size();
	        for (int i = 0; i < n-1; i++)
	        {
	            
	            int min = i;
	            for (int j = i+1; j < n; j++)
	                if (a.get(j) > a.get(min))
	                    min = j;
	
	            int temp = a.get(min);
	            a.set(min, a.get(i));
	            a.set(i, temp);
	        }
	}
	
	public static void elevatorUp(ArrayList <list> a) throws InterruptedException {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getBol() == true) {
				System.out.println("Going up: now at floor " + (i+2));
				Thread.sleep(2000);
				System.out.println("Stopping at floor " + (i+2));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Starting at floor " + (i+2));
				Thread.sleep(2000);
			}
			else if (a.get(i).getBol() == false) {
				System.out.println("Going up: Now at floor " + (i+2));
				Thread.sleep(2000);
			}
		}
		
		}
	
	public static void elevatorDown(ArrayList <list> b) throws InterruptedException {
		for (int i = 1; i < b.size(); i++) {
			if (b.get(i).getBol() == false){
				System.out.println("Going down: Now at floor " + (b.get(i).getInt()));
				Thread.sleep(2000);
			}
			else if (b.get(i).getBol() == true) {
				System.out.println("Going down: Now at floor " + (b.get(i).getInt()));
				Thread.sleep(2000);
				System.out.println("Stopping at floor " + (b.get(i).getInt()));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Starting at floor " + (b.get(i).getInt()));
				Thread.sleep(2000);
			}
			
			
		}
	}

	
		
	
}

	
class list {
	
	int a;
	boolean b;
	
	public list(int a, boolean b) {
		this.a = a;
		this.b = b;
	}
	
	public void change(boolean value) {
		b = value;
		
	}
	
	public int getInt() {
		return a;
	}
	
	public boolean getBol() {
		return b;
	}
	
	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}



		
		
	
	


	
