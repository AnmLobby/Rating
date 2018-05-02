package com.example.javalib;

import com.sun.xml.internal.ws.util.StringUtils;


import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;

public class myClass {


        public static void main(String[] args) {
            String url = "http://www.valueonline.cn/laws/laws?typeid=96219074211635284";
            readHtml(url);
        }

        public static List<Object> readHtml(String url){
            List<Object> list  = new ArrayList<Object>();
            //
            Document doc = null;
            try {
                doc = Jsoup.connect(url).get();
            } catch (Exception e) {
                ///e.printStackTrace();
                System.out.println(e.getMessage()+":--------------->"+url);
            }
            if( doc == null )return list;
            Elements elScripts = doc.getElementsByTag("script");
            String[] elScriptList = elScripts.get(0).data().toString().split("var");
            String strTypeList = elScriptList[2];
            if( StringUtils.isNotBlank(strTypeList)){
            }

            strTypeList = elScriptList[3];
            System.out.println(strTypeList);
            if( StringUtils.isNotBlank(strTypeList) ){
                strTypeList = strTypeList.substring(strTypeList.indexOf("["), strTypeList.lastIndexOf("]")+1);
                JSONArray arrayList = JSONArray.fromObject(strTypeList);
                for (Object o : arrayList) {
                    JSONObject object = JSONObject.fromObject(o);
                    StringBuilder sb = new StringBuilder();
                    sb.append("insert into n3b_vl_market_type values ");
                    sb.append(" ( ");
                    sb.append("'0"+object.get("code_value")+"'");
                    sb.append(",'"+object.get("code_name")+"'");
                    sb.append(",'"+object.get("code_no")+"'");
                    sb.append(",'"+object.get("code_value")+"'");
                    sb.append(",'"+object.get("valid_flag")+"'");
                    sb.append(",'"+object.get("version")+"'");
                    sb.append(",'"+object.get("code_type")+"'");
                    sb.append(" ); ");
                    System.out.println(sb.toString());
                }
            }
            return list;
        }

}
