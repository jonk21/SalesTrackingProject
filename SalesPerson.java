import java.util.ArrayList;
import java.util.Iterator;

public class SalesPerson {
    private String name;
    private String title;
    private ArrayList<Double> sales;

    public SalesPerson(String name, String title) {
        this.name = name;
        this.title = title;
        this.sales = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void addSale(double sale) {
        this.sales.add(sale);
    }

    public Iterator<Double> iterSales() {
        return sales.iterator();
    }

    public double getTotalSales() {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total;
    }

    public double getMinSale() {
        double min = Double.MAX_VALUE;
        for (double sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public double getMaxSale() {
        double max = Double.MIN_VALUE;
        for (double sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double getAverageSales() {
        if (sales.isEmpty()) {
            return 0;
        }
        return getTotalSales() / sales.size();
    }
}