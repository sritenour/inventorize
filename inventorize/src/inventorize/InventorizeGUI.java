package inventorize;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Color;

public class InventorizeGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventorizeGUI frame = new InventorizeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InventorizeGUI() {
		setTitle("inventorize");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnProduct = new JButton("PRODUCT");
		
		JButton btnCustomer = new JButton("CUSTOMER");
		
		JButton btnVendor = new JButton("VENDOR");
		
		JButton btnOrder = new JButton("ORDER");
		
		JButton btnSales = new JButton("SALES");
		
		JButton btnReport = new JButton("REPORT");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JScrollBar scrollBar = new JScrollBar();
		
		txtSearch = new JTextField();
		txtSearch.setText("search ");
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnReport, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnSales, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnOrder, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnVendor, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnCustomer, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnProduct, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
							.addGap(28))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(26)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtSearch)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSearch))
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSearch))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnProduct)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCustomer)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnVendor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOrder)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSales)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReport)))
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
