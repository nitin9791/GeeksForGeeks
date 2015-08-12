package trees;

public class ConvertIntoMirror {
	public static void convertMirror(){
		BuildTree.add();
		BuildTree.inorder(BuildTree.root);
		mirror(BuildTree.root);
		BuildTree.inorder(BuildTree.root);
	}
	public static void mirror(BuildTree node){
		if(node == null)
			return;
		mirror(node.left);
		mirror(node.right);
		BuildTree tmp = node.left;
		node.left = node.right;
		node.right = tmp;
	}
}
