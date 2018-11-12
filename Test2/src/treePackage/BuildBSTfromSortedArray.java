package treePackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BuildBSTfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6} ;
		Tree node = buildBSTfromSarray(arr, 0, arr.length-1);
		
		System.out.println(node.data + " , " + node.left.data + " , "+ node.ryt.data);
		
		spiralForm(node);
		
//		buildBalTree();
	}
	
	//insert an el to tree
	
	public static void insert(int data,Tree root)
	{
		Queue<Tree> q =new LinkedList<Tree>();
		
		Tree newnode = new Tree(data);
		
		if(root!=null)
		{
			q.add(root);
			
			while(!q.isEmpty())
			{
				Tree tmp = q.poll();
				
				System.out.println(tmp.data);
				
				if(tmp.left != null)
				{
					q.add(tmp.left);
				}
				else
				{
//					q.add(newnode);
					tmp.left = newnode;
					break;
				}
				
				if(tmp.ryt != null)
				{
					q.add(tmp.ryt);
				}
				else
				{
					//q.add(newnode);
					tmp.ryt = newnode;
					break;
				}
			}
			
			
		}
	}

	//Tree is mirror image or not
	
	public static boolean isMirror(Tree root)
	{
		if(root!=null)
		{
			return isFoldable(root.left, root.ryt);
		}
		
		return false;
	}
	
	
	public static boolean isFoldable(Tree node1,Tree node2)
	{
		if(node1 == null && node2 == null)
		{
			return true;
		}
		
		if(node1==null || node2==null)
		{
			return false;
		}
		
		return isFoldable(node1.left, node2.ryt) && isFoldable(node1.ryt, node2.left);

	}
	
	//convert to sum tree	
	public static int convertToSum(Tree root)
	{
		if(root!=null)
		{
			int pdata = root.data;
			
			int left = convertToSum(root.left);
			int ryt  = convertToSum(root.ryt);
			
			root.data = left + ryt;
			
			return pdata + left + ryt;
		}
		
		return 0;
	}
	
	
	public static int evaluationExpreTree(Tree root)
	{
		if(root!=null)
		{
			if(root.left == null && root.ryt ==null)
			{
				return root.data;
			}
			
			int leftsum = evaluationExpreTree(root.left);
			int rytsum =  evaluationExpreTree(root.ryt);
			
			int c = root.data;
			
			if((char)c== '+')
			{
				return leftsum + rytsum ;
			}
			else if((char)c == '-')
			{
				return leftsum + rytsum ;
			}
			else if((char)c == '*')
			{
				return leftsum * rytsum ;
			}
			
		}
		
		return 0;
	}
	
	public static void spiralForm(Tree root)
	{
		Stack<Tree> st1 = new Stack<Tree>();
		Stack<Tree> st2 = new Stack<Tree>();
		
		st1.add(root);
		
		while(!st1.isEmpty() || !st2.isEmpty())
		{		
			while(!st1.isEmpty())
			{
				Tree temp = st1.pop();
				System.out.println(temp.data);
				
				if(temp.left != null)
				{
					st2.add(temp.left);
				}
				if(temp.ryt !=null)
				{
					st2.add(temp.ryt);
				}
				
			}
			
			while(!st2.isEmpty())
			{
				Tree temp2 = st2.pop();
				System.out.println(temp2.data);
				
				if(temp2.ryt != null)
				{
					st1.add(temp2.ryt);
				}
				
				if(temp2.left != null)
				{
					st1.add(temp2.left);
				}
				
			}
		}
		
		
	}
	
	public static Tree buildBSTfromSarray(int[] arr,int start,int end)
	{
		if(start>end)
		{
			return null ;
		}
		
		int mid = (start+end)/2;
		
		Tree newt = new Tree(arr[mid]);
		
		newt.left = buildBSTfromSarray(arr, start, mid-1);
		newt.ryt  = buildBSTfromSarray(arr, mid+1, end);
		
		return newt;
	}
	
	
	//build balanced tree from binary search tree
	
	public static void buildBalTree(Tree root)
	{
//		int[] ar = {1,2};
//		
//		System.out.println(ar[0]);
//		
//		test(ar);
//		
//		System.out.println(ar[0]);
		
		
		Tree[] trearr = new Tree[10];
		storeBSTinArr(root, trearr, 0);
		buildBSTfromArr(trearr, 0, trearr.length-1);
		
		
		
	}
	
	public static void test(int[] a)
	{
		a[0] = 12;
	}
	
	public static Tree buildBSTfromArr(Tree[] tr,int s,int e)
	{
		if(s<=e)
		{
		int mid = (s+e)/2;
		Tree temp = tr[mid];
		
		temp.left = buildBSTfromArr(tr, s, mid-1);
		
		temp.ryt  = buildBSTfromArr(tr, mid+1, e);
		
		return temp;
		
		}
		return null;
	}
	
	//storing nodes in array in in order traversal means in ascending order!!
	public static void storeBSTinArr(Tree root,Tree[] ar,int i)
	{		
		if(root!=null)
		{
			storeBSTinArr(root.left, ar, i);
			ar[i++]   = root;
			storeBSTinArr(root.ryt, ar, i);
			
		}				
	}
	
}
