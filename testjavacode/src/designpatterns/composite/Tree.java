package designpatterns.composite;

import java.util.Enumeration;

/**
 *  Tree.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 上午9:26:09 
 * 
 *  @author 马宁波
 */
public class Tree {
	TreeNode root = null;
	
	public Tree(String name){
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		//使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeC.setParent(nodeB);
		nodeB.add(nodeC);
		nodeB.setParent(tree.root);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
		System.out.println(tree.root.getName());
		Enumeration<TreeNode> childrens = tree.root.getChildren();
		while(childrens.hasMoreElements()){
			TreeNode tntemp = childrens.nextElement();
			System.out.println(tntemp.getParent().getName()+"-"+tntemp.getName());
			Enumeration<TreeNode> childrenstemp = tntemp.getChildren();
			while(childrenstemp.hasMoreElements()){
				TreeNode tntemptemp = childrenstemp.nextElement();
				System.out.println(tntemptemp.getParent().getName()+"-"+tntemptemp.getName());
			}
		}
	}
}
