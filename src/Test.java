import java.util.Scanner;

public class Test {
    private static ClassName className;

    public static void main(String[] args) {
        className=new ClassName();
        System.out.println("Mời bạn nhập tên lớp");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        boolean isvalid=className.validate(name);
        System.out.println(isvalid);

    }
}
