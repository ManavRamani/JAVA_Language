class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor 1: Default Constructor
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Constructor 2: Parameterized Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    // Getter methods (optional)
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Setter methods (optional)
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}
class ComplexNum {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, -1.0);

        ComplexNumber sum = complex1.add(complex2);

        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
    }
}