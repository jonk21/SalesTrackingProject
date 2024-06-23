import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SalesPerson> salesPeople = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter sales person name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter your sales person title: ");
            String title = scanner.nextLine();

            SalesPerson salesPerson = new SalesPerson(name, title);

            System.out.print("How many sales values will you enter for this sales person? ");
            int numSales = scanner.nextInt();

            for (int j = 0; j < numSales; j++) {
                System.out.print("Please enter sales figure for " + name + ": ");
                double sale = scanner.nextDouble();
                salesPerson.addSale(sale);
            }

            salesPeople.add(salesPerson);
            scanner.nextLine(); // consume the remaining newline
        }

        printSalesReport(salesPeople);
    }

    private static void printSalesReport(ArrayList<SalesPerson> salesPeople) {
        double companyTotalSales = 0;
        
        for (SalesPerson sp : salesPeople) {
            System.out.println("Sales person: " + sp.getName());
            System.out.println("Title: " + sp.getTitle());
            System.out.println("Total Sales: $" + sp.getTotalSales());
            System.out.println("Min Sales: $" + sp.getMinSale());
            System.out.println("Max Sales: $" + sp.getMaxSale());
            System.out.println("Average Sales: $" + sp.getAverageSales());
            System.out.println("----------------------------------------------------");

            companyTotalSales += sp.getTotalSales();
        }

        System.out.println("Company total sales: $" + companyTotalSales);
    }
}