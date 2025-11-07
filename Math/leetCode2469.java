package Math;

//23-02-2023
//2469. Convert the Temperature.
public class leetCode2469 {
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] arr = new double[2];

        double Kelvin = 0;
        double Fahrenheit = 0;

        arr[0] = Kelvin = celsius + 273.15;
        arr[1] = Fahrenheit = celsius * 1.80 + 32.00;

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
