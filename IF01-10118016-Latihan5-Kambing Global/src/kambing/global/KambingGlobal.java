/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing.global;

/**
 * Nama : Rezky Nur Fauzi
 * NIM  : 10118016  
 * Kelas: IF-1 
 * Deskripsi Program : Menampilkan jumlah kambing menggunakan method get
 */
public class KambingGlobal {
    
    //Variabel jumlahkambing menjadi variabel instance
        int jumlahKambing = 88;
        
        //Method untuk menanmpilkan kambing
        public void getJumlahKambing(){
            System.out.println("Jumlah Kambing : " +jumlahKambing);
        }
        
        public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah : " +jumlahKambing);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
