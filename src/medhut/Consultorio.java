package medhut;


import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Consultorio implements Serializable{
    private  int idConsultorio;
    private  int idDono;
    private  String nome;
    private  String morada;
    private  String localidade;
    private  String especialidade;
    private Set<Consulta> consultas;
    
    
    // dois mapas 
    private final Map<Especialidade, Consultorio> espCons;
    private final Map<String , Consultorio> localCons;
    
    
    // Construtor 
    public Consultorio() {
	this.espCons = new HashMap<>();
	this.localCons = new HashMap<>();
	this.consultas = new HashSet<>();
    }
    
    
    // Getters & Setters

    public int getIdConsultorio() {
	return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
	this.idConsultorio = idConsultorio;
    }

    public int getIdDono() {
	return idDono;
    }

    public void setIdDono(int idDono) {
	this.idDono = idDono;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
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

    public String getEspecialidade() {
	return especialidade;
    }

    public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
    }


    public Set<Consulta> getConsultas() {
	return consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
	this.consultas = consultas;
    }



}
