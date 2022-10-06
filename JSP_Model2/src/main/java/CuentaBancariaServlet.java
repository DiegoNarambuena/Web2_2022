
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/form"})
public class CuentaBancariaServlet extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Map> cuenta = CuentaBancaria.getListaCuentas();
        req.setAttribute("cuenta", cuenta);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
    
    /*
    @POST
    public void procesarDatos(){
        CuentaBancaria acount = new CuentaBancaria();
        List<String> cuentu = new ArrayList<String>(params("motivos"));      
        
        try {
            //cuenta.rellenar(params1st());
            acount.setCuentas(cuentu);
            
            //cuenta.validar();
        } catch (IllegalArgumentException ex){
            Map error = Collections.map("error", ex.getMessage());
            respond(JsonHelper.toJsonString(error)).contentType("application/json").status(400);
            return;
        }
    }*/
}