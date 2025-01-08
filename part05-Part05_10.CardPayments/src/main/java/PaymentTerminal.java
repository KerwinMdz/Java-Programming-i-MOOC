
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        if(payment >= 2.50){
            change = payment - 2.50;
            affordableMeals++;
            money+=2.50;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        
        if(payment >= 4.30){
            change = payment - 4.30;
            heartyMeals++;
            money+=4.30;
            return change;
        }
        return payment;
    }
    //double bal;
    public boolean eatAffordably(PaymentCard card){
       
        if(card.balance() >= 2.50){
           
           affordableMeals++;
            return card.takeMoney(2.50);
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card){
        
        if(card.balance() >= 4.30){
            
            heartyMeals++;
            return card.takeMoney(4.30);
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
