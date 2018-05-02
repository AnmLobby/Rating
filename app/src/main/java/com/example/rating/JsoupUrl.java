package com.example.rating;

import android.util.Log;

import com.alibaba.fastjson.JSONObject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 鱼握拳 on 2018/4/26.
 */

public class JsoupUrl {

    private static String VideoUrl;

    public static String getInstance(final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                Document doc;
                try {
                    doc = Jsoup.connect(url).get();
                    Elements element = doc.getElementsByTag("script");
                    String[] elScriptList = element.get(0).data().toString().split("window.syncData.=");
                    String str = elScriptList[1].toString().trim();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
                    JSONObject jsonObject = JSONObject.parseObject(String.valueOf(stringBuffer));
                    VideoUrl = jsonObject.getJSONObject("cloudPlayInfo").getJSONObject("origin_video_play_info").getString("https_download_url");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        return VideoUrl;


    }
}
