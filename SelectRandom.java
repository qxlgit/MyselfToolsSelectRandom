import java.io.File;
import java.util.Random;
import java.util.Scanner;


class SingleSelectRandom{
    public static void main(String[] args) {
        File file = new File("Ĭ��·��");
        File[] files = file.listFiles();
        if(files==null){
            System.out.println("�ļ������ڣ�"+file.getPath());
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
        String path = "Ĭ��·��";

        while(true){
            System.out.println("������ѡ�\t00ѡ���ʾ���˳�");
            System.out.println("01ѡ���ʾ��·��1");
            System.out.println("02ѡ���ʾ��·��2");
            System.out.println("03ѡ���ʾ��·��3");
            System.out.println("04ѡ���ʾ��·��4");
            System.out.println("05ѡ���ʾ��·��5");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            System.out.println("*********************");
            switch(num){
                case "00":
                    System.exit(0);
                    break;
                case "01":
                    System.out.println("01ѡ���ʾ�����ļ���·��1\t02ѡ���ʾ�����ļ���·��2");
                    num = scanner.next();
                    switch(num){
                        case "01":
                            path = "·��";
                            break;
                        case "02":
                            path = "·��";
                            break;
                        default:
                            path = "·��";
                            break;
                    }
                    break;
                case "02":
                    path = "·��";
                    break;
                case "03":
                    path = "·��";
                    break;
                case "04":
                    path = "·��";
                    break;
                case "05":
                    path = "·��";
                    break;
                default:
                    System.out.println("*********************");
                    break;
            }
            File file = new File(path);
            File[] files = file.listFiles();

            if(files==null){
                System.out.println("�ļ������ڣ�"+file.getPath());
            }else{
                int js = 1;
                while(js<=5){
                    System.out.println("����ļ������"+fun(files));
                    js++;
                    System.out.println("*********************");
                }
            }
        }
    }

    public static File fun(File[] files){
        Random random = new Random();
        System.out.println("�ļ�������"+files.length);
        int num = random.nextInt(files.length);

        if(files[num].isDirectory()){
            File[] temps = files[num].listFiles();
            if(temps!=null){
                return fun(temps);
            }else{
                System.out.println("���ļ�����û���ļ���"+files[num].getPath());
            }
        }
        return files[num];
    }
}