package list;

import java.util.Arrays;

/**
 * Created by kot on 12/27/2014.
 */


public class ArrayListMe<E> implements ListMe<E> {
    private static final Object[] DEFAULT_CAPACITY = new Object[10];
    Object[] elementData;
    private int size;

    public ArrayListMe() {
        this.elementData = DEFAULT_CAPACITY;
    }

    @Override
    public boolean addA(E e) {
        if (size == elementData.length - 2) {
            grow(size);
        }
        elementData[size++] = e;
        return true;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean removeA(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    System.arraycopy(elementData, index + 1, elementData, index,
                            size - index - 1);
                    elementData[--size] = null;

                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    System.arraycopy(elementData, index + 1, elementData, index,
                            size - index - 1);
                    elementData[--size] = null;
                    return true;
                }
        }
        return false;
    }

    @Override
    public boolean removeA(int index) {
        if (index < size) {
            int numMoved = size - index - 1;
            if (numMoved > 0) {
                System.arraycopy(elementData, index + 1, elementData, index,
                        numMoved);
                elementData[--size] = null;
            }
            return true;
        } else
            return false;
    }

    @Override
    public void setA(E e, int index) {
        if (index < size)
        elementData[index] = e;
        else
            return;
    }

    @Override
    public E getA(int index) {
        if (index < elementData.length) {

            return (E) elementData[index];
        }
        return null;
    }
    public void trim(){
        if (size < elementData.length){
            Arrays.copyOf(elementData,size);
        }
    }


    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

}
