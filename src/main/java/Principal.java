import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("funcionarios.csv");
        Arquivo arquivo = new Arquivo();

        //As partes comentadas foram uma das tentativas de utilizar a API Stream

        //Funcionario f = new Funcionario();
        //List<Funcionario> funcionarios = new ArrayList<>();
        try {
            List<String> conteudo = Files.readAllLines(caminho);
            conteudo.forEach(c -> {
                String vetor[] = c.split(",");
                if(vetor[3].equals("0")){
                    //nao tem filho
                }
                else{
                    try{
                       // f.setIdFuncionario(Integer.parseInt(vetor[0]));
                       // f.setQtdFilhos(Integer.parseInt(vetor[3]));
                       // f.setSalario(Double.parseDouble(vetor[4]));
                       // funcionarios.add(f);
                       arquivo.escrever(vetor);
                    } catch (Exception e) {
                       e.printStackTrace();
                    }
                }
            });
        }catch (IOException e){
            //ocorreu um erro
            System.out.println("O arquivo não existe!");
        }
        //List<Funcionario> func = funcionarios.stream().skip(1).filter(p->p.getQtdFilhos()==0).collect(Collectors.toList());
        //func.forEach(d-> System.out.println(d.getIdFuncionario()));
    }
}