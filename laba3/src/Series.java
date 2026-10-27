public abstract class Series {
    protected double first;

    public Series(double first){
        this.first = first;
    }

    public abstract double getTerm(int n);

    public abstract double getSum(int n);

}
