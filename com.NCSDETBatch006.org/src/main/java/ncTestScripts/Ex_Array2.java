package ncTestScripts;

public class Ex_Array2 {

	public static void main(String[] args) {

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("Months of the Year 2023:");
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}

		String[][] months2 = { { "January", "February", "March", "April" }, { "May", "June", "July", "August" },
				{ "September", "October", "November", "December" } };
		System.out.println("Months of the Year 2024:");
		for (int i = 0; i < months2.length; i++) {
			for (int j = 0; j < months2[i].length; j++) {
				System.out.print(months2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
