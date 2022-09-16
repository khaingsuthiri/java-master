public class LeapYear {

    public static boolean isLeapYear(int leapYear) {

        if(leapYear < 1 || leapYear > 9999) {
            return false;
        }

        if(leapYear % 4 == 0) {
            if(leapYear % 100 == 0) {
                if(leapYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2200));
    }
}
