public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {1.5, 2.4, 5.3, -2.5, 4.1, 6.1, 7.4, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        double average = 0.0;
        boolean check = false;
        int count = 0;
        for (int i = 0; i < fractionalNums.length; i++) {
            if (fractionalNums[i] < 0) {
                check = true;
            } else if (check && fractionalNums[i ] >=0 ) {
                average += fractionalNums[i];
                count ++;
            }
        }
        System.out.println(count);
        System.out.println(average/count);

        }
    }