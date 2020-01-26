package data_structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the stack data structure.
 */
public class Stack<T> {

	private final List<T> list = new ArrayList<>();
	
	/**
	 * Adds an element to the stack.
	 * 
	 * @param element The element to be added.
	 */
	public void push(T element) {
		list.add(element);
	}
	
	/**
	 * Remove the element on top of the stack and return it.
	 * 
	 * @return The element on top of the stack
	 */
	public T pop() {
		if(list.isEmpty()) {
			return null;
		}
		
		T element = list.get(list.size() -1);
		list.remove(list.size() -1);
		return element;
		
	}
	
	/**
	 * Returns the element on top of the stack.
	 * 
	 * @return The element on top of the stack.
	 */
	public T top() {
		return list.isEmpty() ? null : list.get(list.size() - 1);
	}
	
	/**
	 * Checks if the stack is empty.
	 * 
	 * @return true, if the stack is empty, false otherwise.
	 */
	public Boolean isEmpty() {
		return list.isEmpty();
	}
	
}
