package org.opentripplanner.routing.core;

public class BikeTriangle {

    /**
     * For the bike triangle, how important time is.
     * triangleTimeFactor+triangleSlopeFactor+triangleSafetyFactor == 1
     */
    private double triangleTimeFactor;

    /** For the bike triangle, how important slope is */
    private double triangleSlopeFactor;

    /** For the bike triangle, how important safety is */
    private double triangleSafetyFactor;

    public void setTriangleSafetyFactor(double triangleSafetyFactor) {
        this.triangleSafetyFactor = triangleSafetyFactor;
    }

    public void setTriangleSlopeFactor(double triangleSlopeFactor) {
        this.triangleSlopeFactor = triangleSlopeFactor;
    }

    public void setTriangleTimeFactor(double triangleTimeFactor) {
        this.triangleTimeFactor = triangleTimeFactor;
    }

    public double getTriangleSafetyFactor(){
        return this.triangleSafetyFactor;
    }

    public double getTriangleTimeFactor(){
        return this.triangleTimeFactor;
    }

    public double getTriangleSlopeFactor(){
        return this.triangleSlopeFactor;
    }
}
