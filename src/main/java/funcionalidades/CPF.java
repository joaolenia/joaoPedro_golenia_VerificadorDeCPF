package funcionalidades;

import java.util.*;

public class CPF {
    private List<String> cpfs;

    public CPF(List<String> cpfs) {
        this.cpfs = cpfs;
        removerDuplicatas();
    }

    public List<String> getCpfs() {
        return cpfs;
    }

    public void removerDuplicatas() {

        Map<String, String> cpfMap = new HashMap<>();
        List<String> cpfOrder = new ArrayList<>();
        for (String cpf : cpfs) {
            String cpfNumerico = cpf.replaceAll("[^0-9]", "");
            if (!cpfMap.containsKey(cpfNumerico)) {
                cpfMap.put(cpfNumerico, cpf);
                cpfOrder.add(cpf);
            }
        }
        cpfs.clear();
        cpfs.addAll(cpfOrder);
    }
}






