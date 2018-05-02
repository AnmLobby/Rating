package com.example.rating;


import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 鱼握拳 on 2018/4/27.
 */

public class VideoReturen {
    private static final String TAG = "VideoReturen";
    public static String getResule(final String url){
        Observable.just(url)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(new Function<String, Void>() {
                    @Override
                    public Void apply(String s) throws Exception {

                            s="55";
                        Log.e(TAG, "apply: "+s);

                        return null;
                    }
                });
        return url;
    }

}
