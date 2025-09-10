
package tcb_pos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Frame extends JFrame implements ActionListener  {

    JButton BuyBtn, RmvBtn;
    JLabel totalLabel, returnLabel;
    JTextField cashField;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    JTextArea invoice;
    int total = 0;
    JTextField STextField;
    int customerCount = 1;
    int riceqty = 0 ;


    Product rice = new Product("Rice", 50);
    Product sugar = new Product("Sugar", 80);
    Product oil = new Product("Oil", 120);
    Product lentil = new Product("Lentil", 120);
    Product onion = new Product("Onion", 120);
    Product salt = new Product("Salt", 30);
    Product egg = new Product("Egg" , 120 );
    Product potato = new Product ("Potato" , 120);

    
Frame () {


       

        JFrame frame = new JFrame() ;
        frame.setSize(1200,850);
        frame.setTitle("Trading Corporation of Bangladesh POS");
        frame.setLayout(new BorderLayout());
        
        
        JPanel panel1 = new JPanel() ;
        panel1.setBackground(new Color(85,155,107,255));
        panel1.setPreferredSize(new Dimension(1200,155));
        panel1.setLayout(null);
        panel1.setOpaque(true);
        
        
        ImageIcon logo = new ImageIcon("image/govt_logo.png");
        Image Govt = logo.getImage();
        Image GovtS = Govt.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon JGovt = new ImageIcon(GovtS);
        JLabel govt = new JLabel();
        govt.setIcon(JGovt);
        govt.setBounds(50,25,200,100);
        panel1.add(govt);
        
        
        
        ImageIcon logo2 = new ImageIcon("image/tcb_logo.png");
        Image Govt2 = logo2.getImage();
        Image GovtS2 = Govt2.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        ImageIcon JGovt2 = new ImageIcon(GovtS2);
        JLabel govt2 = new JLabel();
        govt2.setIcon(JGovt2);
        govt2.setBounds(1000,25,200,100);
        panel1.add(govt2);
        
        
        
        
        
        JLabel textTitle0 = new JLabel();
        textTitle0.setText("Government of the People's Republic of Bangladesh");
        textTitle0.setBounds(390,0,700,30);
        textTitle0.setForeground(Color.white);
        textTitle0.setFont(new Font("Roboto",Font.BOLD,17));
        
        
        
        JLabel textTitle = new JLabel();
        textTitle.setText("Trading Corporation of Bangladesh (TCB)");
        textTitle.setBounds(300,-35,700,150);
        textTitle.setForeground(Color.white);
        textTitle.setFont(new Font("Roboto",Font.BOLD,30));
        
        JLabel textTitle2 = new JLabel();
        textTitle2.setText("Point Of Sale System");
        textTitle2.setBounds(500,0,700,150);
        textTitle2.setForeground(Color.white);
        textTitle2.setFont(new Font("Roboto",Font.BOLD,20));
        
        panel1.add(textTitle0);
        panel1.add(textTitle);
        panel1.add(textTitle2);
        
        
        
        
        
        
        
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(85,155,107,255));
        panel2.setLayout(null);
        panel2.setPreferredSize(new Dimension(1200,70));
        panel2.setOpaque(true);
        
        
        JLabel footer = new JLabel();
        footer.setText ("©2025 Trading Corporation of Bangladesh (TCB). All Rights Reserved.");
        footer.setBounds(5,0,900,90);
        footer.setForeground(Color.white);
        footer.setFont(new Font("Roboto",Font.BOLD,15));
        panel2.add(footer);





        
        JLabel footer2 = new JLabel();
        footer2.setText ("Powered By AIUB");
        footer2.setBounds(970,0,150,90);
        footer2.setForeground(Color.white);
        footer2.setFont(new Font("Roboto",Font.BOLD,15));
        panel2.add(footer2);




        JLabel aiubImgLabel = new JLabel();
        ImageIcon aiubImg2 = new ImageIcon("image/aiub.png");
        Image aiubImg3 = aiubImg2.getImage();
        Image aiubImg4 = aiubImg3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon aiubImg5 = new ImageIcon(aiubImg4); 
        aiubImgLabel.setIcon(aiubImg5);
        aiubImgLabel.setBounds(1100,10,50,50);
        
        panel2.add(aiubImgLabel);
        
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.white);
        panel3.setOpaque(true);
        
        JPanel TPanel = new JPanel();
        TPanel.setBackground(new Color(190,208,196,255));
        TPanel.setOpaque(true);
        TPanel.setLayout(null);
        TPanel.setBounds(0, 0, 1200, 60);
        
        JLabel Slabel = new JLabel();
        Slabel.setText("Search");
        Slabel.setForeground(Color.black);
        Slabel.setBounds(20, 5, 200, 50);
        Slabel.setFont(new Font("Roboto",Font.BOLD,20));
        TPanel.add(Slabel);
        
         STextField = new JTextField(15);
        STextField.setBounds(95, 5, 200, 50);
        STextField.setFont(new Font("Roboto",Font.PLAIN,20));
        STextField.addActionListener(this);

        TPanel.add(STextField);
        
        
        
        
        JPanel Lpanel = new JPanel();
        Lpanel.setBackground(Color.white);
        Lpanel.setOpaque(true);
        Lpanel.setLayout(null);
        Lpanel.setBounds(0, 0, 800, 540);
        
        //Product1
        JLabel riceImgLabel = new JLabel();
        ImageIcon riceImg2 = new ImageIcon("image/rice_pack.png");
        Image riceImg3 = riceImg2.getImage();
        Image riceImg4 = riceImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon riceImg5 = new ImageIcon(riceImg4); 
        riceImgLabel.setIcon(riceImg5);
        riceImgLabel.setBounds(10,100,130,130);
        
        Lpanel.add(riceImgLabel);
        
        btn1 = new JButton(rice.getName() + " - " +  rice.getPrice() + " BDT / KG");
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setBounds(10,235,150,50);
        btn1.addActionListener(this);
        
        Lpanel.add(btn1);
        //product1_end
        
        //Product2
        JLabel SugerImgLabel = new JLabel();
        ImageIcon SugerImg2 = new ImageIcon("image/suger.png");
        Image SugerImg3 = SugerImg2.getImage();
        Image SugerImg4 = SugerImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon SugerImg5 = new ImageIcon(SugerImg4); 
        SugerImgLabel.setIcon(SugerImg5);
        SugerImgLabel.setBounds(190,100,130,130);
        
        Lpanel.add(SugerImgLabel);
        
         btn2 = new JButton(sugar.getName() + " - " +  sugar.getPrice() + " BDT / KG");
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.setBounds(190,235,150,50);
        btn2.addActionListener(this);
        
        Lpanel.add(btn2);
        //product2_end
        
        
        //Product3
        JLabel OilImgLabel = new JLabel();
        ImageIcon OilImg2 = new ImageIcon("image/oil.png");
        Image OilImg3 = OilImg2.getImage();
        Image OilImg4 = OilImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon OilImg5 = new ImageIcon(OilImg4); 
        OilImgLabel.setIcon(OilImg5);
        OilImgLabel.setBounds(370,100,130,130);
        
        
        Lpanel.add(OilImgLabel);
        
         btn3 = new JButton(oil.getName() + " - " +  oil.getPrice() + " BDT / Ltr" );
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setBounds(370,235,150,50);
        btn3.addActionListener(this);
        
        Lpanel.add(btn3);
        //product3_end
        
        
        //Product4
        JLabel SaltImgLabel = new JLabel();
        ImageIcon SaltImg2 = new ImageIcon("image/salt.png");
        Image SaltImg3 = SaltImg2.getImage();
        Image SaltImg4 = SaltImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon SaltImg5 = new ImageIcon(SaltImg4); 
        SaltImgLabel.setIcon(SaltImg5);
        SaltImgLabel.setBounds(550,100,130,130);
        
        Lpanel.add(SaltImgLabel);
        
         btn4 = new JButton(salt.getName() + " - " +  salt.getPrice() + " BDT / KG");
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.setBounds(550,235,150,50);
        btn4.addActionListener(this);
        
        Lpanel.add(btn4);
        //product4_end
        
        
        //Product5
        JLabel EggImgLabel = new JLabel();
        ImageIcon EggImg2 = new ImageIcon("image/egg.png");
        Image EggImg3 = EggImg2.getImage();
        Image EggImg4 = EggImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon EggImg5 = new ImageIcon(EggImg4); 
        EggImgLabel.setIcon(EggImg5);
        EggImgLabel.setBounds(10,300,130,130);
        Lpanel.add(EggImgLabel);
        
         btn5 = new JButton(egg.getName() + " - " +  egg.getPrice() + " BDT/ 12");
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.setBounds(10,435,150,50);
        btn5.addActionListener(this);
        Lpanel.add(btn5);
        //product5_end
		
		//Product6
        JLabel AluImgLabel = new JLabel();
        ImageIcon AluImg2 = new ImageIcon("image/alu.png");
        Image AluImg3 = AluImg2.getImage();
        Image AluImg4 = AluImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon AluImg5 = new ImageIcon(AluImg4); 
        AluImgLabel.setIcon(AluImg5);
        AluImgLabel.setBounds(190,300,130,130);
        Lpanel.add(AluImgLabel);
        
         btn6 = new JButton(potato.getName() + " - " +  potato.getPrice() + " BDT / KG");
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.setBounds(190,435,160,50);
        btn6.addActionListener(this);
        Lpanel.add(btn6);
        //product6_end
		
		
		//Product7
        JLabel PeyajImgLabel = new JLabel();
        ImageIcon PeyajImg2 = new ImageIcon("image/peyaj.png");
        Image PeyajImg3 = PeyajImg2.getImage();
        Image PeyajImg4 = PeyajImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon PeyajImg5 = new ImageIcon(PeyajImg4); 
        PeyajImgLabel.setIcon(PeyajImg5);
        PeyajImgLabel.setBounds(370,300,130,130);
        Lpanel.add(PeyajImgLabel);
        
         btn7 = new JButton(onion.getName() + " - " +  onion.getPrice() + " BDT / KG");
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.setBounds(370,435,150,50);
        btn7.addActionListener(this);
        Lpanel.add(btn7);
        //product7_end
        
		
		//Product8
        JLabel DaalImgLabel = new JLabel();
        ImageIcon DaalImg2 = new ImageIcon("image/Daal.png");
        Image DaalImg3 = DaalImg2.getImage();
        Image DaalImg4 = DaalImg3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon DaalImg5 = new ImageIcon(DaalImg4); 
        DaalImgLabel.setIcon(DaalImg5);
        DaalImgLabel.setBounds(550,300,130,130);
        Lpanel.add(DaalImgLabel);
        
         btn8 = new JButton(lentil.getName() + " - " +  lentil.getPrice() + " BDT / KG");
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.setBounds(550,435,150,50);
        btn8.addActionListener(this);
        Lpanel.add(btn8);
        //product8_end
     
        
        
        
        
        
        
        
        JPanel Rpanel = new JPanel();
        Rpanel.setBackground(new Color(198,198,198,255));
        Rpanel.setOpaque(true);
		Rpanel.setLayout(null);
        Rpanel.setBounds(800, 60, 400, 540);
		
		BuyBtn = new JButton("CheckOut");
		BuyBtn.setBounds(10,470,150,50);
		BuyBtn.addActionListener(this);
		Rpanel.add(BuyBtn);
		
		RmvBtn = new JButton("ClearCart");
		RmvBtn.setBounds(190,470,150,50);
        RmvBtn.addActionListener(this);
		Rpanel.add(RmvBtn);
		
		invoice = new JTextArea();
        JScrollPane scroll = new JScrollPane(invoice);
        scroll.setBounds(10, 10, 370, 300);
        Rpanel.add(scroll);


        totalLabel = new JLabel("Total: 0");
        totalLabel.setBounds(10, 320, 200, 30);
        Rpanel.add(totalLabel);

        JLabel cash = new JLabel("Cash Given:");
        cash.setBounds(10, 360, 100, 30);
        Rpanel.add(cash);

        cashField = new JTextField();
        cashField.setBounds(120, 360, 100, 30);
        Rpanel.add(cashField);

        returnLabel = new JLabel("Return: 0");
        returnLabel.setBounds(10, 400, 200, 30);
        Rpanel.add(returnLabel);


    

         




        
        
     
        
                        


        
        
        
        panel3.add(TPanel);
        panel3.add(Lpanel);
        panel3.add(Rpanel);
        
        
        
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
        


    }   
	
	public void actionPerformed(ActionEvent e) {



    if (e.getSource() == BuyBtn) {
        int cash = 0;


            try { cash = Integer.parseInt(cashField.getText().trim()); }

            catch(Exception ex){ JOptionPane.showMessageDialog(null,"Enter valid cash amount."); 
            return; 
        }


    if(cash < total){
        JOptionPane.showMessageDialog(null, "Insufficient cash!");
        return;
    }
            int ret = cash - total;
            returnLabel.setText("Return: " + ret);
            JOptionPane.showMessageDialog(null, "Payment Successful!\nTotal Bill : " + total + " BDT" + " \nCash Paid : " + cash + " BDT" + "\nReturn Cash : "+ ret + " BDT" );

            String customer = "Customer " + customerCount;
            SellTxt(invoice.getText(), customer, total, cash, ret);

    
    invoice.setText("");
    total = 0;
    totalLabel.setText("Total: 0");
    returnLabel.setText("Return: 0");
    cashField.setText("");

    customerCount++;
   


    } 



    else if (e.getSource() == RmvBtn) {
        JOptionPane.showMessageDialog(null, "Cart Cleared!");
        invoice.setText("");
        total = 0;
        totalLabel.setText("Total: 0");
        returnLabel.setText("Return: 0");
        cashField.setText("");


    }





if (e.getSource() == btn1) {
            addItem("Rice - 50 BDT", 50);
}

else if (e.getSource() == btn2 ){
    addItem("Suger - 80 BDT", 80);
}

else if (e.getSource() == btn3 ){
    addItem("Oil - 120 BDT", 120);
}

else if (e.getSource() == btn4 ){
    addItem("Salt - 30 BDT", 30);
}

else if (e.getSource() == btn5 ){
    addItem("Egg - 120 BDT", 120);
}

else if (e.getSource() == btn6 ){
    addItem("Potato - 120 BDT", 120);
}

else if (e.getSource() == btn7 ){
    addItem("Onion - 120 BDT", 120);
}

else if (e.getSource() == btn8 ){
    addItem("Lentil - 120 BDT", 120);
}









else if (e.getSource() == STextField) {
    String khoj = STextField.getText().trim().toLowerCase();

    if (khoj.contains("rice")) {
        addItem("Rice - 50 BDT", 50);
    } else if (khoj.contains("suger") || khoj.contains("sugar")) {
        addItem("Suger - 80 BDT", 80);
    } else if (khoj.contains("oil")) {
        addItem("Oil - 120 BDT", 120);
    } else if (khoj.contains("salt")) {
        addItem("Salt - 30 BDT", 30);
    } else if (khoj.contains("egg")) {
        addItem("Egg - 120 BDT/Dozen", 120);
    } else if (khoj.contains("potato")) {
        addItem("Potato - 40 BDT/kg", 40);
    } else if (khoj.contains("onion")) {
        addItem("Onion - 60 BDT/kg", 60);
    } else if (khoj.contains("lentil") || khoj.contains("daal")) {
        addItem("Lentil - 90 BDT/kg", 90);
    } else {
        JOptionPane.showMessageDialog(null, "Product not found!");
    }

    STextField.setText(""); 
}






}


public void addItem(String item, int price) {
        invoice.append(item + "\n");
        total += price;
        totalLabel.setText("Total: " + total);
    }







public void SellTxt(String invoiceText, String customer ,int total, int cash, int ret) {
    try {
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("sales.txt", true));

        writer.write("======================================\n");
        writer.write("Customer: " + customer + "\n");
        writer.write(invoiceText + "\n");
        writer.write("Total: " + total + " BDT\n");
        writer.write("Cash Paid: " + cash + " BDT\n");
        writer.write("Return: " + ret + " BDT\n");
        writer.write("======================================\n\n");

        writer.close();
        JOptionPane.showMessageDialog(null, "Invoice saved to sales.txt");
    } 
    catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error saving invoice ");
    }
}

}