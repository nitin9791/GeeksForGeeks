package trees;

public class CheckBST {
	public static void BST(){
		BuildTree.add();
		if(isBST(BuildTree.root)){
			System.out.println("Yes");
			BuildTree.inorder(BuildTree.root);
		}
		else{
			System.out.println("No");
		}
	}
	public static boolean isBST(BuildTree node){
		if(node == null){
			return true;
		}
		boolean flag = true;
		if(node.left != null && node.left.data > node.data){
			flag = false;
		}
		if(node.right !=null && node.right.data < node.data){
			flag = false;
		}
		return isBST(node.left) && isBST(node.right) && flag; 
	}
}
