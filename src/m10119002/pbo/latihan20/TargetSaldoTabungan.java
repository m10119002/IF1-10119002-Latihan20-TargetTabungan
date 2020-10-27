/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan20;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program target saldo tabungan
 * 
 * 
 */
public class TargetSaldoTabungan {
    
    private static String formatIt(String number) {
        int length = number.length();
        int preFL = length % 3; // preFL = preFirstLength
        int arrSize = ((length - preFL) / 3);
        
        int postFL = (preFL == 0)? 3 : preFL; // postFL = postFirstLength
        int beginIndex = 0;
        int endIndex = postFL;
        
        if(preFL > 0) arrSize += 1;
        
        String[] rawResult = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            rawResult[i] = number.substring(beginIndex, endIndex);
            endIndex += 3;
            beginIndex = endIndex-3;
        }
        return String.join(".", rawResult);
    }
    
    public static void main(String[] args) {
        int saldoAwal = 3500000;
        int saldo = saldoAwal;
        double bungaPerBulan = 0.08;
        int saldoTarget = 6000000;
        
        int i = 1;
        while (saldo <= saldoTarget) {
            saldo += (saldo*bungaPerBulan);
            String teks = "Saldo di bulan ke-".concat(Integer.toString(i))
                    .concat(" Rp. ").concat(formatIt(Integer.toString(saldo)));
            System.out.println(teks);
            i++;
        }
    }
    
}
