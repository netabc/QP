package com.qp.ann;

import java.lang.reflect.Proxy;

public class ProxyInvoke<K,T> {

    public void proxy(K k,T t){

        Object proxyInstance = Proxy.newProxyInstance(k.getClass().getClassLoader(), );
    }
}
