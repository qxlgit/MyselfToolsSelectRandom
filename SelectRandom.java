import java.io.File;
import java.util.Random;
import java.util.Scanner;

/**
 * 2021-08-28
 * C:\Users\qinxinlong\Pictures\改
 * C:\Users\qinxinlong\Pictures\今日
 *
 * G:\新建文件夹\AV
 *
 * G:\新建文件夹\BZ
 *
 * G:\新建文件夹\Danbooru
 *
 * G:\新建文件夹\里番
 */

class SingleSelectRandom{
    public static void main(String[] args) {
        File file = new File("默认路径");
        File[] files = file.listFiles();
        if(files==null){
            System.out.println("文件不存在！"+file.getPath());
        }else{
            int js = 1;
            while(js<=1){
                System.out.println(SelectRandom.fun(files));
                js++;
            }
        }
    }
}

public class SelectRandom {
    public static void main(String[] args) {
        String path = "默认路径";

        while(true){
            System.out.println("请输入选项：\t00选项表示：退出");
            System.out.println("01选项表示：C:\\Users\\qinxinlong\\Pictures");
            System.out.println("02选项表示：G:\\新建文件夹\\AV");
            System.out.println("03选项表示：G:\\新建文件夹\\BZ");
            System.out.println("04选项表示：G:\\新建文件夹\\Danbooru");
            System.out.println("05选项表示：G:\\新建文件夹\\里番");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            System.out.println("*********************");
            switch(num){
                case "00":
                    System.exit(0);
                    break;
                case "01":
                    System.out.println("01选项表示：改\t02选项表示：今日");
                    num = scanner.next();
                    switch(num){
                        case "01":
                            path = "C:\\Users\\qinxinlong\\Pictures\\改";
                            break;
                        case "02":
                            path = "C:\\Users\\qinxinlong\\Pictures\\今日";
                            break;
                        default:
                            path = "C:\\Users\\qinxinlong\\Pictures";
                            break;
                    }
                    break;
                case "02":
                    path = "G:\\新建文件夹\\AV";
                    break;
                case "03":
                    path = "G:\\新建文件夹\\BZ";
                    break;
                case "04":
                    path = "G:\\新建文件夹\\Danbooru";
                    break;
                case "05":
                    path = "G:\\新建文件夹\\里番";
                    break;
                default:
                    System.out.println("*********************");
                    break;
            }
            File file = new File(path);
            File[] files = file.listFiles();

            if(files==null){
                System.out.println("文件不存在！"+file.getPath());
            }else{
                int js = 1;
                while(js<=5){
                    System.out.println("随机文件结果："+fun(files));
                    js++;
                    System.out.println("*********************");
                }
            }
        }
    }

    public static File fun(File[] files){
        Random random = new Random();
        System.out.println("文件数量："+files.length);
        int num = random.nextInt(files.length);

        if(files[num].isDirectory()){
            File[] temps = files[num].listFiles();
            if(temps!=null){
                return fun(temps);
            }else{
                System.out.println("该文件夹中没有文件！"+files[num].getPath());
            }
        }
        return files[num];
    }
}