package philos;


import java.util.*;


/**
 * Created by kot on 12/29/2014.
 */
public class ArrReversible<T> extends ArrayList<T> {
    String[] words = "hello my name is joe black".split(" ");

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int index = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public T next() {
                        return get(index--);
                    }
                };
            }
        };
    };

    public Iterable<String> randomised(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {

                List<String> shuffle = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffle, new Random());
                return shuffle.iterator();
            }
        };
    }
}


