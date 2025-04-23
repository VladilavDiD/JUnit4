public class HumanBMI {
    private double weight; // kg
    private double height; // m

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Deficit";
        if (bmi < 25) return "Norm";
        if (bmi < 30) return "Warning!";
        return "Fat";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BMI: " + String.format("%.2f", calculateBMI()) + " — " + classifyBMI();
    }
}
