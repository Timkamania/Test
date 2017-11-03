public class Main {

    public static void main(String[] args) {

    fun();
    numM();
    }



    public static void fun() {

        int M[] = new int[5];
        System.out.println("Заполняет массив случайными числами");
        for(int i = 0; i < M.length; i++) {
            M[i] = (int) (Math.random()*10);
            System.out.println(M[i]);
        }

        int s = 0;
        for (int i = 0; i < M.length; i ++) {
            s = s + M[i];
        }
        System.out.println("Считаем сумму элемента массива");
        System.out.println(s);


        int max  = 0;
        for (int i = 0; i < M.length; i++) {
            if(max < M[i]) {
                max = M[i];
            }
        }

        System.out.println("Выводит максимальное значение массива");
        System.out.println(max);


        int min  = M[1];
        for (int i = 0; i < M.length; i++) {
            if(min > M[i]) {
                min = M[i];
            }
        }

        System.out.println("Выводит минимальное значение массива");
        System.out.println(min);

    }

    public static void numM() {
        System.out.println("Меняет значение переменных(без третьей переменной)");
        int a = 1;
        int b = 9;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }



}







