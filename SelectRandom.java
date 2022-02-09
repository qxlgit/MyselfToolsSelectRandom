import java.io.File;
import java.util.Random;
import java.util.Scanner;


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
            System.out.println("01选项表示：路径1");
            System.out.println("02选项表示：路径2");
            System.out.println("03选项表示：路径3");
            System.out.println("04选项表示：路径4");
            System.out.println("05选项表示：路径5");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            System.out.println("*********************");
            switch(num){
                case "00":
                    System.exit(0);
                    break;
                case "01":
                    System.out.println("01选项表示：子文件夹路径1\t02选项表示：子文件夹路径2");
                    num = scanner.next();
                    switch(num){
                        case "01":
                            path = "路径";
                            break;
                        case "02":
                            path = "路径";
                            break;
                        default:
                            path = "路径";
                            break;
                    }
                    break;
                case "02":
                    path = "路径";
                    break;
                case "03":
                    path = "路径";
                    break;
                case "04":
                    path = "路径";
                    break;
                case "05":
                    path = "路径";
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