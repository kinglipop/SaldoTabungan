/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan19.saldotabungan;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program menghitung saldo tabungan
 */
public class PBO11K10118904Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 2500000;
        double bunga;
        
        for (int i=1 ; i <=6 ; i++){
            bunga = saldo * 0.15;
            saldo = (int) (saldo + bunga);
            
            System.out.printf("Saldo Bulan ke-"+ i +" Rp.%,10d%n",saldo ); 
        }
    }
    
}
