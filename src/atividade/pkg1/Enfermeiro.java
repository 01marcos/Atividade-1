package atividade.pkg1;

public class Enfermeiro extends Pessoa {

    private Integer corem;
    private double salario;
    private String senhaEnfermeiro;

    public Integer getCorem() {
        return corem;
    }

    public void setCorem(Integer corem) {
        this.corem = corem;
    }

    @Override
    public boolean logar(String senha) {
        boolean logar = false;
        if (senha == this.senhaEnfermeiro) {
            logar=true;
            
        }
        return true;
    
        
    }

    public void setSenhaEnfermeiro(String senhaEnfermeiro) {
        this.senhaEnfermeiro = senhaEnfermeiro;
    }

    public String getSenhaEnfermeiro() {
        return senhaEnfermeiro;
    }
        
    
    
    
   
}
