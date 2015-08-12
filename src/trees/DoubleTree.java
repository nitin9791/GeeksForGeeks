package trees;

public class DoubleTree {
	public static void createDoubleTree(){
		BuildTree.add();
		create(BuildTree.root);
		BuildTree.inorder(BuildTree.root);
	}
	public static void create(BuildTree node){
		if(node == null){
			return ;
		}
		create(node.left);
		create(node.right);
		BuildTree tmp = new BuildTree(node.data);
		tmp.left = node.left;
		node.left = tmp;
	}
}
