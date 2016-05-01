/**
 * Created by Heiko on 01.05.2016.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
