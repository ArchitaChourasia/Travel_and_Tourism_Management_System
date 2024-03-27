package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public  class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash(){
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1030, 750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
         thread = new Thread(this);
         thread.start();
         
        
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Splash frame = new Splash();
        
        int x=1;
        for(int i=2; i<=500; i+=10, x+=7){
            frame.setLocation(900 - ((i+x)/2), 500 - (i/2));
            frame.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        
    }
}
