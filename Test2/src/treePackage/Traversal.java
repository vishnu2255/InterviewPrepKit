package treePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root = new Tree(1);
		Tree root2 = new Tree(143);
		
		Tree n1 = new Tree(2);
		
		Tree n2 = new Tree(3);
		
		Tree n3 = new Tree(4);
		
		Tree n4 = new Tree(5);
		
		Tree n5 = new Tree(6);
		
		root.left = n1;
		root.ryt  = n2;
		
		root2.left = n1;
		root2.ryt  = n2;
		
		n1.left  = n3;
		n1.ryt  = n4;
		
		n3.left = n5;
		
	
		String[] ar = {"test","Test","abc","Abc"};
		
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar,String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(Arrays.toString(ar));
		
//		ArrayList<String> ali = new ArrayList();
//		
//		ali.add("test");
//		ali.add("Test");
//		
//		ali.add("abc");
//		ali.add("Abc");
		
//		ali.sort(Comparator);
//		Collections.sort(ali,String.CASE_INSENSITIVE_ORDER);
		
//		System.out.println(ali.toString());
		
//		Arrays.sort(ar);
		
//		System.out.println(Arrays.toString(ar));
//		
//		for(String s : ar)
//		{
//			System.out.println((int)s.charAt(0));						
//		}
		
		
		
//		Tree t = search(root2, 3);
		
//		System.out.println(t.data);
//		printkNodes(root2, 0, 1);
		
//		System.out.println(getLevel(root, 2, 0));
		
//		System.out.println(checkIdenticalTrees(root, root2));
		
//		inOrderTraversal(root);
		
//		levelOrderTraversal(root);

