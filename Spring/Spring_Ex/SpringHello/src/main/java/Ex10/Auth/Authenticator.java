package Ex10.Auth;

import Ex10.Model.*;

public interface Authenticator {
	void authenticate(LoginCommand loginCommand) throws AuthenticationException;

}
