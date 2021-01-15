import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int Papanoel =0;
        int Renos =0;
        int Elfo =0;
        int Ronda =0;
        try {
            Scanner input = new Scanner(new File("C:/Users/josep/IdeaProjects/PAPANOEL/src/Santako.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Ronda++;
                Papanoel=0;
                Renos =0;
                Elfo =0;
                if (line.contains("*<]:-DOo")){
                    Papanoel++;
                }
                else if (line.contains("<]:-D")){
                    Elfo++;
                }

                if (line.contains(">:o)")){
                    Renos++;
                }
                System.out.println(Ronda);
                if (Papanoel >0){
                    System.out.println("DE PAPANOEL HAY "+ Papanoel);
                }

                if (Renos >0){
                    System.out.println("DE RENOS HAY "+ Renos);
                }

                if (Elfo >0){
                    System.out.println(" Y DE ELFOS HAY "+ Elfo);

                }
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
