package trees;

public class MaxheightOfTree {
	public static int heightOfTree(){
		BuildTree.add();
		return height(BuildTree.root);
	}
	public static int height(BuildTree node){
		if(node == null )
			return 0;
		else if(node.left == null && node.right == null){
			return 1;
		}
		else {
			return Math.max(height(node.left),height(node.right)) +1;
		}
	}
}
