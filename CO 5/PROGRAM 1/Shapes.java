import java.awt.*;
import java.applet.*;

/*
<applet code="Shapes" width=350 height=300>
</applet>
*/

public class Shapes extends Applet{
	public void paint(Graphics g){
		g.fillOval(130,50,100,80);
		g.drawLine(80,250,200,250);
		g.fillRect(135,150,90,85);
                
	}
}
