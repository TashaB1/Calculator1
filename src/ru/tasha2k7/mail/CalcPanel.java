package ru.tasha2k7.mail;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class CalcPanel extends JFrame {
    boolean enterFlag = false;
    public GetExpressionOpz geo = new GetExpressionOpz();
    String operation = "%^*/+-";

    public CalcPanel() {
        // Создание окна
        JFrame panel = new JFrame("Calculator");
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints bag = new GridBagConstraints();

        bag.fill = GridBagConstraints.BOTH;  // максимальная ширина и высота
        bag.weightx = 0.5;
        bag.weighty = 0.5;
        bag.ipady = 10;
        bag.ipadx = 12;

        bag.insets = new Insets(2, 2, 0, 2);  // отступы
        JTextField display2 = new JTextField();
        display2.setFont(new Font("Tahoma", 0, 14));
        display2.setHorizontalAlignment(JTextField.RIGHT);
        display2.setEnabled(false);
        bag.gridwidth = 4;
        bag.gridx = 0;
        bag.gridy = 0;
        panel.add(display2, bag);

        bag.insets = new Insets(0, 2, 2, 2);  // отступы
        JTextField display1 = new JTextField();
        display1.setFont(new Font("Tahoma", 0, 20));
        display1.setHorizontalAlignment(JTextField.RIGHT);
        bag.gridwidth = 4;
        bag.gridx = 0;
        bag.gridy = 1;
        panel.add(display1, bag);

        // фильт ввода в JTextField
        ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter1());
        ((AbstractDocument) display2.getDocument()).setDocumentFilter(new Filter2());

        bag.gridwidth = 1;
        bag.ipady = 15;
        bag.insets = new Insets(2, 2, 2, 2);  // отступы
        JButton btnBackSpace = new JButton("←");
        bag.gridx = 0;
        bag.gridy = 2;
        panel.add(btnBackSpace, bag);

        JButton btnCE = new JButton("CE");
        bag.gridx = 1;
        bag.gridy = 2;
        panel.add(btnCE, bag);

        JButton btnC = new JButton("C ");
        bag.gridx = 2;
        bag.gridy = 2;
        panel.add(btnC, bag);

        JButton btnInvolution = new JButton("y×");
        bag.gridx = 3;
        bag.gridy = 2;
        panel.add(btnInvolution, bag);

        JButton btnPercent = new JButton("%");
        bag.gridx = 0;
        bag.gridy = 3;
        panel.add(btnPercent, bag);

        JButton btnDiv = new JButton("/");
        bag.gridx = 1;
        bag.gridy = 3;
        panel.add(btnDiv, bag);

        JButton btnMult = new JButton("*");
        bag.gridx = 2;
        bag.gridy = 3;
        panel.add(btnMult, bag);

        JButton btnSub = new JButton("-");
        bag.gridx = 3;
        bag.gridy = 3;
        panel.add(btnSub, bag);

        JButton btn7 = new JButton("7");
        bag.gridx = 0;
        bag.gridy = 4;
        panel.add(btn7, bag);

        JButton btn8 = new JButton("8");
        bag.gridx = 1;
        bag.gridy = 4;
        panel.add(btn8, bag);

        JButton btn9 = new JButton("9");
        bag.gridx = 2;
        bag.gridy = 4;
        panel.add(btn9, bag);

        JButton btn4 = new JButton("4");
        bag.gridx = 0;
        bag.gridy = 5;
        panel.add(btn4, bag);

        JButton btn5 = new JButton("5");
        bag.gridx = 1;
        bag.gridy = 5;
        panel.add(btn5, bag);

        JButton btn6 = new JButton("6");
        bag.gridx = 2;
        bag.gridy = 5;
        panel.add(btn6, bag);

        JButton btnAdd = new JButton("+");
        bag.gridy = 4;
        bag.gridheight = 2;
        bag.gridx = 3;
        panel.add(btnAdd, bag);

        bag.gridheight = 1;
        JButton btn1 = new JButton("1");
        bag.gridx = 0;
        bag.gridy = 6;
        panel.add(btn1, bag);

        JButton btn2 = new JButton("2");
        bag.gridx = 1;
        bag.gridy = 6;
        panel.add(btn2, bag);

        JButton btn3 = new JButton("3");
        bag.gridx = 2;
        bag.gridy = 6;
        panel.add(btn3, bag);

        JButton btn0 = new JButton("0");
        bag.gridx = 0;
        bag.gridwidth = 2;
        bag.gridy = 7;
        panel.add(btn0, bag);

        bag.gridwidth = 1;
        JButton btnDot = new JButton(".");
        bag.gridx = 2;
        bag.gridy = 7;
        panel.add(btnDot, bag);

        JButton btnEnter = new JButton("=");
        bag.gridy = 6;
        bag.gridheight = 2;
        bag.gridx = 3;
        panel.add(btnEnter, bag);

        //действия
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn1, display1, display2);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn2, display1, display2);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn3, display1, display2);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn4, display1, display2);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn5, display1, display2);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn6, display1, display2);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn7, display1, display2);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn8, display1, display2);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn9, display1, display2);
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressDigit(btn0, display1, display2);
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display1.getText().indexOf(".") == -1) {
                    if (display1.getText().equals(""))
                        display1.setText(display1.getText() + "0" + btnDot.getText());
                    else
                        display1.setText(display1.getText() + btnDot.getText());
                    display1.requestFocus();
                }
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressOper("+", display1, display2);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressOper("-", display1, display2);
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressOper("*", display1, display2);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressOper("/", display1, display2);
            }
        });

        btnCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display1.setText("");
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display1.setText("");
                display2.setText("");
            }
        });

        btnPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display1.getText().equals("") && !display2.getText().equals("") && display1.getText().indexOf("%") == -1) {
                    display1.setText(display1.getText() + "%");
                }
            }
        });

        btnInvolution.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display1.getText().equals("")&&(operation.indexOf(lastSymb(display1))==-1)) {
                    display1.setText(display1.getText() + "^");
                }
            }
        });

        btnBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (display1.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(display1.getText());
                    str.deleteCharAt(display1.getText().length() - 1);
                    backspace = str.toString();
                    display1.setText(backspace);
                }
                display1.requestFocus();
            }
        });

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressEnter(display1, display2);
            }
        });

        display1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
