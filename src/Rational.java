public class Rational {

    private int m, n;

    public Rational(){
        m = 1;
        n = 1;
    }

    public Rational( int _m){
        m = _m;
        n = 1;
    }

    public Rational( int _m, int _n ){
        if (_n == 0){
            System.out.println("Invalid input");
            System.exit(0);
        }
        else if ( _m == _n ){
            m = 1;
            n = 1;
        }
        else if ( _m > 0 && _n > 0 ){
            m = _m;
            n = _n;
            reduce();
        }
        else if ( _m < 0 && _n < 0 || _n < 0){
            m = _m * -1;
            n = _n * -1;
            reduce();
        }
        else if ( _m <= 0 ){
            m = _m;
            n = _n;
            reduce();
        }
    }


    /**
     * this method helps to reduce a fraction
     */
    public void reduce(){
        int _m = Math.abs(m);
        int _n = Math.abs(n);
        int max = _m > _n? _m : _n;
        for ( int i = max; i >= 2; max-- ){
            if ( _m % max == 0 && _n % max == 0){
                m = m / max;
                n = n/ max;
                break;
            }
        }
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    /**
     * sums a fraction with an integer
     * @param a
     * @return
     */
    public Rational plus(int a){
        int _m = a * n + m;
        return new Rational(_m , n);
    }

    public Rational plus(Rational a){
        int _n = n * a.n;
        int _m = m * a.n + a.m * n;
        return new Rational(_m , _n);
    }

    public Rational multi(int a){
        int _m = m * a;
        return new Rational(_m, n);
    }

    public Rational multi(Rational a){
        int _m = m * a.m;
        int _n = n * a.n;
        return new Rational(_m, _n);
    }

    public Rational minus(int a){
        int _m = m - a * n ;
        return new Rational(_m , n);
    }

    public Rational minus(Rational a){
        int _n = n * a.n;
        int _m = m * a.n - a.m * n;
        return new Rational(_m , _n);
    }

    public Rational div(int a){
        int _n = n * a;
        return new Rational(m, _n);
    }

    public Rational div(Rational a){
        int _m = m * a.n;
        int _n = n * a.m;
        return new Rational(_m, _n);
    }

    public boolean isMore( Rational a){
        int _m1 = m * a.n;
        int _m2 = a.m * n;
        if (_m1 > _m2) return true; else return false;
    }

    public boolean isLess( Rational a){
        int _m1 = m * a.n;
        int _m2 = a.m * n;
        if (_m1 < _m2) return true; else return false;
    }

    public void print(){
        System.out.print(m + "/" + n + " ");
    }

    @Override
    public String toString() {
        return String.format("%d/%d", m, n);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {  return true;}

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;   }

        Rational rational = (Rational)obj;
        if ((rational.m == this.m) && ( rational.n == this.n)) {
            return true ;}
        else return false;

    }
}

