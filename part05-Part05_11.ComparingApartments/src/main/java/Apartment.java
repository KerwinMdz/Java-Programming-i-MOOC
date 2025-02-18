
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(compared.squares < this.squares){
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        int apartmentPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        if(apartmentPrice - comparedPrice < 0){
            return comparedPrice -apartmentPrice;
        } else
        return apartmentPrice - comparedPrice;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int apartmentMoreExpensive = this.princePerSquare * this.squares * this.rooms;
        int compareApartmentMoreExpensive = compared.princePerSquare * compared.squares * compared.rooms;
        if(apartmentMoreExpensive > compareApartmentMoreExpensive){
            return true;
        } else {
            return false;
        }
    }

}
