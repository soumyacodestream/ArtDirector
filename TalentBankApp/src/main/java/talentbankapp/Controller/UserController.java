package talentbankapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import talentbankapp.DTO.UserDTO;
import talentbankapp.Service.NotificationService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
    private NotificationService notificationService;

    @PostMapping("/welcome")
    public String registerClient(@RequestBody UserDTO user) {
       
        notificationService.notifyClient(user);
        return "Registration successful for " + user.getName();
    }
	

	}

