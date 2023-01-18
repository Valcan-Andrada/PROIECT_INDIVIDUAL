package OnlineLibraryIndividualProject.IndividualProject.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class Email {
@Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail
                            ,String subject,
                            String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("andravalcan@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        System.out.println(message);
        mailSender.send(message);
        System.out.println("mail sent successfully...");
    }


}
