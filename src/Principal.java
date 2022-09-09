
import dao.PessoaDAO;
import java.math.BigDecimal;
import java.util.Date;
import model.Pessoa;

public class Principal {
    public static void main(String[] args) {
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        for (int i = 0; i < 10;) 
        {
            Pessoa p = new Pessoa("Pessoa " +i, new Date(), new BigDecimal(1000 * ++i));
            
            pessoaDAO.inserir(p);
        }
        
        //Testar a consulta
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);
        
        //criar o metodo toString na classe Pessoa
        System.out.println(pessoaRetornada);
    }
    
}
