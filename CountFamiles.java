import java.util.Scanner;

public class CountFamiles {
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int families = 0;
		
		System.out.println("Enter the number of family incomes you want to enter");
		
		families = keyboard.nextInt();
		
		double[] k = new double[families];
		
		for (int i=0; i<families; i++)
		{
			System.out.println("Please enter the income of the family:");
			k[i] = keyboard.nextDouble();
		}
		
		double maxIncome = 0;
		
		for (int i=0; i<families; i++)
		{
			if (maxIncome < k[i])
			{
				maxIncome = k[i];
			}
		}
		
		System.out.println("The maximum family income that you have entered is: " + maxIncome);
		double percentIncome = (maxIncome * 0.1);
		int count = 0;
		
		System.out.println("The income which are less than 10 percent of the maximum incomes are: ");
		for (int i1 =0; i1 < families; i1++)
		{
			if (k[i1] < percentIncome)
			{
				System.out.println(k[i1]);
				count++;
			}
		}
		System.out.println("The number of familes earning less than 10 percent of the \n" +
				"the maximum are: " + count);
		
	}

}
