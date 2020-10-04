package com.bridgelabz.lambdaexpression;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
	public static <action> void main(String[] args) {
		//create Sample Collection
		List<Integer> myNumberList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			myNumberList.add(i);

		Iterator<Integer> it = myNumberList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator " + i);
		}

		class MyConsumer implements Consumer<Integer> {
			public void accept(Integer t) {
				System.out.println("Mth2: Comsumer impl Value: " + t);
			}
		}

		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		myNumberList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println("Mth3 forEach Anonymous class Value ::" + integer);
			}
		});

		Consumer<Integer> myListAction = n -> {
			System.out.println("Mth4 forEach lambda impl Value" + n);
		};
		myNumberList.forEach(myListAction);

		// Implicit Lambda Expression
		myNumberList.forEach(n -> {
			System.out.println("Mth5 forEach lambda impl Value" + n);

		});

	}
}