/*)*/
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_0) {
                    if (!display2.getText().equals("") && lastSymb(display2).equals(")") && (countSymb(display2.getText(), "(") - countSymb(display2.getText(), ")") > 0)) {
                        if (!display1.getText().equals(""))
                            display2.setText(display2.getText() + "*" + display1.getText() + ")");
                        else
                            display2.setText(display2.getText() + ")");
                        display1.setText("");
                    }

                    if ((operation.indexOf(lastSymb(display2)) != -1 && !display1.getText().equals("")) && (countSymb(display2.getText(), "(") - countSymb(display2.getText(), ")") > 0)) {
                        display2.setText(display2.getText() + display1.getText() + ")");
                        display1.setText("");
                    }

                    display1.setText(display1.getText());
                    display1.requestFocus();
                }
/*(*/
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_9) {
                    if ((display2.getText().equals("")) || (lastSymb(display2).equals("(")) || operation.indexOf(lastSymb(display2)) != -1) {
                        display2.setText(display2.getText() + "(");
                    } else {
                        if (!geo.isDelimiter(lastSymb(display2))) {
                            int i = display2.getText().length() - 1;
                            while (operation.indexOf(lastSymb(display2)) == -1) {
                                i--;
                            }
                            display2.setText(display2.getText().substring(0, i) + "(" + display2.getText().substring(i + 1, display2.getText().length() - 1));
                        }
                    }
                }
/*%*/
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_5) {
                    if (!display1.getText().equals("") && !display2.getText().equals("") && display1.getText().indexOf("%") == -1) {
                        display1.setText(display1.getText() + "%");
                    }
                }
/*^*/
                if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_6) {
                    if (!display1.getText().equals("") && (operation.indexOf(lastSymb(display1)) == -1)) {
                        display1.setText(display1.getText() + "^");
                    }
                }
/*+*/
                if (e.getKeyCode() == KeyEvent.VK_ADD) {
                    pressOper("+", display1, display2);
                }
/*Esc*/
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    display2.setText("");
                    display1.setText("");
                }
/*/*/
                if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
                    pressOper("/", display1, display2);
                }
/***/
                if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
                    pressOper("*", display1, display2);
                }
/*-*/
                if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
                    pressOper("-", display1, display2);
                }
/*Enter*/
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    pressEnter(display1, display2);
                }
/*.*/
                if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
                    if (display1.getText().indexOf(".") == -1) {
                        if (display1.getText().equals(""))
                            display1.setText(display1.getText() + "0" + btnDot.getText());
                        else
                            display1.setText(display1.getText() + btnDot.getText());
                        display1.requestFocus();
                    }
                }
