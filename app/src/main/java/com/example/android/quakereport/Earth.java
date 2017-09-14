package com.example.android.quakereport;

/**
 * Created by shaur on 13-09-2017.
 */

public class Earth {
    //Earthquake magnitude
    private double Magnitude;
    //Location
    private String city;
    // date
    private Long time;

    /**
     *
     * @param mMag Magnitude
     * @param mCity Location
     * @param mDate When it occured
     */
    public Earth(double mMag,String mCity,Long mTime)
    {
        Magnitude=mMag;
        city=mCity;
        time=mTime;
    }

    /**
     *
     * @return Magnitutde of earthquake
     */
    public double getMagnitude()
    {
        return Magnitude;
    }

    /**
     *
     * @return Location of Earthquake
     */
    public String getcity()
    {
        return city;
    }

    /**
     *
     * @return Date
     */
    public Long getTime()
    {
        return time;
    }

}
