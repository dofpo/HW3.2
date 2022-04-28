public class IndexMassServise {
    public int calculate(double mass, double height) {
        int index = (int) (mass / (height * height));
        return index;
    }
}
