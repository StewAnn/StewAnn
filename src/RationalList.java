/**
 *
 */
public class RationalList {

    private Rational[] massiv ;

    public RationalList(){
        massiv = new Rational[0];
    }

    public int length(){
        int i = massiv.length;
        return(i);
    }

    public Rational getElement(int i){
        return(massiv[i]);
    }

    public void add( Rational a){
        Rational[] newMassiv = new Rational[massiv.length + 1];
        System.arraycopy(massiv, 0, newMassiv, 0, massiv.length);
        massiv = newMassiv;
        massiv[massiv.length - 1] = a;
    }

    public void add( int _m, int _n){
        Rational a = new Rational( _m, _n);
        Rational[] newMassiv = new Rational[massiv.length + 1];
        System.arraycopy(massiv, 0, newMassiv, 0, massiv.length);
        massiv = newMassiv;
        massiv[massiv.length - 1] = a;
    }

    public Rational findMax(){
        Rational maximum = massiv[0];
        for( int i = 0; i <= massiv.length-1; i++){
            if (maximum.isLess(massiv[i])){
                maximum = massiv[i];
            }
        }
        return maximum;
    }

    public Rational findMin(){
        Rational minimum = massiv[0];
        for( int i = 0; i <= massiv.length-1; i++){
            if (minimum.isMore(massiv[i])){
                minimum = massiv[i];
            }
        }
        return minimum;
    }

    public int countGreaterThan(Rational a) {
        int k = 0;
        for (int i = 0; i <= massiv.length - 1; i++) {
            if (massiv[i].isMore(a)) {
                k++;
            }
        }
        return k;
    }

    public int countLessThan(Rational a) {
        int k = 0;
        for (int i = 0; i <= massiv.length - 1; i++) {
            if (massiv[i].isLess(a)){
                k++;
            }
        }
        return k;
    }

    public void print(){
        for( int i = 0; i <= massiv.length-1; i++){
            massiv[i].print();
        }
    }
}
