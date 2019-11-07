import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Divisibility {

	public static void main(String[] args) {
		IntStream.range(1, 100)
			.boxed()
			.filter(num -> num%7 == 0)
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}

}
