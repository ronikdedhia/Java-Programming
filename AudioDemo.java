import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AudioDemo extends Applet implements ActionListener
{
	String msg = "";
	Button Play,Loop,Stop;
	AudioClip clip;
	public void init()
	{
	clip=getAudioClip(getDocumentBase(),"bird.wav");
	Play = new Button("Play");
	Loop = new Button("Loop");
	Stop = new Button("Stop");
	add(Play);
	add(Loop);
	add(Stop);
	Play.addActionListener(this);
	Loop.addActionListener(this);
	Stop.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	String str = ae.getActionCommand();
	if(str.equals("Play"))
	{
		msg = "You pressed Play";
		clip.play();
	}
	else if(str.equals("Loop"))
	{
	msg = "You pressed Loop";
	clip.loop();
	}
	else
	{
	msg = "You pressed Stop.";
	clip.stop();
	}
repaint();
}
	public void paint(Graphics g)
	{
		g.drawString(msg, 6, 100);
	}
}