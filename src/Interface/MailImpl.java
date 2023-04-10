package Interface;

public class MailImpl implements Mail {
    @Override
    public void sendMail() {
        System.out.println("Sending Mail: ");
    }

    @Override
    public void log() {
        System.out.println("Logggg!!!" );
    }

}
