package demo.ptpl;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {20, 45, 67, 34, 76, 54, 86};

        int secondnumber = SecondLarge(arr1);

        System.out.println("The second large number is: " + secondnumber);
    }

    public static int SecondLarge(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int large = arr[0];
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
	}

}
