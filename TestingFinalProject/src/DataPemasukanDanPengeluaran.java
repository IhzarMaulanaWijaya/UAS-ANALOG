import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataPemasukanDanPengeluaran {

	private JFrame frame;
	private JTextField textNama;
	private JTextField textNIM;
	private JTextField textBarang;
	private JTextField textPemasukan;
	private JTextField textPengeluaran;
	private JTextField textPendapatan;
	private JTextField textData1;
	private JTextField textData2;
	private JTextField textData3;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataPemasukanDanPengeluaran window = new DataPemasukanDanPengeluaran();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataPemasukanDanPengeluaran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  DATA PEMASUKAN DAN PENGELUARAN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(137, 11, 298, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel LabelNama = new JLabel("Nama Mahasiswa :");
		LabelNama.setBounds(22, 63, 120, 14);
		frame.getContentPane().add(LabelNama);
		
		textNama = new JTextField();
		textNama.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textNama.setBounds(147, 62, 351, 24);
		frame.getContentPane().add(textNama);
		textNama.setColumns(10);
		
		JLabel LabelNIM = new JLabel("NIM Mahasiswa :");
		LabelNIM.setBounds(22, 103, 95, 14);
		frame.getContentPane().add(LabelNIM);
		
		textNIM = new JTextField();
		textNIM.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textNIM.setBounds(146, 97, 175, 22);
		frame.getContentPane().add(textNIM);
		textNIM.setColumns(10);
		
		JLabel LabelBarang = new JLabel("Barang yang Dijual :");
		LabelBarang.setBounds(22, 132, 120, 14);
		frame.getContentPane().add(LabelBarang);
		
		textBarang = new JTextField();
		textBarang.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textBarang.setBounds(147, 130, 342, 24);
		frame.getContentPane().add(textBarang);
		textBarang.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PEMASUKAN BULAN INI :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 167, 192, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		textPemasukan = new JTextField();
		textPemasukan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPemasukan.setBounds(210, 167, 111, 44);
		frame.getContentPane().add(textPemasukan);
		textPemasukan.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PENGELUARAN BULAN INI :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 240, 209, 33);
		frame.getContentPane().add(lblNewLabel_4);
		
		textPengeluaran = new JTextField();
		textPengeluaran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPengeluaran.setBounds(235, 240, 105, 44);
		frame.getContentPane().add(textPengeluaran);
		textPengeluaran.setColumns(10);
		
		JButton btnNewButton = new JButton("Pendapatan");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textPengeluaran.getText());
					num2=Integer.parseInt(textPemasukan.getText());
					
					ans=num2-num1;
					textPendapatan.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Masukkan Angka Saja");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(359, 188, 120, 63);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Hasil Pendapatan :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(521, 168, 111, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		textPendapatan = new JTextField();
		textPendapatan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPendapatan.setBounds(521, 210, 111, 84);
		frame.getContentPane().add(textPendapatan);
		textPendapatan.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("CREATOR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "DIBUAT OLEH IHZAR MAULANA WIJAYA");
				JOptionPane.showMessageDialog(null, "MOHON MAAF BILA KURANG SEMPURNA");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(521, 59, 126, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Data 1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textPengeluaran.getText());
					num2=Integer.parseInt(textPemasukan.getText());
					
					ans=num2-num1;
					textData1.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Masukkan Angka Saja");
				}
			}
		});
		btnNewButton_2.setBounds(53, 303, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textData1 = new JTextField();
		textData1.setBounds(42, 336, 111, 33);
		frame.getContentPane().add(textData1);
		textData1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Data 2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textPengeluaran.getText());
					num2=Integer.parseInt(textPemasukan.getText());
					
					ans=num2-num1;
					textData2.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Masukkan Angka Saja");
				}
			}
		});
		btnNewButton_3.setBounds(196, 303, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textData2 = new JTextField();
		textData2.setBounds(183, 336, 111, 33);
		frame.getContentPane().add(textData2);
		textData2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Data 3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textPengeluaran.getText());
					num2=Integer.parseInt(textPemasukan.getText());
					
					ans=num2-num1;
					textData3.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Masukkan Angka Saja");
				}
			}
		});
		btnNewButton_4.setBounds(337, 303, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		textData3 = new JTextField();
		textData3.setText("");
		textData3.setBounds(327, 336, 108, 33);
		frame.getContentPane().add(textData3);
		textData3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total Pendapatan dari Data :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(52, 380, 192, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("Total");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int data1,data2,data3,hasil;
				try {
					data1=Integer.parseInt(textData1.getText());
					data2=Integer.parseInt(textData2.getText());
					data3=Integer.parseInt(textData3.getText());
					
					hasil=data1+data2+data3;
					textTotal.setText(Integer.toString(hasil));
				 }catch(Exception e2) {
					 JOptionPane.showMessageDialog(null, "Semua Harus Terisi");
				 }
			}
		});
		btnNewButton_5.setBounds(232, 402, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		textTotal = new JTextField();
		textTotal.setBounds(31, 403, 183, 33);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);
	}
}
