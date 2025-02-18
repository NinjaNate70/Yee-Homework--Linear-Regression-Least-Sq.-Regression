public class LinearRegressionRunner {
    public static void main(String[] args) {
        // Ice cream sales example data: [Temperature (x), Sales (y)]
        double[][] data = {
            {14.2, 215},
            {16.4, 325},
            {11.9, 185},
            {15.2, 332},
            {18.5, 406},
            {22.1, 522},
            {19.4, 412},
            {25.1, 614},
            {23.4, 544},
            {18.1, 421},
            {22.6, 445},
            {17.2, 408}
        };

        // Calculate slope (m) and y-intercept (b)
        double m = LinearRegression.calcM(data);
        double b = LinearRegression.calcB(data);

        // Output the results
        System.out.println("Slope (m): " + m);
        System.out.println("Y-Intercept (b): " + b);

        // Example prediction for a given temperature
        double temperature = 20.0;
        double predictedSales = m * temperature + b;
        System.out.println("Predicted sales for " + temperature + "°C: " + predictedSales);
    }
}