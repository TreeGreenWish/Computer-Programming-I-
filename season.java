public class season {
    public static String season(int month, int day) {
        if (month == 12) {
            if (day >= 16) {
                return "Winter";
            }
        }
        if (month < 3) {
            return "Winter";
        }
        if (month == 3) {
            if (day <= 15) {
                return "Winter";
            }
        }
        if (month == 3) {
            if (day > 15) {
                return "Spring";
            }
        }
        if (month > 3) {
            if (month < 6) {
                return "Spring";
            }
        }
        if (month == 6) {
            if (day <= 15) {
                return "Spring";
            }
        }
        if (month == 6) {
            if (day > 15) {
                return "Summer";
            }
        }
        if (month > 6) {
            if (month < 9) {
                return "Summer";
            }
        }
        if (month == 9) {
            if (day <= 15) {
                return "Summer";
            }
        }
        if (month == 9) {
            if (day > 15) {
                return "Fall";
            }
        }
        if (month > 9) {
            if (month < 12) {
                return "Fall";
            }
        }
        return "Fall";
    }

    public static void main(String[] args) {
        System.out.println(season(1, 10));  // Winter
        System.out.println(season(4, 20));  // Spring
        System.out.println(season(7, 4));   // Summer
        System.out.println(season(10, 31)); // Fall
    }
}
