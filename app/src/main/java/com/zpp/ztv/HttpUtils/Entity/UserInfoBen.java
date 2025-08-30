package com.zpp.ztv.HttpUtils.Entity;

import java.util.List;

public class UserInfoBen {

    /**
     * code : 200
     * router : /api/douyin/web/handler_user_profile
     * data : {"user":{"avatar_larger":{"height":720,"uri":"aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc","url_list":["https://p3-pc.douyinpic.com/aweme/1080x1080/aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc.jpeg?from=2956013662"],"width":720},"ip_location":"IP属地：河南","live_commerce":false,"live_status":1,"nickname":"漯河市豫剧艺术中心（漯河市豫剧团）","role_id":"00420","room_data":"{\"status\":2,\"user_count\":1787,\"stream_url\":{\"default_resolution\":\"HD1\",\"extra\":{\"height\":1080,\"width\":1920},\"flv_pull_url\":{\"FULL_HD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_or4\",\"HD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=c0aaab1a311b13f61d32801c38822095\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_hd\",\"SD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=07c45f19716123be2ff76d4cab727a17\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_ld\",\"SD2\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=51dcce9396080798c5a4d9a38e63e156\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_sd\"},\"candidate_resolution\":[\"SD1\",\"SD2\",\"HD1\"],\"flv_pull_url_params\":{\"HD1\":\"{\\\"VCodec\\\":\\\"h264\\\"}\",\"SD1\":\"{\\\"VCodec\\\":\\\"h264\\\"}\",\"SD2\":\"{\\\"VCodec\\\":\\\"h264\\\"}\"},\"live_core_sdk_data\":{\"pull_data\":{\"stream_data\":\"{\\\"common\\\":{\\\"ts\\\":\\\"1756123150\\\",\\\"session_id\\\":\\\"173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"stream\\\":\\\"406081742916288998\\\",\\\"version\\\":0,\\\"rule_ids\\\":\\\"{\\\\\\\"ab_version_trace\\\\\\\":null,\\\\\\\"sched\\\\\\\":\\\\\\\"{\\\\\\\\\\\\\\\"result\\\\\\\\\\\\\\\":{\\\\\\\\\\\\\\\"hit\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\"default\\\\\\\\\\\\\\\",\\\\\\\\\\\\\\\"cdn\\\\\\\\\\\\\\\":547}}\\\\\\\"}\\\",\\\"common_trace\\\":\\\"{\\\\\\\"StrategyTrace\\\\\\\":{\\\\\\\"Neptune\\\\\\\":{\\\\\\\"PlayStream\\\\\\\":{\\\\\\\"ids\\\\\\\":null}}},\\\\\\\"BusinessType\\\\\\\":\\\\\\\"default_business\\\\\\\",\\\\\\\"BigeventAnchorLevel\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"app_id\\\":\\\"100102\\\",\\\"major_anchor_level\\\":\\\"common\\\",\\\"mode\\\":\\\"Normal\\\",\\\"lines\\\":{\\\"main\\\":\\\"line_547\\\"},\\\"p2p_params\\\":{\\\"PcdnIsolationConfig\\\":{\\\"IsolationName\\\":\\\"isolation1\\\",\\\"FsV4Domain\\\":\\\"vcl-brain.ndcpp.com\\\",\\\"FsV6Domain\\\":\\\"vcl-brain-v6.ndcpp.com\\\",\\\"StunV4Domain\\\":\\\"vc-mirror.ndcpp.com\\\",\\\"StunV6Domain\\\":\\\"vc-mirror-v6.ndcpp.com\\\",\\\"HoleV4Domain\\\":\\\"vcl-hole.ndcpp.com\\\",\\\"HoleV6Domain\\\":\\\"vcl-hole-v6.ndcpp.com\\\"}},\\\"stream_data_content_encoding\\\":\\\"default\\\",\\\"common_sdk_params\\\":{\\\"main\\\":\\\"{}\\\"},\\\"stream_name\\\":\\\"stream-406081742916288998\\\",\\\"main_push_id\\\":486,\\\"backup_push_id\\\":0},\\\"data\\\":{\\\"ao\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998.flv?arch_hrchy=h1\\u0026eupf_relay_mode=err\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026only_audio=1\\u0026sign=3bcbb3951e1a4c40d0ea50f1526b419f\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv\\\",\\\"hls\\\":\\\"\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":0,\\\\\\\"resolution\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":0}\\\",\\\"enableEncryption\\\":false}},\\\"ld\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=07c45f19716123be2ff76d4cab727a17\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_ld\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_ld.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=9a3e5a03e40922395d19abc302317d47\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_ld.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=fabc0ebf8d4c8f01388ac6a5ec80fa11\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_ld\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":1000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"960x540\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":25}\\\",\\\"enableEncryption\\\":false}},\\\"md\\\":{\\\"main\\\":{\\\"flv\\\":\\\"https://pull-flv-l26-admin.douyincdn.com/third/stream-406081742916288998_md.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=7e3c77ab7b775a6f71a5d627bc9a0b1d\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_md\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_md.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=233a33a4bb07af79b58f9885a2d0eae4\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_md.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=dc8e1ecb0634391838672a30c6832c6c\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_md\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":800000,\\\\\\\"resolution\\\\\\\":\\\\\\\"640x360\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":15}\\\",\\\"enableEncryption\\\":false}},\\\"hd\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=c0aaab1a311b13f61d32801c38822095\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_hd\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_hd.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ee181e781a156d30c79e9b0172e8381b\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_hd.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=8ad48f3f861fa693c1922a49094f2cc9\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_hd\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":4000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1280x720\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":30}\\\",\\\"enableEncryption\\\":false}},\\\"sd\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=51dcce9396080798c5a4d9a38e63e156\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_sd\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_sd.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=e8d52bc9951c92f0d4f687ea7461acfd\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_sd.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=cd3e22e15a19bff1e6b1a490f53ba8f2\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_sd\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":2000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1280x720\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":30}\\\",\\\"enableEncryption\\\":false}},\\\"origin\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_or4\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_or4.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=a7f41c0a31a2848cc5b1e24d2f109c69\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_or4.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=bc2036172b533ff6b180d36467bf2741\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_or4\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":4137000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1920x1080\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\"}\\\",\\\"enableEncryption\\\":false}}}}\",\"options\":{\"default_quality\":{\"name\":\"超清\",\"sdk_key\":\"hd\"},\"qualities\":[{\"name\":\"标清\",\"sdk_key\":\"ld\",\"v_codec\":\"264\",\"resolution\":\"960x540\",\"level\":1,\"v_bit_rate\":1000000,\"fps\":25},{\"name\":\"高清\",\"sdk_key\":\"sd\",\"v_codec\":\"264\",\"resolution\":\"1280x720\",\"level\":2,\"v_bit_rate\":2000000,\"fps\":30},{\"name\":\"超清\",\"sdk_key\":\"hd\",\"v_codec\":\"264\",\"resolution\":\"1280x720\",\"level\":3,\"v_bit_rate\":4000000,\"fps\":30},{\"name\":\"蓝光\",\"sdk_key\":\"origin\",\"v_codec\":\"264\",\"resolution\":\"1920x1080\",\"level\":4,\"v_bit_rate\":4137000}]}}},\"stream_orientation\":2,\"play\":{\"horizontal\":\"main\",\"vertical\":\"main\"}},\"owner\":{\"web_rid\":\"44877280699\"},\"live_type_third_party\":true,\"live_room_mode\":1,\"paid_live_data\":{\"pay_ab_type\":1},\"ecom_data\":{\"room_cart_v2\":{\"show_cart\":2}},\"pack_meta\":{\"scene\":\"pc_profile_struct(prod_single_dc/rpc/topo)\",\"env\":\"prod\",\"dc\":\"lq\",\"cluster\":\"feed\"}}","room_id":7542487426976075000,"room_id_str":"7542487426976074550","uid":"2809975984364120"}}
     */

