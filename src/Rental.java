class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }
    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1 ;
        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}