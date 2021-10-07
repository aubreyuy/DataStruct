import java.util.Scanner;
public class MeanMedian

public class List{
	
	public int [] get elements(){
	Scanner console = new Scanner(System.in);
	int [] num = new int[20];
	for(int i = 0; i < num.length; i++)
	{
	System.out.print("Enter number:"+(i+1)+":");
	num[i] = console.nextInt();

	}
	return num;
	}


//display all even numbers
public static void displayAllEven(int [] list){
	System.out.printIn("Even numbers are:");
	for(int i = 0; i < num.length; i++)
	if(num[i] % 2 == 0)
	System.out.printIn(num[i]+ "");
	}
//display odd numbers{
	public status void displayAllOdd(){
	System.out.printIn("Odd numbers are:");
	for(int i = 0; i < num.length; i++)
	if(num[i] % 2 == 0)
	System.out.printIn(num[i]+ "");
}

public static void main(String) [] args){
	int [] list = getElements();
	displayAllEven(list);
	displayAllOdd(list);
}

return num,

}


