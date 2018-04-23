package com.noah.citytour;

/**
 * {@link Attraction} represents an attraction or site that user wants to know about.
 * It contains the name, address and information on the desired attraction.
 */
public class Attraction {

    /**
     * Name of attraction
     */
    private String mName;

    /**
     * Address of attraction
     */
    private String mAddress;

    /**
     * Info about the attraction
     */
    private String mInfo;

    /**
     * Image of the attraction
     */
    private int mImage;

    /**
     * Link for the website of the attraction
     */
    private String mLink;

/**
 * Constructor 1
 * Create a new Attraction object.
 */

public Attraction(String name, String address, String info, int image, String link){
    mName = name;
    mAddress = address;
    mInfo = info;
    mImage = image;
    mLink = link;
}

    /**
     * Constructor 2
     * Create a new Attraction object without address.
     */

    public Attraction(String name, String info, int image, String link){
        mName = name;
        mInfo = info;
        mImage = image;
        mLink = link;
    }

    /**
     * Get name of attraction.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get address of attraction
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get info of attraction
     */
    public String getInfo() {
        return mInfo;
    }

    /**
     * Get image of attraction
     */
    public int getImage(){
        return mImage;
    }

    public String getLink(){
        return mLink;
    }
}
