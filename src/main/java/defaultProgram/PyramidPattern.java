package defaultProgram;

public class PyramidPattern {

	public static void starPattern1(int n) {
		for (int i = 0; i <= n; i++) {
//			System.out.print(" ");
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void starPattern2(int n) {
		for (int i = 0; i <= n; i++) {
//			System.out.print(" ");
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void starPattern3(int z) {
		for (int i = 0; i <= z; i++) {
//			System.out.print(" ");
			for (int k = z-i; k > 0; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void numberPattern1(int rows) {

		for (int i = 1; i <= rows; ++i) {

			for (int k = rows - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void findElement(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.print("first Number"+ nums[i]);
					System.out.println("Second Number"+ nums[j]);
//					return;
				}
			}
		}
    }
	

	public static void main(String[] args) {
		int n = 8;
		int z = 9;
		int rows = 9;
		int[] nums = { 13, 12, 8, 15, 20, 13, 11};
        int target = 26;
		starPattern1(n);
		starPattern2(n);
		starPattern3(z);
		numberPattern1(rows);
		findElement(nums, target);
		
	}

}
