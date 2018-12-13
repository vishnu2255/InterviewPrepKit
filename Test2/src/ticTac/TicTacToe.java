package ticTac;

public class TicTacToe {

	private char[][] board;
	private char currentPlayer;
	
	public TicTacToe()
	{
		board = new char[3][3];
		currentPlayer = 'x';
		initializeBoard();
	}
	
	public void initializeBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j] = '-';
			}
		}
	}
	
	public char getCurrentPlayer()
	{
		return currentPlayer;
	}
	
	public void printBoard()
	{
		System.out.println("-------------");
		
		for(int i=0;i<3;i++)
		{
			System.out.print("| ");
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
						
	}
	
	public boolean isBoardFull()
	{
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j] == '-')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isWinner()
	{
		return (checkRows() || checkColumns() || checkDiagonals());
//		return false;
	}
	
	public boolean checkRows()
	{
		
		for(int i=0;i<3;i++)
		{
			if(checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean checkColumns()
	{
		for(int i=0;i<3;i++)
		{
			if(checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean checkDiagonals()
	{
		return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[2][0], board[1][1], board[0][2]) );				
	}
	
	public boolean checkRowCol(char a,char b,char c)
	{
		if(a!='-')
		{
			if(a==b && b==c)
			{
				return true;
			}
		}
		return false;
	}
	
	public void changePlayer()
	{
		if(currentPlayer == 'x')
		{
			currentPlayer = 'o';
		}
		else
		{
			currentPlayer = 'x';
		}
	}
	
	public boolean placeMark(int row,int col)
	{
		if((row>=0 && row<3) && (col>=0 && col<3))
		{
			if(board[row][col] == '-')
			{
				board[row][col] = currentPlayer;
				return true;
			}
		}
		
		return false;
	}
	
	
}
