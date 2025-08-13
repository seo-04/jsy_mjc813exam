package org.mjc;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class email {
    static Properties prop;
    static Session session;
    static MimeMessage message;

    public static void main(String[] args) throws Exception {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }

    public static void generateAndSendEmail() throws Exception {
        final String user ="coups1234@naver.com"; // 발신
        final String password = "960311jj@";

        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.naver.com");
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");

        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));

            // 수신자 메일 전송
            message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress("eyeseo723@naver.com")));

            message.setSubject("서연");

            message.setText("이다");

            Transport.send(message);
            System.out.println("message sent successfully");
        }catch (AddressException e){
            e.printStackTrace();
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
