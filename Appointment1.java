public class Appointment1 {
   public int day;
   public int hour;
   
   public Appointment1(int day, int hour) {
      this.day = day;
      this.hour = hour;
   }
    public int getHour() {
      return hour;
   }
   
   public static String getDayFormated(int day) {
      switch(day){
         case 0:
            return "Monday";
         case 1:
            return "Tuesday";
         case 2:
            return "Wednesday";
         case 3:
            return "Thursday";
         case 4:
            return "Friday";
         case 5:
            return "Saturday";
         case 6:
            return "Sunday";
         default:
            return "Unkown";
      }
   }
}