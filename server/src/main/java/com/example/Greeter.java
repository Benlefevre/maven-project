package com.example;

/**
 * Simple class.
 * @author Babacar Mbaye
 */
public class Greeter {

    /**
     * Only default constructor.
     */
    public Greeter() {
    }

    /**
     * Simple function.
     *
     * @param someone a person's name
     * @return A string that print Hello + someone
     */
    public final String greet(final String someone) {
        return String.format("Hello babacar, %s!", someone);
    }
}
