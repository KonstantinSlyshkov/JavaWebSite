package pac1;

/**
 * Created by kot on 12/25/2014.
 */
public class InnerInherit extends Outer.Inner {
    InnerInherit(Outer out){
        out.super();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        InnerInherit in = new InnerInherit(out);
    }
}
