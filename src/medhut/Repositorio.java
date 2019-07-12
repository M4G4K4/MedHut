package medhut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Repositorio implements Serializable{
    private Set<Admin> admins;
    private Set<Cliente> clientes;
    private Set<Consulta> consultas;
    private Set<Consultorio> consultorios;
    private Set<Dono> donos;
    private Set<Especialidade> especialidades;
    
    private static Repositorio bd = null;
    
    // Construtor 
    private Repositorio (){
        this.admins = new HashSet<>();
        this.clientes = new HashSet<>();
        this.consultas = new HashSet<>();
        this.consultorios = new HashSet<>();
        this.donos = new HashSet<>();
	this.especialidades = new HashSet<>();
        
    }
    
    public static Repositorio getInstance(){
        if (bd == null){
            bd = new Repositorio();
        }
        
        return bd;
    }
    
    public synchronized void novoAdmin(Admin ad){
        this.admins.add(ad);
    }
    
    public synchronized void novoCliente(Cliente cli){
        this.clientes.add(cli);
    }
    
    public void novaConsulta(Consulta con){
        this.consultas.add(con);
    }
    
    public void novoConsultorio(Consultorio cons){
        this.consultorios.add(cons);
    }
    
    public synchronized void novoDono(Dono d){
        this.donos.add(d);
    }
    
    public void novoEspecialidade(Especialidade e){
	this.especialidades.add(e);
    }
    
    public void removeEspecialidade(Especialidade es){
	this.especialidades.remove(es);
    }
    
    public void removeAdmin(Admin a){
	this.admins.remove(a);
    }
    
    // Getters

    public Set<Admin> getAdmins() {
        return admins;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public Set<Consultorio> getConsultorios() {
        return consultorios;
    }

    public Set<Dono> getDonos() {
        return donos;
    }
    
    public Set<Especialidade> getEspecialidade(){
	return especialidades;
    }
    

    
    
    
  public static void serializar(String filename) {
        // Serializar um objeto para ficheiro
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(bd);
            System.out.println("Serialized data is saved in " + filename);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    public static void desserializar(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            bd = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Cliente class not found. " + ex.getMessage());
        }
    }
    
    
    
}
