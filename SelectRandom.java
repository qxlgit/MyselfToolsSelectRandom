import java.io.File;
import java.util.Random;
import java.util.Scanner;

/**
 * 2021-08-28
 * C:\Users\qinxinlong\Pictures\��
 * C:\Users\qinxinlong\Pictures\����
 *
 * G:\�½��ļ���\AV
 *
 * G:\�½��ļ���\BZ
 *
 * G:\�½��ļ���\Danbooru
 *
 * G:\�½��ļ���\�﷬
 */

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
            System.out.println("01ѡ���ʾ��C:\\Users\\qinxinlong\\Pictures");
            System.out.println("02ѡ���ʾ��G:\\�½��ļ���\\AV");
            System.out.println("03ѡ���ʾ��G:\\�½��ļ���\\BZ");
            System.out.println("04ѡ���ʾ��G:\\�½��ļ���\\Danbooru");
            System.out.println("05ѡ���ʾ��G:\\�½��ļ���\\�﷬");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            System.out.println("*********************");
            switch(num){
                case "00":
                    System.exit(0);
                    break;
                case "01":
                    System.out.println("01ѡ���ʾ����\t02ѡ���ʾ������");
                    num = scanner.next();
                    switch(num){
                        case "01":
                            path = "C:\\Users\\qinxinlong\\Pictures\\��";
                            break;
                        case "02":
                            path = "C:\\Users\\qinxinlong\\Pictures\\����";
                            break;
                        default:
                            path = "C:\\Users\\qinxinlong\\Pictures";
                            break;
                    }
                    break;
                case "02":
                    path = "G:\\�½��ļ���\\AV";
                    break;
                case "03":
                    path = "G:\\�½��ļ���\\BZ";
                    break;
                case "04":
                    path = "G:\\�½��ļ���\\Danbooru";
                    break;
                case "05":
                    path = "G:\\�½��ļ���\\�﷬";
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