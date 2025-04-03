package p1;

public class Derived {
    public Derived() {
        super();
        Protection p = new Protection();
        System.out.println("Derived Constructor");
        System.out.println("n = "+p.n);
        // System.out.println("n_pri = "+p.n_pri);
        System.out.println("n_pro = "+p.n_pro);
        System.out.println("n_pub = "+p.n_pub);
    }    
}

