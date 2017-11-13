package xten.cryptoxage.Remote;

import xten.cryptoxage.Model.Coin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by C on 11/11/2017.
 */

public interface CoinService {

    @GET("data/price")
    Call<Coin> calculateValue(@Query("fsym") String from, @Query("tsyms") String to);
}

