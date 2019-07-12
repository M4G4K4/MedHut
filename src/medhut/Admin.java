package medhut;

import java.io.Serializable;

public class Admin implements  Serializable{
    private int idAdmin;
    private String login;
    private String password;
   
    
    // Construtor
    public Admin() {
    }
    
    // Getter and Setters
    public int getIdAdmin() {
	return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
	this.idAdmin = idAdmin;
    }


    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

   
    
}
