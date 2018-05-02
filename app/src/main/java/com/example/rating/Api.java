package com.example.rating;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 鱼握拳 on 2018/4/13.
 */

public interface Api {
    @GET("v3/categories/videoList?id=2&strategy=mostPopular&%20start=0&num=10")
    Observable<HomeItem> getPopular();
}
