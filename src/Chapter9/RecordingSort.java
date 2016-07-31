package Chapter9;

import java.util.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class RecordingSort {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Recording[] recs = new Recording[5];

        for(int i = 0; i < recs.length; i++){
            System.out.println("Enter a song title: ");
            String title = scan.nextLine();
            System.out.println("Enter a song artist: ");
            String artist = scan.nextLine();
            System.out.println("Enter a song length (e.g., 'min.sec': ");
            double length = scan.nextDouble();
            scan.nextLine();

            recs[i] = new Recording(title, artist, length);
        }

        System.out.println("What would you like to sort on?");
        System.out.println("Enter 1 for title, 2 for artist, and 3 for length.");
        int sort = scan.nextInt();

//        trying 3 different ways to sort below
//        first sort is bubble sort
        if(sort == 1){
            int j;
            boolean flag = true;
            Recording temp;

            while ( flag ){
                flag = false;
                for ( j = 0;  j < recs.length - 1;  j++ ){
                    if ( recs [j].getTitle().compareToIgnoreCase( recs [j+1].getTitle() ) > 0 ){
                        temp = recs[j];
                        recs[j] = recs [ j+1];
                        recs[j+1] = temp;
                        flag = true;
                    }
                }
            }
        }

//        second sort is insertion sort
        else if(sort == 2){
            int a = 1;
            while(a < recs.length){
                Recording temp = recs[a];
                int b = a - 1;
                while (b >= 0 && recs[b].getArtist().compareToIgnoreCase(temp.getArtist()) > 0 ){
                    recs[b+1] = recs[b];
                    --b;
                }
                recs[b+1] = temp;
                ++a;
            }

        }

//        third sort uses compareTo method I added to Recording class
        else if(sort == 3){
            Arrays.sort(recs);
        }

        Recording.print(recs);


    }


}
