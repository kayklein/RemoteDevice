package de.kayklein.service;

import android.test.AndroidTestCase;
import junit.framework.Assert;

import static android.app.Service.START_STICKY;

/**
 * Created with IntelliJ IDEA unit Test.
 * User: it-kay-klein
 * Date: 22.02.13
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public class ShellServiceTest extends AndroidTestCase {


    public void testSomething() throws Throwable {
        Assert.assertTrue(1 + 1 == 2);
    }

    public void testOnStartCommand() throws Throwable {
        Assert.assertEquals(new ShellService().onStartCommand(), START_STICKY);
    }


}
