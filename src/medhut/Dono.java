package medhut;

import java.io.Serializable;

public class Dono  implements Serializable{
    private int idDono;
    private String login;
    private String password;
    private String nome;
    private String nCC;
    private String NIF;
    private String telefone;
    private String morada;
    private String localidade;
    private String dataNascimento;
    private String email;

    // Construtor 
    public Dono() {
    }
    
    
    public int getIdDono() {
	return idDono;
    }

    public void setIdDono(int idDono) {
	this.idDono = idDono;
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

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getnCC() {
	return nCC;
    }

    public void setnCC(String nCC) {
	this.nCC = nCC;
    }

    public String getNIF() {
	return NIF;
    }

    public void setNIF(String NIF) {
	this.NIF = NIF;
    }

    public String getTelefone() {
	return telefone;
    }

    public void setTelefone(String telefone) {
	this.telefone = telefone;
    }

    
    public String getMorada() {
	return morada;
    }

    public void setMorada(String morada) {
	this.morada = morada;
    }

    public String getLocalidade() {
	return localidade;
    }

    public void setLocalidade(String localidade) {
	this.localidade = localidade;
    }

    public String getDataNascimento() {
	return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
    }
   

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }
    
}
