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
                s += "(" + a.getElement(i) + ")x^" + i + " + ";
            } else {
                s += "(" + a.getElement(i) + ")";
            }
        }
        return s;
    }


    public Polinom plus(Polinom p) {
        RationalList arr = new RationalList();
        Polinom newP = new Polinom(arr);
        for (int i = 0; i <= p.a.length() - 1; i++) {
            newP.a.add(a.getElement(i).plus(p.a.getElement(i)));
        }
        for (int i = p.a.length(); i <= a.length() - 1; i++) {
            newP.a.add(a.getElement(i));
        }
        return (newP);
    }
}
