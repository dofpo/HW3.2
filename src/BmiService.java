public class BmiService {
    public int calculate(double mass, double height) {
        int index = (int) (mass / (height * height));
        return index;
    }
}
