package com.application.midterm2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FSService {
    @GET("venues/search?v=20170425&limit=1")
    Call<FSJSON> snapToPlace(@Query("client_id") String clientID,
                             @Query("client_secret") String clientSecret,
                             @Query("ll") String ll,
                             @Query("llAcc") double llAcc);
    @GET("search/recommendations?v=20170425&intent=global")
    Call<FSJSON> searchPlaces(@Query("client_id") String clientID,
                              @Query("client_secret") String clientSecret,
                              @Query("ll") String ll,
                              @Query("llAcc") double llAcc);
}