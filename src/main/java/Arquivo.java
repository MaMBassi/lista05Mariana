import java.io.*;

public class Arquivo {
    public void escrever(String vetor[]){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try{
            os = new FileOutputStream("func_filtrado.csv",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write(vetor[0]);
            bw.write(",");
            bw.write(vetor[3]);
            bw.write(",");
            bw.write(vetor[4]);
            bw.newLine();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}