package com.company;

import java.util.Date;

/**
 * Created by pmcgie on 3/19/2017.
 */
public class WaterHeater extends ServiceCall {

    //The city requires that all service calls to water heaters have a mandatory $20 extra charge added.
    protected static double ExtraCharge = 20.00;

    /*
    A water heater service call needs
    an address, date service requested, description of the problem, and the age of the water heater.
    Resolved service calls also need the resolved date, description of the resolution, and the fee charged to the customer.
     */

    private Double HeaterAge;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, Double HeaterAge) {
        super(serviceAddress, problemDescription, date);
        this.HeaterAge = HeaterAge;
    }



    @Override
    public String toString() {

        String Age_String = HeaterAge.toString();
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString((fee + ExtraCharge));

        return "Furnace Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Water Heater Age = " + Age_String + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString;

    }
}
