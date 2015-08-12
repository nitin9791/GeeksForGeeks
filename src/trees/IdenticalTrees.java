package trees;

public class IdenticalTrees {
	public static boolean checkIfIdentical(BuildTree node1,BuildTree node2){
		if(node1 == null && node2 == null)
			return true;
		if((node1 == null && node2 != null) || (node1 !=null && node2 == null) || (node1.data != node2.data)){
			return false;
		}
		return checkIfIdentical(node1.left,node2.left) && checkIfIdentical(node1.right,node2.right);
	}
	public static boolean checkIfIdenticalStructure(BuildTree node1,BuildTree node2){
		if(node1 == null && node2 == null)
			return true;
		if((node1 == null && node2 != null) || (node1 !=null && node2 == null)){
			return false;
		}
		return checkIfIdenticalStructure(node1.left,node2.left) && checkIfIdenticalStructure(node1.right,node2.right);
	}
	public static void IdenticalTree(){
		BuildTree.add();
		BuildTree.addAnotherTree();
		if(IdenticalTrees.checkIfIdentical(BuildTree.root, BuildTree.root1)){
			System.out.println("Identical");
		}
		else{
			System.out.println("Not Identical");
		}
	}
}
