package practice;

public class developersday {
    public static void main(String[] args) {
        session ai=new session("AI in modern applicaton",60);
        session cybersecurity=new session("cybersecurity",80);
        ai.schedulesession("Dr.lutfan haider","101");
        cybersecurity.schedulesession("Dr.Aisha","102");
        ai.displaysession();
        cybersecurity.displaysession();
    }
}
