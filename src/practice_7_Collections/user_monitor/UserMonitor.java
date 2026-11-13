package practice_7_Collections.user_monitor;

import java.util.HashSet;

public class UserMonitor {
    //хранение уникальных сессий
    private HashSet<String> sessions;

    UserMonitor(){
        this.sessions = new HashSet<>();
    }


    public void addNewSession(String session){
        sessions.add(session);
    }
    //доступ к сессиям
    public HashSet<String> getSessions(){
        return this.sessions;
    }

    public void printSessions(){
        System.out.println("Все уникальные сессии: ");
        sessions.forEach(System.out::println);
    }
}
