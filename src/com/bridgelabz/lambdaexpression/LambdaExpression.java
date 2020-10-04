package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
    System.out.println("Welcome to the Lambda Math Operation Problem ");
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

                }
        );

        Function<Integer, Double> toDoubleFunction = Integer::doubleValue;;
        myNumberList.forEach(n -> {
                    System.out.println("Mth6 forEach lambda impl Value " + toDoubleFunction.apply(n));

                }
        );

    // Implicit Lambda Function to print double value
        Function<Integer, Double> toDoubleFunction1 = n-> n.doubleValue();
        myNumberList.forEach(n -> {
                    System.out.println("Mth6 forEach lambda impl Value " + toDoubleFunction1.apply(n));

                }
        );

    }


}


