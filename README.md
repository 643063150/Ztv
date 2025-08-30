# ZTV


一款专为 Android TV 设计的直播观看软件，允许您通过任何设备的浏览器远程控制，分析和保存douyin用户数据，并直接在电视大屏幕上观看直播。

## ✨ 功能特性

- **📺 网页远程控制**：应用启动后会创建一个本地 Web 服务。您可以通过手机或电脑浏览器扫描二维码或输入 IP 地址，即可访问控制面板。
    
- **📊 智能数据分析**：在网页端输入douyin用户主页的分享链接或标题，即可自动抓取并以清晰的可视化图表展示用户数据。
    
- **💾 数据持久化存储**：一键保存分析后的用户数据到电视本地。采用高性能的 MMKV 存储，随时可以快速查阅。
    
- **🎬 直播无缝观看**：在数据页面点击用户头像，即可立即在电视上播放当前直播。虽然是基础播放功能，但力求稳定流畅。
    

## 📸 应用截图

<img width="1917" height="875" alt="Pasted image 20250830215430" src="https://github.com/643063150/Ztv/blob/master/image/Screenshot_20250830_215317.png" />

<img width="1917" height="875" alt="Pasted image 20250830215430" src="https://github.com/643063150/Ztv/blob/master/image/Pasted%20image%2020250830215430.png" />


<img width="1917" height="875" alt="Pasted image 20250830215430" src="https://github.com/643063150/Ztv/blob/master/image/Pasted%20image%2020250830220750.png" />

<img width="1917" height="875" alt="Pasted image 20250830215430" src="https://github.com/643063150/Ztv/blob/master/image/Screenshot_20250830_220831.png" />

## 🛠️ 技术栈与开源库

本项目得以实现，离不开以下优秀的开源项目：

- [**Douyin_TikTok_Download_API**](https://github.com/Evil0ctal/Douyin_TikTok_Download_API "null")：douyin数据解析核心。
    
- [**GSYVideoPlayer**](https://github.com/CarGuo/GSYVideoPlayer "null")：提供稳定可靠的视频播放体验。
    
- [**MMKV**](https://github.com/Tencent/MMKV "null")：腾讯出品的高性能键值存储框架，用于数据持久化。
    
- [**AndroidAsync**](https://github.com/koush/AndroidAsync "null")：轻量级的异步网络库，用于构建应用的 Web 服务。
    

## 🚀 开始使用

### 安装与运行

1. **下载安装** 在项目的 [Releases](https://github.com/643063150/Ztv/releases "null") 中下载最新版本的 APK 文件，并将其安装到你的 Android TV 上。
    
2. **启动应用** 在电视上找到并启动 ZTV 应用。
    
3. **切换到网页导入模式** 应用启动后，界面会显示一个 **IP 地址** 和一个 **二维码**。用你的手机或电脑浏览器扫描二维码，或直接输入显示的 IP 地址。
    
4. **数据分析** 在网页界面中，你可以：
    
    - 输入主播主页链接。
        
    - 或输入从分享的主页复制的文字。
        
    - 点击 **提交** 按钮开始分析用户数据。
        
5. **保存数据** 分析完成后，数据会显示在网页上。点击用户头像下的 **保存** 按钮，即可将该主播的数据持久化保存在电视上。

