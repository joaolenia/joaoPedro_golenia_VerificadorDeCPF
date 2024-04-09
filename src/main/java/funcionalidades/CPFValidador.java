package funcionalidades;

import java.util.ArrayList;
import java.util.List;


public class CPFValidador {

    private List<String> cpfsvalidos;
    private List<String> cpfsinvalidos;

    public CPFValidador(){}

    public void tamanhoCPF(CPF cpfs){
        cpfsvalidos = new ArrayList<>();
        cpfsinvalidos = new ArrayList<>();
        for(String cpf: cpfs.getCpfs()){
            cpf = cpf.trim();
            String cpfNumero = cpf.replaceAll("[^a-zA-Z0-9]", "");
            if (cpfNumero.length() == 11) {
                cpfsvalidos.add(cpf);
            } else {
                cpfsinvalidos.add(cpf);
            }
        }
    }

    public void filtrarNumero() {
        List<String> cpfsNumericos = new ArrayList<>();
        for (String cpf : cpfsvalidos) {
            cpf = cpf.trim();
            if (cpf.matches("[\\d.-]+")) {
                cpfsNumericos.add(cpf);
            }
            else{
                cpfsinvalidos.add(cpf);
            }
        }
        cpfsvalidos = cpfsNumericos;
        cpfsNumericos = null;
    }

    public void imprimir(){
        System.out.println("VÁLIDOS:");
        for (String valido:cpfsvalidos){
            System.out.println(valido);
        }

        System.out.println("-----------------------");

        System.out.println("INVÁLIDOS:");
        for (String invaliodo : cpfsinvalidos){
            System.out.println(invaliodo);
        }

    }

}
