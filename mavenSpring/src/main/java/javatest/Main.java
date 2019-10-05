package javatest;
public class Main{

    static boolean foo(char c)
    {
        System.out.print(c);
        return true;
    }

    public static void main(String[] agrs){
        int i =0;
        for(foo('A');foo('B')&&(i<2);foo('C'))
        {
            i++;
            foo('D');
        }
    }
    private static void drink(int[] input){
        for(int i = 0; i < input.length; i++){
            int n = 0;
            int rest = input[i];
            if(rest == 0)
                break;
            while(rest>1){
                if(rest==2){
                    n++;
                    break;
                }
                int t = rest/3;
                n += t;
                rest = t + rest % 3;
            }
            System.out.println(n);
        }
    }
}
