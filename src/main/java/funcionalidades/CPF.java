package funcionalidades;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CPF {
    private List<String> cpfs;

    public CPF(List<String> cpfs) {
        this.cpfs = cpfs;
        removerDuplicatas();
    }

    public List<String> getCpfs() {
        return cpfs;
    }

    public void removerDuplicatas(){
        Set<String> cpfSet = new LinkedHashSet<>(cpfs);
        cpfs.clear();
        cpfs.addAll(cpfSet);
    }


}


