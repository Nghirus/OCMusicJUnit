package edu.orangecoastcollege.cs273.ocmusicevents;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by vnguyen468 on 11/30/2017.
 */
public class MusicEventTest {

    private MusicEvent testEvent;

    @Before
    public void setUp() throws Exception {
        testEvent = new MusicEvent();
    }

    @Test
    public void getSetTitle() throws Exception {

        //Assertions = guaranees that something matches an expected value
        assertNull("Testing title is null", testEvent.getTitle());
        testEvent.setTitle("Led Zeppelin");

        //assert that the title =  Led Zeppelin
        assertEquals("Testing title is now Led Zeppelin","Led Zeppelin", testEvent.getTitle());

    }

    @Test
    public void getDate() throws Exception {

    }

    @Test
    public void setDate() throws Exception {

    }

    @Test
    public void getDay() throws Exception {

    }

    @Test
    public void setDay() throws Exception {

    }

    @Test
    public void getTime() throws Exception {

    }

    @Test
    public void setTime() throws Exception {

    }

    @Test
    public void getLocation() throws Exception {

    }

    @Test
    public void setLocation() throws Exception {

    }

    @Test
    public void getAddress1() throws Exception {

    }

    @Test
    public void setAddress1() throws Exception {

    }

    @Test
    public void getAddress2() throws Exception {

    }

    @Test
    public void setAddress2() throws Exception {

    }

    @Test
    public void getImageName() throws Exception {

    }

    @Test
    public void setImageName() throws Exception {

    }

}