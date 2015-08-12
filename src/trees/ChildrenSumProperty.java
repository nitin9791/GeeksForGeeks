package trees;

public class ChildrenSumProperty {
	public static void checkChildrenSumProperty(){
		add();
		if(isChildrenSumTree(BuildTree.root)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static void add(){
			BuildTree.root = new BuildTree(10);
			BuildTree.root.left = new BuildTree(6);
			BuildTree.root.right = new BuildTree(4);
			BuildTree.root.left.left = new BuildTree(2);
			BuildTree.root.left.right = new BuildTree(4);
	}
	public static Boolean isChildrenSumTree(BuildTree node){
		if(node == null){
			return true;
		}
		if(node.left == null && node.right == null){
			return true;
		}
		int sum =0;
		if(node.left !=null){
			sum += node.left.data;
		}
		if(node.right !=null){
			sum += node.right.data;
		}
		return isChildrenSumTree(node.left) && isChildrenSumTree(node.right) && (sum == node.data);
	}
	
	public static void convertChildenSumProperty(){
		add();
		BuildTree.inorder(BuildTree.root);
		convert(BuildTree.root);
		BuildTree.inorder(BuildTree.root);
	}
	public static void convert(BuildTree node){
		if(node == null){
			return;
		}
		if(node.left == null && node.right == null){
			return;
		}
		convert(node.left);
		convert(node.right);
		int sum =0;
		if(node.left !=null){
			sum += node.left.data;
		}
		if(node.right != null){
			sum += node.right.data;
		}
		int diff = sum - node.data;
		if(diff < 0)
			incrementChilds(node,-diff);
		else
			node.data = sum;
	}
	public static void incrementChilds(BuildTree node,int diff){
		if(node == null)
			return;
		else if(node.left != null){
			node.left.data += diff;
			incrementChilds(node.left,diff);
		}
		else if(node.right != null){
			node.right.data += diff;
			incrementChilds(node.right,diff);
		}
	}
}
