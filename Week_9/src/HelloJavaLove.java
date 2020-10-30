
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class HelloJavaLove extends JFrame{
	HelloJavaLove(){
        setTitle("HelloJaveLove"); // ������ �̸�
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); 
        c.add(new PanelNorth(),BorderLayout.NORTH); // North������ �г� �߰�
        c.add(new PanelCenter(),BorderLayout.CENTER); // Center�� ���� ���
        setSize(300,300);
        setVisible(true);
         
    }
    public static void main(String[] args) {
        new HelloJavaLove();
    }
     
}

class PanelNorth extends JPanel{ // NORTH�� ���� �г�
	PanelNorth(){
        setBackground(Color.LIGHT_GRAY);
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}

class PanelCenter extends JPanel{ // CENTER�� ���� �г�
	PanelCenter(){
        this.setLayout(null);
        String words[] = {"Hello", "Java", "Love"};
        int x, y;
        JLabel label;
        for(int i=0;i<3;i++) {
            x = (int)(Math.random()*200); // ���ڰ� ������ ��ǥ�� �������� ����
            y = (int)(Math.random()*200); // ���ڰ� ����� �ʵ��� �����Ӻ��� ���� ���� ����
            label = new JLabel(words[i]);
            label.setLocation(x, y); // 
            label.setSize(50,10); // label ũ�� ����
            this.add(label);
        }
    }
}