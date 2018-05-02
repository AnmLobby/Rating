package com.example.rating;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by 鱼握拳 on 2018/4/24.
 */

public class DataLearnerCrawler {
    public static void main(String[] args) {

        try
        {
            Document document = Jsoup.connect("http://www.yiibai.com").get();
            System.out.println(document.title());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}

