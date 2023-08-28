package ProgSuhu;

import java.io.Console;



public class suhumain {
    public static void main(String[] args) {
        Console console = System.console();
        // if(console==null){
        //     System.err.println("Console tidak tersedia");
        //     System.exit(1);
        // }
        
        // loop
        while(true){
        System.out.println("----Program Konversi Suhu----\n--Pilihan--");
        String inputangka = console.readLine("1. Masukkan dalam Celcius (C)\n2. Masukkan dalam Fahrenheit (F)\n3. Masukkan dalam Reamur (R)\n4. Masukkan dalam Kelvin (K)\n5. Selesai (END)\n Masukkan pilihan anda : ");
        
        // konnversi dari string ke integer
        int angka = Integer.parseInt(inputangka);

        if(angka == 1){
            func.celcius();
            func.pilian();    
        }else if(angka == 2){
            func.fahren();
            func.pilian();
        }else if(angka == 3){
            func.reamur();
            func.pilian();
        }else if(angka == 4){
            func.kelvin();
            func.pilian();
        }else if(angka == 5){
            System.out.println("Terimakasih...");
            break;
        }else{
            System.out.println("Pilihan anda tidak ada dalam opsi");
            func.pilian();
        }
        
            
        }  

    }
}
