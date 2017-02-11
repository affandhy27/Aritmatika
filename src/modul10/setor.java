/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

import javax.swing.JOptionPane;

/**
 *
 * @author Affandhy
 */
public class setor {

    private int saldo ;
   
    public void menabung(int bal, int s) {
    
        if(s%100!=0)
        JOptionPane.showMessageDialog(null, "Mesin ATM ridak menerima koin\n Silakan ulangi kembali", "Tranksaksi Gagal",0);
    
        
        else if(s<50000)
        JOptionPane.showMessageDialog(null, "Setor minimal Rp. 50.000, 00", "Tranksaksi Gagal",0);
    
        
        else if(s>50000)
        {
            
        saldo = bal + s ;    
        JOptionPane.showMessageDialog(null, "Saldo Anda Sebesar" + saldo);
        
        
        }
        
    }

    int getsaldo() {
    
    return saldo ;
    }

    
}
