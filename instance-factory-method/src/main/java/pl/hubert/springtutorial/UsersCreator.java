/**
 * 
 */
package pl.hubert.springtutorial;

import java.util.logging.Logger;

/**
 * @author Hubert
 *
 */
public class UsersCreator {

	Logger logger = Logger.getLogger(this.getClass().getName());

	public User createUser(String userName) {
		logger.info("Tworzenie użytkownika " + userName);
		User user = new User();
		user.setName(userName);
		return user;
	}
}
