import java.util.Scanner;
class MaxMinSumAvg
{
	public static void main(String[] args)
	{
		int n,min,max,sum;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		n=sc.nextInt();
		int ar[]=new int[n];

		System.out.print("enter"+n+"elements:");
		for(int i=0;i<n;i++)
			ar[i] = sc.nextInt();

		max = ar[0];
                min =ar[0];
                sum =0;

		System.out.print("Array elements are:-");
		for(int i=0;i<n;i++){
			if(ar[i] > max)
				max = ar[i];
			if(ar[i] < min)
				min = ar[i];
			System.out.print(ar[i]+" ");
			sum += ar[i];
		}

		avg = (float)(sum/n);

		System.out.println("Minimum element:- "+min);
		System.out.println("Maximum element:- "+max);
		System.out.println("Sum of all elements:- "+sum);
		System.out.println("Average of all elements:- "+avg);

		sc.close();
	}
}


