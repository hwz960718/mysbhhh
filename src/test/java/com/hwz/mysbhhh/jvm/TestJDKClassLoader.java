package com.hwz.mysbhhh.jvm;

import com.sun.crypto.provider.DESKeyFactory;
import sun.misc.Launcher;

import java.net.URL;

/**
 * @author hwz
 * @date 2020/8/4
 * 类加载器示例
 */
public class TestJDKClassLoader {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
        System.out.println("-------------------------------");
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootClassLoader = extClassLoader.getParent();
        System.out.println("bootClassLoader:"+bootClassLoader);
        System.out.println("extClassLoader:"+extClassLoader);
        System.out.println("appClassLoader:"+appClassLoader);
        System.out.println("bootstrapLoader加载以下文件");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        System.out.println("extClassLoader加载以下文件:"+System.getProperty("java.ext.dirs"));
        System.out.println("appClassLoader加载以下文件:"+System.getProperty("java.class.path"));
    }
}
