package Chapter13;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class DisplayBook {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        File myFile = new File("C:\\TestFolder\\FavoriteBook.txt");

        if(myFile.exists()){

            try{
                FileInputStream in = new FileInputStream(myFile);
                int letter;
                while ((letter = in.read()) != -1)
                {
                    System.out.print((char)letter);
                }

                in.close();
            }
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
        else{
            try{
                FileOutputStream out = new FileOutputStream(myFile);

                System.out.print("Enter your favorite book: ");
                String answer = scan.nextLine();
                for (int x=0; x < answer.length(); ++x)
                    out.write(answer.charAt(x));

                out.close();
            }
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }


        }
    }
}
