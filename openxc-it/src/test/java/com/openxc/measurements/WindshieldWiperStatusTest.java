package com.openxc.measurements;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

public class WindshieldWiperStatusTest extends TestCase {
    WindshieldWiperStatus measurement;

    @Override
    public void setUp() {
        measurement = new WindshieldWiperStatus(new Boolean(true));
    }

    public void testGet() {
        assertThat(measurement.getValue().booleanValue(), equalTo(true));
    }

    public void testHasNoRange() {
        assertFalse(measurement.hasRange());
    }
}
