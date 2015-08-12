package trees;

public class CountLeaf {

	public static void countLeaf(){
		BuildTree.add();
		System.out.println(count(BuildTree.root));
	}
	public static int count(BuildTree node){
		if(node == null)
			return 0;
		if(node.left == null && node.right==null){
			return 1;
		}
		return count(node.left)+count(node.right);
	}
}
