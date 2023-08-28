package ProgSuhu;

import java.io.Console;

public class func {
    
    

    public static void celcius(){ 
        Console console = System.console();
        String Inputsuhu = console.readLine("Masukkann suhu dalam Celcius (C) : ");
        int suhu = Integer.parseInt(Inputsuhu);
        double ckef = (9/5)*suhu + 32;
        double cker =  (4/5)*suhu;
        double ckek = suhu + 273;
        displaycelcius(ckef, cker, ckek);
            
    }

    public static void fahren(){ 
        Console console = System.console();
        String Inputsuhu = console.readLine("Masukkann suhu dalam Fahrenheit (F) : ");
        int suhu = Integer.parseInt(Inputsuhu);
        double fkec = (5/9)*suhu - 32;
        double fker = (4/9)*suhu - 32;
        double fkek = (5/9)*(suhu-32) + 273;
        displayfahren(fkec,fker,fkek);

    }

    public static void reamur(){ 
        Console console = System.console();
        String Inputsuhu = console.readLine("Masukkann suhu dalam Reamur (R) : ");
        int suhu = Integer.parseInt(Inputsuhu);
        double rkec = (5/4)*suhu;
        double rkef = (9/4)*suhu + 32;
        double rkek = (5/4)*suhu + 273;
        displayreamur(rkec, rkef, rkek);
            
    }

    public static void kelvin(){ 
        Console console = System.console();
        String Inputsuhu = console.readLine("Masukkann suhu dalam Kelvin (K) : ");
        int suhu = Integer.parseInt(Inputsuhu);
        double kkec = suhu - 273;
        double kkef = (9/5)*(suhu-273) + 32;
        double kker = (4/5)*suhu -273;    
        displaykelvin(kkec, kkef, kker);
    }

    static void displaycelcius(double x, double y, double z){
        System.out.println("Dikonversi menjadi : ");
        System.out.println("- Fahrenheit\t: " + x + " \u00B0F" + "\n- Reamur\t: " + y + " \u00B0R" + "\n- Kelvin\t: " + z + " \u00B0K");
    }

    static void displayfahren(double x, double y, double z){
        System.out.println("Dikonversi menjadi : ");
        System.out.println("- Celcius\t: " + x + " \u00B0C" + "\n- Reamur\t: " + y + " \u00B0R" + "\n- Kelvin\t: " + z + " \u00B0K");
    }

    static void displayreamur(double x, double y, double z){
        System.out.println("Dikonversi menjadi : ");
        System.out.println("- Celcius\t: " + x + " \u00B0C" + "\n- Fahrenheit\t: " + y + " \u00B0F" + "\n- Kelvin\t: " + z + " \u00B0K");
    }

    static void displaykelvin(double x, double y, double z){
        System.out.println("Dikonversi menjadi : ");
        System.out.println("- Celcius\t: " + x + " \u00B0C" + "\n- Fahrenheit\t: " + y + " \u00B0F" + "\n- Reamur\t: " + z + " \u00B0R");
    }

    public static void pilian(){
        Console console = System.console();
        String pilih = console.readLine("Selesai atau Lanjut (Y/N) : ");
        if (pilih != null && pilih.equals("Y")) {
            System.exit(0);
        }else{
        }
    }
    

}
