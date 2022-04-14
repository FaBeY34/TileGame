import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application {
    private static boolean isCompleted = false;
    private static File file;
    private static Scanner scanner;

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Scene scene = new Scene(new BorderPane(), 400, 400);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Application level1() throws Exception {
        
        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level1.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static Application level2() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level2.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static Application level3() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level3.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static Application level4() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level4.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static Application level5() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level5.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static Application level6() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level6.txt");
        scanner = new Scanner(file);
        inputReading();

    }

    public static void inputReading() throws Exception {
        while (scanner.hasNextLine()) {
            String[] lines = scanner.nextLine().split(",");
            switch (lines[1]) {
                case "Empty":
                    boolean freeStatus = false;
                    if (lines[2].equals("Free")) {
                        freeStatus = true;
                    }
                    new Tile(Integer.parseInt(lines[0]), true, freeStatus);
                    break;
                case "Pipe":
                    new Pipe(Integer.parseInt(lines[0]), false, lines[2]);
                    break;
                case "Starter":
                    new Starter(Integer.parseInt(lines[0]), lines[2]);
                    break;
                case "End":
                    new End(Integer.parseInt(lines[0]), lines[2]);
                    break;
                case "PipeStatic":
                    new Pipe(Integer.parseInt(lines[0]), true, lines[2]);
                    break;
                default:
                    throw new Exception("Please check your txt file there may be missing spelling");
            }
        }
    }
}
