public class Maximum {
    //Method to check maximum integer number between three integers.
     public Integer testMaximumInteger (Integer x, Integer y, Integer z){
            Integer maximumNumber = z;

            if (y.compareTo(maximumNumber) > 0) {
                maximumNumber = y;
            }
            else if (x.compareTo(maximumNumber) > 0) {
                maximumNumber = x;
            }
            else
                maximumNumber = z;

            return maximumNumber;
        }

     //Method to check maximum float number between three float numbers.
     public Float testMaximumFloat (Float number1, Float number2, Float number3){
         Float maximumFloat = number3;

         if (number2.compareTo(maximumFloat) > 0) {
             maximumFloat = number2;
         }
         else if (number1.compareTo(maximumFloat) > 0) {
             maximumFloat = number1;
         }
         else
             maximumFloat = number3;

         return maximumFloat;
     }
}