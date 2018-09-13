package atividade.pkg1;

public class Atividade1 {

    public static void main(String[] args) {

        Enfermeiro e = new Enfermeiro();
        Paciente p = new Paciente();
        Medico m = new Medico();

        m.setNome("Marcos");
        m.setSobrenome("Rodrigues");
        m.setCpf("111.111.111");
        m.setRg("22.796.981-7");
        m.setEspecialidades("Cirurgião");
        m.setCrm(12389);
        m.setSenhaMedico("44444");

        e.setNome("Artur");
        e.setSobrenome("Freire");
        e.setCpf("111.111.111");
        e.setRg("22.796.981-7");
        e.setCorem(4321);
        e.logar("5555");

        p.setNome("Leandrina");
        p.setSobrenome("Ticas");
        p.setCpf("111.111.111");
        p.setRg("22.796.981-7");
        p.setCodPaciente(6565656);
        p.setSenhaPaciente("888888");

        System.out.println("\n----------------------------------------\n");
        System.out.println("***** PACIENTE *****"
                + "\nNome: " + p.getNome() + " " + p.getSobrenome()
                + "\nCPF: " + p.getCpf()
                + "\nRG: " + p.getRg()
                + "\nCod Paciente: " + p.getCodPaciente()
                + "\nSenha: " + p.getSenhaPaciente());

        System.out.println("\n--------------------------------------------\n");

        System.out.println("***** MEDICO *****"
                + "\nNome: " + m.getNome() + " " + m.getSobrenome()
                + "\nCPF: " + m.getCpf()
                + "\nRG: " + m.getRg()
                + "\nEspecialidades: " + m.getEspecialidades()
                + "\nSenha: " + m.getSenhaMedico());

        System.out.println("\n--------------------------------------------\n");
        System.out.println("***** ENFERMEIRO *****"
                + "\nNome: " + e.getNome() + " " + e.getSobrenome()
                + "\nCPF: " + e.getCpf()
                + "\nRG: " + e.getRg()
                + "\nCOREM: " + e.getCorem()
                + "\nSenha: " + e.getSenhaEnfermeiro());


    }

}
