
public class Statistics {
    private int count;
    private int sum;


    public Statistics(){
    }

    public void addNumber(int number){
        //Can remain empty for now
        this.sum+=number;
        this.count = this.count + 1;
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        
        if(this.sum != 0 && this.count != 0){
        return (double) this.sum / this.count;
    }
    return 0.0;
    }
}
