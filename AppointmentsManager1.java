import javax.swing.*;
/*Author : Ardita Morina
           Fortes Lohaj
           Zanfina Svirca
           Jeta Kasabaqi*/

public class AppointmentsManager1 { 
   
   public Appointment1[][] appointments;
   
   public AppointmentsManager1()
    {
      appointments = new Appointment1[7][24];
   }
   
   public void run() {
      String input = JOptionPane.showInputDialog("Give the action: 0 to add an appointment, 1 to delete an appointment, 2 to list the appointments, 3 to print the appointments and 4 to terminate the program");
      int action = new Integer(input).intValue();
      
       
      switch(action){
         case 0:
            newAppointment();
            break;
         case 1:
            deleteAppointment();
            break;
         case 2:
            listAppointments();
            break;
         case 3:
            printAppointments();
            break;
         default:
            return;
      }
      run();
   }
   
   public void newAppointment() {
      String input = JOptionPane.showInputDialog("Assign the appointment day and hour in the format day:hour (X:XX) as int:int");
      String[] values = input.split(":");
      int day = new Integer(values[0]).intValue();
      int hour = new Integer(values[1]).intValue();
      
      Appointment1 newAppointment = new Appointment1(day, hour);
      
      appointments[day][hour] = newAppointment;
   }
   
   public void deleteAppointment() {
      String input = JOptionPane.showInputDialog("Assign the appointment day and hour in the format day:hour (X:XX) as int:int that you wish to delete");
      String[] values = input.split(":");
      
      if(values.length == 2){
       
       int day = new Integer(values[0]).intValue(); 
       int hour = new Integer(values[1]).intValue();
       
       if(day < 0 || day > 6 || hour < 0 || hour > 23)
        { System.out.println("Error"); }
       
        else {
          appointments[day][hour] = null;
          }
         
         }
     
       else 
      { System.out.println("Error");}
     
      
   }
   
   public void printAppointments() {
      String result = "";
      for(int i = 0; i< 7; i++){
         String dayFormated = Appointment1.getDayFormated(i);
         String dayAppointments = getAppointmentsString(i);
         result += dayFormated + ":\n" + dayAppointments;
      }
      System.out.println(result);
   }
   
   public void listAppointments() {
      String dayString = JOptionPane.showInputDialog("For which day do you want to list the appointments (Input as integer 0-6)");
      int day = new Integer(dayString).intValue();
      String dayFormated = Appointment1.getDayFormated(day);
      String result = "";
      if(day >= 0 && day <= 6){
         result = getAppointmentsString(day);
      }
      JOptionPane.showMessageDialog(null, dayFormated + ":\n" + result);
   }
   
   public String getAppointmentsString(int day) {
      String result = "";
      for(int i = 0 ; i < 24; i++){
         if(appointments[day][i] != null){
            result += "Hour: " + appointments[day][i].getHour() + "\n";
         }
      }
      return result;
   }
}