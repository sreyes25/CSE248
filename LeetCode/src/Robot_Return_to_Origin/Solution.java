package Robot_Return_to_Origin;

public class Solution {

	public static void main(String[] args) {
		System.out.println(judgeCircle("UDLLRRDUDU"));
	}

	public static boolean judgeCircle(String moves) {
		 int[] a = new int[86];
	        for (int c : moves.toCharArray()) {
	            a[c]++;
	        }

	        return a[85] == a[68] && a[82] == a[76];
	}
}
