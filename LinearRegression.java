public class LinearRegression {

    // Calculate the slope (m) of the regression line
    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (double[] point : data) {
            double x = point[0];
            double y = point[1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        // Formula for slope (m): m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX^2)
        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    // Calculate the y-intercept (b) of the regression line
    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0;

        for (double[] point : data) {
            sumX += point[0];
            sumY += point[1];
        }

        // Formula for y-intercept (b): b = (sumY - m * sumX) / n
        double m = calcM(data);
        return (sumY - m * sumX) / n;
    }
}