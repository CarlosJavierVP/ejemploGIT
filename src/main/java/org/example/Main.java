package org.example;

public class Main {
    public static void main(String[] args) {

        public static boolean esPrimo(Integer num){
            boolean primo = true;
            if (num <= 1){
                primo = false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    primo = false;
                }
            }
            return primo;
        }

        public static ArrayList<Integer> listPrimos(int first, int last){
            ArrayList <Integer> list= new ArrayList<>();
            for (int i = first; i<=last; i++){
                if (esPrimo(i)){
                    list.add(i);
                }
            }
            System.out.println(list);
            return list;
        }


        public static void main(String[] args) {
            System.out.println("BUSCADOR DE PRIMOS"+'\n'+"==================");

            int first = 1;
            int last = 1;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Escriba el número inicial (0 para salir):");
                first = sc.nextInt();
                System.out.println("Escriba el número final:");
                last = sc.nextInt();

                listPrimos(first, last);

            }while (first != 0);
            sc.close();
        }
    }
}