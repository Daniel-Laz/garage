package garage;

import java.util.Scanner;

public class MainGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;

        while (scelta != 6) {
            System.out.println(
                "\nMenu:\n" +
                "1. Inserisci Automobile\n" +
                "2. Inserisci Motocicletta\n" +
                "3. Inserisci Furgone\n" +
                "4. Estrai Veicolo\n" +
                "5. Stampa posti\n" +
                "6. Esci"
            );
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci anno: ");
                    int anno = scanner.nextInt();
                    System.out.print("Inserisci marca: ");
                    String marca = scanner.next();
                    System.out.print("Inserisci modello: ");
                    String modello = scanner.next();
                    System.out.print("Inserisci alimentazione: ");
                    String alimentazione = scanner.next();
                    System.out.print("Inserisci cilindrata: ");
                    int cilindrata = scanner.nextInt();
                    System.out.print("Inserisci numero porte: ");
                    int porte = scanner.nextInt();
                    Automobile auto = new Automobile(anno, marca, modello, alimentazione, cilindrata, porte);
                    int postoAuto = garage.inserisciNuovoVeicolo(auto);
                    System.out.println("Automobile inserita nel posto: " + postoAuto);
                    break;

                case 2:
                    System.out.print("Inserisci anno: ");
                    anno = scanner.nextInt();
                    System.out.print("Inserisci marca: ");
                    marca = scanner.next();
                    System.out.print("Inserisci modello: ");
                    modello = scanner.next();
                    System.out.print("Inserisci alimentazione: ");
                    alimentazione = scanner.next();
                    System.out.print("Inserisci cilindrata: ");
                    cilindrata = scanner.nextInt();
                    System.out.print("Inserisci tipologia: ");
                    String tipologia = scanner.next();
                    Motocicletta moto = new Motocicletta(anno, marca, modello, alimentazione, cilindrata, tipologia);
                    int postoMoto = garage.inserisciNuovoVeicolo(moto);
                    System.out.println("Motocicletta inserita nel posto: " + postoMoto);
                    break;

                case 3:
                    System.out.print("Inserisci anno: ");
                    anno = scanner.nextInt();
                    System.out.print("Inserisci marca: ");
                    marca = scanner.next();
                    System.out.print("Inserisci modello: ");
                    modello = scanner.next();
                    System.out.print("Inserisci alimentazione: ");
                    alimentazione = scanner.next();
                    System.out.print("Inserisci cilindrata: ");
                    cilindrata = scanner.nextInt();
                    System.out.print("Inserisci capacità di carico: ");
                    int capacita = scanner.nextInt();
                    Furgone furgone = new Furgone(anno, marca, modello, alimentazione, cilindrata, capacita);
                    int postoFurgone = garage.inserisciNuovoVeicolo(furgone);
                    System.out.println("Furgone inserito nel posto: " + postoFurgone);
                    break;

                case 4:
                    System.out.print("Inserisci il posto da cui estrarre il veicolo: ");
                    int posto = scanner.nextInt();
                    VeicoloAMotore veicoloEstratto = garage.estraiVeicolo(posto);
                    if (veicoloEstratto != null) {
                        System.out.println("Veicolo estratto: " + veicoloEstratto);
                    } else {
                        System.out.println("Nessun veicolo presente in quel posto.");
                    }
                    break;

                case 5:
                    garage.stampaSituazionePosti();
                    break;

                case 6:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
