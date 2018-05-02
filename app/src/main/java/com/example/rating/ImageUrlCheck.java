package com.example.rating;

import android.util.Log;

import com.alibaba.fastjson.JSONObject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by 鱼握拳 on 2018/4/27.
 */

public class ImageUrlCheck {
    private volatile static ImageUrlCheck imageUrlCheck;
    private static final String TAG = "ImageUrlCheck";
    public static String videoUrl;
    public  static  String vl;
    public ImageUrlCheck(){
        super();
    }
    public ImageUrlCheck(String videoUrl){
        super();
        this.videoUrl=videoUrl;
    }
    @Override
    public String toString() {

        return videoUrl;
    }
    public static ImageUrlCheck getImageUrlCheck(final String url){

        if (imageUrlCheck==null){
            synchronized (ImageUrlCheck.class){
                if (imageUrlCheck==null){
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
                                videoUrl=jsonObject.getJSONObject("cloudPlayInfo").getJSONObject("origin_video_play_info").getString("https_download_url").toString();
                                Log.e(TAG, "啊啊啊啊啊啊啊啊啊啊啊啊啊" +videoUrl);
                                imageUrlCheck= new ImageUrlCheck(videoUrl);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                }
            }
        }
        return new ImageUrlCheck(videoUrl);
    }
}
