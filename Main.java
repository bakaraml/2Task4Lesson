public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate (1.63, 52.5);
        System.out.println("Ваш индекс массы тела " + index);
    }
}
