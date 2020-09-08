import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
 
 
public class Calculator extends JFrame implements ActionListener
{   private JFrame f;
    private JTextField text;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bbs,bcs,boff;
 
    public static double a=0,b=0,result=0;//static obj create kora sara value inisilize kore;
    public static int operator=0;
 
    public Calculator()
    {
        f=new JFrame("Calculator");
        text=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("*");
        bmul=new JButton("/");
        bsub=new JButton("+");
        badd=new JButton("-");
        bdec=new JButton(".");
        beq=new JButton("=");
        bbs=new JButton("BS");
        bcs=new JButton("CLR");
		boff=new JButton("OFF");
        
        text.setBounds(30,20,250,70);
        b7.setBounds(40,100,50,50);
        b8.setBounds(100,100,50,50);
        b9.setBounds(160,100,50,50);
        bdiv.setBounds(220,100,50,50);
        
        b4.setBounds(40,160,50,50);
        b5.setBounds(100,160,50,50);
        b6.setBounds(160,160,50,50);
        bmul.setBounds(220,160,50,50);
        
        b1.setBounds(40,220,50,50);
        b2.setBounds(100,220,50,50);
        b3.setBounds(160,220,50,50);
        bsub.setBounds(220,220,50,50);
        
        bdec.setBounds(40,280,50,50);
        b0.setBounds(100,280,50,50);
        beq.setBounds(160,280,50,50);
        badd.setBounds(220,280,50,50);
        
        bbs.setBounds(40,340,70,50);
        bcs.setBounds(120,340,70,50);
		boff.setBounds(200,340,70,50);
        
        f.add(text);//text ta frame er moddhe add hoise
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bbs);
        f.add(bcs);
		f.add(boff);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(330,460);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(this);//mouse click korar age pjnto pottekta button er jaoyar kaj
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bbs.addActionListener(this);
        bcs.addActionListener(this);
		boff.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)//button click korar por
    {
        if(e.getSource()==b1){                //e jdi get source b1 hoy
			
		text.setText(text.getText().concat("1"));//text(faka level).set kora text like 4,(text er sathe get text
		                                          //concat hye jabe like 456
		}
        
        if(e.getSource()==b2)
            text.setText(text.getText().concat("2"));
        
        if(e.getSource()==b3)
            text.setText(text.getText().concat("3"));
        
        if(e.getSource()==b4)
            text.setText(text.getText().concat("4"));
        
        if(e.getSource()==b5)
            text.setText(text.getText().concat("5"));
        
        if(e.getSource()==b6)
            text.setText(text.getText().concat("6"));
        
        if(e.getSource()==b7)
            text.setText(text.getText().concat("7"));
        
        if(e.getSource()==b8)
            text.setText(text.getText().concat("8"));
        
        if(e.getSource()==b9)
            text.setText(text.getText().concat("9"));
        
        if(e.getSource()==b0)
            text.setText(text.getText().concat("0"));
        
        if(e.getSource()==bdec)
            text.setText(text.getText().concat("."));
        
        if(e.getSource()==badd)             //add a gelei
        {
            a=Double.parseDouble(text.getText());//parsedouble,,value parse hye double hye jabe tai double.,
			                                      //ar double hye a te store hbe;operator wish +-*/ hbe
            operator=1;
            text.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(text.getText());
            operator=2;
            text.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(text.getText());
            operator=3;
            text.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(text.getText());
            operator=4;
            text.setText("");
        }
        
        if(e.getSource()==beq)                  //jkhn ei ==hbe
        {
            b=Double.parseDouble(text.getText());//operator er porer value ta double hbe b te store hbe
        
            switch(operator)                      //operator onujayi case cholbe
            {
                case 1: result=a-b;
                    break;
        
                case 2: result=a+b;
                    break;
        
                case 3: result=a/b;
                    break;
        
                case 4: result=a*b;
                    break;
        
                default: result=0;
            }
        
            text.setText(""+result);      //text a set hbe result ar tar age kisui thakbena that mean ""
        }
        
        if(e.getSource()==bcs)
            text.setText("0");
		
		if(e.getSource()==boff)
            text.setText("");
        
        
        if(e.getSource()==bbs)    //45678 ata thaklo akhn BS tip dile akta kome jabe ar 4567 string s a store hbe
        {   String s=text.getText();
            text.setText("");          //4567 nai hye jabe;
            for(int i=0;i<s.length()-1;i++)            //i=0,1,2,3 loop ai 3 bar ghure;length 1 kre kmte thake
            text.setText(text.getText()+s.charAt(i)); //text a set hbe get kora string er sathe concate kora
        }                                            //chatAt(i),0,1,2,3 mane 4567
    }                                               //4567 nai hbar sathe sathe abar loop theke 1 kome string 
	                                               //er sathe add hye jabe...
 
    
}

 