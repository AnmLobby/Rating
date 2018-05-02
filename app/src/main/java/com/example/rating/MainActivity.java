package com.example.rating;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import com.google.gson.reflect.TypeToken;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import cn.jzvd.JZVideoPlayerStandard;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wseemann.media.FFmpegMediaMetadataRetriever;

import static com.alibaba.fastjson.JSON.parseObject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Api api;
    private CompositeDisposable mcompositeDisposable=new CompositeDisposable();
    private HomeAdapter homeAdapter;
    private RecyclerView easyRecyclerView;
    private RetrofitManager retrofitManagera;
    private List<HomeItem.ItemListBean> dataSource=new ArrayList<>();
    private JZVideoPlayerStandard jzVideoPlayerStandard;
    private String url= "https://www.weiyun.com/video_preview?videoID=f7b22754-3933-4dfc-a38f-ee8767272a5d&dirKey=22912732f0a739ae12b58dcd423dce4a&pdirKey=22912732f338fdcb41c5dfa52b9ed888";
    private String html="http://www.chinacaipu.com/menu/rouleishipu/139755.html";
    private Banner banner;
    private List<String> listImage = new ArrayList<>();
    private List<String> listTitle=new ArrayList<>();
    private UserBean[] userBeansList=new UserBean[]{};
    private  String s="https://qiniu-xpc5.vmoviercdn.com/5a388e8631ff6.mp4";
    private String[] images={"http://img.kaiyanapp.com/d7186edff72b6a6ddd03eff166ee4cd8.jpeg","http://img.kaiyanapp.com/cd74ae49d45ab6999bcd55dbae6d550f.jpeg","http://img.kaiyanapp.com/2b7ac9d21ca06df7e39e80a3799a3fb6.jpeg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.image);
        banner=findViewById(R.id.banner);
        jzVideoPlayerStandard=findViewById(R.id.jz);
        Log.e(TAG, "onCreate````````````: "+ getNetVideoBitmap(s));
        jzVideoPlayerStandard.thumbImageView.setImageBitmap(createVideoThumbnail(s,1920,1080));
        jzVideoPlayerStandard.setUp(s,jzVideoPlayerStandard.SCREEN_WINDOW_NORMAL,"");

        Glide.with(this).load("https://cs.vmovier.com/Uploads/cover/2017-12-19/5a3890a2abcc4_cut.jpeg@600w_400h_1e_1c.jpg").into(imageView);
//        initOk();

//        String imageUrlCheck;
//            imageUrlCheck = ImageUrlCheck.getImageUrlCheck(url).toString();

//        Observable.just(url)
//                 .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) throws Exception {
//                        Document doc;
//                        doc = Jsoup.connect(url).get();
//                        Elements element = doc.getElementsByTag("script");
//                        String[] elScriptList = element.get(0).data().toString().split("window.syncData.=");
//                        String str = elScriptList[1].toString().trim();
//                        StringBuffer stringBuffer = new StringBuffer();
//                        stringBuffer.append(str);
//                        stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
//                        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(stringBuffer));
//                       String  videoUrl=jsonObject.getJSONObject("cloudPlayInfo").getJSONObject("origin_video_play_info").getString("https_download_url").toString();
//                Log.e(TAG, "KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK "+videoUrl);
//                    }
//                });

//        StringBuffer stringBuff=new StringBuffer();
//        stringBuff.append(imageUrlCheck);
//        String llll=VideoReturen.getResule(url);
//        Log.e(TAG, "onCreateqqqqqqqqqqqqqq: "+VideoReturen.getResule(url));
//        Log.e(TAG, "KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK "+imageUrlCheck);
//        initBanner();


//        jsinit();
//        jsoupInit();
//        initView();//能拿到
//       init();

//        getNetVideoBitmap(url);
//        easyRecyclerView=findViewById(R.id.clye);
//        retrofitManagera=RetrofitManager.builder();
//        api =retrofitManagera.getService();
//        homeAdapter=new HomeAdapter(new ArrayList<HomeItem.ItemListBean>());
//        LinearLayoutManager layoutManager=new LinearLayoutManager(MyApplication.getContext());
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        easyRecyclerView.setLayoutManager(layoutManager);
//        easyRecyclerView.setAdapter(homeAdapter);
//        mcompositeDisposable.add(api.getPopular()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Consumer<HomeItem>() {
//                    @Override
//                    public void accept(HomeItem rankListBean) throws Exception {
//                        Log.e(TAG, "accept: "+rankListBean.getItemList().size() );
//                        dataSource.addAll(rankListBean.getItemList());
//                        homeAdapter.setNewData(dataSource);
//                        homeAdapter.loadMoreComplete();
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) throws Exception {
//                        Log.e(TAG, "accept: " );
//                    }
//                }));

    }

    private void initOk() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                List<UserBean> userBeans=new ArrayList<>();
                UserBean user=new UserBean();
                String html = "https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.快速上手体验.mp4";
                Document doc;
                try {
                    doc = Jsoup.connect(url).get();
//                    Elements element = doc.getElementsByTag("script").eq(0);
                    Elements element = doc.getElementsByTag("script");
                    String[] elScriptList = element.get(0).data().toString().split("window.syncData.=");
                    String str=elScriptList[1].toString().trim();
                    Log.e(TAG, "run: ---"+str);
                    StringBuffer stringBuffer=new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.delete(stringBuffer.length()-1,stringBuffer.length());
//                    Log.e(TAG, "88888888 "+stringBuffer );


//                    JSONObject jso=JSON.parseObject(String.valueOf(stringBuffer));//json字符串转换成jsonobject对象
//                    System.out.println("初始jsonObject:\n"+jso+"\n");
//                    JSONArray jsarr=jso.getJSONArray("shareInfo");//jsonobject对象取得some对应的jsonarray数组

//                    System.out.println("jsonObject里面的jsonarray:\n"+jsarr+"\n");
//                    JSONObject ao=jsarr.getJSONObject(0);//jsonarray对象通过getjsonobjext(index)方法取得数组里面的jsonobject对象
//                    System.out.println("jsonObject里面的jsonarray里面的第一个jsonobject：\n"+ao+"\n");
//                    String vString=ao.getString("k1");//jsonobject对象通过key直接取得String的值
//                    System.out.println("jsonObject里面的jsonarray里面的第一个jsonobject里的键值对对k1取值：\n"+vString+"\n");




                    JSONObject jsonObject = JSONObject.parseObject(String.valueOf(stringBuffer));
                    // 获取到key为shoppingCartItemList的值
                    String r = String.valueOf(jsonObject.getJSONObject("shareInfo"));
                    JSONObject jso=JSON.parseObject(r);
                    JSONArray jsarr=jso.getJSONArray("file_list");
                    JSONObject ao=jsarr.getJSONObject(0);
                    String vString=ao.getString("video_thumb")+"/640";

//                    String jsonO = .getJSONObject()String.valueOf(JSONObject.parseObject(String.valueOf(r)).getJSONObject("file_list"));
//                    Log.e(TAG, "r11111111111un: "+vString );
//                    String oo=jsonO.getString("video_thumb");
                    String ro = jsonObject.getJSONObject("cloudPlayInfo").getJSONObject("origin_video_play_info").getString("https_download_url");
//                    Log.e(TAG, "run: "+oo );

// jsonToList(str);
//                    Looper.prepare();
                    playVideo(ro);
                    playInmage(vString);
//                    Looper.loop();

//                    Log.e(TAG, "run: "+r.toString().trim() );

//                    JSONObject obj = JSONObject.parseObject(stringBuffer.toString());
//
//                    String jsonArray = obj.getJSONObject("videoInfo").getJSONArray("filename").toJSONString();
//                    Log.e(TAG, "run:88888888 "+jsonArray);
//                    String s=obj.getJSONArray("filename").toString().trim();
//                    Log.e(TAG, "***run: "+s);
//                    System.out.println(obj.getJSONObject("total_listings").getJSONArray("shareKey").getJSONArray(0).get(0));



//                    System.out.println(obj.getJSONArray("shareKey").getJSONArray(0).get(0).toString().trim());

//
//                    SimplePropertyPreFilter filter=new SimplePropertyPreFilter(UserBean.class,stringBuffer.toString().trim());
//                    //若实体类中没有该字段，则直接不解析，不会报错的
//                    String jsonStr=JSON.toJSONString(userBeans,filter);
//
//                    Log.e(TAG, "------"+jsonStr );
//                    Log.e(TAG, "run: ******************"+jsonToList(str));
//                    Log.e(TAG, "run: ########"+objectToJson(str));




                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    private void playInmage(final String vString) {
        Observable.just(vString)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Log.e(TAG, "accept: "+s );
                        Glide.with(MainActivity.this)
//                                .load(R.drawable.cover_default)
                                .load(vString)
                                .into(jzVideoPlayerStandard.thumbImageView);
//                        jzVideoPlayerStandard.setUp(s,jzVideoPlayerStandard.SCREEN_WINDOW_NORMAL,"");
//
//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap(getNetVideoBitmap(s));
//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap();
//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap(createVideoThumbnail(s,400,200));
                    }
                });
    }

    private void playVideo(String r) {

        Observable.just(r)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Log.e(TAG, "accept: "+s );
//                        Glide.with(MainActivity.this)
////                                .load(R.drawable.cover_default)
//                                .load("http://p.qpic.cn/weiyun_snapshot/Q3auHgzwzM4vIcERO1iaWNib7Ofk1DZJuN7icRlGZ8qbw7BUjQWdP2Z9WUkvxUUGOcYVLqaBXm8IyUncMkRKy34XrfBO8eo8ghic/640")
//                                .into(jzVideoPlayerStandard.thumbImageView);
                        jzVideoPlayerStandard.setUp(s,jzVideoPlayerStandard.SCREEN_WINDOW_NORMAL,"");

//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap(getNetVideoBitmap(s));
//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap();
//                        jzVideoPlayerStandard.thumbImageView.setImageBitmap(createVideoThumbnail(s,400,200));
                    }
                });


    }

    public static List jsonToList(String jsonData) {
        if (TextUtils.isEmpty(jsonData)) {
            return null;
        }
        List arrayList = null;
        try {
            arrayList = parseObject(jsonData, new TypeReference<ArrayList>() {
            });
        } catch (Exception e) {
        }
        return arrayList;
    }

    public static String objectToJson(Object object) {
        if (object == null) {
            return "";
        }
        try {
            return JSON.toJSONString(object);
        } catch (JSONException e) {
        } catch (Exception e) {
        }
        return "";
    }


    private void initView() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                String html = "https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.快速上手体验.mp4";
                Document doc;
                try {
                    doc = Jsoup.connect(html).get();
                    Elements element = doc.getElementsByTag("script").eq(0);
                    Log.e(TAG, "run:888 "+element.toString() );
//                    Element content = doc.getElementById("content"); //定义收索范围。
                    Elements scripts = doc.getElementsByTag("script");
                    for (Element script: scripts ) {
                        String scriptText = script.text();
                        Log.e(TAG, "run: " + scriptText.toString().trim());
                    }


                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }
        }).start();
        }

    //
