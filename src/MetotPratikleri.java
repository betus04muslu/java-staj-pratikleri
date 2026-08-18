public class MetotPratikleri {


        public static void main(String[] args) {
            int sayi1 = 6;
            int sayi2 = 10;

            if (isMukemmelSayi(sayi1)) {
                System.out.println(sayi1 + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi1 + " mükemmel bir sayı değildir.");
            }

            if (isMukemmelSayi(sayi2)) {
                System.out.println(sayi2 + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi2 + " mükemmel bir sayı değildir.");
            }
        }

        public static boolean isMukemmelSayi(int sayi) {
            if (sayi <= 1) {
                return false;
            }

            int toplam = 0;

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            return toplam == sayi;
        }
    }

