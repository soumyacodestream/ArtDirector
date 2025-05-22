package talentbankapp.Service;

import org.springframework.stereotype.Service;

@Service
public class TalentBankSMSService {
	 
	public void sendSMS(String phone, String name) {
		 
		System.out.println("\"SMS sent to \" + phoneNumber + \": Hello \" + clientName + \", thank you for registering!\"");
	}

}
