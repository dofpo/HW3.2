public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();
        int index = service.calculate(58, 1.78);
        System.out.println("Индекс массы тела ="+" "+index);
    }
}