package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAddress  extends JInternalFrame{
    private JButton neuButton;
    private JButton bearbeitenButton;
    private JButton zurückZumHauptmenüButton;
    private JTable table1;
    private JPanel panelMain;
    static final int xOffset = 30, yOffset = 30;
    static frmNewAddress frameNewAddress;
    int inset = 50;

    public frmAddress(int pWidth, int pHeight){
        super("UrbanInvoicing - Adressbuch",
                false, //resizable
                false, //closable
                false, //maximizable
                false);//iconifiable
        setSize(pWidth, pHeight);
        //frmContainer.openFrameCount = frmContainer.openFrameCount+1;
        setLocation(xOffset * 1, yOffset * 1);
        setContentPane(panelMain);
        zurückZumHauptmenüButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
