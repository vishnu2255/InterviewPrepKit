package treePackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root = new Tree(1);
//		Tree root2 = new Tree(143);
		
		Tree n1 = new Tree(2);		
		Tree n2 = new Tree(3);		
		Tree n3 = new Tree(4);		
		Tree n4 = new Tree(5);		
		Tree n5 = new Tree(6);
		
		root.left = n1;
		root.ryt  = n2;
//		n1.left = n3;
//		n1.ryt  = n4;
		
		n2.ryt = n4;
		n2.left= n5;
		
		int[] ar = new int[10];
		
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		
		verticalSum(map, root, 0);
		
		for(Entry<Integer, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + "  ,  "+ m.getValue());
		}
//		System.out.println(calcHeight2(root));
		
//		roottoleafpaths(root, 0, ar);
		
		//System.out.println(findMaxLevelSum(root));
		
//		printLevelReverse(root);
		
//		System.out.println(cntLeaves(root));
//		System.out.println(calcHeight(root));
		
//		System.out.println(root.data);
//		deleteTree(root);
		
//		if(root!=null)
//		{
//			System.out.println(root.data);	
//		}	
	}
	
	//find vertical sums
	
	public static void verticalSum(HashMap<Integer,Integer> hash,Tree root,int c)
	{
		if(root.left!=null)
		{
			verticalSum(hash, root.left, c-1);
		}
						
		if(root.ryt!=null)
		{
			verticalSum(hash, root.ryt, c+1);
		}
		
		if(hash.containsKey(c))
		{
			int temp = root.data;
			int val = hash.get(c);
			hash.put(c, temp+val);
		}
		else
		{
			hash.put(c, root.data);
		}
		
	}
	
	
	//find height recursive method
	public static int calcHeight(Tree root)
	{
		if(root!=null)
		{
			int left = calcHeight(root.left);
			int ryt  = calcHeight(root.ryt);
			
			return (left>ryt)?left+1:ryt+1;
		}
		
		return 0;
	}
	
	//find height using level order
	
	public static int calcHeight2(Tree root)
	{
		Queue<Tree> q = new LinkedList<Tree>();
		int cnt=1;
		
		q.add(root);
		q.add(null);
		
		if(root!=null)
		{
			while(!q.isEmpty())
			{
				Tree temp = q.poll();
			
				if(temp!=null)
				{
					
					//min depth condition
					// add this condition for finding min depth
//					if(temp.left ==null && temp.ryt ==null)
//					{
//						return cnt;
//					}					
					if(temp.left!=null)
					{
						q.add(temp.left);
					}
					if(temp.ryt!=null)
					{
						q.add(temp.ryt);
					}					
				}
				else
				{
					if(!q.isEmpty())
					{
						cnt++;
						q.add(null);	
					}					
				}							
			}
			
		}
		
		return cnt;
	}
	
	public static int cntLeaves(Tree root)
	{
		if(root!=null)
		{
//			if(root.left ==null && root.ryt ==null)
//			{
//				return 1;
//			}
			
			if(root.left !=null && root.ryt !=null)
			{
				return 1 + cntLeaves(root.left)+ cntLeaves(root.ryt);
			}
		
			if(root.left!=null)
			{
				return cntLeaves(root.left);
				
			}
			
			if(root.ryt!=null)
			{
				return cntLeaves(root.ryt);
			}
			
//			int lef = cntLeaves(root.left);
//			int ryt  =cntLeaves(root.ryt);
//			
//			return lef+ryt;
		}
		
		return 0;
	}
	
	//find deepest node-->last node inlevel traversal
	
	public static Tree deepest(Tree root)
	{
		if(root!=null)
		{
			Queue<Tree> q = new LinkedList<Tree>();
			Tree res = null;
			int cntleaves = 0;
			int cntfullnodes = 0;
			
			q.add(root);
			
			while(!q.isEmpty())
			{
				res = q.poll();
				
				if(res.left==null && res.ryt==null)
				{
					cntleaves++;					
				}
				
				if(res.left!=null && res.ryt!=null)
				{
					cntfullnodes++;					
				}
			
				if(res.left!=null)
				{
					q.add(res.left);
				}
				
				if(res.ryt!=null)
				{
					q.add(res.ryt);
				}			
			}
			return res;
			
		}
		
		return null;
	}
	
	public static int findMaxLevelSum(Tree root)
	{
		if(root!=null)
		{
			Queue<Tree> q = new LinkedList<Tree>();
			int cursum = 0,tem=0;
			int maxsum =0;
			
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty())
			{
				Tree temp = q.poll();
				
				if(temp!=null)
				{
									
				cursum = cursum + temp.data;
				
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.ryt!=null)
				{
					q.add(temp.ryt);
				}
				
				}
				else
				{
					if(cursum>maxsum)
					{
						maxsum = cursum;
					}
					cursum = 0 ;
					
					if(!q.isEmpty())
					{
						q.add(null);
					}
				}								
			}			
			return maxsum;
		}		
		return 0;
	}
	public static int i=0;
	
	public static void roottoleafpaths(Tree root,int level,int[] arr)
	{
		if(root!=null)
		{
			int tm = root.data;
			arr[level] = tm;
			if(root.left ==null && root.ryt ==null)
			{
				for(int i=0;i<=level;i++)
				{
					System.out.println(arr[i]);
				}
				System.out.println(" path ");
			}						
			
			roottoleafpaths(root.left, level+1, arr);
			roottoleafpaths(root.ryt, level+1, arr);
			
		}
		
	}
	
	public static void printLevelReverse(Tree root)
	{
		if(root!=null)
		{
			Queue<Tree> q = new LinkedList<Tree>();
			Stack<Tree> st = new Stack<Tree>();
			
			q.add(root);
			
			while(!q.isEmpty())
			{
				Tree temp = q.poll();
				
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				
				if(temp.ryt != null)
				{
					q.add(temp.ryt);
				}
				
				st.add(temp);
			}
			
			while(!st.isEmpty())
			{
				System.out.println(st.pop().data);
			}
		}
	}
	
	public static Tree deleteTree(Tree node)
	{
		if(node!=null)
		{
//			Tree left = deleteTree(node.left);
			
			Tree left = deleteTree(node.left);
			Tree ryt  = deleteTree(node.ryt);
			
			if(left == null && ryt == null)
			{
				System.out.println(node.data);
				node = null;
				return node;
			}			
		}		
		return null;
	}

}
