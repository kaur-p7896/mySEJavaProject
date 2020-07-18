import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your username: ");
		String name=input.nextLine();
		System.out.println("Enter Password: ");
		String pass=input.nextLine();
		
		System.out.println("Would you like to select \n 1.Daily Mood Option\n 2. Relax mind Option\n3.Interaction Option ");
	     int option= input.nextInt();
	     input.nextLine();
	     switch(option)
	     {
	     case 1:
	    	 System.out.println("Daily Mood option");
	    	 break;
	     case 2: 
	    	 System.out.println("Relax Mind option");
	    	 break;
	     case 3:
	    	
	    	 System.out.println("Choose 1.Social Group 2. Counselling");
	    	 if(input.nextInt()==1)
	    	 {
	    		 input.nextLine();
	    		 System.out.println("Welcome to Group!!!");
	    		 socialGroup obj1= new socialGroup();
	    		 obj1.setName();
	    		 obj1.setDate();
	    		 obj1.discuss();
	    		
	    		   		 
	    		 
	    	 }
	    	 else
	    	 { 
	    		 input.nextLine();
	    		 System.out.println("You have to get premium to access counselling");
	    		 System.out.println("Do you want to get premium? Y/N");
	    		 //String choice=
	    		 if((input.nextLine()).equalsIgnoreCase("Y"))
	    		 {
	    			doctor obj2=new doctor();
	    			obj2.showPrice();
	    			System.out.println("Choose 1: Monthly Subscription\n2: 4-Month Subscription\n3:1-Year Subscription");
	    			int premium=input.nextInt();
	    			obj2.counselling();
	    		 }
	    		 else
	    			 System.out.println("Sorry! You can't get access to Counselling");
	    		 
	    	 }
	    		 
	    	 break;
	    	
	     }
	     
	}

}
