public class Exponential extends Series {
    private double q;

    public Exponential(double first, double q){
        super(first);
        this.q = q;
    }

    @Override
    public double getTerm(int n){
        return first * Math.pow(q, n - 1);
    }

    @Override
    public double getSum(int n){
        return first * (Math.pow(q, n) - 1) / (q - 1);
    }

    @Override
    public String toString() {
        return "Exponential{a1=" + first + ", q=" + q + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Exponential other = (Exponential) obj;
        return first == other.first && q == other.q;
    }
}
