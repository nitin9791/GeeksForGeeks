package trees;

public class SizeOfTree {
	public static int sizeOfTree(){
		BuildTree.add();
		return size(BuildTree.root);
	}
	public static int size(BuildTree node){
		if(node == null )
			return 0;
		else if(node.left == null && node.right == null){
			return 1;
		}
		else {
			return size(node.left) + size(node.right) +1;
		}
	}
}