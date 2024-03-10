package ncTestScripts;

public class Ex_Arrays1 {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 4, 5 };

		for (int a = 0; a < num1.length; a++) {
			
			System.out.println(num1[a]);

		}

		int[][] num2 = { { 1, 2, 3 }, { 9, 8, 7 } ,{4, 5, 6}};

		for (int i = 0; i < num2.length; i++) {

			for (int j = 0; j < num2.length; j++) {

				System.out.print(num2[i][j] + " ");
			}
			System.out.println();
		}

	}
}