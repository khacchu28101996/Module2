package Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Mail mail =  new MailImpl();
        mail.sendMail();
        mail.log();
    }
}
