public class Main {
    public static void main(String[] args) {
        IndexMassServise service = new IndexMassServise();
        double index = service.calculate(58, 1.78);
        System.out.println("Индекс массы тела ="+" "+index);
    }
}