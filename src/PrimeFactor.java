import java.util.ArrayList;

public class PrimeFactor {

    public ArrayList<Integer> calculate(int number) {

        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return  factors;
    }

}
