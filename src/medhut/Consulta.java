package medhut;

import java.io.Serializable;


public class Consulta implements Serializable{
    private int idConsulta;
    private String dataHora;
    private String hora;
    private EstadoConsulta estado;
    private int idConsultorio;
    private int idCliente;
    private String itensExtra;
    private int valor;
    private int valorItens;
   
    private Consultorio consultorio;
    
    
    
    // Construtor
    public Consulta(Consultorio consultorio) {
	this.consultorio = consultorio;
    }
    
    public Consulta(){
        
    }

    // Getters

    public int getIdConsulta() {
	return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
	this.idConsulta = idConsulta;
    }

    public String getDataHora() {
	return dataHora;
    }

    public void setDataHora(String dataHora) {
	this.dataHora = dataHora;
    }

    public String getHora() {
	return hora;
    }

    public void setHora(String hora) {
	this.hora = hora;
    }
    

    public EstadoConsulta getEstado() {
	return estado;
    }

    public void setEstado(EstadoConsulta estado) {
	this.estado = estado;
    }

    public int getIdConsultorio() {
	return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
	this.idConsultorio = idConsultorio;
    }

    public int getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
    }

    public String getItensExtra() {
	return itensExtra;
    }

    public void setItensExtra(String itensExtra) {
	this.itensExtra = itensExtra;
    }

    public int getValor() {
	return valor;
    }

    public void setValor(int tipoConsulta) {
        int valorAPagar = 0;
        
        if(tipoConsulta <= 3){
            switch (tipoConsulta) {
                case 0:
                    valorAPagar = 60;
                    break;
                case 1:
                    valorAPagar = 70;
                    break;
                case 2:
                    valorAPagar = 50;
                    break;
                case 3:
                    valorAPagar = 55;
                    break;
                default:
                    break;
            }
            this.valor = valorAPagar; 
        }
        else{
            this.valor = tipoConsulta;
        }
        
    }
    

    public float getValorItens() {
	return valorItens;
    }

    public void setValorItens(int valorItens) {
	this.valorItens = valorItens;
    }
    

    public Consultorio getConsultorio() {
	return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
	this.consultorio = consultorio;
    }
    
    
}
