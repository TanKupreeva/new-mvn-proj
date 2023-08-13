package mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SendEmailTLS {

    public static void main(String[] args) {
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        final String username = "tanya.kupreeva91@gmail.com";  // тут прописывается адрес почты с которой идет отправка
        final String password = "tnnivbfoyfpeeqxn";  // тут прописывается ключ
        try{
            Session session = Session.getDefaultInstance(props,
                    new Authenticator(){
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }});
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("tanya.kupreeva91@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("tanya.kupreeva91@gmail.com",false)); // тут прописывается адрес почты получателя
            msg.setSubject("Hello");  // тут прописывается заголовок письма
            msg.setText("Text"); // тут прописывается текст письма
            msg.setSentDate(new Date());
            Transport.send(msg);
            System.out.println("Message sent.");
        }catch (MessagingException e){
            System.out.println("Cause: " + e);
        }
    }
}