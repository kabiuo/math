public class dascf {

    int numberIn[] = new int[10];
    int number = -1;
    int n = 0;

    public static void main(String args[]) {
        new dascf();
    }

    public dascf() {
        save();
    }

    public void save() {

        // int ran=-1;
//            while (n < numberIn.length) {
        for (int j = 0; j < numberIn.length; j++) {
            number = (int) (Math.random() * 10);
            for (int k = 0; k < j; k++) {
//                    System.out.print(numberIn[k] == number);
                if (numberIn[k] == number) {
                    j--;
                    number = -1;
                    break;
                }
            }
            if (number != -1) {
                numberIn[j] = number;
            }
        }

        for (int l = 0; l < numberIn.length; l++) {
            System.out.print(numberIn[l] + "\t");
        }
//        }
    }
}
