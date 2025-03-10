public class Date {
   //fields
   int year;
   int month;
   int day;
   
   //methods
   public int getDaysInMonth(){
      //runs "in the context" of an object
      //31,30,28/29
      if(month == 9 || month == 4 | month == 6 || month == 11){
         return 30;
      }else if (month == 2) {
         if(isLeapYear()){
            return 29;
         }else {
         return 28;
         }
      }else {
         return 31;
      }
         
   }
   public int getDaysInYear(){
      if (isLeapYear()){
         return 366;
      }else {
         return 365;
      }
   }
   
   public boolean isLeapYear(){
      return (year % 4 ==0 || (year % 4 == 0 && year % 100 != 0));
     }
}