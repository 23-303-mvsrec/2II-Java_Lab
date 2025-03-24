class LabeledBreak {
    public static void main(String[] args) {
        byte b = 10;
        int i = 65;
        float f = 34.56f;
        double d = 567.89d;
        char c = 'a';
        short s = 89;

        b = (byte) s;
        c = (char) i;
        System.out.println("c = (char) i: " + c);

        i = (int) d;
        System.out.println("i = (int) d: " + i);

        int i1 = 67;
        double d1 = i1;
        System.out.println("d1 = i1: " + d1);

        float f1 = 4.0f / 3;
        System.out.println("f1 = 4.0f / 3: " + f1);
    }
}

