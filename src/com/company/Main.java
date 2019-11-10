package com.company;

public final class Main {
        private Main() {
        }

        /**
         * Создаем обьект, генер. и проверяем.
         * @param args - 0.
         */
        public static void main(final String[] args) {
                // write your code here
                MathFunc math = new MathFunc();
                String str = math.mathFunction();

                System.out.println(str);

                math.mathStream('0', str);
                math.mathStream('1', str);
                math.mathStream('2', str);
                math.mathStream('3', str);
                math.mathStream('4', str);
                math.mathStream('5', str);
                math.mathStream('6', str);
                math.mathStream('7', str);
                math.mathStream('8', str);
                math.mathStream('9', str);
        }
}
