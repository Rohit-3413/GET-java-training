package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :4:26:31 PM
 * project  :AdvanceJava
 */

public class ForEachDemo2 {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("John","Mike","Alex","Navin","Kartik");

		Consumer<String> convertUpperCase=new Consumer<String>()
		{

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());

			}
		};

		// traversing through Consumer Interface Implementation
		names.forEach(convertUpperCase);


		// Consumer to display a Number
		Consumer<Integer> display= a -> System.out.println(a);

		//implement display using accept
		display.accept(10);

	}

}
