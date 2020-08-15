public class Maximum {
    //Method to check maximum integer number between three integers
     public Integer testMaximumInteger (Integer x, Integer y, Integer z){
            Integer maximumNumber = z;

            if (y.compareTo(maximumNumber) > 0) {
                maximumNumber = y;

            } else if (x.compareTo(maximumNumber) > 0) {
                maximumNumber = x;
            } else
                maximumNumber = z;

            return maximumNumber;
        }
    }