/*digit*/
                if (e.getKeyCode() == KeyEvent.VK_NUMPAD0 || e.getKeyCode() == KeyEvent.VK_NUMPAD1 || e.getKeyCode() == KeyEvent.VK_NUMPAD2 || e.getKeyCode() == KeyEvent.VK_NUMPAD3 || e.getKeyCode() == KeyEvent.VK_NUMPAD4 || e.getKeyCode() == KeyEvent.VK_NUMPAD5 || e.getKeyCode() == KeyEvent.VK_NUMPAD6 || e.getKeyCode() == KeyEvent.VK_NUMPAD7 || e.getKeyCode() == KeyEvent.VK_NUMPAD8 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
                    if (enterFlag || display1.getText().equals("Деление на ноль невозможно")) {
                        display2.setText("");
                        display1.setText("");
                        display1.setFont(new Font("Tahoma", 0, 20));
                        enterFlag = false;
                    }

                    display1.setText(display1.getText());
                    display1.requestFocus();
                }
                super.keyPressed(e);
            }
        });

        // Показать окно
        panel.setSize(245, 450);
        panel.setLocationRelativeTo(null);
        panel.setResizable(false);
        panel.pack();
        panel.setVisible(true);
    }

    public static int bracket(String expression) {
        int open = 0, close = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (String.valueOf(expression.charAt(i)).equals("(")) open++;
            if (String.valueOf(expression.charAt(i)).equals(")")) close++;
        }
        return open - close;
    }

    public void pressDigit(JButton obj, JTextField d1, JTextField d2) {
        if (enterFlag) {
            d2.setText("");
            d1.setText("");
            enterFlag = false;
        }
        d1.setText(d1.getText() + obj.getText());
        d1.requestFocus();
    }

    public void pressOper(String oper, JTextField display1, JTextField display2) {
        if (enterFlag) {
            display2.setText("");
            display1.setFont(new Font("Tahoma", 0, 20));
            enterFlag = false;
        }

        if (display1.getText().equals("Деление на ноль невозможно")) {
            display2.setText("");
            display1.setText("");
            display1.setFont(new Font("Tahoma", 0, 20));
            enterFlag = false;
            return;
        }

        if (!display1.getText().equals("") && display2.getText().equals("") && (String.valueOf(display1.getText().charAt(0)).equals("-"))) {
            display2.setText("(0" + display1.getText() + ")" + oper);
            display1.setText("");
            display1.requestFocus();
            return;
        }

        if (!display1.getText().equals("") && !display2.getText().equals("") && lastSymb(display2).equals("/")) {
            if (Double.valueOf(display1.getText()) == 0) {
                display2.setText("");
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter3());
                display1.setFont(new Font("Tahoma", 0, 14));
                display1.setText("Деление на ноль невозможно");
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter1());
                return;
            }
        }

        if (!display1.getText().equals("") && !display2.getText().equals("") && lastSymb(display2).equals(")"))
            display2.setText(display2.getText() + "*" + display1.getText() + oper);
        else if (display1.getText().equals("") && !display2.getText().equals("") && lastSymb(display2).equals(")"))
            display2.setText(display2.getText() + oper);
        else if (!display1.getText().equals(""))
            display2.setText(display2.getText() + display1.getText() + oper);

        if (oper.equals("-")) {
            if (display1.getText().equals("") && (display2.getText().equals("") || lastSymb(display2).equals("(")) && display1.getText().indexOf("-") == -1) {
                display2.setText(display2.getText() + "0-" + display1.getText());
                return;
            }
        }

        if (!display1.getText().equals("") && lastSymb(display1).equals("^")) {
            display2.setText(display1.getText() + "1" + oper);
        }

        display1.setText("");
        display1.requestFocus();
    }

    public void pressEnter(JTextField display1, JTextField display2) {
        if (enterFlag) {
            display2.setText("");
            display1.setText("");
            display1.setFont(new Font("Tahoma", 0, 20));
            enterFlag = false;
        }

        if (!display1.getText().equals("") && !display2.getText().equals("") && lastSymb(display2).equals("/")) {
            if (Double.valueOf(display1.getText()) == 0) {
                display2.setText("");
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter3());
                display1.setFont(new Font("Tahoma", 0, 14));
                display1.setText("Деление на ноль невозможно");
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter1());
                return;
            }
        }

        if (!display1.getText().equals("") || lastSymb(display2).equals(")")) {
            if (display1.getText() != "") {
                display2.setText(display2.getText() + display1.getText());
            }

            if (countSymb(display2.getText(), "(") - countSymb(display2.getText(), ")") > 0) {
                int k = countSymb(display2.getText(), "(") - countSymb(display2.getText(), ")");
                for (int j = 0; j < k; j++) {
                    display2.setText(display2.getText() + ")");
                }
            }

            if (!display1.getText().equals("") && lastSymb(display1).equals("^")) {
                display2.setText(display2.getText() + "1");
            }
            
           

            if (display2.getText() != "") {
                CalcExpression calc = new CalcExpression();//"(50-5.3)-80");
                String postnot = geo.ParseExpression(display2.getText()); //Преобразовываем выражение в постфиксную запись

                double result = calc.CalcExpression(postnot); //Решаем полученное выражение

                System.out.println(postnot);
                System.out.println(result); //Возвращаем результат

                String answer;
                if (String.valueOf(result).length() > 15) {
                    DecimalFormat df = new DecimalFormat("0.##########E0");
                    answer = String.valueOf(df.format(result)).replaceAll(",", ".");
                } else
                    answer = String.valueOf(result);

                System.out.print(String.valueOf(answer.replaceAll(",", ".")));
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter3());
                display1.setText(String.valueOf(answer.replaceAll(",", ".")));
                enterFlag = true;
                display1.requestFocus();
                ((AbstractDocument) display1.getDocument()).setDocumentFilter(new Filter1());
            }
        }
    }

    public static int countSymb(String text, String symb) {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
            if (String.valueOf(text.charAt(i)).equals(symb)) count++;
        return count;
    }

    public static String lastSymb(JTextField display) {
        String lastSymb;
        int indLastSymb;
        if (!display.getText().equals("")) {
            indLastSymb = display.getText().length() - 1;
            lastSymb = String.valueOf(display.getText().charAt(indLastSymb));
            return lastSymb;
        }
        return "";
    }
}
