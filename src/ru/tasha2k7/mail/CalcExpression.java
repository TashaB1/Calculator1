package ru.tasha2k7.mail;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Wolfsjunge on 16.09.2016.
 */
class CalcExpression {
    public double CalcExpression(String postnot) {
        Stack<Double> stack = new Stack<Double>();
        String word = "";
        StringTokenizer tokenizer = new StringTokenizer(postnot, " ", false); //разбиваем выражение на слова, разделители включаются в число слов

        while (tokenizer.hasMoreTokens()) { //пока в строке еще есть слова
            word = tokenizer.nextToken(); //возвращает в виде строки следующее слово

            if (word.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (word.equals("-")) {
                Double b = stack.pop(), a = stack.pop();
                stack.push(a - b);
            } else if (word.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (word.equals("/")) {
                Double b = stack.pop(), a = stack.pop();
                stack.push(a / b);
            } else
                stack.push(Double.valueOf(word));
        }
        return stack.pop();
    }
}
