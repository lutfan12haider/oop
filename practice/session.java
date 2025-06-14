package practice;
import java.util.ArrayList;
public class session {
private String sessiontitle;
private String speakername;
private int duration;
private String roomnumber;
    public session(String sessiontitle,int duration){
    this.sessiontitle=sessiontitle;
    this.duration=duration;
    this.speakername="Not assigned";
    this.roomnumber="Not assigned";
    }
    public void schedulesession(String speakername,String roomnumber){
    this.speakername=speakername;
    this.roomnumber=roomnumber;
        System.out.println("Session scheduled " + sessiontitle + " by " + speakername + " in room " + roomnumber);

    }
    public void displaysession(){
        System.out.println("Session title : " + sessiontitle);
        System.out.println("Speakername : " + speakername);
        System.out.println("Duration : " + duration + " in minutes");
        System.out.println("Room number : " + roomnumber);
        System.out.println();

    }
}

