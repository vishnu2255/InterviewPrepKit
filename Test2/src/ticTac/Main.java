package ticTac;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  
		// TODO Auto-generated method stub
		
	    //findGcd(14, 63);
		
		//genRandom();
		
		Scanner scn = new Scanner(System.in);		
		TicTacToe obj = new TicTacToe();						
		System.out.println("Tic Tac Toe!!");
		
//		obj.printBoard();
		
		do 
		{
		System.out.println("current board layout");
		obj.printBoard();
			
		int row,col;
		
		do {
		
		System.out.println("Player "+obj.getCurrentPlayer() + " Enter an empty row and col to mark");
		row = scn.nextInt()-1;
		col = scn.nextInt()-1;
		
		}
		while(!obj.placeMark(row, col));
		
	
		//multi player
		obj.changePlayer();
		
		
		if(obj.isBoardFull() || obj.isWinner())
		{
			break;
		}
		
		//playing against bot
		int rnum ;
		int cnum ;
		do
		{
//			double rand = Math.random();
//			rand = rand*3 +1;
//			int r = (int)rand;
			
			Random ran = new Random();
			 //ran.nextInt(max-min+1)+min
			 rnum = ran.nextInt(2-0+1)+0;
			 cnum = ran.nextInt(2-0+1)+0;
			 
		}
		while(!obj.placeMark(rnum, cnum));
		
		obj.changePlayer();
		
		}
		while(!obj.isWinner() && !obj.isBoardFull());
		
		if(obj.isBoardFull() && !obj.isWinner())
		{
			System.out.println("Game is a tie");
		}
		else
		{
			System.out.println("current layout");
			obj.printBoard();
			obj.changePlayer();
			
			System.out.println(Character.toUpperCase(obj.getCurrentPlayer()) + " wins the game");
		}	
	}
	
	
	public static void genRandom()
	{
		double rand = Math.random();
		rand = rand*3 +1;
		int r = (int)rand;
				
		Random ran = new Random();
		 //ran.nextInt(max-min+1)+min
		System.out.println(ran.nextInt(2-0+1)+0);
		
	}
	
	public static void findGcd(int a,int b)
	{
		int min;
		int gcd =1;
		if(a>b)
		{
			min = a;
		}
		else
		{
			min = b;
		}
		
		for(int i=min;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
				break;
			}
		}				
		System.out.println(gcd);
	}

}
