import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Graf
{	
	private static void initUI() {
        JFrame f = new JFrame("Algoritmica Grafurilor");
        //sa se inchida aplicatia atunci cand inchid fereastra
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //imi creez ob MyPanel
        f.add(new MyPanel());
        //f.add(new MyPanel());
        //setez dimensiunea ferestrei
        f.setSize(500, 500);
        //fac fereastra vizibila
        f.setVisible(true);
    }
	
	public static void main(String[] args)
	{
		//pornesc firul de executie grafic
		SwingUtilities.invokeLater(new Runnable() 
		{
            public void run() 
            {
            	initUI(); 
            }
        });
	}	
}
