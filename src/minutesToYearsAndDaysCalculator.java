public class minutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long mins){
        if(mins < 0){
            System.out.println("Invalid Value");
        }
            long hours = mins / 60;
            long days = hours / 24;
            long years = days / 365;
            long extraDays = days % 365;
        System.out.println(mins + "min = " + years + "y and " + extraDays + "d");
    }
}
