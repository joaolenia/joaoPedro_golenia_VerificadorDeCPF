package funcionalidades;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class CPFValidador {

    private List<String> cpfsvalidos;

    private List<String> cpfsinvalidos;

    List<String> cpfNumerico = new ArrayList<>();


    public void filtragemCompleta(CPF cpf){
      filtrarTamanho(cpf);
      filtrarNumero();
      filtrarCaracteres();

      imprimir();
    }

    public void filtrarTamanho(CPF cpfs) {
        cpfsvalidos = new ArrayList<>();
        cpfsinvalidos = new ArrayList<>();
        for (String cpf : cpfs.getCpfs()) {
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
        List<String> aux = new ArrayList<>();
        for (String cpf : cpfsvalidos) {
            if (cpf.matches("[\\d.-]+")) {
                aux.add(cpf);
            }
            else {
                cpfsinvalidos.add(cpf);
            }
        }
        cpfsvalidos.clear();
        cpfsvalidos.addAll(aux);
        aux.clear();
    }

    public void filtrarCaracteres() {
        for (String cpf : cpfsvalidos) {
            String cpfNumero = cpf.replaceAll("[^a-zA-Z0-9]", "");
            cpfNumerico.add(cpfNumero);
        }
        Set<String> cpfSet2 = new LinkedHashSet<>(cpfNumerico);
        cpfNumerico.clear();
        cpfNumerico.addAll(cpfSet2);
        cpfSet2.clear();

    }


    public void imprimir() {
        System.out.println("VÁLIDOS:");
        for (String valido : cpfsvalidos) {
              //  String cpfFormatado = String.format("%s.%s.%s-%s", valido.substring(0, 3), valido.substring(3, 6), valido.substring(6, 9), valido.substring(9));
                //System.out.println(cpfFormatado);
               System.out.println(valido);
            }

        System.out.println("-----------------------");

        System.out.println("INVÁLIDOS:");
        for (String invaliodo : cpfsinvalidos) {
            System.out.println(invaliodo);
        }

    }
}