//		System.out.println(countNodes(root));
//				
//		System.out.println(countLeaves(root));
//		
//		System.out.println(countNonLeaves(root));
//		
//		System.out.println(countFullNodes(root));
		
	}
	
	public static void printkNodes(Tree node,int level,int dist)
	{
		if(node!=null)
		{
			if(level == dist)
			{
				System.out.println(node.data+" at level "+dist);
				
			}
			
			printkNodes(node.left, level+1, dist);
			printkNodes(node.ryt , level+1, dist);
			
			
		}
		
	}
	
	//finding given nodes are children of not same parent
	public static boolean isCousin(Tree root,Tree node1,Tree node2)
	{
		int key = 12;
		if(root!=null)
		{			
			if(getLevel(node1, key, 0) == getLevel(node2, key, 0) && (!isSibling(root, node1,node2)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	//finding whether given nodes are children of same parent
	public static boolean isSibling(Tree root,Tree node1,Tree node2)
	{
		if(root!=null)
		{
			return ( (root.left.data == node1.data && root.ryt.data == node2.data) 
				|| (root.left.data == node2.data && root.ryt.data == node1.data) 
				|| (isSibling(root.left, node1, node2)) 
				|| (isSibling(root.ryt, node1, node2))				
				    );
		}
		
		
		return false;
	}
	
	
	
	//getting level of the given key in a tree
	public static int getLevel(Tree node1,int key,int level)
	{
		if(node1!=null)
		{
			if(node1.data == key)
			{
				return level;
			}
			
			int level2 = getLevel(node1.left, key, level+1);
			
			if(level2!= -1)
			{
				return level2;
			}
		    return getLevel(node1.ryt, key, level+1);
			
			
		}
		
		return -1;
	}
	
	public static Tree convertBSTtoDLL(Tree root)
	{
		if(root.left != null)
		{
			Tree left= convertBSTtoDLL(root.left);
			
			while(left.ryt!=null)
			{
				left = left.ryt;
			}
			
			left.ryt = root;
			root.left = left;
		}
		
		if(root.ryt != null)
		{
		Tree ryt = convertBSTtoDLL(root.ryt);
		
		while(ryt.left != null)
		{
			ryt = ryt.left;
		}
		
		ryt.left = root;
		root.ryt = ryt;
		
		}
		
		return null;
	}
	
	//lca in Binary Tree
	public static Tree lcaBT(Tree root,int p,int q)
	{
		if(root == null)
		{
			return root;
		}
		
		if(root.data ==p || root.data ==q)
		return root;
		
		Tree left = lcaBT(root.left,p,q);
		Tree ryt  = lcaBT(root.ryt ,p,q);
		
		if(left!=null && ryt!=null)
		{
			return root;
		}
		
		return (left!=null)?left:ryt;
										
	}
	
	
	//lca in Binary Search Tree
	public static void lowestCommonAncestor(Tree root,Tree node1,Tree node2)
	{
//		Tree node1;
//		Tree node2;
		
		while(root!=null)
		{
			if(node1.data < root.data && node2.data< root.data)
			{
				root = root.left;				
			}
			
			else if(node1.data > root.data && node2.data > root.data)
			{
				root = root.ryt;
			}
			else
			{
				System.out.println(root.data);
				break;
			}
			
		}
		
	}
	
	//Level Order Tarversal
	
	public static void levelOrderTraversal(Tree root)
	{
		Queue<Tree> q =new LinkedList<Tree>();
		
		if(root!=null)						
		{
			q.add(root);
			
			while(!q.isEmpty())
			{
				Tree temp = q.poll();
				
				System.out.println("Q: data  "+temp.data);
				
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				
				if(temp.ryt!=null)
				{
					q.add(temp.ryt);
				}
			}								
		}						
	}
	
	//find if one tree is sub tree of other
	
	public static void findIfST(Tree root, Tree root2)
	{
		int var = root.data;
		
		Tree fnd = search(root2, root.data);
		
//		if()
//		{
//			
//		}
		
		
	}
	
	public static Tree search(Tree node,int keyv)
	{
		if(node!=null)
		{
			if(node.data == keyv)
			{
				//checkBoth Tres are identical or not
				//checkIdenticalTrees(node,root);
				return node;
			}
			
			Tree node2 = search(node.left,keyv);
			if(node2!=null)
			{
				return node2;
			}
			
			return search(node.ryt, keyv);						
		}
		
		return null;
	}
	
	//check whether two tree are identical
	public static boolean checkIdenticalTrees(Tree node1,Tree node2)
	{
		if(node1==null && node2==null)
		{
			return true;
		}
		
		if(node1!=null && node2!=null)
		{
			
			return (node1.data ==node2.data)&& checkIdenticalTrees(node1.left, node2.left) && checkIdenticalTrees(node1.ryt, node2.ryt);
		}
		
		return false;
	}
	
	public static void inOrderTraversal(Tree node)
	{
		if(node!=null)
		{
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.ryt);
		}
	}
	
	public static int isIdentical(Tree node1,Tree node2)
	{
		if(node1==null && node2==null)
		{
			return 1;
		}
		
		if(node1!=null && node2!=null && node1.data == node2.data)
		{
			int lef = isIdentical(node1.left, node2.left);
			if(lef == 0)
			{
				return 0;
			}
			
			int ryt = isIdentical(node1.ryt, node2.ryt);
			
			if(ryt==0)
			{
				return 0;
			}
			
			return 1;
		}
		
		return 0;
	}
	
	public static int countNodes(Tree node)
	{
		if(node==null)
			return 0;
		else
		{
			return 1+ countNodes(node.left) +  countNodes(node.ryt);
		}
		
		
		//return -1;
	}
	
	public static int countLeaves(Tree node)
	{	
		if(node == null)
		{
			return 0;
		}
		else
		{
			if(node.left==null && node.ryt ==null)
			{
				return 1;
			}
			else
			{
				return countLeaves(node.left) + countLeaves(node.ryt);
			}
		}
					
	}
	
	public static int countNonLeaves(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		else
		{
			if(node.left==null && node.ryt ==null)
			{
				return 0;
			}
			else
			{
				return 1+countNonLeaves(node.left) + countNonLeaves(node.ryt);
			}
		}
	}
	
	public static int countFullNodes(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		else
		{
			if(node.left ==null && node.ryt==null)
			{
				return 0;
			}
			else
			{
				int r = (node.left!=null && node.ryt!=null)?1:0;
				return countFullNodes(node.left) + countFullNodes(node.ryt)+r;
			}
		}
	
	}
	
	
}


