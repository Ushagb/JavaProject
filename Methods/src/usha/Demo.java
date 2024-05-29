package usha;

class computer
{
	public void PlayMusic()  //Method declaration
	{
		System.out.println("Music Playing");
	}
	public String getMeAPen(int cost)
	{
		if(cost >= 10)
		     return "pen";
		else
			return "Nothing";
	}
}
public class Demo {
	public static void main(String args[])
	{
		computer obj = new computer();    //create a object
				obj.PlayMusic();                  //calling a method
				String str = obj.getMeAPen(20);
				System.out.println(str);
	}

}
