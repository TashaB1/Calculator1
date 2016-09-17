package ru.tasha2k7.mail;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Wolfsjunge on 16.09.2016.
 */

class GetExpressionOpz {
   // private static String operators = "+-*/";
    private static String delimiters = "+-*/() ";



  /*  private static boolean isDelimiter(String delim){
        if (delim.length()!=1){
            return false;
        }
        for (int i = 0; i < delimiters.length(); i++){
            if (delim.charAt(0) == delimiters.charAt(i)){
                return true;
            }
        }
        return false;
    }*/

    private static boolean isDelimiter(String delim){
        if (delimiters.indexOf(delim) != -1)
            return  true;
        return false;
    }

    public static int priority(String oper){
        if(oper.equals("(")) return 1;
        if(oper.equals("+")||oper.equals("-")) return 2;
        if(oper.equals("*")||oper.equals("/")) return 3;
        return 0;
    }

    public static String ParseExpression(String infnot){
        String postnot = new String();
        Stack<String> stack = new Stack<String>();
        StringTokenizer tokenizer = new StringTokenizer(infnot, delimiters, true); //разбиваем выражение на слова, разделители включаются в число слов

        String word = "";

        while (tokenizer.hasMoreTokens()) { //пока в строке еще есть слова
            word = tokenizer.nextToken(); //возвращает в виде строки следующее слово

            if (word.equals(" ")) continue;

            if (isDelimiter(word)) {  // если слово - разделитель
                if (word.equals("(")) stack.push(word);   // если скобка откр. то в выходную строку
                else if (word.equals(")")) {  //извлекаем символы из стека в выходную строку до тех пор, пока не встретим в стеке открывающую скобку
                    while (!stack.peek().equals("(")) {
                        postnot += stack.pop();   //для массива postnot.add((String) stack.pop());
                    }
                    stack.pop(); // уничтожили (
                } else {
                    while (!stack.isEmpty() && (priority(word) <= priority(String.valueOf(stack.peek())))) {
                        postnot += stack.pop();
                    }
                    stack.push(word);
                }
            } else {
                postnot += word;
            }
        }
        return postnot;
    }
}
