package swing.test;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *  PopupWindows.java
 *  Description:
 *  
 *  CreateDate: 2016年9月11日 上午12:49:04
 *  @author 马宁波
 */
public class PopupWindows {
	JFrame mainWindow;
    public PopupWindows(){
        mainWindow = new JFrame("pop up window");
        //mainWindow.setBounds(10,10,10,10);
        JButton JB = new JButton("PopUp");
        JB.addActionListener(new creatNewWindow());
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.add(JB);
        mainWindow.pack();
    }
    class creatNewWindow implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new PopupWindows().mainWindow.setBounds(100,100,100,100);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        PopupWindows popupWindows = new PopupWindows();
//        Thread.sleep(5000);
//        popupWindows.mainWindow.setVisible(false);
        
    }
}
