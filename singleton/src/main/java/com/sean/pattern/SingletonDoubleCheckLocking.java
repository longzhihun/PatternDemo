package com.sean.pattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/20.
 */
public class SingletonDoubleCheckLocking {

    private volatile static SingletonDoubleCheckLocking singletonDoubleCheckLocking;

    private SingletonDoubleCheckLocking() {};

    public static  SingletonDoubleCheckLocking getInstance() {
        if (singletonDoubleCheckLocking == null) {
            synchronized (SingletonDoubleCheckLocking.class) {
                if (singletonDoubleCheckLocking == null) {
                    singletonDoubleCheckLocking = new SingletonDoubleCheckLocking();
                }
            }
        }

        return singletonDoubleCheckLocking;
    }
}
