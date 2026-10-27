import java.lang.ref.SoftReference;

public class Republic extends State{
    private String president;
    private String form;

    public Republic(String name, String capital, double area, double popul,
                    String president, String form){
        super(name, capital, area, popul);
        this.president = president;
        this.form = form;
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Тип: Республіка");
        System.out.println("Президент: " + president);
        System.out.println("Форма правління: " + form);
    }


}
