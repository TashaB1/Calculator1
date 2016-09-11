package ru.tasha2k7.mail;


import javax.swing.text.*;

// например, мы хотим фильтровать цифры
class Filter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        string = string.replaceAll("[a-zA-Z]", "");
        super.insertString(fb, offset, string, attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        text = text.replaceAll("[^0-9]", "");
        super.replace(fb, offset, length, text, attrs);
    }
}