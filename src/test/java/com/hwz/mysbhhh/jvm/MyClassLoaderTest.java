package com.hwz.mysbhhh.jvm;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author hwz
 * @date 2020/8/6
 * 自定义类加载器
 * 自定义类加载器只需要继承ClassLoader，该类有两个核心方法，一个是loadClass(String name,boolean resolve),实现了双亲委派机制，
 * 一个是findClass，默认实现是空方法，所以我们自定义类加载器主要是重写findClass方法
 */
public class MyClassLoaderTest {
    static class MyClassLoader extends ClassLoader {
        private String classPath;

        public MyClassLoader(String classPath) {
            this.classPath = classPath;
        }

        private byte[] loadByte(String name) throws IOException {
            name = name.replaceAll("\\.", "/");
            FileInputStream fileInputStream = new FileInputStream(classPath + "/" + name + ".class");
            int available = fileInputStream.available();
            byte[] bytes = new byte[available];
            fileInputStream.read(bytes);
            fileInputStream.close();
            return bytes;
        }

        /**
         * 自定义类加载方式 打破双亲委派机制
         * @param name
         * @param resolve
         * @return
         * @throws ClassNotFoundException
         */
        @Override
        protected Class<?> loadClass(String name, boolean resolve)
                throws ClassNotFoundException {
            synchronized (getClassLoadingLock(name)) {
                // First, check if the class has already been loaded
                Class<?> c = findLoadedClass(name);
                if (c == null) {
                    long t0 = System.nanoTime();
                    // If still not found, then invoke findClass in order
                    // to find the class.
                    long t1 = System.nanoTime();

                    if (!name.startsWith("com.hwz.mysbhhh.jvm")) {
                        c = this.getParent().loadClass(name);
                    } else {
                        c = findClass(name);
                    }
                    // this is the defining class loader; record the stats
                    sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
                    sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
                    sun.misc.PerfCounter.getFindClasses().increment();
                }
                if (resolve) {
                    resolveClass(c);
                }
                return c;
            }
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            try {
                byte[] bytes = loadByte(name);
                return defineClass(name, bytes, 0, bytes.length);
            } catch (IOException e) {
                e.printStackTrace();
                throw new ClassNotFoundException();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        /**
         * 自定义类加载器在初始化的时候会首先初始化父类ClassLoader,其中会把自定义加载器的父类加载器设置为AppClassLoader
         */
        MyClassLoader myClassLoader = new MyClassLoader("D:/test");
        Class<?> aClass = myClassLoader.loadClass("com.hwz.mysbhhh.jvm.Math");
        Object instance = aClass.newInstance();
        Method methods = aClass.getDeclaredMethod("compute", null);
        methods.invoke(instance, null);
        System.out.println(aClass.getClassLoader().getClass().getName());
    }


}
