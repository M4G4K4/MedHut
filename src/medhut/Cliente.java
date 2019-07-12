package medhut;

import java.io.Serializable;

public class Cliente  implements Serializable{
    private int idCliente;
    private int pontosGanhos;
    private int pontosUtilizados;
    private int pontosAtuais;
    private int vales;
    private String login;
    private String password;
    private String nome;
    private String nCC;
    private String NIF;
    private String telefone;
    private String morada;
    private String localidade;
    private String dataNascimento;
   
    
 
    // Construtor 
    public Cliente() {
    }
    
    // Getters and setter

    public int getVales() {
        return vales;
    }

    public void setVales(int vales) {
        this.vales = vales;
    }
    
    public int getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
    }

    public int getPontosGanhos() {
	return pontosGanhos;
    }

    public void setPontosGanhos(int pontosGanhos) {
	this.pontosGanhos = pontosGanhos;
    }

    public int getPontosUtilizados() {
	return pontosUtilizados;
    }

    public void setPontosUtilizados(int pontosUtilizados) {
	this.pontosUtilizados = pontosUtilizados;
    }

    public int getPontosAtuais() {
	return pontosAtuais;
    }

    public void setPontosAtuais(int pontosAtuais) {
	this.pontosAtuais = pontosAtuais;
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
    

}