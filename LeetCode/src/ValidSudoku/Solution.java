package ValidSudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			              {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			              {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			              {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			              {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			              {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			              {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			              {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			              {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

		isValidSudoku(board);
	}

	public static boolean isValidSudoku(char[][] board) {

		List<Map< Integer , Set<Character>>>[] b = new ArrayList[9];
		for(int i = 0; i < b.length; i++) b[i] =  new ArrayList<>();
	
		for (int row = 0; row < b.length; row++) {
			Set<Character> set = new HashSet<>();
			for(char n : board[row]) set.add(n);
			
			Map<Integer, Set<Character>> map = new HashMap<>(); 
			
			map.put(row, set);
			
			b[row].add(map);

		}
		
		return true;
	}

}
