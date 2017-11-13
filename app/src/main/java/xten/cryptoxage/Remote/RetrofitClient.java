package xten.cryptoxage.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by C on 11/11/2017.
 */

public class RetrofitClient {
    private static Retrofit retrofit= null;
    public static Retrofit getClient(String baseURL){
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder ()
                    .baseUrl (baseURL)
                    .addConverterFactory (GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
