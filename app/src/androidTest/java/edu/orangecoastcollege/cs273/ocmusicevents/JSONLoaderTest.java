package edu.orangecoastcollege.cs273.ocmusicevents;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class JSONLoaderTest {

    private Context testContext;

    @Before
    public void setUp()
    {
        testContext = InstrumentationRegistry.getTargetContext();
    }
    @Test
    public void testJSONLoader() throws Exception {
        List<MusicEvent> testList = JSONLoader.loadJSONFromAsset(testContext,"MusicEventsTest.json");
        //Asser test list is not null
        assertNotNull("Testing list is not null", testList);
        assertEquals("Testing list size is 2",2 , testList.size());

        //First Event should be blink 182
        MusicEvent event1 = testList.get(0);
        assertEquals("Testing title.", "Blink 182", event1.getTitle());
        assertEquals("Testing Location", "Irvine Meadows (formerly Verizon Wireless)", event1.getLocation());

        event1 = testList.get(1);
        assertEquals("Testing title at position 2", "Ben Folds And A Piano", event1.getTitle());
    }
}
