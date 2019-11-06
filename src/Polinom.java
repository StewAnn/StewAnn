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

    public Polinom minus(Polinom p) {
        RationalList arr = new RationalList();
        Polinom newP = new Polinom(arr);
        for (int i = 0; i <= p.a.length() - 1; i++) {
            newP.a.add(a.getElement(i).minus(p.a.getElement(i)));
        }
        for (int i = p.a.length(); i <= a.length() - 1; i++) {
            newP.a.add(a.getElement(i));
        }
        return (newP);
    }

    public String print(){
        String s = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (i != 0) {
                if (a.getElement(i).getM()<0) {
                    Rational rational = new Rational(a.getElement(i).getM()*-1,a.getElement(i).getN());
                    s += "- (" + rational + ")x^" + i + " ";
                } else {
                    if (i  == a.length()-1) {
                        s += "(" + a.getElement(i) + ")x^" + i + " ";
                    } else s += "+ (" + a.getElement(i) + ")x^" + i + " ";
                }
            } else {
                if (a.getElement(i).getM()<0) {
                    Rational rational = new Rational(a.getElement(i).getM()*-1,a.getElement(i).getN());
                    s += "- (" + rational + ")"  ;
                } else {
                    s += "+ (" + a.getElement(i) + ")" ;
                }


            }
        }
        return s;

    }
}
