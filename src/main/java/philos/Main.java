package philos;

/**
 * Created by kot on 12/29/2014.
 */
public class Main {
    public static void main(String[] args) {
        ArrReversible<String> arr = new ArrReversible<String>();
        for(String s : arr.randomised()){
            System.out.println(s);
        }
    }
}
