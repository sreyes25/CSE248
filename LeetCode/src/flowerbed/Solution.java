package flowerbed;

import java.util.Comparator;

class Solution {

	public static void main(String[] args) {
		int[] fb = {1,0,0,0,0,1};
		System.out.println(canPlaceFlowers(fb, 1));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int size = flowerbed.length - 2;
		int fb = 0;
		
		if(size%2 == 0) {
			fb = (size/2) - 1;
		}else {
			fb = (int) Math.ceil(size/2);
		}

		if (n == 1) {
			return true;
		}

		return n <= fb;

	}

}
