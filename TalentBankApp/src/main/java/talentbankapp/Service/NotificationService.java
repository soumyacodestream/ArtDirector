package talentbankapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talentbankapp.DTO.UserDTO;

@Service
public class NotificationService {
	
	@Autowired
	TalentBankEmailService emailService;
	
	@Autowired 
	TalentBankSMSService smsService;
	
	
	public String getNotification(UserDTO user) {
		
		emailService.sendEmail(user.getEmail(), user.getName(), user.getPhone());
		smsService.sendSMS(user.getPhone(), user.getName());
		
		
		 return null;
	}


	public void notifyClient(UserDTO user) {
		// TODO Auto-generated method stub
		
	}

}
