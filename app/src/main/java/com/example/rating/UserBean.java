package com.example.rating;

import java.util.List;

/**
 * Created by 鱼握拳 on 2018/4/25.
 */

public class UserBean {

    /**
     * userInfo : {}
     * cloudPlayInfo : {"hd_video_play_info":{"retcode":25834,"dl_proxy_https_cos_path":null},"hd_video_exists":false,"origin_video_play_info":{"https_download_url":"https://sz-btfs-v2-yun-ftn.weiyun.com/ftn_handler/933f84514d61fb44c54794c762f8229838be007ed19b50d14d9d464adbb441de/2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4?fname=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4&from=30013&version=3.3.3.3&uin=841453858","video_url":null,"cookie_name":"","cookie_value":""}}
     * videoInfo : {"file_size":"","filename":"2.快速上手体验.mp4"}
     * episodeInfo : {"file_list":[],"finish_flag":true,"pdir_key":"","total_file_count":0}
     * shareInfo : {"share_uin":null,"down_cnt":0,"view_cnt":4,"store_cnt":0,"res_type":0,"share_name":"2.快速上手体验.mp4","create_time":1524282033,"pdir_key":"22912732f0a739ae12b58dcd423dce4a","file_list":[{"file_id":"d8f94d33-bfce-4c06-8fc5-9795b9344f94","file_name":"2.快速上手体验.mp4","file_size":40750412,"thumb_url":null,"pdir_key":"22912732f0a739ae12b58dcd423dce4a","long_time":835000,"video_thumb":"http://p.qpic.cn/weiyun_snapshot/Q3auHgzwzM4vIcERO1iaWNib7Ofk1DZJuN7icRlGZ8qbw7BUjQWdP2Z9WUkvxUUGOcYVLqaBXm8IyUncMkRKy34XrfBO8eo8ghic","https_thumb_url":null,"lib_id":null,"file_mtime":1523840935514}],"dir_list":[],"share_key":"5DZBOD6","short_url":"https://share.weiyun.com/5DZBOD6","safe_type":null,"virus_desc":null,"virus_name":null,"share_flag":11,"item":{},"need_pwd":null,"html_content":null,"resource_list":[],"collection":{},"thumb_url":null,"pwd":"","remain_time":-1,"resource_type":0,"store_appid":0,"share_nick_name":"   。","share_head_image_url":"http://thirdqq.qlogo.cn/g?b=sdk&k=FLcGBfm6VMjwoMsYXT5lgw&s=640&t=1483354367","share_type":11,"group_code":0,"is_editable":false,"weiyun_vip_flag":0,"weiyun_vip_img_url":"http://qzonestyle.gtimg.cn/qz-proj/wy-src/img/vip-v2/vip_0_off_.png","https_weiyun_vip_img_url":"https://qzonestyle.gtimg.cn/qz-proj/wy-src/img/vip-v2/vip_0_off_.png","is_share_owner":false,"note_list":[],"server_page_context":"0,1,0,1","finish_flag":true,"total_dir_count":0,"total_file_count":1,"is_all_pic_video":true,"already_join":false,"nickname_list":[],"album_owner_nickname":null,"album_owner_logo":null,"share_dir_join_user_list":[],"share_user_id":null,"album_owner_user_id":null,"is_dir_encryption":null,"total_note_count":0,"last_save_path":[],"file_item_list":[],"file_size":null,"file_suffix":null,"is_all_pic":false,"is_all_video":true}
     * videoID : d8f94d33-bfce-4c06-8fc5-9795b9344f94
     * dirKey : 22912732f0a739ae12b58dcd423dce4a
     * pdirKey :
     * shareKey : 5DZBOD6
     * type : share
     * isOwner : true
     * error : {}
     * shareDirRootKey :
     * fileName : 2.快速上手体验.mp4
     * safebox :
     */

    private UserInfoBean userInfo;
    private CloudPlayInfoBean cloudPlayInfo;
    private VideoInfoBean videoInfo;
    private EpisodeInfoBean episodeInfo;
    private ShareInfoBean shareInfo;
    private String videoID;
    private String dirKey;
    private String pdirKey;
    private String shareKey;
    private String type;
    private boolean isOwner;
    private ErrorBean error;
    private String shareDirRootKey;
    private String fileName;
    private String safebox;


