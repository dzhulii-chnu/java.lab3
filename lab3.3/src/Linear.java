public class Linear implements ISeries{
    private double first;
    private double d;

    public Linear(double first, double d) {
        this.first = first;
        this.d = d;
    }

    public double getD(double d){
        return d;
    }

    public double getFirst(double first){
        return first;
    }

    @Override
    public double getTerm(int n){
        return first + (n - 1) * d;
    }

    @Override
    public double getSum(int n){
        return (2 * first + (n - 1) * d) * n / 2.0;
    }

    @Override
    public String toString() {
        return "Linear{a1=" + first + ", d=" + d + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Linear other = (Linear) obj;
        return first == other.first && d == other.d;
    }
}
