public class label {
    public static void main(String[] args) {
        /*
         label is a  identifier or we can say it is used to name an unname block
         unnamed block can be just local bloack or conditional block or switch or loop bloacks


         */
       a: for (int i = 1; i <= 5; i++) {
            b:for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                break a;// it will terminate the a block

            }
            System.out.println();

        }
    }
}
