package demo.services.account.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.services.account.model.Account;

@RestController
public class AccountController {

	@RequestMapping("/")
	public Account findAccount() {
		return new Account(1, 1, "123456789", 1234);
	}
	
}
