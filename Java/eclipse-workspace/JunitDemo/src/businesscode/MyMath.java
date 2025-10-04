package businesscode;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :12:56:55 PM
 * project  :JunitDemo
*/

public class MyMath {

	public int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
