package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName,passaword,newpass;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen kullanıcı değeri giriniz :");
        userName=input.nextLine();
        System.out.print("lütfen şifreyi yaznız :");
        passaword=input.nextLine();
        int newPassoword;

        if (userName.equals("Patika")&&(passaword.equals("123"))){
            System.out.println("giriş yaptınız");

        }else if(userName.equals("Patika")){
            System.out.println("şifrenizi Sıfırlamak istiyormusunuz evet ise 1 hayır ise 0 a tıklayınız");
            newPassoword= input.nextInt();
            input.nextLine();
            switch (newPassoword){
                case 1:
                    System.out.println("lütfen yeni şifrenizi yazıznız");
                    newpass= input.nextLine();
                    if (newpass.equals("123")){
                        System.out.println("şifre oluşturalamadı");


                    }else {
                        System.out.println("şifre oluşturuldu");
                    }
                    break;
                case 0:
                    System.out.println("tamam");
                    break;

            }
        }else{
            System.out.println("giriş yapamadınız");
        }


    }
}
