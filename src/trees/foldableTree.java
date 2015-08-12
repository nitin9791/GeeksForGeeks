package trees;

public class foldableTree {
	public static void checkFoldable(){
		BuildTree.add();
		BuildTree.inorder(BuildTree.root);
		ConvertIntoMirror.mirror(BuildTree.root.left);
		if(IdenticalTrees.checkIfIdenticalStructure(BuildTree.root.left,BuildTree.root.right)){
			System.out.println("Foldable");
		}
		else{
			System.out.println("Not Foldable");
		}
		BuildTree.inorder(BuildTree.root);
		ConvertIntoMirror.mirror(BuildTree.root.left);
		BuildTree.inorder(BuildTree.root);
	}
}
