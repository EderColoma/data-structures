package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the methods of the {@link Stack} class.
 */
public class StackTest {

	/**
	 * Tests the addition of an element to the stack.
	 */
	@Test
	public void pushTest() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		
		assertEquals(Integer.valueOf(1), Integer.valueOf(stack.top()));
	}
	
	/**
	 * Tests the removal of an element from the stack.
	 */
	@Test
	public void popTest() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(5);
		Integer element = stack.pop();
		
		assertEquals(Integer.valueOf(5), element);
		assertEquals(Integer.valueOf(1), stack.top());
	}
	
	/**
	 * Tests the removal of an element from an empty stack.
	 */
	@Test
	public void popEmptyTest() {
		Stack<Integer> stack = new Stack<>();
		assertNull(stack.pop());
	}
	
	/**
	 * Tests the retrieval of the top element of the stack.
	 */
	@Test
	public void topTest() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(5);
		
		assertEquals(Integer.valueOf(5), stack.top());
	}
	
	/**
	 * Tests the retrieval of the top element of an empty stack.
	 */
	@Test
	public void topEmptyTest() {
		Stack<Integer> stack = new Stack<>();
		assertNull(stack.top());
	}
	
	/**
	 * Tests if the stack is empty.
	 */
	@Test
	public void isEmptyTest() {
		assertTrue(new Stack<>().isEmpty());
	}
	
	/**
	 * Tests if the stack is empty, when it is not.
	 */
	@Test
	public void isNotEmptyTest() {
		Stack<String> stack = new Stack<>();
		stack.push("X");
		assertFalse(stack.isEmpty());
	}
}
