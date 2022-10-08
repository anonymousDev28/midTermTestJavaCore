import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static void printSquare() {
        System.out.println("Câu 1: Viết chương trình thực hiện");
        System.out.println("In ra màn hình hình vuông *");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }

    public static void printTriangle() {
        System.out.println("In ra màn hình hình tam giác *");
        for (int i = 4; i >0 ; i--) {
            for (int j = 4; j > i-1; j--) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n-----------------------------");
    }

    public static void countWords() {
        System.out.println("Câu 2: chuỗi: \"You only live once, but if you do it right, once is enough\"");
        String str = "You only live once, but if you do it right, once is enough";
        int count = 0;
        boolean notCounted = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB
                    && str.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if('o' == str.charAt(i)){
                countO++;
            }
        }
        System.out.println("số từ trong chuỗi là: "+count);
        System.out.println("số lần kí tự 'o' xuất hiện là: "+countO);
        System.out.println("\n-----------------------------");
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkPrimeNumber() {
        System.out.println("Câu 3: Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.");
        final int MAX_VALUE = 100;
//        Random rd = new Random();

        double randomDouble = Math.random();
        randomDouble = randomDouble * 100 + 1;
        int randomInt = (int) randomDouble;
        if(isPrimeNumber(randomInt)){
            System.out.println("số "+randomInt+" là số nguyên tố");
        }else {
            System.out.println("số "+randomInt+" không là số nguyên tố");
        }
        System.out.println("\n-----------------------------");
    }

    public static void tenPrimeNums() {
        System.out.println("Câu 4: Viết chương trình thực hiện:");
        System.out.println("Liệt kê 10 số nguyên tố đầu tiên");
        int countPrimeNums = 0;
        int num = 2;
        while (countPrimeNums <10){
            if(isPrimeNumber(num)){
                System.out.println("số nguyên tố thứ "+(countPrimeNums+1)+": "+num);
                countPrimeNums++;
            }
            num++;
        }
        System.out.println("\n-----------------------------");
    }

    public static void primeNumTen() {
        System.out.println("Liệt kê các số nguyên tố nhỏ hơn 10");
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int i = 0; i < 10; i++) {
            if(isPrimeNumber(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println("\n-----------------------------");
    }

    public static void sum2Darray() {
        int sum = 0;
        System.out.println("Nhập vào số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = sc.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.println("mảng vừa nhập là: ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                System.out.printf("a[%d][%d] = %d ",i,j,a[i][j]);
            }
            System.out.println();
        }
        System.out.println("các phần tử trên đường chéo chính là : ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(i == j){
                    System.out.printf("a[%d][%d] = %d ",i,j,a[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("tổng các phần tử của mảng 2 chiều vừa nhập là: "+sum);
    }
    public static void sumMatrix() {
        System.out.println("Câu 5: Tạo mảng hai chiều và in ra các phần tử trên đường chéo chính");
        int sum = 0;
        System.out.println("Nhập vào số dòng của ma trận 1: ");
        int row1 = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trân 1: ");
        int column1 = sc.nextInt();
        int a1[][] = new int[row1][column1];
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a1[i][j] = sc.nextInt();
                if(a1[i][j] % 3 == 0){
                    sum+=a1[i][j];
                }
            }
        }
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("các phần tử trên đường chéo chính là : ");
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                if(i == j){
                    System.out.printf("a[%d][%d] = %d ",i,j,a1[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Nhập vào số dòng của ma trận 2: ");
        int row2 = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trân 2: ");
        int column2 = sc.nextInt();
        while (row2 != row1 || column2 != column1){
            System.out.println("Số dòng và số cột 2 ma trận phải bằng nhau !" +
                    "\nmời nhập lại");
            System.out.println("Nhập vào số dòng của ma trận 2: ");
            row2 = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trân 2: ");
            column2 = sc.nextInt();
        }
        int a2[][] = new int[row2][column2];
        for(int i = 0;i<row2;i++){
            for(int j = 0;j<column2;j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        sc.nextLine();
        System.out.println(" + ");
        for(int i = 0;i<row2;i++){
            for(int j = 0;j<column2;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
        int result[][] =new int[row1][column1];
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                result[i][j]=a1[i][j]+a2[i][j];
            }
        }
        System.out.println(" = ");
        for(int i = 0;i<row2;i++){
            for(int j = 0;j<column2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public  static final Pattern VALID_PHONE_NUMBER_REGEX =
            Pattern.compile("((0)+([0-9]{9})\\b)");
    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    public static boolean validatePhoneNumber(String phoneStr) {
        Matcher matcher = VALID_PHONE_NUMBER_REGEX.matcher(phoneStr);
        return matcher.find();
    }

    public static void inputInfo() {
        System.out.println("Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email và số điện thoại đó có hợp lệ không.");
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        while (!validateEmail(email)){
            System.out.println("Vui lòng nhập lại đúng định dạng email!");
            email = sc.nextLine();
        }
        System.out.println("email vừa nhập là: "+email);
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        while (!validatePhoneNumber(phoneNumber)){
            System.out.println("Vui lòng nhập lại đúng định dạng số điện thoại 10 chữ số bắt đầu bằng số 0!");
            phoneNumber = sc.nextLine();
        }
        System.out.println("Số điện thoại vừa nhập là :"+phoneNumber);
    }
    public static void main(String[] args) {
        printSquare();
        printTriangle();
        countWords();
        checkPrimeNumber();
        tenPrimeNums();
        primeNumTen();
        sumMatrix();
        inputInfo();
    }
}