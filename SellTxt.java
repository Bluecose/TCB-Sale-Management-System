import java.io.*;

public void saveInvoiceToFile(String invoiceText, String memberText, int total, int cash, int ret) {
    try {
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("sales.txt", true));

        writer.write("======================================\n");
        writer.write(memberText + "\n"); 
        writer.write(invoiceText + "\n");
        writer.write("Total: " + total + " BDT\n");
        writer.write("Cash Paid: " + cash + " BDT\n");
        writer.write("Return: " + ret + " BDT\n");
        writer.write("======================================\n");

        writer.close();
        JOptionPane.showMessageDialog(null, "Invoice saved to sales.txt!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error saving invoice: " + ex.getMessage());
    }
}
