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
public class tarik {

    private int saldo ;
    public void ambil(int tab, int t) {
    
        if (t%100!=0)
            JOptionPane.showMessageDialog(null, "Tidak Menerima Uang Koin","Gagal", 0);
        else{
            if(t>tab)
             JOptionPane.showMessageDialog(null, "Pengambilan Minimal Rp.50.000, 00","Gagal", 0);
            else{
           
            saldo = tab-t ;
             JOptionPane.showMessageDialog(null, "Saldo Minimal Rp.50.000, 00","Gagal", 2);
            
            
        }
            
    }
    }
    public int getsaldo() {
    return saldo ;
    }
    
}
