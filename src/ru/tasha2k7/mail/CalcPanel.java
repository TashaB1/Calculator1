package ru.tasha2k7.mail;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Wolfsjunge on 10.09.2016.
 */
public class CalcPanel extends JFrame{

    public CalcPanel(){
        // Создание окна
        JFrame panel = new JFrame("Calculator");
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(245,450);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints bag = new GridBagConstraints();

//GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty,
// int anchor, int fill, Insets insets, int ipadx, int ipady)



        // натуральная высота, максимальная ширина и высота
        bag.fill = GridBagConstraints.BOTH;
        bag.insets = new Insets(2, 2, 2, 2);  // отступы
        bag.weightx = 0.5;
        bag.weighty = 0.5;
        bag.ipady = 20;
        bag.ipadx = 10;


        JTextField display = new JTextField();
        bag.gridwidth = 3;
        bag.gridx = 0;
        bag.gridy = 0;
        panel.add(display, bag);

        JButton btn1 = new JButton("1");
        bag.gridwidth = 1;
        bag.gridx = 0;
        bag.gridy = 1;
        panel.add(btn1, bag);

        JButton btn2 = new JButton("2");
        bag.gridx = 1;
        bag.gridy = 1;
        panel.add(btn2, bag);

        JButton btn4 = new JButton("4");
        bag.gridx = 0;
        bag.gridy = 2;
        panel.add(btn4, bag);

        JButton btn5 = new JButton("5");
        bag.gridx = 1;
        bag.gridy = 2;
        panel.add(btn5, bag);

        JButton btn3 = new JButton("3");
        bag.gridy = 1;       // выравнять компонент по 1 строке
        bag.gridheight = 2; // и 2 строке
        bag.gridx = 2;       // и 3 столбец
        panel.add(btn3, bag);
    }
}
