package com.zpp.ztv.HttpUtils.Entity;

import java.util.List;

public class DouyinLiveResponse {

    /**
     * code : 200
     * router : /api/douyin/web/fetch_user_live_videos
     * data : {"data":{"data":[{"id_str":"7542418868329827091","status":2,"status_str":"2","title":"滑县四间房镇王三寨村","cover":{"url_list":["https://p3-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=jLzXlpp7wvl75%2BMAh4yXza5OIfM%3D","https://p11-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=zeXKww0ZSMzED5AbgO4Fx9ViHzU%3D"]},"stream_url":{"flv_pull_url":{"FULL_HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4","HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd","SD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld","SD2":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd"},"default_resolution":"HD1","hls_pull_url_map":{"FULL_HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD2":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9"},"hls_pull_url":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","stream_orientation":2,"pull_datas":{}}}],"enter_room_id":"7542418868329827091","user":{"id_str":"2809975984364120","sec_uid":"MS4wLjABAAAA8aLtFo_E3XsLqFyYnohF683DQDPK5BdYU1HqPl_0f7-fXVu3oow_W-s-19WZodoD","nickname":"漯河市豫剧艺术中心（漯河市豫剧团）","foreign_user":0,"open_id_str":""},"room_status":0},"status_code":0}
     */

    private int code;
    private String router;
    private DataBeanXX data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public DataBeanXX getData() {
        return data;
    }

    public void setData(DataBeanXX data) {
        this.data = data;
    }

    public static class DataBeanXX {
        /**
         * data : {"data":[{"id_str":"7542418868329827091","status":2,"status_str":"2","title":"滑县四间房镇王三寨村","cover":{"url_list":["https://p3-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=jLzXlpp7wvl75%2BMAh4yXza5OIfM%3D","https://p11-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=zeXKww0ZSMzED5AbgO4Fx9ViHzU%3D"]},"stream_url":{"flv_pull_url":{"FULL_HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4","HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd","SD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld","SD2":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd"},"default_resolution":"HD1","hls_pull_url_map":{"FULL_HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD2":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9"},"hls_pull_url":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","stream_orientation":2,"pull_datas":{}}}],"enter_room_id":"7542418868329827091","user":{"id_str":"2809975984364120","sec_uid":"MS4wLjABAAAA8aLtFo_E3XsLqFyYnohF683DQDPK5BdYU1HqPl_0f7-fXVu3oow_W-s-19WZodoD","nickname":"漯河市豫剧艺术中心（漯河市豫剧团）","foreign_user":0,"open_id_str":""},"room_status":0}
         * status_code : 0
         */

        private DataBeanX data;
        private int status_code;

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public int getStatus_code() {
            return status_code;
        }

        public void setStatus_code(int status_code) {
            this.status_code = status_code;
        }

        public static class DataBeanX {
            /**
             * data : [{"id_str":"7542418868329827091","status":2,"status_str":"2","title":"滑县四间房镇王三寨村","cover":{"url_list":["https://p3-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=jLzXlpp7wvl75%2BMAh4yXza5OIfM%3D","https://p11-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=zeXKww0ZSMzED5AbgO4Fx9ViHzU%3D"]},"stream_url":{"flv_pull_url":{"FULL_HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4","HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd","SD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld","SD2":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd"},"default_resolution":"HD1","hls_pull_url_map":{"FULL_HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD2":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9"},"hls_pull_url":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","stream_orientation":2,"pull_datas":{}}}]
             * enter_room_id : 7542418868329827091
             * user : {"id_str":"2809975984364120","sec_uid":"MS4wLjABAAAA8aLtFo_E3XsLqFyYnohF683DQDPK5BdYU1HqPl_0f7-fXVu3oow_W-s-19WZodoD","nickname":"漯河市豫剧艺术中心（漯河市豫剧团）","foreign_user":0,"open_id_str":""}
             * room_status : 0
             */

            private String enter_room_id;
            private UserBean user;
            private int room_status;
            private List<DataBean> data;

