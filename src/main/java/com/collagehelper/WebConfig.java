package com.collagehelper;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    // 保存上传文件的目录
    public final static String FILE_DIR = "D:/aaaa/heed/";

    //虚拟路径, 即访问 /appName/collect_data/xxx 会访问到  F:/msg_collect_files/xxx
    public final static String VIRTUL_DIR = "/image/";

    //拦截虚拟路径所有请求
    public final static String VIRTUL_DIR_Handle = VIRTUL_DIR + "**";

    /**
     * 配置静态资源的web访问路径，例如上传的文件 abc.png 保存在 F:/msg_collect_files/ 下
     * 那么在浏览器中访问的路径为：http://localhost:8080/collect_data/upload/abc.png
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(VIRTUL_DIR_Handle).addResourceLocations(
                "file:D:/aaaa/head/");
//        registry.addResourceHandler(VIRTUL_DIR_Handle).addResourceLocations(
//                "file:D:/aaaa/goods/");
    }

}
