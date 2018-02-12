public class Boy extends Student {

    public Boy(int kurs, String name) {
        super(kurs, name);
    }

    @Override
    public void info() {
        System.out.println("So my name is " + name + ".");
        System.out.println("I study at college for " + kurs + "years!");
        System.out.println("And this is my first project on GitHub!");
    }
}
