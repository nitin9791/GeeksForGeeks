package trees;

import java.io.*;
public class kthSmallestinBinarySearchtree {
	static int n=0;
	public static void getElement(){
		try{
			add();
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int k = Integer.parseInt(b.readLine()); 
			printKthElement(BuildTree.root,k);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void add(){
		BuildTree.root = new BuildTree(20);
		BuildTree.root.left = new BuildTree(8);
		BuildTree.root.right = new BuildTree(22);
		BuildTree.root.left.left = new BuildTree(4);
		BuildTree.root.left.right = new BuildTree(12);
		BuildTree.root.left.right.left = new BuildTree(10);
		BuildTree.root.left.right.right = new BuildTree(14);
	}
	public static void printKthElement(BuildTree node,int k){
		if(n>k || node == null){
			return;
		}
		else if(n == k){
			System.out.println(node.data);
			return;
		}
		else if(n<k){
			printKthElement(node.left,k);
			n++;
			printKthElement(node.right,k);
		}
	}
}
