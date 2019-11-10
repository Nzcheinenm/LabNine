package com.company;

import java.util.Arrays;


class MathFunc {
        /**
         * Максимальная длина.
         */
        private static int maxLength = 120;
        /**
         * Минимальная длина.
         */
        private static int minLength = 60;

        String mathFunction() {

                maxLength -= minLength;
                int randomNumberLength = (int) ((Math.random() * ++maxLength)
                    + minLength);

                int[] str = new int[randomNumberLength];

                System.out.println("Длина - " + randomNumberLength);
                for (int i = 0; i <= str.length - 1; i++) {
                        str[i] = (int) (Math.random() * 10);
                }
                return Arrays.toString(str);
        }

        void mathStream(final char num, final String strArr) {

                int lengthArr = strArr.length() / 3;

                long countValue = strArr.chars()
                    .mapToObj(c -> (char) c)
                    .filter(e -> e.equals(num))
                    .count();

                float procentNum = (float) (countValue * 100) / lengthArr;
                System.out.println(num + " встречается - " + countValue
                    + " раза или " + procentNum + " %");
        }

}
