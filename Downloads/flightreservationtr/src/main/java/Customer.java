import java.util.*;

public class Customer{
    private String name;
    private String customerId;
    private static int customerPassword = 3000;
    private static int id = 1000;
    private static int flightNo = 9000;

    Scanner scan = new Scanner(System.in);
    private static HashMap<String, String> customerNamePwd = new HashMap<String, String>();
    private static HashMap<String, String> customerNameId = new HashMap<String, String>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        id++;
        String arr[] = name.split(" ");
        this.customerId = "" + arr[0].charAt(0) + arr[1].charAt(0) + id;
    }
    public int getCustomerPassword() {
        return customerPassword;
    }
    public void setCustomerPassword(int customerPassword) {
        this.customerPassword = customerPassword;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Customer.id = id;
    }

    public void addCustomers(){
        customerNamePwd.put(getName(), String.valueOf(getCustomerPassword()));
        customerNameId.put(getName(), getCustomerId());
    }

    public void signIn(){
        do {
            System.out.println("Musteri eklemek ister misiniz? (E/H)");
            char onay = scan.nextLine().toLowerCase().charAt(0);
            if(onay == 'h'){
                break;
            }else if(onay == 'e'){
                System.out.print("Lutfen musteri ismini giriniz: ");
                setName(scan.nextLine());
                setCustomerId(customerId);
                setCustomerPassword(++customerPassword);
                addCustomers();
            }else{
                System.out.println("Lutfen 'E' veya 'H' harflerinden birini giriniz...");
            }
        }while(true);
        System.out.println("Passwords: " + customerNamePwd);
        System.out.println("Customer Id's: " + customerNameId);
    }

    public void updatePassword(){
        String newPwd = "";
        String musteriNo = "";
        String isim = "";
        do {
            System.out.println("Password'u update etmek icin tam isminizi giriniz.\nCikmak icin 'Q' tusuna basiniz.");
            isim = scan.nextLine();
            if (isim.equalsIgnoreCase("Q")) {
                System.out.println("Passwordunuz update edilmemistir");
                break;
            } else if (customerNameId.containsKey(isim)) {
                System.out.println("Musteri numaranizi giriniz");
                musteriNo = scan.nextLine();
                if (customerNameId.containsValue(musteriNo)) {
                    System.out.print("Yeni passwordu giriniz: ");
                    newPwd = scan.next();
                } else {
                    System.out.println("Musteri no kayitlarda bulunmamaktadir...");
                }
            } else {
                System.out.println("Musteri ismi kayitlarda bulunmamaktadir...");
            }
            String id = customerNameId.get(isim);
            if (id.equals(musteriNo)) {
                customerNamePwd.put(isim, newPwd);
                break;
            } else {
                System.out.println("Kayitlarda bulunamadiniz...");
            }
        }while(true);
        if(!isim.equalsIgnoreCase("Q")) {
            System.out.println("Sn. " + isim + " yeni passwordunuz: " + customerNamePwd.get(isim));
        }
        System.out.println("Passwords: " + customerNamePwd);
        System.out.println("Customer Id's: " + customerNameId);
    }

    public String setFlightNo(String from, String to, String date){
        String flightNumber = "" + from.charAt(0) + to.charAt(0) + date.substring(2,4) + date.substring(5,7) + date.substring(8);
        return flightNumber;
    }
}
