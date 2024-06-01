import java.util.Scanner;

class Skills
{
	public static void main(String args[])
	{
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("python");
		skills.add("C");
		skills.add("HTML CSS");
		skills.add("Operating System");

		for(int i = 0; i <= skills.size(); i++)
		{
			System.out.println(skills.get(i));
		}
	}
}
