package trees;
import java.io.*;
public class RootToLeafPathSum {
	public static void isRootToLeafPathSum(){
	BuildTree.add();
	try{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(b.readLine());
		if(getRootToLeafPathSum(BuildTree.root,sum,0)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
	public static boolean getRootToLeafPathSum(BuildTree node,int sum,int currentsum){
		if(node == null){
			return false;
		}
		if(node.left == null && node.right == null){
			if(currentsum+node.data == sum){
				return true;
			}
			else{
				return false;
			}
		}
		boolean left = getRootToLeafPathSum(node.left,sum,currentsum+node.data);
		boolean right = getRootToLeafPathSum(node.right,sum,currentsum+node.data);
		return left || right;
	}
}
