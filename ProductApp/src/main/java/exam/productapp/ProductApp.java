/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.productapp;

/**
 *
 * @author tumithobejane
 */
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class ProductApp extends JFrame {

    private JTextField txtCustomerName;
    private JComboBox<String> cmbProduct;
    private JTextField txtPrice;
    private JTextArea txtOutput;

    public ProductApp() {
        setTitle("Product App");
        setSize(420, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ----- Menu bar -----
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem processItem = new JMenuItem("Process Sale");
        JMenuItem clearItem = new JMenuItem("Clear");
        processItem.addActionListener(e -> processSale());
        clearItem.addActionListener(e -> clearFields());
        editMenu.add(processItem);
        editMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        // ----- Input fields -----
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        txtCustomerName = new JTextField();
        cmbProduct = new JComboBox<>(new String[]{
            "Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"
        });
        txtPrice = new JTextField();

        inputPanel.add(new JLabel("Customer Name:"));
        inputPanel.add(txtCustomerName);
        inputPanel.add(new JLabel("Select Product:"));
        inputPanel.add(cmbProduct);
        inputPanel.add(new JLabel("Product Price:"));
        inputPanel.add(txtPrice);

        // ----- Output area -----
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtOutput);
        scroll.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 20, 20, 20),
                BorderFactory.createEtchedBorder()));

        add(inputPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    private void processSale() {
        String customer = txtCustomerName.getText().trim();
        String product = (String) cmbProduct.getSelectedItem();

        if (customer.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the customer name.");
            return;
        }

        double price;
        try {
            price = Double.parseDouble(txtPrice.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price.");
            return;
        }

        ProductSale sale = new ProductSale(customer, product, price);

        txtOutput.setText(
                "CUSTOMER NAME: " + sale.getCustomerName()
                + "\nPRODUCT NAME: " + sale.getProductName()
                + "\nPRODUCT PRICE: R" + String.format("%.2f", sale.getPrice())
                + "\nVAT AMOUNT: R" + String.format("%.2f", sale.calculateVAT())
                + "\nCOMMISSION AMOUNT: R" + String.format("%.2f", sale.calculateCommission())
                + "\nTOTAL SALE AMOUNT: R" + String.format("%.2f", sale.calculateTotal()));
    }

    private void clearFields() {
        txtCustomerName.setText("");
        cmbProduct.setSelectedIndex(0);
        txtPrice.setText("");
        txtOutput.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProductApp().setVisible(true));
    }
}
