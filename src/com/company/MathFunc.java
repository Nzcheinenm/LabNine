package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class MathFunc {
        /**
         * Максимальная длина.
         */
        private static int maxLength = 120;
        /**
         * Минимальная длина.
         */
        private static int minLength = 60;
        public String mathFunction() {

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

        void mathStream(final String num, final String strArr) {
                List<String> asd = Arrays.asList(strArr.split("," + " "));
                Stream stream = asd.stream();
                int lengthArr = strArr.length() / 3;
                long countValue = stream.filter(e -> e.equals(num)).count();
                float proc = (float) (countValue * 100) / lengthArr;
                System.out.println(num + " встречается - " + countValue
                                  + " раза или " + proc + " %");
        }

}
