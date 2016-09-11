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
        bag.insets = new Insets(2, 2, 2, 2);  // отступы
        bag.weightx = 0.5;
        bag.weighty = 0.5;
        bag.ipady = 20;
        bag.ipadx = 10;

        JTextField display = new JTextField();
        display.setFont(new Font("Tahoma",0,25));
        bag.gridwidth = 4;
        bag.gridx = 0;
        bag.gridy = 0;
        panel.add(display, bag);

       // магия начинается тут
        ((AbstractDocument) display.getDocument()).setDocumentFilter(new Filter());

        bag.gridwidth = 1;
        JButton btnSpace = new JButton("←");
        bag.gridx = 0;
        bag.gridy = 1;
        panel.add(btnSpace, bag);

        JButton btnDel = new JButton("/");
        bag.gridx = 1;
        bag.gridy = 1;
        panel.add(btnDel, bag);

        JButton btnUmn = new JButton("*");
        bag.gridx = 2;
        bag.gridy = 1;
        panel.add(btnUmn, bag);

        JButton btnMinus = new JButton("-");
        bag.gridx = 3;
        bag.gridy = 1;
        panel.add(btnMinus, bag);

        JButton btn7 = new JButton("7");
        bag.gridx = 0;
        bag.gridy = 2;
        panel.add(btn7, bag);

        JButton btn8 = new JButton("8");
        bag.gridx = 1;
        bag.gridy = 2;
        panel.add(btn8, bag);

        JButton btn9 = new JButton("9");
        bag.gridx = 2;
        bag.gridy = 2;
        panel.add(btn9, bag);

        JButton btn4 = new JButton("4");
        bag.gridx = 0;
        bag.gridy = 3;
        panel.add(btn4, bag);

        JButton btn5 = new JButton("5");
        bag.gridx = 1;
        bag.gridy = 3;
        panel.add(btn5, bag);

        JButton btn6 = new JButton("6");
        bag.gridx = 2;
        bag.gridy = 3;
        panel.add(btn6, bag);

        JButton btnPlus = new JButton("+");
        bag.gridy = 2;       // выравнять компонент по 1 строке
        bag.gridheight = 2; // и 2 строке
        bag.gridx = 3;       // и 3 столбец
        panel.add(btnPlus, bag);

        bag.gridheight = 1; // и 2 строке
        JButton btn1 = new JButton("1");
        bag.gridx = 0;
        bag.gridy = 4;
        panel.add(btn1, bag);

        JButton btn2 = new JButton("2");
        bag.gridx = 1;
        bag.gridy = 4;
        panel.add(btn2, bag);

        JButton btn3 = new JButton("3");
        bag.gridx = 2;
        bag.gridy = 4;
        panel.add(btn3, bag);

        JButton btn0 = new JButton("0");
        bag.gridx = 0;
        bag.gridwidth = 2;
        bag.gridy = 5;
        panel.add(btn0, bag);

        bag.gridwidth = 1;
        JButton btnDot = new JButton(".");
        bag.gridx = 2;
        bag.gridy = 5;
        panel.add(btnDot, bag);

        JButton btnEnter = new JButton("=");
        bag.gridy = 4;       // выравнять компонент по 1 строке
        bag.gridheight = 2; // и 2 строке
        bag.gridx = 3;       // и 3 столбец
        panel.add(btnEnter, bag);

        //действия
        display.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                    display.setText(display.getText() + String.valueOf(e.getKeyChar()));
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn1.getText();
                display.setText(EnterNumber);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn2.getText();
                display.setText(EnterNumber);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn3.getText();
                display.setText(EnterNumber);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn4.getText();
                display.setText(EnterNumber);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn5.getText();
                display.setText(EnterNumber);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn6.getText();
                display.setText(EnterNumber);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn7.getText();
                display.setText(EnterNumber);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn8.getText();
                display.setText(EnterNumber);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = display.getText() + btn9.getText();
                display.setText(EnterNumber);
            }
        });

        // Показать окно
        panel.setSize(245,450);
        panel.setLocationRelativeTo(null);
        panel.setResizable(false);
        panel.pack();
        panel.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();

    }
}
