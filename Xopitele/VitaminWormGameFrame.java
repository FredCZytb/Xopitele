import javax.swing.JFrame;

public class VitaminWormGameFrame extends JFrame{
    VitaminWormGameFrame(){
        this.add(new VitaminWormPanel());
        this.setTitle("Xopitele - Game Running - 600x600 Units 25 - Screen Units 14400");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}