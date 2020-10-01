package mm721;

public class maopao {
    public static void main(String[] args) {
        maopao ad = new maopao();
        int[] b={5,6,4,2,8,3,9,1,7};
        int[] c={156,1651,56,4156,312,58,51,654,11,65,41,51,65,13,1};
        ad.mao(b);
        System.out.println();
        ad.mao(c);
    }

    public void mao(int[] a) {
        int l;
        for (int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    l=a[j];
                    a[j]=a[j+1];
                    a[j+1]=l;
                }
            }
        }
        for(int n:a)System.out.println(n+"  ");
        System.out.println();
    }
}
