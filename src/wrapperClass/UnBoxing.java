package wrapperClass;

public class UnBoxing {
    static void main(String[] args) {
        Byte b = 12;
        Short s = 23;
        Integer i = 54;
        Long l = 97L;
        Float f = 79.0F;
        Double d = 97.08;
        Boolean bool = true;
        Character ch = 'A';

        // Unboxing
        byte b1 = b.byteValue(); // this is unboxing
        System.out.println("b1 = " + b1);
        short s1 = s; // this is auto unboxing.
        System.out.println("s1 = " + s1);
        int i1 = i;
        System.out.println("i1 = " + i1);
        long l1 = l;
        System.out.println("l1 = " + l1);
        float f1 = f;
        System.out.println("f1 = " + f1);
        double d1 = d;
        System.out.println("d1 = " + d1);
        boolean bool1 = bool;
        System.out.println("bool1 = " + bool1);
        char ch2 = ch;
        System.out.println("ch2 = " + ch2);
    }
}
