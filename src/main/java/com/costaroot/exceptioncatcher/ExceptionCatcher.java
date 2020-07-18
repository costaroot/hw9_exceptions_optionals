package com.costaroot.exceptioncatcher;

import com.costaroot.exceptions.ExceptionA;
import com.costaroot.exceptions.ExceptionB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExceptionCatcher {
    private List<Exception> exceptionsList;
    private Random random;

    public ExceptionCatcher() {
        exceptionsList = new ArrayList<>();
        random = new Random();
        initList();
    }

    private void initList() {
        exceptionsList.add(new ExceptionA());
        exceptionsList.add(new ExceptionB());
        exceptionsList.add(new IOException());
        exceptionsList.add(new NullPointerException());
    }

    private void randException() throws Exception {
        throw exceptionsList.get(random.nextInt(exceptionsList.size()));
    }

    public void exceptionHandler() {
        try {
            randException();
        } catch (ExceptionB e) {
            System.out.println("Exception B was caught");
        } catch (ExceptionA e) {
            System.out.println("Exception A was caught");
        } catch (IOException e) {
            System.out.println("IOException was caught");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException was caught");
        } catch (Exception e) {
            System.out.println("Other exception was caught");
        }
    }
}
