package com.costaroot.executor;

import com.costaroot.exceptioncatcher.ExceptionCatcher;
import com.costaroot.rethrowing.RethrowingDemo;
import com.costaroot.safedivision.SafeDivision;

public class Executor {
    private ExceptionCatcher exceptionCatcher;

    public Executor() {
        exceptionCatcher = new ExceptionCatcher();
    }

    private void safeDivisionExecute() {
        SafeDivision safeDivision = new SafeDivision();
        System.out.println("Results= " + safeDivision.divisionNumbers());
    }

    private void rethrowingExecute() {
        RethrowingDemo demo = new RethrowingDemo();
        try {
            demo.someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        this.rethrowingExecute();
        exceptionCatcher.exceptionHandler();
        this.safeDivisionExecute();
    }
}
