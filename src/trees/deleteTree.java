package trees;

public class deleteTree {
	public static void deleteTree(){
		BuildTree.add();
		delete(BuildTree.root);
		BuildTree.root = null;
		BuildTree.inorder(BuildTree.root);
	}
	public static void delete(BuildTree node){
		if(node == null )
			return;
		delete(node.left);
		delete(node.right);
		node = node.left = node.right = null;
	}
}
