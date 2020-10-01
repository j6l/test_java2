package mm721;

import java.util.Scanner;

public class Shuzudiaodong {

    public int[] cha(int[] a) {//插入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("需要插入几位");
        int jj = sc.nextInt();
        for (int i = 0; i < jj; i++) {
            System.out.println("输入第" + (i + 1) + "个数值：");
            a[i] = sc.nextInt();
        }
        return a;
    };

    public void xianshi(int[] a) {//显示数据
        System.out.println("数组a的内容为：");
        for (int n=0;n<a.length;n++) {
            if(a[n]==0)continue;
            System.out.println(a[n] + "  ");
        }
        System.out.println();
    };

    public void charu(int[] a) {//指定位置插入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("需要插入到第几位");
        int di = sc.nextInt()-1;
        System.out.println("需要插入什么数值");
        int cha = sc.nextInt();
        for (int i = di; i < 10; i++) {
            int sw;
            sw = a[i];
            a[i] = cha;
            cha = sw;
        }
        System.out.println();
    };

    public void cu(int[] a) {//查询可以被3整除的数据
        System.out.println("可以被3整除的数据：");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 3 == 0) {
                System.out.println(a[i] + "  ");
            }
        }
        System.out.println();
    };

    public void haunying() {//欢迎
        System.out.println("*******************************************");
        System.out.println("1.插入数据");
        System.out.println("2.显示数据");
        System.out.println("3.指定位置插入数据");
        System.out.println("4.查询可以被3整除的数据");
        System.out.println("5.冒泡排序");
        System.out.println("0.退出");
        System.out.println("*******************************************");
    }

    public void mao(int[] a){//冒泡排序
        int l;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    l=a[j];
                    a[j]=a[j+1];
                    a[j+1]=l;
                }
            }
        }
        xianshi(a);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        Shuzudiaodong ac = new Shuzudiaodong();
        boolean scv = true;
        do {
            ac.haunying();
            Scanner sc = new Scanner(System.in);
            int scc = sc.nextInt();
            switch (scc) {
                case 1: ac.cha(a);break;
                case 2: ac.xianshi(a); break;
                case 3: ac.charu(a);break;
                case 4: ac.cu(a); break;
                case 5: ac.mao(a); break;
                case 0: scv = false; break;
            }
        } while (scv);

    }
}
