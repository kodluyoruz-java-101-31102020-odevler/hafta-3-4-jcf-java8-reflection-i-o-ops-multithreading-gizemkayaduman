package soru7;

import java.util.ArrayList;
import java.util.List;

public class EvenOddOperation extends Thread {

	private List<Integer> numbers;
	static List<Integer> evenNumberList = new ArrayList<Integer>();
	static List<Integer> oddNumberList = new ArrayList<Integer>();

	public EvenOddOperation(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) % 2 == 0){
					evenNumberList.add(i);
					System.out.println(numbers.get(i) + "- Çift Sayı");
				}
				else {
					oddNumberList.add(i);
                    System.out.println(numbers.get(i) + " - Tek Sayı");
                }
			ThreadSleeper.sleep(100);
			}
		}
	}
}