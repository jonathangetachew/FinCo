package project.framework.view;

/**
 * Created by Jonathan on 2/3/2020.
 */

public class AddPersonalAccountDialog extends javax.swing.JDialog {
	protected MainWindow parentframe;

	public AddPersonalAccountDialog(MainWindow parent)
	{
		super(parent);
		parentframe=parent;

		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parses your Java file into its visual environment.
		//{{ INIT_CONTROLS
		setTitle("Add personal account");
		setModal(true);
		getContentPane().setLayout(null);
		setSize(283,303);
		setVisible(false);
		JLabel1.setText("Name");
		getContentPane().add(JLabel1);
		JLabel1.setForeground(java.awt.Color.black);
		JLabel1.setBounds(12,84,48,24);
		JLabel2.setText("Street");
		getContentPane().add(JLabel2);
		JLabel2.setForeground(java.awt.Color.black);
		JLabel2.setBounds(12,108,48,24);
		JLabel3.setText("City");
		getContentPane().add(JLabel3);
		JLabel3.setForeground(java.awt.Color.black);
		JLabel3.setBounds(12,132,48,24);
		JLabel4.setText("State");
		getContentPane().add(JLabel4);
		JLabel4.setForeground(java.awt.Color.black);
		JLabel4.setBounds(12,156,48,24);
		JLabel5.setText("Zip");
		getContentPane().add(JLabel5);
		JLabel5.setForeground(java.awt.Color.black);
		JLabel5.setBounds(12,180,48,24);
		JLabel6.setText("Email");
		getContentPane().add(JLabel6);
		JLabel6.setForeground(java.awt.Color.black);
		JLabel6.setBounds(12,204,96,24);
		getContentPane().add(JTextField_NAME);
		JTextField_NAME.setBounds(84,84,156,20);
		getContentPane().add(JTextField_CT);
		JTextField_CT.setBounds(84,132,156,20);
		getContentPane().add(JTextField_ST);
		JTextField_ST.setBounds(84,156,156,20);
		getContentPane().add(JTextField_STR);
		JTextField_STR.setBounds(84,108,156,20);
		getContentPane().add(JTextField_ZIP);
		JTextField_ZIP.setBounds(84,180,156,20);
		getContentPane().add(JTextField_EM);
		JTextField_EM.setBounds(84,204,156,20);
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(48,264,84,24);
		JButton_Cancel.setText("Cancel");
		JButton_Cancel.setActionCommand("Cancel");
		getContentPane().add(JButton_Cancel);
		JButton_Cancel.setBounds(156,264,84,24);
		getContentPane().add(JTextField_ACNR);
		JTextField_ACNR.setBounds(84,60,156,20);
		JLabel8.setText("Acc Nr");
		getContentPane().add(JLabel8);
		JLabel8.setForeground(java.awt.Color.black);
		JLabel8.setBounds(12,60,48,24);
		//}}

		//{{REGISTER_LISTENERS
		SymAction lSymAction = new SymAction();
		JButton_OK.addActionListener(lSymAction);
		JButton_Cancel.addActionListener(lSymAction);
		//}}
	}




	//{{DECLARE_CONTROLS
	public javax.swing.JLabel JLabel1 = new javax.swing.JLabel();
	public javax.swing.JLabel JLabel2 = new javax.swing.JLabel();
	public javax.swing.JLabel JLabel3 = new javax.swing.JLabel();
	public javax.swing.JLabel JLabel4 = new javax.swing.JLabel();
	public javax.swing.JLabel JLabel5 = new javax.swing.JLabel();
	public javax.swing.JLabel JLabel6 = new javax.swing.JLabel();
	public javax.swing.JTextField JTextField_NAME = new javax.swing.JTextField();
	public javax.swing.JTextField JTextField_CT = new javax.swing.JTextField();
	public javax.swing.JTextField JTextField_ST = new javax.swing.JTextField();
	public javax.swing.JTextField JTextField_STR = new javax.swing.JTextField();
	public javax.swing.JTextField JTextField_ZIP = new javax.swing.JTextField();
	public javax.swing.JTextField JTextField_EM = new javax.swing.JTextField();
	public javax.swing.JButton JButton_OK = new javax.swing.JButton();
	public javax.swing.JButton JButton_Cancel = new javax.swing.JButton();
	public javax.swing.JTextField JTextField_ACNR = new javax.swing.JTextField();
	public javax.swing.JLabel JLabel8 = new javax.swing.JLabel();
	//}}


	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButton_OK)
				JButtonOK_actionPerformed(event);
			else if (object == JButton_Cancel)
				JButtonCalcel_actionPerformed(event);
		}
	}

	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
		parentframe.setAccountNumber(JTextField_ACNR.getText());
		parentframe.setCustomerName(JTextField_NAME.getText());
		parentframe.getAddress().setStreet(JTextField_STR.getText());
		parentframe.getAddress().setCity(JTextField_CT.getText());
		parentframe.getAddress().setZip(JTextField_ZIP.getText());
		parentframe.getAddress().setState(JTextField_ST.getText());
		parentframe.setCustomerEmail(JTextField_EM.getText());
		parentframe.newAccount =true;

		// TODO: Create Personal Account Here

		dispose();
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		//make this frame invisible if Cancel button is clicked
		dispose();
	}
}