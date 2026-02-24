package Generator;
import javax.swing .*;
import java.lang.ProcessBuilder;
import java.util.Random;

public class Generator {

        public static JTextPane seedLabel = new JTextPane();

        public static void gen17(){
            Random rand = new Random();
            long seed = (long)(rand.nextDouble() * 3245185536584267267L); // Limited to long range
            seedLabel.setText(Long.toString(seed));
        }

        public static void main(String[] args){

        seedLabel.setEditable(false);
        seedLabel.setText("Seed will be printed here");

        JButton gen17 = new JButton("Generate seed (max 17char)");
        gen17.setBounds(105, 100, 250, 50);
        gen17.addActionListener(e -> gen17 ());

        JButton close = new JButton("Exit");
        close.setBounds(105, 250, 250, 50);
        close.addActionListener(e -> System.exit(0));

        seedLabel.setBounds(105, 160, 250, 30);

        JFrame main = new JFrame();
        main.setTitle("Random Seed Generator (Minecraft)");
        main.setVisible(true);
        main.setSize(500, 500);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setResizable(false);
        main.setLayout(null);
        main.add(gen17);
        main.add(close);
        main.add(seedLabel);
    }
}
