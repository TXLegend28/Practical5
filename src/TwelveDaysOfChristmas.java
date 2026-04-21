public class TwelveDaysOfChristmas {

    public static void main(String[] args) {


        String[] days = {
                "first", "second", "third", "fourth", "fifth", "sixth",
                "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };


        for (int day = 0; day < 12; day++) {


            System.out.println();
            switch (day) {
                case 0:
                    System.out.print("On the " + days[0] + " day of Christmas,\n");
                    break;
                case 1:
                    System.out.print("On the " + days[1] + " day of Christmas,\n");
                    break;
                case 2:
                    System.out.print("On the " + days[2] + " day of Christmas,\n");
                    break;
                case 3:
                    System.out.print("On the " + days[3] + " day of Christmas,\n");
                    break;
                case 4:
                    System.out.print("On the " + days[4] + " day of Christmas,\n");
                    break;
                case 5:
                    System.out.print("On the " + days[5] + " day of Christmas,\n");
                    break;
                case 6:
                    System.out.print("On the " + days[6] + " day of Christmas,\n");
                    break;
                case 7:
                    System.out.print("On the " + days[7] + " day of Christmas,\n");
                    break;
                case 8:
                    System.out.print("On the " + days[8] + " day of Christmas,\n");
                    break;
                case 9:
                    System.out.print("On the " + days[9] + " day of Christmas,\n");
                    break;
                case 10:
                    System.out.print("On the " + days[10] + " day of Christmas,\n");
                    break;
                case 11:
                    System.out.print("On the " + days[11] + " day of Christmas,\n");
                    break;
            }

            System.out.println("my true love sent to me");


            switch (day) {
                case 11:
                    System.out.println("Twelve drummers drumming,");
                case 10:
                    System.out.println("Eleven pipers piping,");
                case 9:
                    System.out.println("Ten lords a-leaping,");
                case 8:
                    System.out.println("Nine ladies dancing,");
                case 7:
                    System.out.println("Eight maids a-milking,");
                case 6:
                    System.out.println("Seven swans a-swimming,");
                case 5:
                    System.out.println("Six geese a-laying,");
                case 4:
                    System.out.println("Five golden rings,");
                case 3:
                    System.out.println("Four calling birds,");
                case 2:
                    System.out.println("Three French hens,");
                case 1:
                    System.out.println("Two turtle doves, and");
                case 0:
                    if (day == 0) {
                        System.out.println("A partridge in a pear tree.");
                    } else {
                        System.out.println("A partridge in a pear tree.");
                    }
                    break;
            }
        }
    }
}