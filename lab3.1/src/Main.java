public class Main {
    public static void main(String[] args) {
        State state = new State("Україна", "Київ", 603.5, 37.0);

        Republic republic = new Republic("Франція", "Париж", 643.8, 68.0,
                "Емманюель Макрон", "напівпрезидентська");

        Monarchy monarchy = new Monarchy("Бруней", "Бандар-Сері-Бегаван", 5.8, 0.45,
                "Хассанал Болкіах", "Болкіах");

        Kingdom kingdom = new Kingdom("Іспанія", "Мадрид", 506.0, 48.0,
                "Філіп VI", "Бурбони", "Леонор");

        State[] arr = {state, republic, monarchy, kingdom};

        for (State s : arr) {
            s.Show();
            System.out.println();
        }
    }
}