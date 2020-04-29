import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            int sum =0;
            while ((line =br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum : "+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Moi nhap vao duong dan :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