            public String getEnter_room_id() {
                return enter_room_id;
            }

            public void setEnter_room_id(String enter_room_id) {
                this.enter_room_id = enter_room_id;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public int getRoom_status() {
                return room_status;
            }

            public void setRoom_status(int room_status) {
                this.room_status = room_status;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class UserBean {
                /**
                 * id_str : 2809975984364120
                 * sec_uid : MS4wLjABAAAA8aLtFo_E3XsLqFyYnohF683DQDPK5BdYU1HqPl_0f7-fXVu3oow_W-s-19WZodoD
                 * nickname : 漯河市豫剧艺术中心（漯河市豫剧团）
                 * foreign_user : 0
                 * open_id_str :
                 */

                private String id_str;
                private String sec_uid;
                private String nickname;
                private int foreign_user;
                private String open_id_str;

                public String getId_str() {
                    return id_str;
                }

                public void setId_str(String id_str) {
                    this.id_str = id_str;
                }

                public String getSec_uid() {
                    return sec_uid;
                }

                public void setSec_uid(String sec_uid) {
                    this.sec_uid = sec_uid;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getForeign_user() {
                    return foreign_user;
                }

                public void setForeign_user(int foreign_user) {
                    this.foreign_user = foreign_user;
                }

                public String getOpen_id_str() {
                    return open_id_str;
                }

                public void setOpen_id_str(String open_id_str) {
                    this.open_id_str = open_id_str;
                }
            }

            public static class DataBean {
                /**
                 * id_str : 7542418868329827091
                 * status : 2
                 * status_str : 2
                 * title : 滑县四间房镇王三寨村
                 * cover : {"url_list":["https://p3-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=jLzXlpp7wvl75%2BMAh4yXza5OIfM%3D","https://p11-webcast-sign.douyinpic.com/webcast-cover/7525347493460691747~tplv-qz53dukwul-common-resize:0:0.image?biz_tag=app_6383_webcast&from=webcast.room.pack&l=20250825151950BA836A9C692EF14DBC4B&lk3s=39e7556e&s=enter_room&sc=webcast_cover&x-expires=1758698390&x-signature=zeXKww0ZSMzED5AbgO4Fx9ViHzU%3D"]}
                 * stream_url : {"flv_pull_url":{"FULL_HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4","HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd","SD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld","SD2":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd"},"default_resolution":"HD1","hls_pull_url_map":{"FULL_HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD2":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9"},"hls_pull_url":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","stream_orientation":2,"pull_datas":{}}
                 */

                private String id_str;
                private int status;
                private String status_str;
                private String title;
                private CoverBean cover;
                private StreamUrlBean stream_url;

                public String getId_str() {
                    return id_str;
                }

                public void setId_str(String id_str) {
                    this.id_str = id_str;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getStatus_str() {
                    return status_str;
                }

                public void setStatus_str(String status_str) {
                    this.status_str = status_str;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public StreamUrlBean getStream_url() {
                    return stream_url;
                }

                public void setStream_url(StreamUrlBean stream_url) {
                    this.stream_url = stream_url;
                }

                public static class CoverBean {
                    private List<String> url_list;

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class StreamUrlBean {
                    /**
                     * flv_pull_url : {"FULL_HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4","HD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd","SD1":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld","SD2":"http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd"}
                     * default_resolution : HD1
                     * hls_pull_url_map : {"FULL_HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","HD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD1":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9","SD2":"http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9"}
                     * hls_pull_url : http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9
                     * stream_orientation : 2
                     * pull_datas : {}
                     */

                    private FlvPullUrlBean flv_pull_url;
                    private String default_resolution;
                    private HlsPullUrlMapBean hls_pull_url_map;
                    private String hls_pull_url;
                    private int stream_orientation;
                    private PullDatasBean pull_datas;

                    public FlvPullUrlBean getFlv_pull_url() {
                        return flv_pull_url;
                    }

                    public void setFlv_pull_url(FlvPullUrlBean flv_pull_url) {
                        this.flv_pull_url = flv_pull_url;
                    }

                    public String getDefault_resolution() {
                        return default_resolution;
                    }

                    public void setDefault_resolution(String default_resolution) {
                        this.default_resolution = default_resolution;
                    }

                    public HlsPullUrlMapBean getHls_pull_url_map() {
                        return hls_pull_url_map;
                    }

                    public void setHls_pull_url_map(HlsPullUrlMapBean hls_pull_url_map) {
                        this.hls_pull_url_map = hls_pull_url_map;
                    }

                    public String getHls_pull_url() {
                        return hls_pull_url;
                    }

                    public void setHls_pull_url(String hls_pull_url) {
                        this.hls_pull_url = hls_pull_url;
                    }

                    public int getStream_orientation() {
                        return stream_orientation;
                    }

                    public void setStream_orientation(int stream_orientation) {
                        this.stream_orientation = stream_orientation;
                    }

                    public PullDatasBean getPull_datas() {
                        return pull_datas;
                    }

                    public void setPull_datas(PullDatasBean pull_datas) {
                        this.pull_datas = pull_datas;
                    }

                    public static class FlvPullUrlBean {
                        /**
                         * FULL_HD1 : http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=59dde25d6043481c3ae457359bde4967&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_or4
                         * HD1 : http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=99fc63e435c65380ed7d1e5df9968d5d&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_hd
                         * SD1 : http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=80317a0b3f06ec746ecfa9edd59639e6&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_ld
                         * SD2 : http://pull-flv-f26.douyincdn.com/third/stream-406080669912138411_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=f55bc495c757b212b2a1337990c57304&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9&unique_id=stream-406080669912138411_683_flv_sd
                         */

                        private String FULL_HD1;
                        private String HD1;
                        private String SD1;
                        private String SD2;

                        public String getFULL_HD1() {
                            return FULL_HD1;
                        }

                        public void setFULL_HD1(String FULL_HD1) {
                            this.FULL_HD1 = FULL_HD1;
                        }

                        public String getHD1() {
                            return HD1;
                        }

                        public void setHD1(String HD1) {
                            this.HD1 = HD1;
                        }

                        public String getSD1() {
                            return SD1;
                        }

                        public void setSD1(String SD1) {
                            this.SD1 = SD1;
                        }

                        public String getSD2() {
                            return SD2;
                        }

                        public void setSD2(String SD2) {
                            this.SD2 = SD2;
                        }
                    }

                    public static class HlsPullUrlMapBean {
                        /**
                         * FULL_HD1 : http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_or4.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=ac580a1b4c19fcb3d37dcc65c4e8a359&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9
                         * HD1 : http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_hd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1a9094e9ff7c9603e3cc1bb876c1af53&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9
                         * SD1 : http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_ld.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=d46c3cd2d9f61bc972042148f34a0d09&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9
                         * SD2 : http://pull-hls-f26.douyincdn.com/third/stream-406080669912138411_sd.m3u8?arch_hrchy=h1&exp_hrchy=h1&expire=68b54916&major_anchor_level=common&sign=1653b286502602d6a0de3fa8c65146c4&t_id=037-20250825151950BA836A9C692EF14DBC4B-6IH4i9
                         */

                        private String FULL_HD1;
                        private String HD1;
                        private String SD1;
                        private String SD2;

                        public String getFULL_HD1() {
                            return FULL_HD1;
                        }

                        public void setFULL_HD1(String FULL_HD1) {
                            this.FULL_HD1 = FULL_HD1;
                        }

                        public String getHD1() {
                            return HD1;
                        }

                        public void setHD1(String HD1) {
                            this.HD1 = HD1;
                        }

                        public String getSD1() {
                            return SD1;
                        }

                        public void setSD1(String SD1) {
                            this.SD1 = SD1;
                        }

                        public String getSD2() {
                            return SD2;
                        }

                        public void setSD2(String SD2) {
                            this.SD2 = SD2;
                        }
                    }

                    public static class PullDatasBean {
                    }
                }
            }
        }
    }
}
