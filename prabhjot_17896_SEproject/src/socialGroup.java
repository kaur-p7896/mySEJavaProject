import java.util.Scanner;

public class socialGroup  {


	public String groupName;
	public String date;
	public socialGroup() {
		groupName="Facebook Group";
		date="20/02/20";
	}

	public String setName()
	{
		return groupName;
	}
	public String setDate()
	{
		return date;
	}
	public void discuss()
	{
		System.out.println("Write your thoughts in form");
		Scanner input=new Scanner(System.in);
		String thoughts= input.nextLine();
		System.out.println(thoughts);
	}
}



