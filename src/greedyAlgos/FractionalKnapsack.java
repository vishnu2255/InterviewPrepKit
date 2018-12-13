package greedyAlgos;

import java.util.Scanner;

public class FractionalKnapsack {

	double[] weight;
	double[] benefit;
	double[] ratio;
	double W;
	
	public FractionalKnapsack() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num of items in the sack ");
		int n = sc.nextInt();
		
		System.out.println("Enter the weight and benefit");
		weight = new double[n];
		benefit = new double[n];
		ratio = new double[n];
						
		for(int i=0;i<n;i++)
		{
		weight[i] = sc.nextDouble();
		benefit[i] = sc.nextDouble();
		ratio[i] = weight[i]/benefit[i];
		
		}
		
		System.out.println("Enter the weight of the knapsack");
		W = sc.nextDouble();
	}

	int getNext()
	{
		double  highest = 0;
		int index=-1;
		for(int i=0;i<benefit.length;i++)
		{
			if(ratio[i]>highest)
			{
				highest = ratio[i];
				index=i;
			}
		}		
		return index;
	}
	
	void fill()
	{
	double cw = 0;
	double cb =	0;
	
	System.out.println("items considered\n");
	
	while(cw<W)
	{
		int item = getNext();
		if(item == -1)
		{
			break;
		}
		
		System.out.println(item+" , ");  
		 
		if(cw + weight[item] <= W)
		{
		cw = cw + weight[item];
		cb = cb + benefit[item];
		
		ratio[item] = 0;
		}		
		else			
		{
		cb = cb + (ratio[item]*(W-cw));
		cw = cw + (W-cw);
		break;
		}
	}
	
	System.out.println("mx benefit = "+cb+" max weight = "+ cw);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FractionalKnapsack fw = new FractionalKnapsack();
		fw.fill();
	}

}
