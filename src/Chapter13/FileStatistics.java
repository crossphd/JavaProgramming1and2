package Chapter13;

import java.io.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class FileStatistics {

    public static void main(String[] args){

        File file1 = new File("C:\\TestFolder\\test.txt");

        System.out.println("The size of the " + file1.getName() + " file is " + file1.length()
                + " and was last modified " + file1.lastModified());
    }
}
