package main.java;

public class Assignment {
    /**
     * Exercise 1: Calculate movie ticket total
     * Calculate the total cost for a family going to the movies:
     * - Adult tickets cost $12.50 each (2 adults)
     * - Child tickets cost $8.00 each (3 children)
     * - Large popcorn costs $7.25 (1 popcorn to share)
     */
    public static double calculateMovieNight() {
        double adultTickets = 2 * 12.50;
        double childTickets = 3 * 8;
        double largePopcorn = 1 * 7.25;

        return adultTickets + childTickets + largePopcorn;
    }

    /**
     * Exercise 2a: Check if someone can rent a car
     * Most rental companies require drivers to be 25 or older
     * @param age the person's age
     * @return true if age is 25 or older, false otherwise
     */
    public static boolean canRentCar(int age) {
       if (age >= 25){
        return true;
       }else{
        return false;
       }
    }

    /**
     * Exercise 2b: Check if password is valid length
     * Password must be at least 8 characters
     * @param password the password to check
     * @return true if password length is 8 or more, false otherwise
     */
    public static boolean isValidPasswordLength(String password) {
        if(password.length() >= 8){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Exercise 2c: Check if it's time for an oil change
     * Car needs oil change every 5000 miles
     * @param mileage the current mileage
     * @param lastChangeMileage the mileage at last oil change
     * @return true if difference is 5000 or more, false otherwise
     */
    public static boolean needsOilChange(int mileage, int lastChangeMileage) {
        if(mileage-lastChangeMileage >= 5000){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Exercise 3: Get message for divisible by 3
     * @param number the number to check
     * @return "Divisible by 3" if number is divisible by 3, "" otherwise
     */
    public static String getDivisibleByThreeMessage(int number) {
        if(number % 3 == 0){
            return "Divisible by 3";
        } else {
            return "";
        }
    }

    /**
     * Exercise 4: Determine if a year is a leap year
     * @param year the year to check
     * @return "Leap Year" if the year is a leap year, "Not Leap Year" otherwise
     * Hint: a year is a leap year if it's divisible by 4, 
     * except if it's divisible by 100 but not by 400
     */
    public static String getLeapYearMessage(int year) {
        if(year % 4 == 0){
            if (year % 100 != 0 ){
                return "Leap Year";
            }
            if (year % 100 == 0 && year % 400 == 0){
                return "Leap Year";
            }else return "Not Leap Year";
        }else return "Not Leap Year";
    }

    /**
     * Exercise 5: Get ticket price category
     * @param age the person's age
     * @return "Free" if age < 5, "Child Price" if age is 5-12, 
     *         "Student Price" if age is 13-21, "Adult Price" if age is 22+
     */
    public static String getTicketPriceCategory(int age) {
        if(age < 5){
            return "Free";
        }else if(age >= 5 && age <= 12){
            return "Child Price";
        }else if(age >= 13 && age <= 21){
            return "Student Price";
        }else return "Adult Price";
    }
}