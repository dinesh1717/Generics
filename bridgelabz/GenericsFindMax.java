package bridgelabz;
public class GenericsFindMax  <T extends Comparable<T>> {


    public <T extends Comparable<T>> T findMaximum(T... x) {
        public <T extends Comparable<T>>T findMaximum (T x, T y, T z){
            T max = x;

            if (y.compareTo(max) > 0)
                max = y;

            if (z.compareTo(max) > 0)
                max = z;

            return max;
        }
        public static void main (String[]args){
            GenericsFindMax genericsFindMax = new GenericsFindMax();
            genericsFindMax.findMaximum(6, 7, 5);
        }
    }
}

