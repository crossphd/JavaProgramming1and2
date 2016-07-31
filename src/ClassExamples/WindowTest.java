package ClassExamples;

import javax.swing.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class WindowTest {

    public static void main(String[] args) {


        window();
    }

    public static void window() {
        JTextField color = new JTextField();
        JTextField noun1 = new JTextField();
        JTextField noun2 = new JTextField();
        JTextField noun3 = new JTextField();
        JTextField adjective = new JTextField();
        JTextField verb = new JTextField();

        Object[] popup = {"Enter the following:", "Color:", color, "Plural Noun:", noun1,
                "Plural Noun:", noun2, "Singular Noun:", noun3, "Adjective:", adjective,
                "Plural Verb:", verb};

        JOptionPane.showConfirmDialog(null, popup, "Window Name",
                JOptionPane.OK_CANCEL_OPTION);


    }
}
