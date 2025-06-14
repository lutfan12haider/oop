package practice;

public class championstrophy {
    public static void main(String[] args) {
        stadium nationalstadium=new stadium("National Stadium","Karachi",100000);
        stadium Gaddafistadium=new stadium("Gaddafi Stadium","Lahore",200000);
        nationalstadium.schedulematched("Pakistan VS India");
        Gaddafistadium.schedulematched("Australia VS New zealand");
        nationalstadium.displaydetails();
        Gaddafistadium.displaydetails();
    }
}
