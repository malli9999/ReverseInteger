
public class ReverseInteger {
	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. If
	 * reversing x causes the value to go outside the signed 32-bit integer range
	 * [-231, 231 - 1], then return 0.
	 *  Input: x = 123 Output: 321
	 */

	static int reverse = 0;
	static int pop;

	// will be using mod and divide operation
	public static int reverse(int x) {
		while (x != 0) {
			//Using the  % mod operation we get the last digit eg: i/p 123 , pop holds 3
			pop = x % 10;
			//Now removing the last digit in the input eg: 123 , now x holds 12
			x = x / 10;
			//If condition to check the boundaries
			if (reverse > Integer.MAX_VALUE / 10)
				return 0;
			if (reverse < Integer.MIN_VALUE / 10)
				return 0;
			// Adding the last digit from pop in the reverse
			reverse = reverse * 10 + pop;

		}
		return reverse;
	}

	public static void main(String[] args) {
		
		int revNum = ReverseInteger.reverse(3218);
		System.out.println(revNum);

	}

}
