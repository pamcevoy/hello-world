/**
 * (c) Copyright 2018 Patrick McEvoy
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link HelloWorld}.
 * @author Patrick McEvoy
 */
public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld app = new HelloWorld();
        Assert.assertEquals("Hello World", app.getMessage());
    }
}
