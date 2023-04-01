

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Scanner;

public class TaslakClass {

    /*
    Kurallar:
    ---Lütfen kendi branch'ınızda işiniz tamamlandığında github'a push etmeden önce methodunuz için ayrılan alanın
    taslak class'taki ile uyumlu olup olumadığını kontrol ediniz.
    Alan yeterli değilse alana uygun bir kod yazınız. Alanın artırılması talebinizi team lead'e iletiniz.
    --Methodunuzun içine en üst kısma medhodunuz fonksiyonu hakkında kısa öz bir açıklama yazınız.
    -- pull yaptiktan sonra size verilen alan dogru degilse bos satir silerek yada atlayarak ilgili satira geliniz

    ----GitHub---
    --Master brach'ini pull ediniz.
    --Kendi brach'iza gecip master brach'ini kendi branch'iniaza cekiniz.
    --Kendi branch'inizda calisip,Git add . ve git commit -m"VersiyonAdiniz " yapiniz.
    --Kendi branch'inizi push ediniz.

 */


    static Scanner input = new Scanner(System.in);
    static WebDriver chromeDriver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

    //static WebDriver edgeDriver =  new EdgeDriver();
    public static void main(String[] args) {

        System.out.println("QA01 SELENIM PROJE ÇALIŞMA SAYFASI");
        System.out.println("\n1- Aykut" +
                "\n2- Gül" +
                "\n3- Hamit" +
                "\n4- Kübra" +
                "\n5- Mehmet" +
                "\n6- Mustafa" +
                "\n7- Nihat" +
                "\n8- Ömer" +
                "\n9- Remziye" +
                "\n10- Sevil");
        System.out.println("Tercihiniz...");
        String tercih = input.next();

        switch (tercih) {

            case "1":
                aykutMethod(); //
                break;
            case "2":
                gulMethod(); //
                break;
            case "3":
                hamitMethod(); //
                break;
            case "4":
                kubraMethod(); //
                break;
            case "5":
                sevilMethod();
                break;
            case "6":
                mustafaMethod(); //
                break;
            case "7":
                nihatMethod(); //
                break;
            case "8":
                omerMethod(); //
                break;
            case "9":
                remziyeMethod(); //
                break;
            case "0":
                break;
            default:
                System.out.println("Hatali giris");
        }


    }


    public static void aykutMethod() {  //90-110
        System.out.println("aykut01");


















    }

    public static void gulMethod() { //112 -132



















    }

    public static void hamitMethod() { //134-154



















    }

    public static void kubraMethod() { //156-176



















    }

    public static void sevilMethod() { //178-198




















    }
    public static void mustafaMethod() { //200-220
    //google'a gider, arama çubuğuna youtube yazar,tıklar
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        chromeDriver.get("https://google.com/");
        WebElement googleBar = chromeDriver.findElement(By.xpath("//input[@title='Ara']"));
        googleBar.sendKeys("You Tube");
        googleBar.submit();












    }

    public static void nihatMethod() { //222-242



















}
    public static void omerMethod() { //243-263



















    }

    public static void remziyeMethod() { //265-285



















    }



}


