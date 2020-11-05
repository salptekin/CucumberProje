import java.util.*;

public class Flights extends Customer{

    HashMap<String, String> flights = new HashMap<String, String>();
    List<String> from = new ArrayList<String>();
    List<String> flightTimes = new ArrayList<String>();

    public List setLocations() {
        from.add("Miami");
        from.add("Jacksonville");
        from.add("Atlanta");
        from.add("NewJersey");
        from.add("Tampa");
        from.add("Boston");
        return from;
    }

    public List<String> setTimes() {
        flightTimes.add("06:00am");
        flightTimes.add("09:30am");
        flightTimes.add("10:00am");
        flightTimes.add("01:20am");
        flightTimes.add("04:00pm");
        flightTimes.add("09:40pm");
        flightTimes.add("00:10am");
        return flightTimes;
    }

    public HashMap setFlightTimes() {
        setLocations();
        setTimes();
        flights.put(from.get(0)+"-->"+from.get(1), flightTimes.get(0));
        flights.put(from.get(1)+"-->"+from.get(0), flightTimes.get(1));
        flights.put(from.get(0)+"-->"+from.get(2), flightTimes.get(3));
        flights.put(from.get(2)+"-->"+from.get(0), flightTimes.get(4));
        flights.put(from.get(0)+"-->"+from.get(3), flightTimes.get(1));
        flights.put(from.get(3)+"-->"+from.get(0), flightTimes.get(2));
        flights.put(from.get(0)+"-->"+from.get(4), flightTimes.get(2));
        flights.put(from.get(4)+"-->"+from.get(0), flightTimes.get(3));
        flights.put(from.get(0)+"-->"+from.get(5), flightTimes.get(5));
        flights.put(from.get(5)+"-->"+from.get(0), flightTimes.get(5));
        flights.put(from.get(1)+"-->"+from.get(2), flightTimes.get(1));
        flights.put(from.get(2)+"-->"+from.get(1), flightTimes.get(2));
        flights.put(from.get(1)+"-->"+from.get(3), flightTimes.get(3));
        flights.put(from.get(3)+"-->"+from.get(1), flightTimes.get(4));
        flights.put(from.get(1)+"-->"+from.get(4), flightTimes.get(0));
        flights.put(from.get(4)+"-->"+from.get(1), flightTimes.get(1));
        flights.put(from.get(0)+"-->"+from.get(4), flightTimes.get(5));
        flights.put(from.get(1)+"-->"+from.get(5), flightTimes.get(6));
        flights.put(from.get(5)+"-->"+from.get(1), flightTimes.get(1));
        flights.put(from.get(2)+"-->"+from.get(3), flightTimes.get(0));
        flights.put(from.get(3)+"-->"+from.get(2), flightTimes.get(0));
        flights.put(from.get(2)+"-->"+from.get(4), flightTimes.get(1));
        flights.put(from.get(4)+"-->"+from.get(2), flightTimes.get(4));
        flights.put(from.get(2)+"-->"+from.get(5), flightTimes.get(5));
        flights.put(from.get(5)+"-->"+from.get(2), flightTimes.get(6));
        flights.put(from.get(3)+"-->"+from.get(4), flightTimes.get(4));
        flights.put(from.get(4)+"-->"+from.get(3), flightTimes.get(5));
        flights.put(from.get(3)+"-->"+from.get(5), flightTimes.get(3));
        flights.put(from.get(5)+"-->"+from.get(3), flightTimes.get(4));
        flights.put(from.get(4)+"-->"+from.get(5), flightTimes.get(0));
        flights.put(from.get(5)+"-->"+from.get(4), flightTimes.get(5));
        return flights;
    }

    public void selectFlight(){
        HashMap<String, String> onayliUcuslar = new HashMap<String, String>();
        setFlightTimes();
        Scanner scan = new Scanner(System.in);
        char cikis = ' ';
        String from = "";
        String to = "";
        String date = "";
        char tekYon = ' ';
        while(!(cikis=='q')){
            System.out.println("Lutfen, sadece gidis icin '1', gidis-donus icin '2' tusuna basiniz");
            tekYon = scan.next().charAt(0);
            System.out.print("Gidis Nereden: ");
            from = scan.next();
            System.out.print("Gidis Nereye: ");
            to = scan.next();
            System.out.print("Gidis Tarihi(yyyy/mm/dd): ");
            date = scan.next();

            if (flights.containsKey(from + "-->" + to)) {
                System.out.println("Gidis Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                System.out.print("Onayliyor musunuz? (E/H)");
                char onay = scan.next().toLowerCase().charAt(0);
                if(onay=='e'){
                    System.out.println("Gidis Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                    System.out.println("Gidis Ucus Numaraniz: " + setFlightNo(from, to, date));
                    onayliUcuslar.put("Gidis Ucus No:" + setFlightNo(from, to, date), "Gidis Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                }
            } else {
                System.out.println("Istediginiz locationlarda ucuslarimiz bulunmamaktadir.");
            }
            if(tekYon=='2'){
                String temp = from;
                from = to;
                to = temp;
                System.out.print("Donus Tarihi(yyyy/mm/dd): ");
                date = scan.next();
                if (flights.containsKey(from + "-->" + to)) {
                    System.out.println("Donus Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                    System.out.print("Onayliyor musunuz? (E/H)");
                    char onay = scan.next().toLowerCase().charAt(0);
                    if(onay=='e'){
                        System.out.println("Donus Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                        System.out.println("Donus Ucus Numaraniz: " + setFlightNo(from, to, date));
                        onayliUcuslar.put("Donus Ucus No:" + setFlightNo(from, to, date), "Donus Ucus Bilgileriniz:" + from + "-->" + to + " Tarih:" + date + " Saat:" + flights.get(from + "-->" + to));
                    }
                } else {
                    System.out.println("Istediginiz locationlarda ucuslarimiz bulunmamaktadir.");
                }
            }
            System.out.println("Ucus arama islemini durdurmak icin 'Q' tusuna basiniz.");
            System.out.println("Ucus arama islemine devam etmek icin herhangi bir sayi giriniz");
            cikis = scan.next().toLowerCase().charAt(0);
        }
        System.out.println(onayliUcuslar);
    }
}
