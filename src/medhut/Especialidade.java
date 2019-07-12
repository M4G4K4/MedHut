package medhut;
import java.io.Serializable;

public class Especialidade implements Serializable {
    private String especialidade;
    
    // Construtor 
    public Especialidade() {
    }
    
    // Getters and Setters 
    public String getEspecialidade() {
	return especialidade;
    }

    public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
    }
    
}
