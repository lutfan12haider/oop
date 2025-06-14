package practice;
import java.util.ArrayList;
 class stadium {
  private String name;
     private String city;
     private int capacity;
     private ArrayList<String> matchscheduled;
     public stadium(String name, String city, int capacity) {
         this.name = name;
         this.city = city;
         this.capacity = capacity;
         matchscheduled = new ArrayList<>();
     }
     public void schedulematched(String match){
         matchscheduled.add(match);
         System.out.println("Match Scheduled for " + name + " is: " + match);
     }
     public void displaydetails(){
         System.out.println("stadium" +name);
         System.out.println("city" +city);
         System.out.println("capacity" +capacity);
         System.out.println("Matches Scheduled: " + (matchscheduled.isEmpty() ? "None" : matchscheduled));
         System.out.println();
     }
}

