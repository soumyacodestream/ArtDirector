package talentbankapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class TalentBankEmailService {

	@Autowired
    private JavaMailSender mailSender;

	public void sendEmail(String to, String subject, String message) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("soumyaalladi05@gmail.com");
        msg.setTo("madhacker1321@gmail.com");
        msg.setSubject("Registration done");
        msg.setText("Your regestration has been added successfully");
        mailSender.send(msg);
       
    }
}
