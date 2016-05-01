/**
 * Created by Heiko on 01.05.2016.
 */
public abstract class Price {
    abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1 ;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}
