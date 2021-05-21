import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ayda doğdunuz ?: ");
        String month = input.nextLine();

        System.out.print(month + " ayının hangi gününde doğdunuz ?: ");
        int day = input.nextInt();
        
        if (day >= 1) {
            if (day <= 30) {
                if (month.equals("Nisan") || month.equals("nisan") || month.equals("NİSAN")) {
                    if (day <= 20) {
                        System.out.println("Burcunuz: Koç");
                    } else {
                        System.out.println("Burcunuz: Boğa");
                    }
                } else if (month.equals("Şubat") || month.equals("şubat") || month.equals("ŞUBAT")) {
                    if (day<=29) {
                        if (day <= 19) {
                            System.out.println("Burcunuz: Kova");
                        } else {
                            System.out.println("Burcunuz: Balık");
                        }
                    } else {
                        System.out.println("Yanlış gün girişi. LÜtfen tekrar deneyiniz.!");
                    }
                } else if (month.equals("Haziran") || month.equals("haziran") || month.equals("HAZİRAN")) {
                    if (day <= 22) {
                        System.out.println("Burcunuz: İkizler");
                    } else {
                        System.out.println("Burcunuz: Yengeç");
                    }
                } else if (month.equals("Eylül") || month.equals("eylül") || month.equals("EYLÜL")) {
                    if (day <= 22) {
                        System.out.println("Burcunuz: Başak");
                    } else {
                        System.out.println("Burcunuz: Terazi");
                    }
                } else if (month.equals("Kasım") || month.equals("kasım") || month.equals("KASIM")) {
                    if (day <= 21) {
                        System.out.println("Burcunuz: Akrep");
                    } else {
                        System.out.println("Burcunuz: Yay");
                    }
                }
            } else {
                System.out.println("Yanlış gün girişi. Lütfen tekrar deneyiniz.!");
            }
            if (day <= 31) {
                if (month.equals("Ocak") || month.equals("ocak") || month.equals("OCAK")) {
                    if (day <= 21) {
                        System.out.println("Burcunuz: Oğlak");
                    } else {
                        System.out.println("Burcunuz: Kova");
                    }
                } else if (month.equals("Mart") || month.equals("mart") || month.equals("MART")) {
                    if (day <= 20) {
                        System.out.println("Burcunuz: Balık");
                    } else {
                        System.out.println("Burcunuz: Koç");
                    }
                } else if (month.equals("Mayıs") || month.equals("mayıs") || month.equals("MAYIS")) {
                    if (day <= 21) {
                        System.out.println("Burcunuz: Boğa");
                    } else {
                        System.out.println("Burcunuz: İkizler");
                    }
                } else if (month.equals("Temmuz") || month.equals("temmuz") || month.equals("TEMMUZ")) {
                    if (day <= 22) {
                        System.out.println("Burcunuz: Yengeç");
                    } else {
                        System.out.println("Burcunuz: Aslan");
                    }
                } else if (month.equals("Ağustos") || month.equals("ağustos") || month.equals("AĞUSTOS")) {
                    if (day <= 22) {
                        System.out.println("Burcunuz: Aslan");
                    } else {
                        System.out.println("Burcunuz: Başak");
                    }
                } else if (month.equals("Ekim") || month.equals("ekim") || month.equals("EKİM")) {
                    if (day <= 22) {
                        System.out.println("Burcunuz: Terazi");
                    } else {
                        System.out.println("Burcunuz: Akrep");
                    }
                } else if (month.equals("Aralık") || month.equals("aralık") || month.equals("ARALIK")) {
                    if (day <= 21) {
                        System.out.println("Burcunuz: Yay");
                    } else {
                        System.out.println("Burcunuz: Oğlak");
                    }
                }
            } else {
                System.out.println("Yanlış gün girişi. Lütfen tekrar deneyiniz.!");
            }
        } else {
            System.out.println("Yanlış gün girişi. LÜtfen tekrar deneyiniz.!");
        }
    }
}
