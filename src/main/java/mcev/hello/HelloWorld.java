/**
 * (c) Copyright 2018 Patrick McEvoy
 */
package mcev.hello;

/**
 * A simple hello world program.
 */
public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        app.showMessage();
    }

    public void showMessage() {
        System.out.println(getMessage());
    }

    public String getMessage() {
        return "Hello World";
    }
}
