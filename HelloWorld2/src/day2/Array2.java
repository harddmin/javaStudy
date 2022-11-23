package day2;

public class Array2 {

	public static void main(String[] args) {
		int[][] sungjuk = {
				{100, 20, 30},
				{100, 40, 50}
		};
		

		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(" " + sungjuk[i][j]);
			}
			System.out.println();
		}

	}

}
