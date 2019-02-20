import java.util.Arrays;

public class matho {
    String result[] = new String[1000];
    int numberIn[] = new int[9];
    int sumOne = -1;
    int sumTwo = -1;
    int sumThree = -1;
    int number = -1;
    int stc = 0;

    public static void main(String args[]) {
        new matho();
    }

    public matho() {
        int ss = 0;
        while (ss < 10000000) {
            s();
            save();
            ccc();
            ss++;
        }
        for (String dd : result
                ) {
            System.out.print(dd + "\n");
        }
        System.out.println("一共有"+stc+"个");
    }

    public void s() {
        for (int i = 0; i < numberIn.length; i++) {
            numberIn[i] = -1;
        }
    }

    public void save() {
        for (int j = 0; j < numberIn.length; j++) {
            number = (int) (Math.random() * 10);
            for (int k = 0; k < j; k++) {
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
//        for (int l = 0; l < numberIn.length; l++) {
//            System.out.print(numberIn[l]+"\t");
//        }
    }


    public void ccc() {
        sumOne = numberIn[0] * 100 + numberIn[1] * 10 + numberIn[2];
        sumTwo = numberIn[3] * 100 + numberIn[4] * 10 + numberIn[5];
        sumThree = numberIn[6] * 100 + numberIn[7] * 10 + numberIn[8];
//        System.out.print(sumOne + sumTwo == sumThree);
        if (sumOne + sumTwo == sumThree) {
//            System.out.print("you");
            String tmpc = sumOne + "+" + sumTwo + "=" + sumThree;
            String tmpb = sumTwo + "+" + sumOne + "=" + sumThree;
            for (int l = 0; l < result.length; l++) {
                int coun = 0;
                for (int k = 0; k < l; k++) {
                    if (result[k].equals(tmpc) || result[k].equals(tmpb)) {
                        coun = -1;
                        break;
                    }
                }
                if (result[l] == null) {
                    if (-1 != coun) {
                        result[l] = tmpc;
                        stc++;
                    }
                }
            }
        }
    }
}
