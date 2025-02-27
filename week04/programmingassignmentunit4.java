package week04;
import java.util.ArrayList;
import java.util.List;

public class programmingassignmentunit4 {
    // Method to calculate the average stock price
    public static float calculateAveragePrice(int[] stockPrices) {
        int sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return (float) sum / stockPrices.length;
    }

    // Method to find the maximum stock price
    public static int findMaximumPrice(int[] stockPrices) {
        int maxPrice = stockPrices[0];
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count the occurrences of a specific price
    public static int countOccurrences(int[] stockPrices, int targetPrice) {
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static List<Integer> computeCumulativeSum(List<Integer> stockPrices) {
        List<Integer> cumulativeSumList = new ArrayList<>();
        int cumulativeSum = 0;
        for (int price : stockPrices) {
            cumulativeSum += price;
            cumulativeSumList.add(cumulativeSum);
        }
        return cumulativeSumList;
    }

    public static void main(String[] args) {
        // Sample data
        int[] stockPricesArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
        List<Integer> stockPricesList = new ArrayList<>();
        for (int price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate the average stock price
        float averagePrice = calculateAveragePrice(stockPricesArray);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find the maximum stock price
        int maxPrice = findMaximumPrice(stockPricesArray);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Count the occurrences of a specific price (e.g., 500)
        int targetPrice = 500;
        int occurrenceCount = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrenceCount);

        // Compute the cumulative sum of stock prices
        List<Integer> cumulativeSumList = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSumList);
    }
}
