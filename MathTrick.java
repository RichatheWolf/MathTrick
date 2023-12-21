/** * *
 * @author Richa Limaye
 * @version 12/20/23
 * Program uses methods to manipulate integers and strings.
 */

public class MathTrick {
    public static int getRandomNum() {
        int maxNum = 999;
        int minNum = 100;
        int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        // complete the method
        while (Math.abs(firstDigit - lastDigit) < 2) {
            num = (int) (Math.random() * (maxNum - minNum + 1) + minNum);
            firstDigit = num / 100;
            lastDigit = num % 10;
        }
        return num;
    }
    public static int reverseDigits(int num) {
        int num2 = 0;
        while (num > 0) {
            num2 = num2 * 10;
            num2 += num % 10;
            num = num / 10;
        }
        return num2;
    }
    public static String replaceLtr(@org.jetbrains.annotations.NotNull String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            String num2 = str.substring(i, 1 + i);
            if (num2.equals("0")) {
                num2 = "Y";
            }
            if (num2.equals("1")) {
                num2 = "M";
            }
            if (num2.equals("2")) {
                num2 = "P";
            }
            if (num2.equals("3")) {
                num2 = "L";
            }
            if (num2.equals("4")) {
                num2 = "R";
            }
            if (num2.equals("5")) {
                num2 = "O";
            }
            if(num2.equals("6")){
                num2 = "F";
            }
            if(num2.equals("7")){
                num2 = "A";
            }
            if(num2.equals("8")){
                num2 = "I";
            }
            if(num2.equals("9")){
                num2 = "B";
            }
            string = string + num2;
        }
        return string;
    }
    public static String reverseString(String str) {
        String string2 = "";
        for(int i = str.length(); i > 0; i--){
            String num3 = str.substring(i - 1, i);
            string2 = string2 + num3;
        }
    return string2;
    }
    public static void main(String[] args){
        //1.Generate a random 3-digit number so that the first and third digits differ by more than one.
        int randDigit = getRandomNum();
        System.out.println("1. The starting number: " + randDigit);
        //2.Now reverse the digits to form a second number.
        int reverseDigit = reverseDigits(randDigit);
        System.out.println("2. The reversed number: " + reverseDigit);
        //3.Subtract the smaller number from the larger one.
        int difference = Math.abs(randDigit - reverseDigit);
        System.out.println("3. The difference is: " + difference);
        //4.Now reverse the digits in the answer you got in step 3, and add it to that number.
        int reversedDifference = reverseDigits(difference) + difference;
        System.out.println("4. The reversed number added to difference: " +reversedDifference);
        //5.Multiply by one million.
        int million = randDigit * 1000000;
        System.out.println("5. Number x one million: " + million);
        //6.Subtract 733,361,573.
        int subtract = million - 733361573;
        System.out.println("6. Number subtracted and converted to String: " +subtract);
        //7.Convert the number to a string in order to replace the numbers with letters.
        // Ex: String str = String.valueOf(myNumber);
        String str = String.valueOf(subtract);
        //Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String subtractToString = replaceLtr(str);
        System.out.println("7. Replaced string: " + subtractToString);
        //8.Now reverse the letters in the string to read your message backward.
        String reverseLetter = reverseString(subtractToString);
        System.out.println("8. Reversed string: " + reverseLetter);
    }
}
