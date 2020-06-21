package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        Processor processor2 = new Processor();
        processor2.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        MathExpression mathExpressionAdd = (a, b) -> a + b;
        System.out.println(mathExpressionAdd.calculateExpression(1, 2));

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        PoemDecorator poemDecorator = (s)-> {
            String s1 ="**:.";
            String s2 = s.toLowerCase();
            String s3 = ".:**";
            return s1+s2+s3;
        };
        poemBeautifier.beautify(poemDecorator);


        PoemDecorator poemDecorator2 = (s)-> {

            String s1 = s.replace('i','I');
            return s1.replace('e','E');

        };
        poemBeautifier.beautify(poemDecorator2);

        PoemDecorator poemDecorator3 = (s) -> {
            String s2 ="";
            for (int i =0; i<10;i++){
                s2 += s+" ";
            }
            return s2;
        };
        poemBeautifier.beautify(poemDecorator3);

    }



}
