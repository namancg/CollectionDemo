package com.bridgelabz.collectiondemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class CollectionsDemo {
	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();

	}

	private static void doListDemo() {
		System.out.println("List Demo");
		List<String> list = new LinkedList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private static void doStackDemo() {
		System.out.println("Stack Demo");

		Stack<String> stack = new Stack<>();

		stack.push("Ravi");
		stack.push("Amit");
		stack.push("Garima");
		stack.push("Ashish");
		String pop = stack.pop();
		System.out.println("Popped Element : " + pop);
		Iterator iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private static void doQueueDemo() {
		System.out.println("Queue Demo");

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("Head : " + queue.element());
		System.out.println("Head : " + queue.peek());
		System.out.println("Iterating Queue Elememts : ");
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("Queue Elememts after removing two elements are : ");
		iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	
	private static void doSetDemo() {
		System.out.println("Set Demo");
		Set<String> set = new LinkedHashSet<>();

		set.add("Ravi");
		set.add("Vjay");
		set.add("Ravi");
		set.add("Ajay");
		for(String element : set) {
			System.out.println(element);
		}
	}

}