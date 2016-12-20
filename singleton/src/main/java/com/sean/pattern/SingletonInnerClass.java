package com.sean.pattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/20.
 */
public class SingletonInnerClass {

    private static class singletonHolder {
        public static final  SingletonInnerClass singleton = new SingletonInnerClass();
    }

    private SingletonInnerClass(){};

    public static SingletonInnerClass getInstance() {
        return singletonHolder.singleton;
    }
}
