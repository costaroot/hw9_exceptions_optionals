package com.costaroot.rethrowing;

public class RethrowingDemo {

    public void someMethod2() throws Exception {
        throw new Exception("Exception in someMethod2");
    }

    public void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }
}
