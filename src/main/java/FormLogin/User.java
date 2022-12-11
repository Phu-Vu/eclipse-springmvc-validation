package FormLogin;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;		//phải là đầu org.hibernate ko đc javax
import org.hibernate.validator.constraints.NotEmpty;	//phải là đầu org.hibernate ko đc javax

public class User {
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Size(min = 6,max = 15)
	//để gọi các phương thức @ bên trên ta cần phải import api vào file pom.xml

	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
