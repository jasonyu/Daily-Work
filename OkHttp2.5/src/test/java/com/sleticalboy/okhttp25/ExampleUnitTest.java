package com.sleticalboy.okhttp25;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void substring_test() {
        final String url = "http://gdown.baidu.com/data/wisegame/df65a597122796a4/weixin_821.apk";
        String fileName = url.substring(url.lastIndexOf("/") + 1, url.length());
        System.out.println(fileName);
    }
}