package bank;

public class bank {
    private String accout;//账户
    private int ban;//余额

    public bank(String accout, int ban) {
        this.accout = accout;
        this.ban = ban;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "bank[账号："+accout+",余额："+ban+"]";
    }

    /**
     * 存款
     */
    public synchronized void save(){
        int ban=getBan();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        ban+=100;
        setBan(ban);
        System.out.println("存款后的余额："+ban);
    }

    /***
     * 取款
     */
    public synchronized void draw(){
        int ban=getBan();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        ban-=200;
        setBan(ban);
        System.out.println("取款后的余额："+ban);
    }

}
