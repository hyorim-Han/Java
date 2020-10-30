
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class HelloJavaLove extends JFrame{
	HelloJavaLove(){
        setTitle("HelloJaveLove"); // 프레임 이름
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); 
        c.add(new PanelNorth(),BorderLayout.NORTH); // North영역에 패널 추가
        c.add(new PanelCenter(),BorderLayout.CENTER); // Center에 글자 출력
        setSize(300,300);
        setVisible(true);
         
    }
    public static void main(String[] args) {
        new HelloJavaLove();
    }
     
}

class PanelNorth extends JPanel{ // NORTH에 붙일 패널
	PanelNorth(){
        setBackground(Color.LIGHT_GRAY);
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}

class PanelCenter extends JPanel{ // CENTER에 붙일 패널
	PanelCenter(){
        this.setLayout(null);
        String words[] = {"Hello", "Java", "Love"};
        int x, y;
        JLabel label;
        for(int i=0;i<3;i++) {
            x = (int)(Math.random()*200); // 글자가 쓰여질 좌표를 랜덤으로 설정
            y = (int)(Math.random()*200); // 글자가 벗어나지 않도록 프레임보다 작은 범위 설정
            label = new JLabel(words[i]);
            label.setLocation(x, y); // 
            label.setSize(50,10); // label 크기 설정
            this.add(label);
        }
    }
}