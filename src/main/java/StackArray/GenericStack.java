package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public void push(E item) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = item;
            } else {
                E[] biggerElements = (E[]) new Object[elements.length + 1];
                for (int j = 0; j < biggerElements.length; j++) {
                    biggerElements[j] = elements[i];
                }
                biggerElements[biggerElements.length - 1] = item;
                elements = biggerElements;
                break;
            }
        }
    }


    public E pop() {
        E itemPopped = null;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] != null) {
                itemPopped = elements[i];
                elements[i] = null;
                break;
            }
        }
        return itemPopped;
    }


    public boolean isEmpty() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                return false;
            }
        }
        return true;
    }
}
