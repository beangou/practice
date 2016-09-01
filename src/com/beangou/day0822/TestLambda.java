package com.beangou.day0822;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JButton;

public class TestLambda {

	public static void main(String[] args) {
//		replaceRunnale();
//		dealEvent();
//		iteratorList();
//		usePredicate();
//		predicateInLambda();
//		mapInLambda();
//		reduceInLambda();
//		filterInlambda();
//		distinctSet();
		statistics();
	}
	
	// 用lambda实现runnable
	public static void replaceRunnale() {
		new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("用lambda实现runnable");
			}
			}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("用runnable");
				}
			}
		}).start();
	}
	
	// 进行事件处理
	public static void dealEvent() {
		
		JButton jb = new JButton("Show");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handling without lambda expression is boring");
			}
		});
		
		jb.addActionListener(e -> System.out.println("Event handling without lambda expression is boring"));
	}
	
	// 对列表进行迭代
	public static void iteratorList() {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//		List<String> features = new ArrayList<>();
		features.forEach(e -> System.out.println(e));
		System.out.println("*********");
		// java的方法引用
		features.forEach(System.out::println);
	}
	
	// 函数式接口predicate
	public static void usePredicate() {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "JJ");
		filter(languages, (str)->((String) str).startsWith("J"));
	}
	
	public static void filter(List<String> names, Predicate<String> condition) {
		int c = 2;
		names.forEach(e -> {
			int b = 2;
			if(condition.test(e)) {
				System.out.println("e=>" + e + ", c" + c);
			}
		});
	}
	
	// lambda中加入Predicate
	public static void predicateInLambda() {
		Predicate<String> preStartWithJ = n -> n.startsWith("J");
		Predicate<String> preFourLetterLong = n -> n.length() == 4;
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "JJ");
		languages.stream().filter(preStartWithJ.and(preFourLetterLong)).forEach(System.out::println);
		languages.stream().filter(preStartWithJ.or(preFourLetterLong)).forEach(System.out::println);
	}
	
	// 使用lambda的Map
	public static void mapInLambda() {
		List<Integer> taxList = Arrays.asList(100, 200, 300, 400, 500);
		taxList.parallelStream().map(e -> (e + .12*e)).forEach(System.out::println);
		System.out.println("**********");
		taxList.stream().map(e -> (e + .12*e)).forEach(System.out::println);
		System.out.println("**********");
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
	}
	
	// 使用lambda的Reduce实例
	public static void reduceInLambda() {
		List<Integer> taxList = Arrays.asList(100, 200, 300, 400, 500);
		double bill = taxList.stream().reduce((sums, cost) -> sums+cost).get();
		System.out.println(bill);
	}
	
	// 使用lambda的Map和Reduce实例
	public static void mapAndReduceInLambda() {
		List<Integer> taxList = Arrays.asList(100, 200, 300, 400, 500);
		double bill = taxList.stream().map(cost -> cost + .12*cost).reduce((sum, cost) -> sum+cost).get();
		System.out.println(bill);
	}
	
	// 使用filter
	public static void filterInlambda() {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "JJ");
		List<String> filterResult = languages.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
		System.out.println("filterResult=" + filterResult);
	}
	
	// 集合去重
	public static void distinctSet() {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
	}
	
	// 计算集合元素最大值、最小值、总和以及平均值(IntStream, LongStream, DoubleStream)
	public static void statistics() {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics iss = primes.parallelStream().mapToInt(x -> x).summaryStatistics();
		System.out.println("max: " + iss.getMax());
		System.out.println("min: " + iss.getMin());
		System.out.println("sum: " + iss.getSum());
		System.out.println("avg: " + iss.getAverage());
		System.out.println("count: " + iss.getCount());
	}
	
}
