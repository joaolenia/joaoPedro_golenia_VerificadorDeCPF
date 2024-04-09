package funcionalidades;

import java.util.ArrayList;
import java.util.List;

public class CPFValidador {

    private List<String> cpfsvalidos;
    private List<String> cpfsinvalidos;

    public CPFValidador(){}

    public void TamanhoCPF(CPF cpfs){
        cpfsvalidos = new ArrayList<>();
        cpfsinvalidos = new ArrayList<>();
        for(String cpf: cpfs.getCpfs()){
            String cpfNumeros = cpf.replaceAll("[^0-9]", "");
            if (cpfNumeros.length() == 11) {
                cpfsvalidos.add(cpf);
            } else {
                cpfsinvalidos.add(cpf);
            }
        }
    }


    public void Imprimir(){


    }

}
