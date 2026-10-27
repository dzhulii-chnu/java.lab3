public class Monarchy extends State {
    protected String monarch;
    protected String dynasty;

    public Monarchy(String name, String capital, double area, double popul,
                    String monarch, String dynasty) {
        super(name, capital, area, popul);
        this.monarch = monarch;
        this.dynasty = dynasty;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Вид: Монархія");
        System.out.println("Монарх: " + monarch);
        System.out.println("Династія: " + dynasty);
    }
}
