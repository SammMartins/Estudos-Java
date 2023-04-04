// Importa a classe File e as classes relacionadas a datas da biblioteca Java Time
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

// Classe principal
public class Aep {
    public static void main(String arg[]){
        // Cria um objeto File que representa a pasta que será monitorada
        File folder = new File("G:\\Área de Trabalho\\Arquivos");
        

        // Verifica se a pasta existe
        if (!folder.exists()) {
            System.out.println("A pasta não existe.");
            return;
        }


        // Define o número de dias após os quais os arquivos serão excluídos
        int days = 1;

        // Loop através dos arquivos na pasta
        for (File file : folder.listFiles()) {
            // Verifica se o arquivo é um arquivo e não uma pasta
            if (file.isFile()) {
                // Obtém a data de modificação do arquivo em LocalDate
                LocalDate fileDate = LocalDate.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault());
                // Obtém a data atual em LocalDate
                LocalDate currentDate = LocalDate.now();
                // Calcula a diferença em dias entre a data atual e a data de modificação do arquivo
                int diffDays = (int) java.time.temporal.ChronoUnit.DAYS.between(fileDate, currentDate);
                // Verifica se a diferença em dias é maior ou igual ao número de dias definido
                if (diffDays >= days) {
                    // Exclui o arquivo
                    file.delete();
                }
            }
        }    
    }
    
}