package atividade.pkg1;

public class Medico extends Pessoa {

    private String especialidades;
    private Integer crm;
    private String senhaMedico;
    private double salario;

    @Override
    public boolean logar(String senha) {
        boolean password = false;
        if (senha == this.senhaMedico) {
            password= true;
        }
        return password;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }
    
    


}





