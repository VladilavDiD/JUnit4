public class Main {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse(3, 2);

        // Test area
        double expectedArea = Math.PI * 3 * 2;
        System.out.println("Test area: " + (Math.abs(ellipse1.area() - expectedArea) < 0.001 ? "PASSED" : "FAILED"));

        // Test perimeter
        double expectedPerimeter = Math.PI * (3 * (3 + 2) - Math.sqrt((3 * 3 + 2) * (3 + 3 * 2)));
        System.out.println("Test perimeter: " + (Math.abs(ellipse1.perimeterApprox() - expectedPerimeter) < 0.001 ? "PASSED" : "FAILED"));

        // Test isCircle true
        Ellipse ellipse2 = new Ellipse(2, 2);
        System.out.println("Test isCircle true: " + (ellipse2.isCircle() ? "PASSED" : "FAILED"));

        // Test isCircle false
        Ellipse ellipse3 = new Ellipse(2, 3);
        System.out.println("Test isCircle false: " + (!ellipse3.isCircle() ? "PASSED" : "FAILED"));

        // Test describe
        String description = ellipse1.describe();
        System.out.println("Test describe: " + (description.equals("Ellipse with a = 3.00 and b = 2.00") ? "PASSED" : "FAILED"));
    }
}
