public class State {
    protected String name;
    protected String capital;
    protected double area;
    protected  double popul;

    public State(String name, String capital, double area, double popul){
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.popul = popul;
    }

    public void Show(){
        System.out.println("Тип: Держава");
        System.out.println("Назва: " + name);
        System.out.println("Столиця: " + capital);
        System.out.println("Площа: " + area );
        System.out.println("Населення: " + popul + " млн осіб");
    }


}
