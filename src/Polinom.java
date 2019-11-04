public class Polinom {

    private RationalList a;

    public Polinom(RationalList arr) {
        a = arr;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (i != 0) {
                s += "(" + a.element(i) + ")x^" + i + " + ";
            } else {
                s += "(" + a.element(i) + ")";
            }
        }
        return s;
    }


    public Polinom plus(Polinom p) {
        RationalList arr = new RationalList();
        Polinom newP = new Polinom(arr);
        for (int i = 0; i <= p.a.length() - 1; i++) {
            newP.a.add(a.element(i).plus(p.a.element(i)));
        }
        for (int i = p.a.length(); i <= a.length() - 1; i++) {
            newP.a.add(a.element(i));
        }
        return (newP);
    }
}
