package bank;

public class test {
    public static void main(String[] args) {
        bank one=new bank("1001",1000);//创建账户
        save sa=new save(one);//实例化存款
        draw dr=new draw(one);//实例化取款
        Thread sat=new Thread(sa);
        Thread drt=new Thread(dr);
        Thread drt2=new Thread(dr);
        drt.start();//调用一次取款
        drt2.start();//第二次调用取款
        sat.start();//调用存款
        try {
            //强行占用cpu优先运行
            drt.join();
            drt2.join();
            sat.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(one);//打印账户详情

    }
}
