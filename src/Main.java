public class Main {

    public static void main(String[] args) {

        Rational r1 = new Rational( 8 , 10);
        int a = 5;
        Rational r2 = new Rational(2, 3);
        Rational r3 = r1.plus(r2);
        RationalList arr = new RationalList();
        arr.add(r1);
        arr.add(r2);
        arr.add(4,7);
        arr.add(1, 2);
        arr.add(13, 5);
        arr.print();
        System.out.println();
        int k = arr.countGreaterThan(r2);
        System.out.println(k);
        Rational maxR = arr.findMax();
        maxR.print();
        RationalList arr2 = new RationalList();
        arr2.add(9, -3); arr2.add(5, 6);  arr2.add(1, 5);
        System.out.println();
        Polinom p1 = new Polinom(arr);
        Polinom p2 = new Polinom(arr2);
        Polinom p3 = p1.plus(p2);
        System.out.println(p3);
        Float s3 = r1.toFloat(); System.out.println(s3);
    }

}
