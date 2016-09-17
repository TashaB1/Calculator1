package ru.tasha2k7.mail;

import java.util.Stack;

/**
 * Created by Wolfsjunge on 16.09.2016.
 */
class CalcExpression {
    public Double CalcExpression(String postnot) {
        Stack<Double> stack = new Stack<Double>();

        for (int x = 0; x < postnot.length(); x++) {
            if (postnot.charAt(x) == '+') stack.push(stack.pop() + stack.pop());
            else
            if (postnot.charAt(x) =='-'){
                Double b = stack.pop(), a = stack.pop();
                stack.push(a-b);
            }
            else
            if (postnot.charAt(x) == '*') stack.push(stack.pop()*stack.pop());
            else
            if (postnot.charAt(x) == '/'){
                Double b = stack.pop(), a = stack.pop();
                stack.push(a/b);
            }
            else
            stack.push(Double.valueOf(x));
        }
        return stack.pop();
    }
}
