package Fivee;

public class Fivee {

	public static void main(String[] args) {
		int[] arr = new int[15];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }

        }
        System.out.print("Number of paired elements=" + count);

	}

}
