package ru.tasha2k7.mail;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

class Filter1 extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text.length() < 16) {
            text = text.replaceAll("[^(0-9).%^E]", "");
            super.replace(fb, offset, length, text, attrs);
        }
    }
}

class Filter2 extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        text = text.replaceAll("[^0-9()^.%+-/*]", "");
        super.replace(fb, offset, length, text, attrs);
    }
}

class Filter3 extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        //text = text.replaceAll("[/\\s/^a-zA-Zа-яА-Я^0-9().+-/*=]", "");
        super.replace(fb, offset, length, text, attrs);
    }
}
