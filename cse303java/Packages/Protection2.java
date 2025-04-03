package p2;
import p1.Protection;
public class Protection2 extends Protection{
    public Protection2() {
        Protection p = new Protection();
        System.out.println("Protection2 Constructor");
        //System.out.println("n = " + p.n);
        // System.out.println("n_pri = "+p.n_pri);
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}

