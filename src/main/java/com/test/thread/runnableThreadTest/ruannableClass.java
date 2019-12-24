package com.test.thread.runnableThreadTest;

/**
 * @program:
 * @description: ruannbleTest
 * @author: pijunqi
 * @create: 2019-12-09 17:19
 **/

public class ruannableClass  implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread.run()");
    }

}
