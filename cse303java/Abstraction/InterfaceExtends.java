interface A1 {
    void methodA();
}

interface B1 {
    void methodB();
}

interface C extends A1, B1 {
    void methodC();
}

class MyClass implements C {
    public void methodA() { }
    public void methodB() { }
    public void methodC() { }
}

public class InterfaceExtends {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
