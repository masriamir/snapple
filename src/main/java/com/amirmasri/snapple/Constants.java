package com.amirmasri.snapple;

/**
 * This class is responsible for defining all application constants.
 * @author Amir Masri
 */
class Constants {

    /**
     * Base url for a Snapple Real Fact.
     * Append any number to the end of the url to get that fact number.
     */
    static final String BASE_URL = "http://www.snapple.com/real-facts/cap-view/";

    /**
     * Div tag selector used to parse the fact detail.
     */
    static final String SELECTOR = "div.fact_text_wrap";

    /**
     * The amount of time in milliseconds to wait in between server requests.
     */
    static final int factDetailWaitInterval = 1000;

}
