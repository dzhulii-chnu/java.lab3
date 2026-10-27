public class Kingdom extends Monarchy{
    private String heir;

    public Kingdom(String name, String capital, double area, double population,
                   String monarch, String dynasty,
                   String heir) {
        super(name, capital, area, population, monarch, dynasty);
        this.heir = heir;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Вид: Королівство");
        System.out.println("Спадкоємець престолу: " + heir);
    }
}

