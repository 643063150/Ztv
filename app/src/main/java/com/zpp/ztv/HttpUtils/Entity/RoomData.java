package com.zpp.ztv.HttpUtils.Entity;

import java.util.List;

public class RoomData {

    /**
     * status : 2
     * user_count : 1787
     * stream_url : {"default_resolution":"HD1","extra":{"height":1080,"width":1920},"flv_pull_url":{"FULL_HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=ab555f509b68c286d1e8ce088e8d2fa5&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_or4","HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=c0aaab1a311b13f61d32801c38822095&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_hd","SD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=07c45f19716123be2ff76d4cab727a17&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_ld","SD2":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=51dcce9396080798c5a4d9a38e63e156&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_sd"},"candidate_resolution":["SD1","SD2","HD1"],"flv_pull_url_params":{"HD1":"{\"VCodec\":\"h264\"}","SD1":"{\"VCodec\":\"h264\"}","SD2":"{\"VCodec\":\"h264\"}"},"play":{"horizontal":"main","vertical":"main"}}
     */

    private int status;
    private int user_count;
    private StreamUrlBean stream_url;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUser_count() {
        return user_count;
    }

    public void setUser_count(int user_count) {
        this.user_count = user_count;
    }

    public StreamUrlBean getStream_url() {
        return stream_url;
    }

    public void setStream_url(StreamUrlBean stream_url) {
        this.stream_url = stream_url;
    }

    public static class StreamUrlBean {
        /**
         * default_resolution : HD1
         * extra : {"height":1080,"width":1920}
         * flv_pull_url : {"FULL_HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=ab555f509b68c286d1e8ce088e8d2fa5&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_or4","HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=c0aaab1a311b13f61d32801c38822095&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_hd","SD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=07c45f19716123be2ff76d4cab727a17&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_ld","SD2":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=51dcce9396080798c5a4d9a38e63e156&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_sd"}
         * candidate_resolution : ["SD1","SD2","HD1"]
         * flv_pull_url_params : {"HD1":"{\"VCodec\":\"h264\"}","SD1":"{\"VCodec\":\"h264\"}","SD2":"{\"VCodec\":\"h264\"}"}
         * play : {"horizontal":"main","vertical":"main"}
         */

        private String default_resolution;
        private ExtraBean extra;
        private FlvPullUrlBean flv_pull_url;
        private FlvPullUrlParamsBean flv_pull_url_params;
        private PlayBean play;
        private List<String> candidate_resolution;

        public String getDefault_resolution() {
            return default_resolution;
        }

        public void setDefault_resolution(String default_resolution) {
            this.default_resolution = default_resolution;
        }

        public ExtraBean getExtra() {
            return extra;
        }

        public void setExtra(ExtraBean extra) {
            this.extra = extra;
        }

        public FlvPullUrlBean getFlv_pull_url() {
            return flv_pull_url;
        }

        public void setFlv_pull_url(FlvPullUrlBean flv_pull_url) {
            this.flv_pull_url = flv_pull_url;
        }

        public FlvPullUrlParamsBean getFlv_pull_url_params() {
            return flv_pull_url_params;
        }

        public void setFlv_pull_url_params(FlvPullUrlParamsBean flv_pull_url_params) {
            this.flv_pull_url_params = flv_pull_url_params;
        }

        public PlayBean getPlay() {
            return play;
        }

        public void setPlay(PlayBean play) {
            this.play = play;
        }

        public List<String> getCandidate_resolution() {
            return candidate_resolution;
        }

        public void setCandidate_resolution(List<String> candidate_resolution) {
            this.candidate_resolution = candidate_resolution;
        }

        public static class ExtraBean {
            /**
             * height : 1080
             * width : 1920
             */

            private int height;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }

        public static class FlvPullUrlBean {
            /**
             * FULL_HD1 : http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=ab555f509b68c286d1e8ce088e8d2fa5&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_or4
             * HD1 : http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=c0aaab1a311b13f61d32801c38822095&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_hd
             * SD1 : http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=07c45f19716123be2ff76d4cab727a17&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_ld
             * SD2 : http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1&exp_hrchy=h1&expire=68b58a8e&major_anchor_level=common&sign=51dcce9396080798c5a4d9a38e63e156&t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn&unique_id=stream-406081742916288998_486_flv_sd
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

        public static class FlvPullUrlParamsBean {
            /**
             * HD1 : {"VCodec":"h264"}
             * SD1 : {"VCodec":"h264"}
             * SD2 : {"VCodec":"h264"}
             */

            private String HD1;
            private String SD1;
            private String SD2;

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

        public static class PlayBean {
            /**
             * horizontal : main
             * vertical : main
             */

            private String horizontal;
            private String vertical;

            public String getHorizontal() {
                return horizontal;
            }

            public void setHorizontal(String horizontal) {
                this.horizontal = horizontal;
            }

            public String getVertical() {
                return vertical;
            }

            public void setVertical(String vertical) {
                this.vertical = vertical;
            }
        }
    }
}
