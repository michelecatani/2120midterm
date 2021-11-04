// class for testing RainFall

public class RainFallDemo {
    // main function
    public static void main(String[] args) {
        // array for storing rainfall for each month 
        double[] monthsRain = {1.6, 2.1, 1.7, 3.5, -2.6, 3.7, 3.9, 2.6, 2.9, 4.3, 2.4, 3.7};

        // create new rainfall instance
        RainFall rainFall = new RainFall(monthsRain);

        // ensure the month with the minimum rainfall will print as 0.0, and not negative
        double minNumber = 0;

        if(monthsRain[rainFall.getMonthWithLeastRain()] < 0){
            minNumber = 0;
        } else {
            minNumber = monthsRain[rainFall.getMonthWithLeastRain()];
        }

        // print out all of the values
        System.out.println("The total rainfall for this year is " + rainFall.getTotalRainfall());
        System.out.println("The average rainfall for this year is " + rainFall.getAverageMonthlyRainfall());
        System.out.println("The month with the highest amount of rain is " + (rainFall.getMonthWithMostRain() + 1) + " with " + monthsRain[rainFall.getMonthWithMostRain()] + " inches.");
        System.out.println("the month with the lowest amount of rain is " + (rainFall.getMonthWithLeastRain() + 1) + " with " + minNumber + " inches.");
    }

}
