package com.amirmasri.snapple;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Random;

/**
 * This class contains various utility functions.
 * @author Amir Masri
 */
class Util {

    /**
     * Pauses the current threads' execution for the given number of milliseconds.
     * @param length the number of milliseconds to sleep
     */
    private static void pauseRequests(int length) throws InterruptedException {
        Thread.sleep(length);
    }

    /**
     * Generates a random, valid id to use when fetching a fact.
     * @return the generated id
     */
    static int generateId() {
        Random rand = new Random();
        int id = rand.nextInt(989) + 1;

        // Fact numbers 498 through 650 no longer exist on Snapple's website
        // Make sure to get a new random number if it falls within this range
        while (id > 497 && id < 651) {
            id = rand.nextInt(989) + 1;
        }

        return id;
    }

    /**
     * Gets a fact's detail text based on the given fact id.
     * @param id the fact id
     * @return the associated fact detail unless an exception occurs, in which case an empty string will be returned
     */
    static String getFactDetail(int id) {
        boolean requestAgain = false;
        try {
            pauseRequests(Constants.factDetailWaitInterval);
            return Jsoup.connect(Constants.BASE_URL + id).get().select(Constants.SELECTOR).first().text();
        } catch (IOException | InterruptedException e) {
            // we failed to generate a fact detail so we try again with a new id
            requestAgain = true;
        }
        return requestAgain ? getFactDetail(generateId()) : "";
    }

}
