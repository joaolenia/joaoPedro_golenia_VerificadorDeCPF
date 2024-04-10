package funcionalidades;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class CPFValidador {

    private List<String> cpfsvalidos;
    private List<String> cpfsinvalidos;

    public void tamanhoCPF(CPF cpfs) {
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
        List<String> cpfsNumericos = new ArrayList<>();
        for (String cpf : cpfsvalidos) {
            if (cpf.matches("[\\d.-]+")) {
                cpfsNumericos.add(cpf);
            }
            else {
                cpfsinvalidos.add(cpf);
            }
        }
        cpfsvalidos.clear();
        cpfsvalidos.addAll(cpfsNumericos);
        cpfsNumericos.clear();
    }

    public void filtrarCaracteres() {
        List<String> aux = new ArrayList<>();
        for (String cpf : cpfsvalidos) {
            String cpfNumero = cpf.replaceAll("[^a-zA-Z0-9]", "");
            aux.add(cpfNumero);
        }
        Set<String> cpfSet2 = new LinkedHashSet<>(aux);
        aux.clear();
        cpfsvalidos.clear();
        cpfsvalidos.addAll(cpfSet2);


    }

    public void imprimir() {
        System.out.println("VÁLIDOS:");
        for (String valido : cpfsvalidos) {
               // String cpfFormatado = String.format("%s.%s.%s-%s", valido.substring(0, 3), valido.substring(3, 6), valido.substring(6, 9), valido.substring(9));
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

