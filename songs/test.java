package songs;

import java.util.Scanner;

public class test {

    static playlist pl = new playlist();

    public static void main(String[] args) throws ExecptionDemo {

        pl.testplay();
        testplay();
    }

    private static void testplay() throws ExecptionDemo {
        Scanner sc = new Scanner( System.in );
        System.out.println( "--------学生信息管理系统-------" );
        System.out.println( "1 添加" );
        System.out.println( "2 显示" );
        System.out.println( "3 id查询/name查询" );
        System.out.println( "4 修改" );
        System.out.println( "5 删除" );
        System.out.println( "--------学生信息管理系统-------" );
        System.out.println( "请输入要选定的序号！" );
        int choose = sc.nextInt();
        switch (choose) {
            case 1: {
                pl.addtodoplaylist();
                testplay();
                break;
            }
            case 2: {
                pl.displayallsong();
                testplay();
                break;
            }
            case 3: {
                pl.searchsongbyid();
                testplay();
                break;
            }
            case 4: {
                pl.updatesong();
                testplay();
                break;
            }
            case 5: {
                pl.deletesong();
                testplay();
                break;
            }
            default:
                System.out.println( "输入无效即将推出" );
                testplay();
                break;
        }

    }


//    public void testplaylist() {
//        Song one = new Song("s1001", "风", "wo");
//        Song two = new Song("s1002", "花", "ww");
//        Song three = new Song("s1003", "雪", "tt");
//        Song five = new Song("s1004", "月", "rr");
//        list.add(one);
//        list.add(two);
//        list.add(three);
//        list.add(five);
//        playlist pp=new playlist("喜欢的",list);
//
////        for (int i=0;i<list.size();i++) {
////            System.out.println(list.get(i));
////        }
//        //list.remove(one);
//        System.out.println(pp.searchsongbyname("月"));
//        pp.searchsongbyid( "s1004" );
//        //pp.displayallsong();
//    }

}
