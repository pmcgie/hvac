package com.company;

import java.util.Date;

public class Furnace extends ServiceCall {

    enum FurnaceType {
        FORCED_AIR,
        BOILER,
        GRAVITY
    }

    private FurnaceType type;

    public Furnace(String serviceAddress, String problemDescription, Date date, FurnaceType type) {

        super(serviceAddress, problemDescription, date);
        this.type = type;

    }

    @Override
    public String toString() {

        String typeString = type.toString();
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Furnace Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Furnace Type = " + typeString + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;

    }


    //Inner class to collect the different varieties of furnace
    //When we ask for the type, we'll use the constants from this class to display the choice of types.

//    protected static class FurnaceTypeManager {
//
//        protected static final int FORCED_AIR = 1;
//        protected static final int BOILER = 2;
//        protected static final int GRAVITY = 3;
//
//        static HashMap<Integer, String> furnaceTypes;
//
//        //Static initialization block
//        static {
//            furnaceTypes = new HashMap<Integer, String>();
//            furnaceTypes.put(FORCED_AIR,"Forced Air");
//            furnaceTypes.put(BOILER, "Boiler/Radiators");
//            furnaceTypes.put(GRAVITY, "Gravity Feed (the older 'octopus' style)");
//        }
//
//        public static String getTypeString(int typeInt) {
//
//            if (furnaceTypes.containsKey(typeInt)) {
//                return furnaceTypes.get(typeInt);
//            }
//            else {
//                return "Unknown type";
//            }
//
//        }
//
//        public static String furnaceTypeUserChoices() {
//
//            //Get all of the keys from the HashMap and sort them in order
//            ArrayList<Integer> keys = new ArrayList<Integer>(furnaceTypes.keySet());
//            Collections.sort(keys);
//
//
//            //Build and return a string of all the keys and their values
//            String userChoices = "";
//            for (Integer k : keys) {
//
//                userChoices = userChoices + k + " : " + furnaceTypes.get(k) + "\n";
//
//            }
//
//            return userChoices;
//        }
//
//    }



}