    public static class ShareInfoBean{


        /**
         * share_uin : null
         * down_cnt : 0
         * view_cnt : 4
         * store_cnt : 0
         * res_type : 0
         * share_name : 2.快速上手体验.mp4
         * create_time : 1524282033
         * pdir_key : 22912732f0a739ae12b58dcd423dce4a
         * file_list : [{"file_id":"d8f94d33-bfce-4c06-8fc5-9795b9344f94","file_name":"2.快速上手体验.mp4","file_size":40750412,"thumb_url":null,"pdir_key":"22912732f0a739ae12b58dcd423dce4a","long_time":835000,"video_thumb":"http://p.qpic.cn/weiyun_snapshot/Q3auHgzwzM4vIcERO1iaWNib7Ofk1DZJuN7icRlGZ8qbw7BUjQWdP2Z9WUkvxUUGOcYVLqaBXm8IyUncMkRKy34XrfBO8eo8ghic","https_thumb_url":null,"lib_id":null,"file_mtime":1523840935514}]
         * dir_list : []
         * share_key : 5DZBOD6
         * short_url : https://share.weiyun.com/5DZBOD6
         * safe_type : null
         * virus_desc : null
         * virus_name : null
         * share_flag : 11
         * item : {}
         * need_pwd : null
         * html_content : null
         * resource_list : []
         * collection : {}
         * thumb_url : null
         * pwd :
         * remain_time : -1
         * resource_type : 0
         * store_appid : 0
         * share_nick_name :    。
         * share_head_image_url : http://thirdqq.qlogo.cn/g?b=sdk&k=FLcGBfm6VMjwoMsYXT5lgw&s=640&t=1483354367
         * share_type : 11
         * group_code : 0
         * is_editable : false
         * weiyun_vip_flag : 0
         * weiyun_vip_img_url : http://qzonestyle.gtimg.cn/qz-proj/wy-src/img/vip-v2/vip_0_off_.png
         * https_weiyun_vip_img_url : https://qzonestyle.gtimg.cn/qz-proj/wy-src/img/vip-v2/vip_0_off_.png
         * is_share_owner : false
         * note_list : []
         * server_page_context : 0,1,0,1
         * finish_flag : true
         * total_dir_count : 0
         * total_file_count : 1
         * is_all_pic_video : true
         * already_join : false
         * nickname_list : []
         * album_owner_nickname : null
         * album_owner_logo : null
         * share_dir_join_user_list : []
         * share_user_id : null
         * album_owner_user_id : null
         * is_dir_encryption : null
         * total_note_count : 0
         * last_save_path : []
         * file_item_list : []
         * file_size : null
         * file_suffix : null
         * is_all_pic : false
         * is_all_video : true
         */

        private Object share_uin;
        private int down_cnt;
        private int view_cnt;
        private int store_cnt;
        private int res_type;
        private String share_name;
        private int create_time;
        private String pdir_key;
        private String share_key;
        private String short_url;
        private Object safe_type;
        private Object virus_desc;
        private Object virus_name;
        private int share_flag;
        private ItemBean item;
        private Object need_pwd;
        private Object html_content;
        private CollectionBean collection;
        private Object thumb_url;
        private String pwd;
        private int remain_time;
        private int resource_type;
        private int store_appid;
        private String share_nick_name;
        private String share_head_image_url;
        private int share_type;
        private int group_code;
        private boolean is_editable;
        private int weiyun_vip_flag;
        private String weiyun_vip_img_url;
        private String https_weiyun_vip_img_url;
        private boolean is_share_owner;
        private String server_page_context;
        private boolean finish_flag;
        private int total_dir_count;
        private int total_file_count;
        private boolean is_all_pic_video;
        private boolean already_join;
        private Object album_owner_nickname;
        private Object album_owner_logo;
        private Object share_user_id;
        private Object album_owner_user_id;
        private Object is_dir_encryption;
        private int total_note_count;
        private Object file_size;
        private Object file_suffix;
        private boolean is_all_pic;
        private boolean is_all_video;
        private List<FileListBean> file_list;
        private List<?> dir_list;
        private List<?> resource_list;
        private List<?> note_list;
        private List<?> nickname_list;
        private List<?> share_dir_join_user_list;
        private List<?> last_save_path;
        private List<?> file_item_list;

