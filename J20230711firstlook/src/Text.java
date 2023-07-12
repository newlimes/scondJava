public class Text {
    public static void main(String[] args) {
        int m = 20;
        int n;
        double b =10.55;
        float a = 10.5f;
        {
            a = (float)b;//强制转化，八位转四位
        }
        boolean t = true;
        char s = '高';
        String str =m+"";//数值转换字符串
        n = Integer.valueOf(str);//字符串转换数值
        System.out.println("n: "+n);
        System.out.println(str);
        System.out.println(s);
        System.out.println(t);
        System.out.println("Hello Word");
    }
}
