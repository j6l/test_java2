package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class playlist {
    Scanner sc = new Scanner( System.in );
    static List<Song> list = new ArrayList<Song>();

    public playlist() {

    }

    public void testplay(){
                Song one = new Song("s1001", "风", "wo");
        Song two = new Song("s1002", "花", "ww");
        Song three = new Song("s1003", "雪", "tt");
        Song five = new Song("s1004", "月", "rr");
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(five);
    }

    //添加歌曲到播放列表
    public void addtodoplaylist() {
        System.out.println( "请输入 编号" );
        String id = sc.next();
        System.out.println( "请输入 歌曲名" );
        String name = sc.next();
        System.out.println( "请输入 演唱者" );
        String singer = sc.next();
        list.add( new Song( id, name, singer ) );
    }

    //显示列表歌曲
    public void displayallsong() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get( i ) );
        }
    }

    //    通过id查询歌曲
    public void searchsongbyid() throws ExecptionDemo {
        String find = sc.next();
        boolean iiiid = true;
        for (Song temp : list) {
            if (temp.getId().equals( find ) || temp.getName().equals( find )) {
                System.out.println( "id='" + temp.getId() + '\'' +
                        ", 歌曲名='" + temp.getName() + '\'' +
                        ", 表演者='" + temp.getSinger() );
                iiiid = false;
                break;
            }
        }
        if (iiiid) {
            System.out.println( "文件未找到" );
            throw new ExecptionDemo( "文件未找到" );
        }
    }

    //修改歌曲
    public void updatesong() throws ExecptionDemo {
        System.out.println( "请输入要修改的id或者name" );
        String find = sc.next();
        boolean xxx = true;
        for (Song temp : list) {
            if (temp.getId().equals( find ) || temp.getName().equals( find )) {
                {
                    System.out.println( "请输入 id" );
                    temp.setId( sc.next() );
                    System.out.println( "请输入 name" );
                    temp.setName( sc.next() );
                    System.out.println( "请输入 yanchang" );
                    temp.setSinger( sc.next() );
                    xxx = false;
                    System.out.println( "修改成功" );
                    break;
                }
            }
            if (xxx) {
                System.out.println( "文件未找到" );
                throw new ExecptionDemo( "文件未找到" );
            }

        }
    }

    //从播放列表删除歌曲
    public void deletesong() throws ExecptionDemo {
        System.out.println( "请输入要查找的id或者name" );
        String find = sc.next();
        boolean iiiid = true;
        for (Song temp : list) {
            if (temp.getId().equals( find ) || temp.getName().equals( find )) {
                list.remove( temp );
                iiiid = false;
                System.out.println( "删除成功" );
                break;
            }
        }
        if (iiiid) {
            System.out.println( "文件未找到" );
            throw new ExecptionDemo( "文件未找到" );

        }
    }
}
