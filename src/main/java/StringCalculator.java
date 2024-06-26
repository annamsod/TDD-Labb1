public class StringCalculator {

    public int add(String input) throws IllegalArgumentException {
        int sum=0;
        if(!input.isEmpty()) {
            String[] numbers;
            if(input.startsWith("//")){
                char divider = input.charAt(2);
                String newString = input.substring(input.indexOf("\n")+1);
                numbers = newString.split(String.valueOf(divider));
            }
            else {
                numbers = input.split("[, \n]");
            }
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if(num<0){
                    throw new IllegalArgumentException("Negatives not allowed: " + num);
                }
                sum += num;
            }
        }
        return sum;
    }
}
