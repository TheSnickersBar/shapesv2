import javax.swing.JFrame;
public class ShapeArrayDriverStudent {
	public static void main(String[] args) {
         JFrame frame = new JFrame("What is the Point");
         frame.setSize(1000, 1000);
         frame.setLocation(50,50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new ShapePanelStudent());
         frame.setVisible(true);
	}
}