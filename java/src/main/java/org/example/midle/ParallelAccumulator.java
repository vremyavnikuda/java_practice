package org.example.midle;

/*
* Параллельные аккумуляторы

Кроме блокировок, Java Concurrent может предложить еще одну интересную функцию - параллельные аккумуляторы. LongAccumulator обновляет значение, используя предоставленную функцию. Это позволяет нам реализовать алгоритм без блокировок в ряде сценариев. Обычно это предпочтительнее чем AtomicLong, когда несколько потоков обновляют общее значение.

Для того чтобы создать аккумулятор, вам нужно указать в конструкторе два аргумента. Первый из них - это функция, используемая для вычисления результата аккумулятора. Обычно это метод sum. Второй параметр указывает начальное значение нашего аккумулятора.

Теперь давайте создадим LongAccumulator с начальным значением 10000а затем вызовем метод accumulate() из нескольких потоков.
* */
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelAccumulator {
	private AtomicInteger sum = new AtomicInteger(0);

	public void addToSum(int value) {

		sum.addAndGet(value);
	}

	public int getSum() {
		return sum.get();
	}

	public static void main(String[] args) {
		final ParallelAccumulator accumulator = new ParallelAccumulator();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				accumulator.addToSum(1);
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(accumulator.getSum());
	}
}