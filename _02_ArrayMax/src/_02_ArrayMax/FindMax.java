package _02_ArrayMax;

public class FindMax {
	public static void main(String[] args) {
		int [] findMax = {0, 1 , 2, 30, 4, 5, 6, 7, 8, 9};
		int max = findMax[0];
		for(int i = 0; i < findMax.length; i++) {
			if(max <= findMax[i]) {
				max = findMax[i];
			}
		}
		System.out.println("Il massimo è " + max);
	}
}
