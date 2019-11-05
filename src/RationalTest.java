import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalTest {

    Rational r1 = new Rational( 8 , 10);
    Rational r2 = new Rational(2, 3);
    RationalList arr = new RationalList();


    @Test
    public void plus() {
        Rational actual = r1.plus(r2);
        Rational expected = new Rational(22,15);
        assertEquals(expected, actual);
    }


    @Test
    public void findMax() {
        arr.add(r1);
        arr.add(r2);
        arr.add(4,7);
        arr.add(1, 2);
        arr.add(13, 5);
        Rational actual = arr.findMax();
        Rational expected = new Rational(13,5);
        assertEquals(expected, actual);
    }

    @Test
    public void countGraterThan() {
        arr.add(r1);
        arr.add(r2);
        arr.add(4,7);
        arr.add(1, 2);
        arr.add(13, 5);
        int actual = arr.countGreaterThan(r2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void plusPolinom() {
        arr.add(r1);
        arr.add(r2);
        arr.add(4,7);
        arr.add(1, 2);
        arr.add(13, 5);
        RationalList arr2 = new RationalList();
        arr2.add(9, -3);
        arr2.add(5, 6);
        arr2.add(1, 5);
        Polinom p1 = new Polinom(arr);
        Polinom p2 = new Polinom(arr2);
        String actual = p1.plus(p2).toString();
        RationalList arr3 = new RationalList();
        arr3.add(-11,5);
        arr3.add(3,2);
        arr3.add(27,35);
        arr3.add(1,2);
        arr3.add(13,5);
        String expected = new Polinom(arr3).toString();
        assertEquals(expected, actual);
    }

}
