class OOPsAdvanced2 {
    // Demonstrate composition, dependency injection (constructor injection)
    interface MessageService { void send(String to, String msg); }
    static class EmailService implements MessageService { public void send(String to,String msg){ System.out.println("Email to "+to+": "+msg); } }
    static class Notification {
        private final MessageService svc;
        Notification(MessageService svc){ this.svc = svc; }
        void notify(String user, String message){ svc.send(user, message); }
    }
    public static void main(String[] args){
        Notification n = new Notification(new EmailService());
        n.notify("team@company.com","Build succeeded");
    }
}
