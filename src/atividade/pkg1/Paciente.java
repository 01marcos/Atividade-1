
package atividade.pkg1;


public class Paciente extends Pessoa{
    
    private Integer codPaciente;
    private String senhaPaciente;
    
    
    
    public boolean logar(String senha){
        boolean password= false;
        if(senha==this.senhaPaciente){
           password=true;
        }
        return password;
    }

    public Integer getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Integer codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getSenhaPaciente() {
        return senhaPaciente;
    }

    public void setSenhaPaciente(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }
    
    
    
    
    
    
}
