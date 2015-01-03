package list;
/**
 * Created by kot on 12/27/2014.
 */
interface ListMe<E> {
    boolean addA(E e);

    boolean removeA(Object o);

    boolean removeA(int index);

    void setA(E e, int index);

    E getA(int index);
}
