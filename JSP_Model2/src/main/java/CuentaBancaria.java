import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.javalite.common.Collections;

public class CuentaBancaria implements Serializable{
    
    public CuentaBancaria(){
    }
    
    private List<String> cuentas;

    public static List<Map> getListaCuentas() {
        List res = Collections.list(
                Collections.map("id", 1, "00000001", 1000000),
                Collections.map("id", 2, "00000002", 2000000),
                Collections.map("id", 3, "00000003", 1500000)
        );
        return res;
    }
    
    public List<String> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<String> id) {
        List<String> l = new ArrayList<>();
        Integer i;
        for (i = 0; i <= id.size() - 1; i++) {
            l.add(getNumeroCuenta(Integer.valueOf(id.get(i))));
        }
        this.cuentas = l;
    }
    public String getNumeroCuenta(Integer codigo) {
        String nombres[] = {"00000001", "00000002", "00000003"};

        return nombres[codigo - 1];
    }
    
    public Integer getSaldo(Integer codigo) {
        Integer saldo[] = {00000001, 00000002, 00000003};

        return saldo[codigo - 1];
    }
}