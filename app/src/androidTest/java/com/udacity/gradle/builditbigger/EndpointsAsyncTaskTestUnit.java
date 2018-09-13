package com.udacity.gradle.builditbigger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertFalse;

public class EndpointsAsyncTaskTestUnit {
    String mJoke = null;
    CountDownLatch mCountDownLatch = null;

    @Before
    public void setUp() throws Exception {
        mCountDownLatch = new CountDownLatch(1);
    }

    @After
    public void tearDown() throws Exception {
        mCountDownLatch.countDown();
    }

    @Test
    public void testNonEmptyJokeFromEndpointsAsyncTask() throws InterruptedException {
        EndpointsAsyncTask jokeEndpointsAsyncTask = new EndpointsAsyncTask();
        jokeEndpointsAsyncTask.setListener(new EndpointsAsyncTask.EndpointsAsyncTaskListener() {
            @Override
            public void onTaskCompleted(String result) {
                mJoke = result;
                mCountDownLatch.countDown();
            }
        }).execute();

        mCountDownLatch.await();
        Assert.assertNotNull(mJoke);
        Assert.assertNotEquals(0, mJoke.length());
        assertFalse(mJoke.startsWith("failed to connect to"));
    }
}