public class StringCalculator {

    public int add(String input) {
        int sum=0;
        if(!input.isEmpty()) {
            String [] numbers = input.split("[, \n]");
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
