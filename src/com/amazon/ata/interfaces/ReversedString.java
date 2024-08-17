package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence{

    private final String reversedString;
    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        StringBuilder stringBuilder = new StringBuilder(chars);
        this.reversedString = stringBuilder.reverse().toString();
    }

    @Override
    public int length() {

        return this.reversedString.length();
    }

    @Override
    public char charAt(int index) {

        return this.reversedString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return this.reversedString.subSequence(start, end);
    }

    @Override
    public String toString() {
        return this.reversedString;
    }
}
