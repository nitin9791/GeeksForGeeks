package trees;

import java.util.Random;

public class BuildTree {
	public static BuildTree root = null,root1 =null;
	public int data;
	public BuildTree left,right;
	public BuildTree(int data){
		if(root == null){
			root = this;
		}
		this.data = data;
		this.left = this.right = null;
	}
	public static void add(){
		root = new BuildTree(11);
		root.left = new BuildTree(8);
		root.right = new BuildTree(14);
		root.left.left = new BuildTree(4);
		root.left.right = new BuildTree(10);
		root.right.left = new BuildTree(12);
		root.right.right = new BuildTree(28);
		root.right.right.left =  new BuildTree(16);
		root.right.right.left.right =  new BuildTree(16);
	}
	
	public static void addAnotherTree(){
		root1 = new BuildTree(2);
		root1.left = new BuildTree(4);
		root1.right = new BuildTree(6);
		root1.left.left = new BuildTree(8);
		root1.left.right = new BuildTree(10);
		root1.right.right = new BuildTree(14);
		root1.right.right.left =  new BuildTree(28);
	}
	
	public static void inorder(BuildTree tmp){
		if(tmp != null){
			inorder(tmp.left);
				System.out.println(tmp.data);
			inorder(tmp.right);
		}
	}
	public static void preorder(BuildTree tmp){
		if(tmp != null){
			System.out.println(tmp.data);
			preorder(tmp.left);
			preorder(tmp.right);
		}
	}
	public static void postorder(BuildTree tmp){
		if(tmp != null){
			postorder(tmp.left);
			postorder(tmp.right);
			System.out.println(tmp.data);
		}
	}
}