    private int code;
    private String router;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * user : {"avatar_larger":{"height":720,"uri":"aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc","url_list":["https://p3-pc.douyinpic.com/aweme/1080x1080/aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc.jpeg?from=2956013662"],"width":720},"ip_location":"IP属地：河南","live_commerce":false,"live_status":1,"nickname":"漯河市豫剧艺术中心（漯河市豫剧团）","role_id":"00420","room_data":"{\"status\":2,\"user_count\":1787,\"stream_url\":{\"default_resolution\":\"HD1\",\"extra\":{\"height\":1080,\"width\":1920},\"flv_pull_url\":{\"FULL_HD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_or4\",\"HD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=c0aaab1a311b13f61d32801c38822095\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_hd\",\"SD1\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=07c45f19716123be2ff76d4cab727a17\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_ld\",\"SD2\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=51dcce9396080798c5a4d9a38e63e156\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_sd\"},\"candidate_resolution\":[\"SD1\",\"SD2\",\"HD1\"],\"flv_pull_url_params\":{\"HD1\":\"{\\\"VCodec\\\":\\\"h264\\\"}\",\"SD1\":\"{\\\"VCodec\\\":\\\"h264\\\"}\",\"SD2\":\"{\\\"VCodec\\\":\\\"h264\\\"}\"},\"live_core_sdk_data\":{\"pull_data\":{\"stream_data\":\"{\\\"common\\\":{\\\"ts\\\":\\\"1756123150\\\",\\\"session_id\\\":\\\"173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"stream\\\":\\\"406081742916288998\\\",\\\"version\\\":0,\\\"rule_ids\\\":\\\"{\\\\\\\"ab_version_trace\\\\\\\":null,\\\\\\\"sched\\\\\\\":\\\\\\\"{\\\\\\\\\\\\\\\"result\\\\\\\\\\\\\\\":{\\\\\\\\\\\\\\\"hit\\\\\\\\\\\\\\\":\\\\\\\\\\\\\\\"default\\\\\\\\\\\\\\\",\\\\\\\\\\\\\\\"cdn\\\\\\\\\\\\\\\":547}}\\\\\\\"}\\\",\\\"common_trace\\\":\\\"{\\\\\\\"StrategyTrace\\\\\\\":{\\\\\\\"Neptune\\\\\\\":{\\\\\\\"PlayStream\\\\\\\":{\\\\\\\"ids\\\\\\\":null}}},\\\\\\\"BusinessType\\\\\\\":\\\\\\\"default_business\\\\\\\",\\\\\\\"BigeventAnchorLevel\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"app_id\\\":\\\"100102\\\",\\\"major_anchor_level\\\":\\\"common\\\",\\\"mode\\\":\\\"Normal\\\",\\\"lines\\\":{\\\"main\\\":\\\"line_547\\\"},\\\"p2p_params\\\":{\\\"PcdnIsolationConfig\\\":{\\\"IsolationName\\\":\\\"isolation1\\\",\\\"FsV4Domain\\\":\\\"vcl-brain.ndcpp.com\\\",\\\"FsV6Domain\\\":\\\"vcl-brain-v6.ndcpp.com\\\",\\\"StunV4Domain\\\":\\\"vc-mirror.ndcpp.com\\\",\\\"StunV6Domain\\\":\\\"vc-mirror-v6.ndcpp.com\\\",\\\"HoleV4Domain\\\":\\\"vcl-hole.ndcpp.com\\\",\\\"HoleV6Domain\\\":\\\"vcl-hole-v6.ndcpp.com\\\"}},\\\"stream_data_content_encoding\\\":\\\"default\\\",\\\"common_sdk_params\\\":{\\\"main\\\":\\\"{}\\\"},\\\"stream_name\\\":\\\"stream-406081742916288998\\\",\\\"main_push_id\\\":486,\\\"backup_push_id\\\":0},\\\"data\\\":{\\\"ao\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998.flv?arch_hrchy=h1\\u0026eupf_relay_mode=err\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026only_audio=1\\u0026sign=3bcbb3951e1a4c40d0ea50f1526b419f\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv\\\",\\\"hls\\\":\\\"\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":0,\\\\\\\"resolution\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":0}\\\",\\\"enableEncryption\\\":false}},\\\"ld\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=07c45f19716123be2ff76d4cab727a17\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_ld\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_ld.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=9a3e5a03e40922395d19abc302317d47\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_ld.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=fabc0ebf8d4c8f01388ac6a5ec80fa11\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_ld\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":1000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"960x540\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":25}\\\",\\\"enableEncryption\\\":false}},\\\"md\\\":{\\\"main\\\":{\\\"flv\\\":\\\"https://pull-flv-l26-admin.douyincdn.com/third/stream-406081742916288998_md.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=7e3c77ab7b775a6f71a5d627bc9a0b1d\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_md\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_md.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=233a33a4bb07af79b58f9885a2d0eae4\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_md.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=dc8e1ecb0634391838672a30c6832c6c\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_md\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":800000,\\\\\\\"resolution\\\\\\\":\\\\\\\"640x360\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":15}\\\",\\\"enableEncryption\\\":false}},\\\"hd\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=c0aaab1a311b13f61d32801c38822095\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_hd\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_hd.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ee181e781a156d30c79e9b0172e8381b\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_hd.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=8ad48f3f861fa693c1922a49094f2cc9\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_hd\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":4000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1280x720\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":30}\\\",\\\"enableEncryption\\\":false}},\\\"sd\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=51dcce9396080798c5a4d9a38e63e156\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_sd\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_sd.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=e8d52bc9951c92f0d4f687ea7461acfd\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_sd.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=cd3e22e15a19bff1e6b1a490f53ba8f2\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_sd\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":2000000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1280x720\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\",\\\\\\\"fps\\\\\\\":30}\\\",\\\"enableEncryption\\\":false}},\\\"origin\\\":{\\\"main\\\":{\\\"flv\\\":\\\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_flv_or4\\\",\\\"hls\\\":\\\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_or4.m3u8?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=a7f41c0a31a2848cc5b1e24d2f109c69\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\\",\\\"cmaf\\\":\\\"\\\",\\\"dash\\\":\\\"\\\",\\\"lls\\\":\\\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_or4.sdp?arch_hrchy=h1\\u0026exp_hrchy=h1\\u0026expire=68b58a8e\\u0026major_anchor_level=common\\u0026sign=bc2036172b533ff6b180d36467bf2741\\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\\u0026unique_id=stream-406081742916288998_486_lls_or4\\\",\\\"tsl\\\":\\\"\\\",\\\"tile\\\":\\\"\\\",\\\"http_ts\\\":\\\"\\\",\\\"ll_hls\\\":\\\"\\\",\\\"sdk_params\\\":\\\"{\\\\\\\"VCodec\\\\\\\":\\\\\\\"h264\\\\\\\",\\\\\\\"vbitrate\\\\\\\":4137000,\\\\\\\"resolution\\\\\\\":\\\\\\\"1920x1080\\\\\\\",\\\\\\\"gop\\\\\\\":2,\\\\\\\"drType\\\\\\\":\\\\\\\"sdr\\\\\\\"}\\\",\\\"enableEncryption\\\":false}}}}\",\"options\":{\"default_quality\":{\"name\":\"超清\",\"sdk_key\":\"hd\"},\"qualities\":[{\"name\":\"标清\",\"sdk_key\":\"ld\",\"v_codec\":\"264\",\"resolution\":\"960x540\",\"level\":1,\"v_bit_rate\":1000000,\"fps\":25},{\"name\":\"高清\",\"sdk_key\":\"sd\",\"v_codec\":\"264\",\"resolution\":\"1280x720\",\"level\":2,\"v_bit_rate\":2000000,\"fps\":30},{\"name\":\"超清\",\"sdk_key\":\"hd\",\"v_codec\":\"264\",\"resolution\":\"1280x720\",\"level\":3,\"v_bit_rate\":4000000,\"fps\":30},{\"name\":\"蓝光\",\"sdk_key\":\"origin\",\"v_codec\":\"264\",\"resolution\":\"1920x1080\",\"level\":4,\"v_bit_rate\":4137000}]}}},\"stream_orientation\":2,\"play\":{\"horizontal\":\"main\",\"vertical\":\"main\"}},\"owner\":{\"web_rid\":\"44877280699\"},\"live_type_third_party\":true,\"live_room_mode\":1,\"paid_live_data\":{\"pay_ab_type\":1},\"ecom_data\":{\"room_cart_v2\":{\"show_cart\":2}},\"pack_meta\":{\"scene\":\"pc_profile_struct(prod_single_dc/rpc/topo)\",\"env\":\"prod\",\"dc\":\"lq\",\"cluster\":\"feed\"}}","room_id":7542487426976075000,"room_id_str":"7542487426976074550","uid":"2809975984364120"}
         */

        private UserBean user;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * avatar_larger : {"height":720,"uri":"aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc","url_list":["https://p3-pc.douyinpic.com/aweme/1080x1080/aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc.jpeg?from=2956013662"],"width":720}
             * ip_location : IP属地：河南
             * live_commerce : false
             * live_status : 1
             * nickname : 漯河市豫剧艺术中心（漯河市豫剧团）
             * role_id : 00420
             * room_data : {"status":2,"user_count":1787,"stream_url":{"default_resolution":"HD1","extra":{"height":1080,"width":1920},"flv_pull_url":{"FULL_HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_or4","HD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=c0aaab1a311b13f61d32801c38822095\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_hd","SD1":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=07c45f19716123be2ff76d4cab727a17\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_ld","SD2":"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=51dcce9396080798c5a4d9a38e63e156\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_sd"},"candidate_resolution":["SD1","SD2","HD1"],"flv_pull_url_params":{"HD1":"{\"VCodec\":\"h264\"}","SD1":"{\"VCodec\":\"h264\"}","SD2":"{\"VCodec\":\"h264\"}"},"live_core_sdk_data":{"pull_data":{"stream_data":"{\"common\":{\"ts\":\"1756123150\",\"session_id\":\"173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"stream\":\"406081742916288998\",\"version\":0,\"rule_ids\":\"{\\\"ab_version_trace\\\":null,\\\"sched\\\":\\\"{\\\\\\\"result\\\\\\\":{\\\\\\\"hit\\\\\\\":\\\\\\\"default\\\\\\\",\\\\\\\"cdn\\\\\\\":547}}\\\"}\",\"common_trace\":\"{\\\"StrategyTrace\\\":{\\\"Neptune\\\":{\\\"PlayStream\\\":{\\\"ids\\\":null}}},\\\"BusinessType\\\":\\\"default_business\\\",\\\"BigeventAnchorLevel\\\":\\\"\\\"}\",\"app_id\":\"100102\",\"major_anchor_level\":\"common\",\"mode\":\"Normal\",\"lines\":{\"main\":\"line_547\"},\"p2p_params\":{\"PcdnIsolationConfig\":{\"IsolationName\":\"isolation1\",\"FsV4Domain\":\"vcl-brain.ndcpp.com\",\"FsV6Domain\":\"vcl-brain-v6.ndcpp.com\",\"StunV4Domain\":\"vc-mirror.ndcpp.com\",\"StunV6Domain\":\"vc-mirror-v6.ndcpp.com\",\"HoleV4Domain\":\"vcl-hole.ndcpp.com\",\"HoleV6Domain\":\"vcl-hole-v6.ndcpp.com\"}},\"stream_data_content_encoding\":\"default\",\"common_sdk_params\":{\"main\":\"{}\"},\"stream_name\":\"stream-406081742916288998\",\"main_push_id\":486,\"backup_push_id\":0},\"data\":{\"ao\":{\"main\":{\"flv\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998.flv?arch_hrchy=h1\u0026eupf_relay_mode=err\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026only_audio=1\u0026sign=3bcbb3951e1a4c40d0ea50f1526b419f\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv\",\"hls\":\"\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":0,\\\"resolution\\\":\\\"\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\",\\\"fps\\\":0}\",\"enableEncryption\":false}},\"ld\":{\"main\":{\"flv\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_ld.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=07c45f19716123be2ff76d4cab727a17\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_ld\",\"hls\":\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_ld.m3u8?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=9a3e5a03e40922395d19abc302317d47\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_ld.sdp?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=fabc0ebf8d4c8f01388ac6a5ec80fa11\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_lls_ld\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":1000000,\\\"resolution\\\":\\\"960x540\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\",\\\"fps\\\":25}\",\"enableEncryption\":false}},\"md\":{\"main\":{\"flv\":\"https://pull-flv-l26-admin.douyincdn.com/third/stream-406081742916288998_md.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=7e3c77ab7b775a6f71a5d627bc9a0b1d\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_md\",\"hls\":\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_md.m3u8?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=233a33a4bb07af79b58f9885a2d0eae4\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_md.sdp?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=dc8e1ecb0634391838672a30c6832c6c\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_lls_md\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":800000,\\\"resolution\\\":\\\"640x360\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\",\\\"fps\\\":15}\",\"enableEncryption\":false}},\"hd\":{\"main\":{\"flv\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_hd.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=c0aaab1a311b13f61d32801c38822095\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_hd\",\"hls\":\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_hd.m3u8?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=ee181e781a156d30c79e9b0172e8381b\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_hd.sdp?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=8ad48f3f861fa693c1922a49094f2cc9\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_lls_hd\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":4000000,\\\"resolution\\\":\\\"1280x720\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\",\\\"fps\\\":30}\",\"enableEncryption\":false}},\"sd\":{\"main\":{\"flv\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_sd.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=51dcce9396080798c5a4d9a38e63e156\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_sd\",\"hls\":\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_sd.m3u8?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=e8d52bc9951c92f0d4f687ea7461acfd\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_sd.sdp?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=cd3e22e15a19bff1e6b1a490f53ba8f2\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_lls_sd\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":2000000,\\\"resolution\\\":\\\"1280x720\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\",\\\"fps\\\":30}\",\"enableEncryption\":false}},\"origin\":{\"main\":{\"flv\":\"http://pull-flv-l26.douyincdn.com/third/stream-406081742916288998_or4.flv?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=ab555f509b68c286d1e8ce088e8d2fa5\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_flv_or4\",\"hls\":\"http://pull-hls-l26.douyincdn.com/third/stream-406081742916288998_or4.m3u8?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=a7f41c0a31a2848cc5b1e24d2f109c69\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\",\"cmaf\":\"\",\"dash\":\"\",\"lls\":\"http://pull-lls-l26.douyincdn.com/third/stream-406081742916288998_or4.sdp?arch_hrchy=h1\u0026exp_hrchy=h1\u0026expire=68b58a8e\u0026major_anchor_level=common\u0026sign=bc2036172b533ff6b180d36467bf2741\u0026t_id=173-20250825195910D52B14FD6D795BF5F736-pOHcLn\u0026unique_id=stream-406081742916288998_486_lls_or4\",\"tsl\":\"\",\"tile\":\"\",\"http_ts\":\"\",\"ll_hls\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"vbitrate\\\":4137000,\\\"resolution\\\":\\\"1920x1080\\\",\\\"gop\\\":2,\\\"drType\\\":\\\"sdr\\\"}\",\"enableEncryption\":false}}}}","options":{"default_quality":{"name":"超清","sdk_key":"hd"},"qualities":[{"name":"标清","sdk_key":"ld","v_codec":"264","resolution":"960x540","level":1,"v_bit_rate":1000000,"fps":25},{"name":"高清","sdk_key":"sd","v_codec":"264","resolution":"1280x720","level":2,"v_bit_rate":2000000,"fps":30},{"name":"超清","sdk_key":"hd","v_codec":"264","resolution":"1280x720","level":3,"v_bit_rate":4000000,"fps":30},{"name":"蓝光","sdk_key":"origin","v_codec":"264","resolution":"1920x1080","level":4,"v_bit_rate":4137000}]}}},"stream_orientation":2,"play":{"horizontal":"main","vertical":"main"}},"owner":{"web_rid":"44877280699"},"live_type_third_party":true,"live_room_mode":1,"paid_live_data":{"pay_ab_type":1},"ecom_data":{"room_cart_v2":{"show_cart":2}},"pack_meta":{"scene":"pc_profile_struct(prod_single_dc/rpc/topo)","env":"prod","dc":"lq","cluster":"feed"}}
             * room_id : 7542487426976075000
             * room_id_str : 7542487426976074550
             * uid : 2809975984364120
             */

            private AvatarLargerBean avatar_larger;
            private String ip_location;
            private boolean live_commerce;
            private int live_status;
            private String nickname;
            private String role_id;
            private String room_data;
            private long room_id;
            private String room_id_str;
            private String uid;
            private String sec_uid;

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public AvatarLargerBean getAvatar_larger() {
                return avatar_larger;
            }

            public void setAvatar_larger(AvatarLargerBean avatar_larger) {
                this.avatar_larger = avatar_larger;
            }

            public String getIp_location() {
                return ip_location;
            }

            public void setIp_location(String ip_location) {
                this.ip_location = ip_location;
            }

            public boolean isLive_commerce() {
                return live_commerce;
            }

            public void setLive_commerce(boolean live_commerce) {
                this.live_commerce = live_commerce;
            }

            public int getLive_status() {
                return live_status;
            }

            public void setLive_status(int live_status) {
                this.live_status = live_status;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getRole_id() {
                return role_id;
            }

            public void setRole_id(String role_id) {
                this.role_id = role_id;
            }

            public String getRoom_data() {
                return room_data;
            }

            public void setRoom_data(String room_data) {
                this.room_data = room_data;
            }

            public long getRoom_id() {
                return room_id;
            }

            public void setRoom_id(long room_id) {
                this.room_id = room_id;
            }

            public String getRoom_id_str() {
                return room_id_str;
            }

            public void setRoom_id_str(String room_id_str) {
                this.room_id_str = room_id_str;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public static class AvatarLargerBean {
                /**
                 * height : 720
                 * uri : aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc
                 * url_list : ["https://p3-pc.douyinpic.com/aweme/1080x1080/aweme-avatar/tos-cn-i-0813_927e0c2177c44477b3e65f3aec2f1fbc.jpeg?from=2956013662"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }
    }
}