//    private void jsinit() {
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                String html = "https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.快速上手体验.mp4";
//                Document doc;
//                try{
//                    doc = Jsoup.connect(html).get();
////                    Element link = doc.select("div").first();
////                    String linkHref = link.attr("id"); // "http://example.com/"//取得链接地址
//                    Element  id=doc.select("div.main").select("a");
//                    String   idpl=id.attr("preload");
//                    System.out.println(idpl);
////                    System.out.println(linkHref);
//                }catch(IOException e){
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
////                try
////                {
////                    Document document = Jsoup.connect("https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4").get();
////                    System.out.println(document.title());
////                    Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
////                    for (Element image : images)
////                    {
////                        System.out.println("src : " + image.attr("src"));
////                        System.out.println("height : " + image.attr("height"));
////                        System.out.println("width : " + image.attr("width"));
////                        System.out.println("alt : " + image.attr("alt"));
////                    }
////                }
////                catch (IOException e)
////                {
////                    e.printStackTrace();
////                }
////                try {
////                    Document doc = Jsoup.connect("https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4").get();
////                    Elements titleAndPic = doc.select("div.video.video-js.vjs_video_3-dimensions.vjs-controls-enabled.vjs-workinghover.vjs-v6.vjs-has-started.vjs-paused.vjs-user-inactive");
////                    Log.i("mytag", "title:" + titleAndPic.get(0).select("video").attr("autoplay"));
////
//
////                    //所需链接在<div class="detail">中的<a>标签里面
////                    Elements url = doc.select("div.detail").select("a");
////                    Log.i("mytag", "url:" + url.get(1).attr("href"));
////
////                    //原料在<p class="subcontent">中
////                    Elements burden = doc.select("p.subcontent");
////                    //对于一个元素中的文本，可以使用Element.text()方法
////                    Log.i("mytag", "burden:" + burden.get(1).text());
//
////                }catch(Exception e) {
////                    Log.i("mytag", e.toString());
////                }
//
//
////
////                try {
////                    Document doc = Jsoup.connect("https://www.weiyun.com/video_preview?videoID=d8f94d33-bfce-4c06-8fc5-9795b9344f94&dirKey=22912732f0a739ae12b58dcd423dce4a&shareKey=5DZBOD6&fileName=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4").get();
//////                    Elements elements = doc.select("div[id=vjs_video_3]").select("div.video.video-js.vjs_video_3-dimensions.vjs-controls-enabled.vjs-workinghover.vjs-v6.vjs-has-started.vjs-paused.vjs-user-inactive");
////                    Elements elements = doc.select("div.video.video-js.vjs_video_3-dimensions.vjs-controls-enabled.vjs-workinghover.vjs-v6.vjs-has-started.vjs-paused.vjs-user-inactive");
////                    Elements p = doc.select("video[vjs-tech]");
////                    Log.d(TAG, "run: "+p.size());
////                    for(Element element : elements){
////                        Elements t = element.select("video.vjs-tech");
////                        System.out.println("src : " + t.get(0).attr("autoplay"));
////                        Log.e("url*****************", t.get(0).attr("autoplay"));
////                    }
////                } catch (IOException e) {
////                    // TODO Auto-generated catch block
////                    e.printStackTrace();
////                } catch (Exception e) {
////                    // TODO: handle exception
////                }
//
//            }
//        }).start();
//
//
//    }
    private void initBanner() {
        listImage.add("http://img.kaiyanapp.com/d7186edff72b6a6ddd03eff166ee4cd8.jpeg");
        listImage.add("http://img.kaiyanapp.com/cd74ae49d45ab6999bcd55dbae6d550f.jpeg");
        listImage.add("http://img.kaiyanapp.com/2b7ac9d21ca06df7e39e80a3799a3fb6.jpeg");
        Log.e(TAG, "initBanner: "+listImage.size() );
//        banner.setImages(listImage)
//                .setImageLoader(new GlideImageLoader())
//                .setBannerStyle(BannerConfig.NUM_INDICATOR)
//                .isAutoPlay(true);
        listTitle.add("1");
        listTitle.add("2");
        listTitle.add("3");
        banner.setImages((List<?>) listImage)
                .setImageLoader(new GlideImageLoader())
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                .setBannerTitles(listTitle)
                .isAutoPlay(true);
        banner.start();
    }
    private void jsoupInit() {

            new Thread(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    try {
                        Document doc = Jsoup.connect("http://www.cnblogs.com/").get();

                        Elements elements = doc.select("div.post_item_body");

                        for(Element element : elements){
                            Elements title = element.select("a.titlelnk");
                            Log.e("title:", title.get(0).text());
                            Log.e("url", title.get(0).attr("href"));

                            Elements content = element.select("p.post_item_summary");
                            Log.e("content:", content.get(0).text());

                        }

                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                }
            }).start();

    }


    private void init() {

        try {
            //还是一样先从一个URL加载一个Document对象。
            Document doc = Jsoup.connect("http://home.meishichina.com/show-top-type-recipe.html").get();

            //“椒麻鸡”和它对应的图片都在<div class="pic">中
            Elements titleAndPic = doc.select("div.pic");
            //使用Element.select(String selector)查找元素，使用Node.attr(String key)方法取得一个属性的值
            Log.i("mytag", "title:" + titleAndPic.get(1).select("a").attr("title") + "pic:" + titleAndPic.get(1).select("a").select("img").attr("data-src"));

            //所需链接在<div class="detail">中的<a>标签里面
            Elements url = doc.select("div.detail").select("a");
            Log.i("mytag", "url:" + url.get(1).attr("href"));

            //原料在<p class="subcontent">中
            Elements burden = doc.select("p.subcontent");
            //对于一个元素中的文本，可以使用Element.text()方法
            Log.i("mytag", "burden:" + burden.get(1).text());

        }catch(Exception e) {
            Log.i("mytag", e.toString());
        }



    }

    public static Bitmap getNetVideoBitmap(String videoUrl) {
        Bitmap bitmap = null;


        FFmpegMediaMetadataRetriever retriever = new FFmpegMediaMetadataRetriever();
        try {
            //根据url获取缩略图
            retriever.setDataSource(videoUrl, new HashMap());
            //获得第一帧图片
            bitmap = retriever.getFrameAtTime();
            Log.e(TAG, "getNetVideoBitmap: "+bitmap.getByteCount() );
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            retriever.release();
        }
        return bitmap;
    }
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    private Bitmap createVideoThumbnail(String url, int width, int height) {
        Bitmap bitmap = null;
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        int kind = MediaStore.Video.Thumbnails.MINI_KIND;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                retriever.setDataSource(url, new HashMap<String, String>());
            } else {
                retriever.setDataSource(url);
            }
            bitmap = retriever.getFrameAtTime();
        } catch (IllegalArgumentException ex) {
            // Assume this is a corrupt video file
        } catch (RuntimeException ex) {
            // Assume this is a corrupt video file.
        } finally {
            try {
                retriever.release();
            } catch (RuntimeException ex) {
                // Ignore failures while cleaning up.
            }
        }
        if (kind == MediaStore.Images.Thumbnails.MICRO_KIND && bitmap != null) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, width, height,
                    ThumbnailUtils.OPTIONS_RECYCLE_INPUT);
        }
        return bitmap;
    }
}
