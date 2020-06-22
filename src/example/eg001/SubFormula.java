package example.eg001;

public class SubFormula implements Formula{
    @Override
    public double calculate(int a) {
        return sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println(new SubFormula().calculate(16));
    }
}