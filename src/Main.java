public class Main {
    public static void main(String[] args) {
        int priceTicket = 5_250;
        int bonus = 20;
        int miles = 1;
        int total = priceTicket / bonus * miles;
        System.out.println(total + "мили");
    }
}
