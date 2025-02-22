public class MovieInterest {
    public static void seeMovie(double cost, int stars) {
        String interest = "not interested";
        
        if (cost < 5.00) {
            interest = "very interested";
        } else {
            if (cost >= 12.00) {
                if (stars == 5) {
                    interest = "sort-of interested";
                }
            } else if (stars > 1) {
                 if (stars < 5) {
                        interest = "sort-of interested";
                 } else {
                        interest = "very interested";
                 }
                
            }
        }
        System.out.println(interest);
    }

    public static void main(String[] args) {
        seeMovie(4.50, 3);  // Very interested
        seeMovie(10.00, 3); // Sort-of interested
        seeMovie(12.50, 5); // Sort-of interested
        seeMovie(12.50, 4); // Not interested
        seeMovie(7.00, 1);  // Not interested
    }
}
