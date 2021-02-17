package soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Application {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10000; i++) {
			numbers.add(i);
		}
		// System.out.println(numbers);

		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		int start = 0, finish = 2500;
		for (int i = 0; i < 4; i++) {
			EvenOddOperation evenOddArray = new EvenOddOperation(numbers.subList(start, finish));
			start += 50;
			finish -= 50;
			threadPoolExecutor.execute(evenOddArray);
		}
		threadPoolExecutor.shutdown();
		while (!threadPoolExecutor.isTerminated()) {
		}

		System.out.println("Çift Sayılar ");
		EvenOddOperation.evenNumberList.stream().forEach(a -> System.out.println(a));
		System.out.println();
		System.out.println("Tek Sayılar ");
		EvenOddOperation.oddNumberList.stream().forEach(a -> System.out.println(a));
	}
}
