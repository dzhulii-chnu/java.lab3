public class Main {
    public static void main(String[] args){
        Linear l1 = new Linear(2, 3);
        Linear l2 = new Linear(2, 4);
        Linear l3 = new Linear(2, 3);
        Exponential e1 = new Exponential(3, 0.5);
        Exponential e2 = new Exponential(3, 0.4);
        int n = 5;

        System.out.println(l1);
        System.out.println(n + "-й член = " + l1.getTerm(n));
        System.out.println("Сума перших " + n + " членів = " + l1.getSum(n));
        System.out.println(e1);
        System.out.println(n + "-й член = " + e1.getTerm(n));
        System.out.println("Сума перших " + n + " членів = " + e1.getSum(n));
        System.out.println("Порівння e1 та е2 : " + e1.equals(e2));
        System.out.println("Порівння l1 та l2 : " + l1.equals(l2));
        System.out.println("Порівння l1 та l3 : " + l1.equals(l3));
    }
}