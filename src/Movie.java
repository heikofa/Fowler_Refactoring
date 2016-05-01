public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private Price price;
    private String title;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }
    public String getTitle (){
        return title;
    }
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1 ;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}