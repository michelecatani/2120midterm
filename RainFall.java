/**
 * This is the RainFall class
 * Its purpose is to store monthly rainfall data.
 * @author Michele Catani
 */

public class RainFall {
    /**
     * An Array that will store monthly rainfall data.
     */
    private double[] monthsRain = new double[12];

    /**
     * Constructor
     * Assigns the values passed in to the monthsRain array
     * @param months the array that is passed in
     */
    public RainFall(double[] months){
        for(int i = 0; i < monthsRain.length; i++){
            monthsRain[i] = months[i];
        }
    }

    /**
     * Used to return the totalRainfall
     * @return theTotalRainfall for the year
     */
    public double getTotalRainfall() {
        double sum = 0;
        for(int i = 0; i < monthsRain.length; i++){
            if(monthsRain[i] > 0){
                sum += monthsRain[i];
            }
        }
        return sum;
    }

    /**
     * Used to return the average monthly rainfall
     * @return the average monthly rainfall for the year
     */
    public double getAverageMonthlyRainfall() {
        double sum = 0;

        for(int i = 0; i < monthsRain.length; i++){
            if(monthsRain[i] > 0){
                sum += monthsRain[i];
            }
        }
        return sum / 12;
    }

    /**
     * Used to return the month with the most rain
     * @return the month with the most rain
     */
    public int getMonthWithMostRain() {
        int maxIndex = 0;
        double maxNumber = 0;

        for (int i = 0; i < monthsRain.length; i++){
            if(monthsRain[i] > maxNumber){
                maxIndex = i;
                maxNumber = monthsRain[i];
            }
        }
        return maxIndex;
    }

    /**
     * Used to return the month with the least rain
     * @return the month with the least rain
     */
    public int getMonthWithLeastRain() {
        int minIndex = 0;
        double minNumber = 0;

        for (int i = 0; i < monthsRain.length; i++){
            if(monthsRain[i] < minNumber){
                minIndex = i;
                minNumber = monthsRain[i];
            }
        }
        return minIndex;
    }
}
