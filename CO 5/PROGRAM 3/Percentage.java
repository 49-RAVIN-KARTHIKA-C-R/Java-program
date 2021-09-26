// 3. Find the percentage of marks obtained by a student in 5 subjects. Display a happy face if he secures above 50% or a sad face if otherwise.  

import java.awt.*;
import java.applet.*;
/*
<applet code="Percentage" width=500 height=500>
<param name="a" value="50">
<param name="b" value="50">
<param name="c" value="50">
<param name="d" value="50">
<param name="e" value="50">
</applet>
*/
public class Percentage extends Applet {
  int a,b,c,d,e;
  float sum,percent;
  String str;

  public void start() {
    String s1;

    s1 = getParameter("a");
    a = Integer.parseInt(s1);

    s1 = getParameter("b");
    b = Integer.parseInt(s1);

    s1 = getParameter("c");
    c = Integer.parseInt(s1);

    s1 = getParameter("d");
    d = Integer.parseInt(s1);

    s1 = getParameter("e");
    e = Integer.parseInt(s1);
  }

  public void paint(Graphics g) {
    sum = a + b + c + d + e;
    percent = sum / 500 * 100;
    if (percent >= 50) {
      g.drawOval(80, 70, 150, 150);

      g.setColor(Color.BLACK);
      g.fillOval(120, 120, 15, 15);
      g.fillOval(170, 120, 15, 15);

      g.drawArc(130, 180, 50, 20, 180, 180);
    } else {
      g.drawOval(80, 70, 150, 150);
      g.setColor(Color.BLACK);
      g.fillOval(120, 120, 15, 15);
      g.fillOval(170, 120, 15, 15);

      g.drawArc(130, 180, 50, 20, 180, -180);
    }

    g.drawString("Mark in Maths out of 100   " + a, 10, 300);
    g.drawString("Mark in English out of 100   " + b, 10, 350);
    g.drawString("Mark in Chemistry out of 100   " + c, 10, 400);
    g.drawString("Mark in Physics out of 100   " + d, 10, 450);
    g.drawString("Mark in Biology out of 100   " + e, 10, 500);
    g.drawString("Percentage " + percent, 10, 550);

  }
}