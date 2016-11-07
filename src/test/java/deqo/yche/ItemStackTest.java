package deqo.yche;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemStackTest {



    @Test
    public void testIsEmpty() throws Exception {
        ItemStack  test = new ItemStack();
        Item s1= new Item(4);
        assertTrue(test.isEmpty());
        test.push(s1);
        assertFalse(test.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        ItemStack  test = new ItemStack();
        Item s1= new Item(4);
        test.push(s1);
        assertTrue(1 == test.getSize() );
    }


    @Test (expected = EmptyStackException.class )
    public void testPeek() throws EmptyStackException {
        ItemStack  test = new ItemStack();
        Item s1= new Item(4);
        test.push(s1);
        assertEquals(s1.getValeur(), test.peek().getValeur());
        test.pop();
        test.peek();
    }

    @Test (expected = EmptyStackException.class )
    public void testPop() throws EmptyStackException {
        ItemStack  test = new ItemStack();
        Item s1= new Item(4);
        Item s2= new Item(5);
        test.push(s1);
        test.push(s2);
        test.pop();
        assertEquals(4, test.peek().getValeur());
        test.pop();
        test.pop();
    }
}