        public Object getShare_uin() {
            return share_uin;
        }

        public void setShare_uin(Object share_uin) {
            this.share_uin = share_uin;
        }

        public int getDown_cnt() {
            return down_cnt;
        }

        public void setDown_cnt(int down_cnt) {
            this.down_cnt = down_cnt;
        }

        public int getView_cnt() {
            return view_cnt;
        }

        public void setView_cnt(int view_cnt) {
            this.view_cnt = view_cnt;
        }

        public int getStore_cnt() {
            return store_cnt;
        }

        public void setStore_cnt(int store_cnt) {
            this.store_cnt = store_cnt;
        }

        public int getRes_type() {
            return res_type;
        }

        public void setRes_type(int res_type) {
            this.res_type = res_type;
        }

        public String getShare_name() {
            return share_name;
        }

        public void setShare_name(String share_name) {
            this.share_name = share_name;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public String getPdir_key() {
            return pdir_key;
        }

        public void setPdir_key(String pdir_key) {
            this.pdir_key = pdir_key;
        }

        public String getShare_key() {
            return share_key;
        }

        public void setShare_key(String share_key) {
            this.share_key = share_key;
        }

        public String getShort_url() {
            return short_url;
        }

        public void setShort_url(String short_url) {
            this.short_url = short_url;
        }

        public Object getSafe_type() {
            return safe_type;
        }

        public void setSafe_type(Object safe_type) {
            this.safe_type = safe_type;
        }

        public Object getVirus_desc() {
            return virus_desc;
        }

        public void setVirus_desc(Object virus_desc) {
            this.virus_desc = virus_desc;
        }

        public Object getVirus_name() {
            return virus_name;
        }

        public void setVirus_name(Object virus_name) {
            this.virus_name = virus_name;
        }

        public int getShare_flag() {
            return share_flag;
        }

        public void setShare_flag(int share_flag) {
            this.share_flag = share_flag;
        }

        public ItemBean getItem() {
            return item;
        }

        public void setItem(ItemBean item) {
            this.item = item;
        }

        public Object getNeed_pwd() {
            return need_pwd;
        }

        public void setNeed_pwd(Object need_pwd) {
            this.need_pwd = need_pwd;
        }

        public Object getHtml_content() {
            return html_content;
        }

        public void setHtml_content(Object html_content) {
            this.html_content = html_content;
        }

        public CollectionBean getCollection() {
            return collection;
        }

        public void setCollection(CollectionBean collection) {
            this.collection = collection;
        }

        public Object getThumb_url() {
            return thumb_url;
        }

        public void setThumb_url(Object thumb_url) {
            this.thumb_url = thumb_url;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public int getRemain_time() {
            return remain_time;
        }

        public void setRemain_time(int remain_time) {
            this.remain_time = remain_time;
        }

        public int getResource_type() {
            return resource_type;
        }

        public void setResource_type(int resource_type) {
            this.resource_type = resource_type;
        }

        public int getStore_appid() {
            return store_appid;
        }

        public void setStore_appid(int store_appid) {
            this.store_appid = store_appid;
        }

        public String getShare_nick_name() {
            return share_nick_name;
        }

        public void setShare_nick_name(String share_nick_name) {
            this.share_nick_name = share_nick_name;
        }

        public String getShare_head_image_url() {
            return share_head_image_url;
        }

        public void setShare_head_image_url(String share_head_image_url) {
            this.share_head_image_url = share_head_image_url;
        }

        public int getShare_type() {
            return share_type;
        }

        public void setShare_type(int share_type) {
            this.share_type = share_type;
        }

        public int getGroup_code() {
            return group_code;
        }

        public void setGroup_code(int group_code) {
            this.group_code = group_code;
        }

        public boolean isIs_editable() {
            return is_editable;
        }

        public void setIs_editable(boolean is_editable) {
            this.is_editable = is_editable;
        }

        public int getWeiyun_vip_flag() {
            return weiyun_vip_flag;
        }

        public void setWeiyun_vip_flag(int weiyun_vip_flag) {
            this.weiyun_vip_flag = weiyun_vip_flag;
        }

        public String getWeiyun_vip_img_url() {
            return weiyun_vip_img_url;
        }

        public void setWeiyun_vip_img_url(String weiyun_vip_img_url) {
            this.weiyun_vip_img_url = weiyun_vip_img_url;
        }

        public String getHttps_weiyun_vip_img_url() {
            return https_weiyun_vip_img_url;
        }

        public void setHttps_weiyun_vip_img_url(String https_weiyun_vip_img_url) {
            this.https_weiyun_vip_img_url = https_weiyun_vip_img_url;
        }

        public boolean isIs_share_owner() {
            return is_share_owner;
        }

        public void setIs_share_owner(boolean is_share_owner) {
            this.is_share_owner = is_share_owner;
        }

        public String getServer_page_context() {
            return server_page_context;
        }

        public void setServer_page_context(String server_page_context) {
            this.server_page_context = server_page_context;
        }

        public boolean isFinish_flag() {
            return finish_flag;
        }

        public void setFinish_flag(boolean finish_flag) {
            this.finish_flag = finish_flag;
        }

        public int getTotal_dir_count() {
            return total_dir_count;
        }

        public void setTotal_dir_count(int total_dir_count) {
            this.total_dir_count = total_dir_count;
        }

        public int getTotal_file_count() {
            return total_file_count;
        }

        public void setTotal_file_count(int total_file_count) {
            this.total_file_count = total_file_count;
        }

        public boolean isIs_all_pic_video() {
            return is_all_pic_video;
        }

        public void setIs_all_pic_video(boolean is_all_pic_video) {
            this.is_all_pic_video = is_all_pic_video;
        }

        public boolean isAlready_join() {
            return already_join;
        }

        public void setAlready_join(boolean already_join) {
            this.already_join = already_join;
        }

        public Object getAlbum_owner_nickname() {
            return album_owner_nickname;
        }

        public void setAlbum_owner_nickname(Object album_owner_nickname) {
            this.album_owner_nickname = album_owner_nickname;
        }

        public Object getAlbum_owner_logo() {
            return album_owner_logo;
        }

        public void setAlbum_owner_logo(Object album_owner_logo) {
            this.album_owner_logo = album_owner_logo;
        }

        public Object getShare_user_id() {
            return share_user_id;
        }

        public void setShare_user_id(Object share_user_id) {
            this.share_user_id = share_user_id;
        }

        public Object getAlbum_owner_user_id() {
            return album_owner_user_id;
        }

        public void setAlbum_owner_user_id(Object album_owner_user_id) {
            this.album_owner_user_id = album_owner_user_id;
        }

        public Object getIs_dir_encryption() {
            return is_dir_encryption;
        }

        public void setIs_dir_encryption(Object is_dir_encryption) {
            this.is_dir_encryption = is_dir_encryption;
        }

        public int getTotal_note_count() {
            return total_note_count;
        }

        public void setTotal_note_count(int total_note_count) {
            this.total_note_count = total_note_count;
        }

        public Object getFile_size() {
            return file_size;
        }

        public void setFile_size(Object file_size) {
            this.file_size = file_size;
        }

        public Object getFile_suffix() {
            return file_suffix;
        }

        public void setFile_suffix(Object file_suffix) {
            this.file_suffix = file_suffix;
        }

        public boolean isIs_all_pic() {
            return is_all_pic;
        }

        public void setIs_all_pic(boolean is_all_pic) {
            this.is_all_pic = is_all_pic;
        }

        public boolean isIs_all_video() {
            return is_all_video;
        }

        public void setIs_all_video(boolean is_all_video) {
            this.is_all_video = is_all_video;
        }

        public List<FileListBean> getFile_list() {
            return file_list;
        }

        public void setFile_list(List<FileListBean> file_list) {
            this.file_list = file_list;
        }

        public List<?> getDir_list() {
            return dir_list;
        }

        public void setDir_list(List<?> dir_list) {
            this.dir_list = dir_list;
        }

        public List<?> getResource_list() {
            return resource_list;
        }

        public void setResource_list(List<?> resource_list) {
            this.resource_list = resource_list;
        }

        public List<?> getNote_list() {
            return note_list;
        }

        public void setNote_list(List<?> note_list) {
            this.note_list = note_list;
        }

        public List<?> getNickname_list() {
            return nickname_list;
        }

        public void setNickname_list(List<?> nickname_list) {
            this.nickname_list = nickname_list;
        }

        public List<?> getShare_dir_join_user_list() {
            return share_dir_join_user_list;
        }

        public void setShare_dir_join_user_list(List<?> share_dir_join_user_list) {
            this.share_dir_join_user_list = share_dir_join_user_list;
        }

        public List<?> getLast_save_path() {
            return last_save_path;
        }

        public void setLast_save_path(List<?> last_save_path) {
            this.last_save_path = last_save_path;
        }

        public List<?> getFile_item_list() {
            return file_item_list;
        }

        public void setFile_item_list(List<?> file_item_list) {
            this.file_item_list = file_item_list;
        }

        public static class ItemBean {
        }

        public static class CollectionBean {
        }

        public static class FileListBean {
            /**
             * file_id : d8f94d33-bfce-4c06-8fc5-9795b9344f94
             * file_name : 2.快速上手体验.mp4
             * file_size : 40750412
             * thumb_url : null
             * pdir_key : 22912732f0a739ae12b58dcd423dce4a
             * long_time : 835000
             * video_thumb : http://p.qpic.cn/weiyun_snapshot/Q3auHgzwzM4vIcERO1iaWNib7Ofk1DZJuN7icRlGZ8qbw7BUjQWdP2Z9WUkvxUUGOcYVLqaBXm8IyUncMkRKy34XrfBO8eo8ghic
             * https_thumb_url : null
             * lib_id : null
             * file_mtime : 1523840935514
             */

            private String file_id;
            private String file_name;
            private int file_size;
            private Object thumb_url;
            private String pdir_key;
            private int long_time;
            private String video_thumb;
            private Object https_thumb_url;
            private Object lib_id;
            private long file_mtime;

            public String getFile_id() {
                return file_id;
            }

            public void setFile_id(String file_id) {
                this.file_id = file_id;
            }

            public String getFile_name() {
                return file_name;
            }

            public void setFile_name(String file_name) {
                this.file_name = file_name;
            }

            public int getFile_size() {
                return file_size;
            }

            public void setFile_size(int file_size) {
                this.file_size = file_size;
            }

            public Object getThumb_url() {
                return thumb_url;
            }

            public void setThumb_url(Object thumb_url) {
                this.thumb_url = thumb_url;
            }

            public String getPdir_key() {
                return pdir_key;
            }

            public void setPdir_key(String pdir_key) {
                this.pdir_key = pdir_key;
            }

            public int getLong_time() {
                return long_time;
            }

            public void setLong_time(int long_time) {
                this.long_time = long_time;
            }

            public String getVideo_thumb() {
                return video_thumb;
            }

            public void setVideo_thumb(String video_thumb) {
                this.video_thumb = video_thumb;
            }

            public Object getHttps_thumb_url() {
                return https_thumb_url;
            }

            public void setHttps_thumb_url(Object https_thumb_url) {
                this.https_thumb_url = https_thumb_url;
            }

            public Object getLib_id() {
                return lib_id;
            }

            public void setLib_id(Object lib_id) {
                this.lib_id = lib_id;
            }

            public long getFile_mtime() {
                return file_mtime;
            }

            public void setFile_mtime(long file_mtime) {
                this.file_mtime = file_mtime;
            }
        }
    }
    public static class UserInfoBean {
    }
    public static class ErrorBean{

    }
    public static class CloudPlayInfoBean {
        /**
         * hd_video_play_info : {"retcode":25834,"dl_proxy_https_cos_path":null}
         * hd_video_exists : false
         * origin_video_play_info : {"https_download_url":"https://sz-btfs-v2-yun-ftn.weiyun.com/ftn_handler/933f84514d61fb44c54794c762f8229838be007ed19b50d14d9d464adbb441de/2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4?fname=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4&from=30013&version=3.3.3.3&uin=841453858","video_url":null,"cookie_name":"","cookie_value":""}
         */

        private HdVideoPlayInfoBean hd_video_play_info;
        private boolean hd_video_exists;
        private OriginVideoPlayInfoBean origin_video_play_info;

        public HdVideoPlayInfoBean getHd_video_play_info() {
            return hd_video_play_info;
        }

        public void setHd_video_play_info(HdVideoPlayInfoBean hd_video_play_info) {
            this.hd_video_play_info = hd_video_play_info;
        }

        public boolean isHd_video_exists() {
            return hd_video_exists;
        }

        public void setHd_video_exists(boolean hd_video_exists) {
            this.hd_video_exists = hd_video_exists;
        }

        public OriginVideoPlayInfoBean getOrigin_video_play_info() {
            return origin_video_play_info;
        }

        public void setOrigin_video_play_info(OriginVideoPlayInfoBean origin_video_play_info) {
            this.origin_video_play_info = origin_video_play_info;
        }

        public static class HdVideoPlayInfoBean {
            /**
             * retcode : 25834
             * dl_proxy_https_cos_path : null
             */

            private int retcode;
            private Object dl_proxy_https_cos_path;

            public int getRetcode() {
                return retcode;
            }

            public void setRetcode(int retcode) {
                this.retcode = retcode;
            }

            public Object getDl_proxy_https_cos_path() {
                return dl_proxy_https_cos_path;
            }

            public void setDl_proxy_https_cos_path(Object dl_proxy_https_cos_path) {
                this.dl_proxy_https_cos_path = dl_proxy_https_cos_path;
            }
        }

        public static class OriginVideoPlayInfoBean {
            /**
             * https_download_url : https://sz-btfs-v2-yun-ftn.weiyun.com/ftn_handler/933f84514d61fb44c54794c762f8229838be007ed19b50d14d9d464adbb441de/2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4?fname=2.%E5%BF%AB%E9%80%9F%E4%B8%8A%E6%89%8B%E4%BD%93%E9%AA%8C.mp4&from=30013&version=3.3.3.3&uin=841453858
             * video_url : null
             * cookie_name :
             * cookie_value :
             */

            private String https_download_url;
            private Object video_url;
            private String cookie_name;
            private String cookie_value;

            public String getHttps_download_url() {
                return https_download_url;
            }

            public void setHttps_download_url(String https_download_url) {
                this.https_download_url = https_download_url;
            }

            public Object getVideo_url() {
                return video_url;
            }

            public void setVideo_url(Object video_url) {
                this.video_url = video_url;
            }

            public String getCookie_name() {
                return cookie_name;
            }

            public void setCookie_name(String cookie_name) {
                this.cookie_name = cookie_name;
            }

            public String getCookie_value() {
                return cookie_value;
            }

            public void setCookie_value(String cookie_value) {
                this.cookie_value = cookie_value;
            }
        }
    }

    public static class VideoInfoBean {
        /**
         * file_size :
         * filename : 2.快速上手体验.mp4
         */

        private String file_size;
        private String filename;

        public String getFile_size() {
            return file_size;
        }

        public void setFile_size(String file_size) {
            this.file_size = file_size;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }
    }

    public static class EpisodeInfoBean {
        /**
         * file_list : []
         * finish_flag : true
         * pdir_key :
         * total_file_count : 0
         */

        private boolean finish_flag;
        private String pdir_key;
        private int total_file_count;
        private java.util.List<?> file_list;

        public boolean isFinish_flag() {
            return finish_flag;
        }

        public void setFinish_flag(boolean finish_flag) {
            this.finish_flag = finish_flag;
        }

        public String getPdir_key() {
            return pdir_key;
        }

        public void setPdir_key(String pdir_key) {
            this.pdir_key = pdir_key;
        }

        public int getTotal_file_count() {
            return total_file_count;
        }

        public void setTotal_file_count(int total_file_count) {
            this.total_file_count = total_file_count;
        }

        public List<?> getFile_list() {
            return file_list;
        }

        public void setFile_list(List<?> file_list) {
            this.file_list = file_list;
        }
    }
}
