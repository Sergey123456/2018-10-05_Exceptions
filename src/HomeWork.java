public class HomeWork {
	private static final int SIZE = 4;
	public static void main(String[] args) {
		String[][] ar = new String[SIZE][SIZE];
		fillArray(ar);
//		ar[3][3] = "s";
		printArray(ar);
		try {
			System.out.println(getStringArray(ar));
		} catch (MyArraySizeException | MyArrayDataException e) {
			e.printStackTrace();
//			System.out.println("Exception:" + e.getClass() + " " + e.getMessage());
		}
	}
	public static int getStringArray(String[][] ar) throws MyArraySizeException, MyArrayDataException {
		if (ar.length != SIZE | ar[0].length != SIZE)
			throw new MyArraySizeException("SIZE:" + ar.length + " X " + ar[0].length);
		int col = 0;
		int row = 0;
		int sum = 0;
		try {
			for (int i = 0; i < ar.length; i++) {
				for (int j = 0; j < ar.length; j++) {
					col = i;
					row = j;
					sum += Integer.parseInt(ar[i][j]);
				}
			}
		} catch (Exception e) {
			throw new MyArrayDataException("Col = " + col + " row = " + row);
		}
		return sum;
	}
	private static void fillArray(String[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = Integer.toString(i + j);
			}
		}
	}
	private static void printArray(String[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
