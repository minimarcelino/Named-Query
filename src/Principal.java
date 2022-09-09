
import dao.PessoaDAO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import model.Pessoa;

public class Principal {
    public static void main(String[] args) {
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        for (int i = 0; i < 10;) 
        {
            Pessoa p = new Pessoa("Pessoa " +i, new Date(2000+i, i, 1), new BigDecimal(1000 * ++i));
            
            pessoaDAO.inserir(p);
        }
        
        //Testar a consulta
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);
        
        //System.out.println("Pessoas que o nome contém 3!");
        List<Pessoa> pessoaRetornada2 = pessoaDAO.buscarPorNome("3");
        
        //System.out.println("Pessoas que ganham mais de R$3000.00!");
        List<Pessoa> pessoaRetornada3 = pessoaDAO.buscarPorSalario(new BigDecimal(3000));
        
        
        //criar o metodo toString na classe Pessoa
        System.out.println("\nBUSCA POR ID:");
        for (Pessoa pessoa : pessoaRetornada2) {
            System.out.println(pessoa);
        }
        
        System.out.println("\nBUSCA POR ID:");
        System.out.println(pessoaRetornada);
        
        System.out.println("\nBUSCA POR NOME:");
        //System.out.println(pessoaRetornada2);
        for (Pessoa pessoa : pessoaRetornada2) 
        {
            System.out.println(pessoa);
        }
        
        System.out.println("BUSCA POR SALÁRIO");
        //System.out.println(pessoaRetornada3);
        for (Pessoa pessoa : pessoaRetornada3) 
        {
            System.out.println(pessoa);
        }
        //System.out.println(pessoaRetornada3);
    }
    
}
