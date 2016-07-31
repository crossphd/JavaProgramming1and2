package Chapter13;

import java.io.File;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class FileStatistics2 {

    public static void main(String[] args){

        File file1 = new File("C:\\TestFolder\\Quote.txt");
        File file2 = new File("C:\\TestFolder\\Quote.docx");

        double f1Size = file1.length();
        double f2Size = file2.length();

        System.out.println("The size of the " + file1.getName() + " file is " + file1.length());
        System.out.println("The size of the " + file2.getName() + " file is " + file2.length());

        System.out.println("The ratio is " + Math.round(f2Size/f1Size) + " / 1");
    }




}
