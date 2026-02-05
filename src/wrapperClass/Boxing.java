package wrapperClass;

public class Boxing {

    static void main(String[] args) {
        byte b = 12;
        short s = 21;
        int i = 40;
        long l = 80L;
        float f = 30.9f;
        double d = 578.87;
        boolean bool = false;
        char c = 'A';

        // Boxing
        Byte b1 = new Byte(b); // This syntax is deprecated and this is boxing.
        System.out.println(b1);
        Short s1 = s; // new syntax and this is auto boxing.
        System.out.println(s1);
        Integer i1 = i;
        System.out.println(i1);
        Long l1 = l;
        System.out.println(l1);
        Float f1 = f;
        System.out.println(f1);
        Double d1 = d;
        System.out.println(d1);
        Boolean bool1 = bool;
        System.out.println(bool1);
        Character ch1 = c;
        System.out.println("ch1 = " + ch1);
    }
}
