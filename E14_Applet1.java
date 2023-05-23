import java.applet.Applet;
import java.awt.Graphics;

public class E14_Applet1 extends Applet {

  @Override
  public void paint(Graphics g) {
    g.drawString("welcome", 150, 150);  }

  public void init() {
    System.out.println("init");  }

  public void start() {
    System.out.println("start");  }

  public void stop() {
    System.out.println("stop");  }

  public void destroy() {
    System.out.println("destroy");  }
}
