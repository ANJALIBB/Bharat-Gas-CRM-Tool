import gasbooking.Delivery;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static int count;
    static int bcount = 0, ccount = 0, dcount = 0, pcount = 0;
    static String dpname;

    public static void cylindercount(Delivery[] obj) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        for (Delivery delivery : obj) {
            count = 0; // initially 0
            System.out.println("in the month of " + (months[delivery.getDt_2().getMonth()]) + ":");
            System.out.println("* In" + delivery.getArea());
            if (delivery.getStatus().equals("D")) {
                count = delivery.NumberOfCylinders; // Using the getter here
            }
            System.out.println("-" + count + " cylinder delivered");

        }
        System.out.println("\n");
    }

    public static void checklatedate(Delivery[] obj) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] month = new int[12]; // 12 month so
        for (Delivery delivery : obj) {
            if (delivery.getStatus().equals("D") && delivery.getAmount() == 758.67) {
                month[delivery.getDt_2().getMonth()] += 1; // month array will hv how many late delivered there for each month
                // 0 means jan,1 -feb,2-march....
            }
        }
        for (int i = 0; i < 12; i++) {
            if (month[i] != 0) {
                System.out.println("* In" + months[i] + " there are " + month[i]);
            }
        }
        System.out.println("/n");
    }

    public static void singlecylinder(Delivery[] obj) {
        System.out.println("number of single cylinder");
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].NumberOfCylinders == 1) {
                System.out.println("customer name" + obj[i].getCustomerName());
                System.out.println("customer number" + obj[i].getCustomerMobile());
                System.out.println("gas agency name " + (i + 101));
            }
        }
        System.out.println("/n");
    }

    public static void DeliveryDetails(Delivery[] obj) {
        System.out.println("---------------delivery details--------------------------");
        System.out.println("enter the name of person");
        dpname = new Scanner(System.in).next();
        for (Delivery delivery : obj) {
            if (delivery.getStatus().equals("D") && delivery.getDelPersonName().equals(dpname)) {
                System.out.println("customer name" + delivery.getCustomerName());
                System.out.println("-" + delivery.getStreet() + "," + delivery.getArea() + "," + delivery.AgencyPincode);
            }
        }
        System.out.println("/n");
    }

    public static void printreport(Delivery[] obj) {
        System.out.println("--------------------delivery report--------------------------");
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getStatus().equals("D")) {
                dcount++;
            } else if (obj[i].getStatus().equals("B")) {
                bcount++;

            } else if (obj[i].getStatus().equals("C")) {
                ccount++;

            } else if (obj[i].getStatus().equals("P")) {
                pcount++;

            } else {
                System.out.println("status invalid");
            }
        }
        System.out.println("* Booked");
        System.out.println("-" + bcount + " booked");
        System.out.println("* Delivered");
        System.out.println("-" + dcount + " delivered");
        System.out.println("* canceled");
        System.out.println("-" + ccount + " cancelled");
        System.out.println("* pending");
        System.out.println("-" + pcount + " pending");
        System.out.println("\n");
    }

    public static void printInvoice(Delivery[] obj) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String invoiceDate = sdf.format(d);
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getStatus().equals("D")) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("INVOICE");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("gas agency code :" + 8861 + "\t\t\t" + "date of invoice : " + invoiceDate);
                System.out.println("gas agency name" + "bharat gas " + "\t\t\t" + "agency phone no" + 5678);
                System.out.println("gas connection no :" + (i + 101) + "\t\t\t" + "customer name" + obj[i].getCustomerName());
                System.out.println("Booking date" + sdf.format(obj[i].getDt_1()) + "\t\t\t" + "customer number" + obj[i].getCustomerMobile());
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("amount " + obj[i].getAmount());
                System.out.println("refund " + obj[i].getRefund());
                System.out.println("total amount" + (obj[i].getAmount() - obj[i].getRefund()));
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Delivery person name" + obj[i].getDelPersonName() + "\t\t\t" + "delivery person mobile " + obj[i].getDelPersonNumber());
                System.out.println("delivery date " + sdf.format(obj[i].getDt_2()));
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("\n\n");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("                                   Bharat gas agency                                  ");
        System.out.println("*****************************");
        Delivery delivery1 = new Delivery("John Doe", "Area1", "Street1", "1234567890", "123456", 1, "DeliveryPerson1");
        Delivery delivery2 = new Delivery("Jane Smith", "Area2", "Street2", "0987654321", "654321", 2, "DeliveryPerson2");

        // Set delivery person details
        delivery1.setDeliveryPersonDetails();
        delivery2.setDeliveryPersonDetails();

        // Get delivery person's name and number
        delivery1.getdelpername();
        System.out.println("Delivery Person");
}
}