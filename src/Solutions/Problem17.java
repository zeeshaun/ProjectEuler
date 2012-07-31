package Solutions;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 */
public class Problem17 {

    private static final String numbers[] = new String[1001];
    private static final String and = "And";
    private static final String one = "One";
    private static final String two = "Two";
    private static final String three = "Three";
    private static final String four = "Four";
    private static final String five = "Five";
    private static final String six = "Six";
    private static final String seven = "Seven";
    private static final String eight = "Eight";
    private static final String nine = "Nine";
    private static final String ten = "Ten";
    private static final String eleven = "Eleven";
    private static final String twelve = "Twelve";
    private static final String thirteen = "Thirteen";
    private static final String fourteen = "Fourteen";
    private static final String fifteen = "Fifteen";
    private static final String sixteen = "Sixteen";
    private static final String seventeen = "Seventeen";
    private static final String eighteen = "Eighteen";
    private static final String nineteen = "Nineteen";
    private static final String twenty = "Twenty";
    private static final String thirty = "Thirty";
    private static final String fourty = "Forty";
    private static final String fifty = "Fifty";
    private static final String sixty = "Sixty";
    private static final String seventy = "Seventy";
    private static final String eighty = "Eighty";
    private static final String ninety = "Ninety";
    private static final String hundred = "Hundred";
    private static final String thousand = "Thousand";
    private int range;
    private String answer;

    public Problem17() {
        initNumbers();
        this.range = 1000;
        calculateBruteSolution();
    }

    public Problem17(int range) {
        initNumbers();
        this.range = range;
        calculateBruteSolution();
    }

    //Executes in 7 miliseconds
    public void calculateBruteSolution() {
        StringBuilder builder = new StringBuilder();
        for (int x = 1; x <= range; x++) {
            if(x<100){
                builder.append(getNum(x));
            } else if (x<1000) {
                builder.append(getNum(x/100)).append(hundred);
                if(x%100!=0){
                    builder.append(and).append(getNum(x%100));
                }
            } else if (x==1000) {
                builder.append(one).append(thousand);
            }
            
        }
        answer = builder.toString();
        System.out.println(answer.length()/* + ": " + answer*/);
    }
    
    public String getNum(int num) {
        StringBuilder builder = new StringBuilder();
        
        if (num <= 20 || num == 30 || num == 40 || num == 50 || num == 60 || num == 70 || num == 80 || num == 90) {
                builder.append(numbers[num]);
            } else if (num < 30) {
                builder.append(numbers[20]).append(numbers[num % 20]);
            } else if (num < 40) {
                builder.append(numbers[30]).append(numbers[num % 30]);
            } else if (num < 40) {
                builder.append(numbers[30]).append(numbers[num % 30]);
            } else if (num < 50) {
                builder.append(numbers[40]).append(numbers[num % 40]);
            } else if (num < 60) {
                builder.append(numbers[50]).append(numbers[num % 50]);
            } else if (num < 70) {
                builder.append(numbers[60]).append(numbers[num % 60]);
            } else if (num < 80) {
                builder.append(numbers[70]).append(numbers[num % 70]);
            } else if (num < 90) {
                builder.append(numbers[80]).append(numbers[num % 80]);
            } else if (num < 100) {
                builder.append(numbers[90]).append(numbers[num % 90]);
            }
        
        return builder.toString();
    }

    public void initNumbers() {
        numbers[1] = one;
        numbers[2] = two;
        numbers[3] = three;
        numbers[4] = four;
        numbers[5] = five;
        numbers[6] = six;
        numbers[7] = seven;
        numbers[8] = eight;
        numbers[9] = nine;
        numbers[10] = ten;
        numbers[11] = eleven;
        numbers[12] = twelve;
        numbers[13] = thirteen;
        numbers[14] = fourteen;
        numbers[15] = fifteen;
        numbers[16] = sixteen;
        numbers[17] = seventeen;
        numbers[18] = eighteen;
        numbers[19] = nineteen;
        numbers[20] = twenty;
        numbers[30] = thirty;
        numbers[40] = fourty;
        numbers[50] = fifty;
        numbers[60] = sixty;
        numbers[70] = seventy;
        numbers[80] = eighty;
        numbers[90] = ninety;
        numbers[100] = hundred;
        numbers[1000] = thousand;
    }
}
