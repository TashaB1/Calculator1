package ru.tasha2k7.mail;


import javax.swing.text.*;

class Filter1 extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        text = text.replaceAll("[^0-9.-]", "");
        super.replace(fb, offset, length, text, attrs);
    }
}

class Filter2 extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        text = text.replaceAll("[^0-9().+-/*]", "");
        super.replace(fb, offset, length, text, attrs);
    }
}