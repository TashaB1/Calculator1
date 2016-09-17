package ru.tasha2k7.mail;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Wolfsjunge on 10.09.2016.
 */
public class Calculator {
    double number;
    public int indLastSymb = 0;
    public GetExpressionOpz geo = new GetExpressionOpz();

    public Calculator(){

        // Создание окна
        JFrame panel = new JFrame("Calculator");
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Font font = new Font("Tahoma",Font.BOLD,20);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints bag = new GridBagConstraints();

        //GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty,
        // int anchor, int fill, Insets insets, int ipadx, int ipady)

        bag.fill = GridBagConstraints.BOTH;  // максимальная ширина и высота
        bag.weightx = 0.5;
        bag.weighty = 0.5;
        bag.ipady = 10;
        bag.ipadx = 10;

        bag.insets = new Insets(2, 2, 0, 2);  // отступы
        JTextField display2 = new JTextField();
        display2.setFont(new Font("Tahoma",0,25));
        display2.setHorizontalAlignment(JTextField.RIGHT );
        display2.setEnabled(false);
        bag.gridwidth = 4;
        bag.gridx = 0;
        bag.gridy = 0;
        panel.add(display2, bag);

        if (display2.getText() != "") {
            indLastSymb = display2.getText().length()-1;
        }

        bag.insets = new Insets(0, 2, 2, 2);  // отступы
        JTextField display1 = new JTextField();
        display1.setFont(new Font("Tahoma",0,25));
        display1.setHorizontalAlignment(JTextField.RIGHT );
        bag.gridwidth = 4;
        bag.gridx = 0;
        bag.gridy = 1;
        panel.add(display1, bag);

        // фильт ввода в JTextField
        ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter1());
        ((AbstractDocument) display2.getDocument()).setDocumentFilter(new Filter2());

        bag.gridwidth = 1;
        bag.ipady = 20;
        bag.insets = new Insets(2, 2, 2, 2);  // отступы
        JButton btnBackSpace = new JButton("←");
        bag.gridx = 0;
        bag.gridy = 2;
        panel.add(btnBackSpace, bag);

        JButton btnDiv = new JButton("/");
        bag.gridx = 1;
        bag.gridy = 2;
        panel.add(btnDiv, bag);

        JButton btnMult = new JButton("*");
        bag.gridx = 2;
        bag.gridy = 2;
        panel.add(btnMult, bag);

        JButton btnSub = new JButton("-");
        bag.gridx = 3;
        bag.gridy = 2;
        panel.add(btnSub, bag);

        JButton btn7 = new JButton("7");
        bag.gridx = 0;
        bag.gridy = 3;
        panel.add(btn7, bag);

        JButton btn8 = new JButton("8");
        bag.gridx = 1;
        bag.gridy = 3;
        panel.add(btn8, bag);

        JButton btn9 = new JButton("9");
        bag.gridx = 2;
        bag.gridy = 3;
        panel.add(btn9, bag);

        JButton btn4 = new JButton("4");
        bag.gridx = 0;
        bag.gridy = 4;
        panel.add(btn4, bag);

        JButton btn5 = new JButton("5");
        bag.gridx = 1;
        bag.gridy = 4;
        panel.add(btn5, bag);

        JButton btn6 = new JButton("6");
        bag.gridx = 2;
        bag.gridy = 4;
        panel.add(btn6, bag);

        JButton btnAdd = new JButton("+");
        bag.gridy = 3;       // выравнять компонент по 1 строке
        bag.gridheight = 2; // и 2 строке
        bag.gridx = 3;       // и 3 столбец
        panel.add(btnAdd, bag);

        bag.gridheight = 1; // и 2 строке
        JButton btn1 = new JButton("1");
        bag.gridx = 0;
        bag.gridy = 5;
        panel.add(btn1, bag);

        JButton btn2 = new JButton("2");
        bag.gridx = 1;
        bag.gridy = 5;
        panel.add(btn2, bag);

