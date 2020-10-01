package mm721;
//阶乘
public class JieCheng {

    public int fac(int a){
        int s = 1;
        for (int i=1;i<=a;i++){
            s*=i;
        }
        return s;
    }

    public static void main(String[] args) {
        JieCheng jc=new JieCheng();
        System.out.println(jc.fac(3));
        int a=5,b=0;
        for (int i=1;i<=a;i++){
            b+=jc.fac(i);
        }
        System.out.println(b);
    }
}
