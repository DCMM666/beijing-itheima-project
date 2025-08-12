package exam;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7的日期");
        int num = sc.nextInt();
        if (num > 0 && num <= 5) {
            System.out.println("工作日");
        } else if (num == 6 || num == 7) {
            System.out.println("周末");
        } else {
//            System.out.println("您输入的数据有误");
//            return;
        }
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("您输入的数据有误");
                break;
        }
    }


}