        JButton btn3 = new JButton("3");
        bag.gridx = 2;
        bag.gridy = 5;
        panel.add(btn3, bag);

        JButton btn0 = new JButton("0");
        bag.gridx = 0;
        bag.gridwidth = 2;
        bag.gridy = 6;
        panel.add(btn0, bag);

        bag.gridwidth = 1;
        JButton btnDot = new JButton(".");
        bag.gridx = 2;
        bag.gridy = 6;
        panel.add(btnDot, bag);

        JButton btnEnter = new JButton("=");
        bag.gridy = 5;       // выравнять компонент по 1 строке
        bag.gridheight = 2; // и 2 строке
        bag.gridx = 3;       // и 3 столбец
        panel.add(btnEnter, bag);

        //действия
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn1.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn2.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn3.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn4.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn5.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn6.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn7.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn8.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn9.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display1.getText() + btn0.getText();
                display1.setText(EnterNumber);
                display1.requestFocus();
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display1.getText().indexOf(".") == -1){
                    String EnterNumber = display1.getText() + btnDot.getText();
                    display1.setText(EnterNumber);
                    display1.requestFocus();
                }
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(display1.getText());
                display1.setText("");
                display2.setText(display2.getText() + number + "+");
                display1.requestFocus();
            }
        });

     /*   btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(display1.getText());
                display1.setText("");
                operations = "-";
                display1.requestFocus();
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(display1.getText());
                display1.setText("");
                operations = "*";
                display1.requestFocus();
            }
        });

        btnMult.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                firstnumber = Double.parseDouble(display1.getText());
                display1.setText("");
                operations = "*";
                display1.requestFocus();
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(display1.getText());
                display1.setText("");
                operations = "/";
                display1.requestFocus();
            }
        });*/

        btnBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace = null;
                if (display1.getText().length() >0){
                    StringBuilder str = new StringBuilder(display1.getText());
                    str.deleteCharAt(display1.getText().length()-1);
                    backspace = str.toString();
                    display1.setText(backspace);
                }
                display1.requestFocus();
            }
        });

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bracket(display2.getText()) > 0) {
                    for (int j = 1; j == bracket(display2.getText()); j++) {
                        display2.setText(display2.getText() + ")");
                    }
                }

                if (display2.getText() != "") {

                    CalcExpression calc = new CalcExpression();  //"(4-5)-3");
                    String postnot = geo.ParseExpression(display2.getText()); //Преобразовываем выражение в постфиксную запись
                    System.out.println(postnot);
                    double result = calc.CalcExpression(postnot); //Решаем полученное выражение
                    System.out.println(result); //Возвращаем результат
                    display1.setText(String.valueOf(result));
                    display1.requestFocus();
                }
            }
        });

        display1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET){
                    if (bracket(display2.getText()) > 0) {
                            display2.setText(display2.getText() + ")");
                    }
                    else display2.setText(display2.getText());
                }
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET){
                    if ((geo.isDelimiter(String.valueOf(display2.getText().charAt(indLastSymb))))||(display2.getText() == "")){
                        display2.setText(display2.getText() + "(");
                    }
                    else{
                        int i = indLastSymb;
                        while (!(geo.isDelimiter(String.valueOf(display2.getText().charAt(indLastSymb))))) {
                            i--;
                        }
                        display2.setText(display2.getText().substring(0,i) + "(" + display2.getText().substring(i+1, indLastSymb));
                    }

                }
                super.keyPressed(e);
            }
        });

        // Показать окно
        panel.setSize(245,450);
        panel.setLocationRelativeTo(null);
        panel.setResizable(false);
        panel.pack();
        panel.setVisible(true);

    }

    public static int bracket(String expression){
        int open = 0, close = 0;
        for (int i=0; i< expression.length(); i++){
            if (String.valueOf(expression.charAt(i)) == "(") open++;
            if (String.valueOf(expression.charAt(i)) == ")") close++;
        }
        return open-close;
    }

    public static void main(String[] args) {

        new Calculator();

    }
}
