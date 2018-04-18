package cosw.eci.edu.lab11.Network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NetworkService {
    @POST( "user/login" )
    Call<Token> login(@Body LoginWrapper user );

}
