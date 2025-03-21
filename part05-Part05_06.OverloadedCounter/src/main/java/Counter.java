public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }
    public Counter(){
        this(0);
    }

    public void increase(){
        this.startValue = this.startValue + 1;
    }
    //Method Overloading
    public void increase(int increaseBy){
        if(increaseBy < 0){
            return;
        } else {
            this.startValue = this.startValue + increaseBy;
        }
    }
    public void decrease(){
        this.startValue = this.startValue - 1;
    }
    //Method Overloading
    public void decrease(int decreaseBy){
        if(decreaseBy < 0){
            return;
        } else {
            this.startValue = this.startValue - decreaseBy;
        }
    }
    public int value(){
        return startValue;
    }
}
