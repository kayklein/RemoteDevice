package de.kayklein;

/**
 * Android test instrument.
 * User: it-kay-klein
 * Date: 22.02.13
 * Time: 19:25
 */

import android.test.suitebuilder.TestSuiteBuilder;
import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * A test suite containing all tests for android application.
 */
public class AllTests extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(AllTests.class).includeAllPackagesUnderHere().build();
    }
}