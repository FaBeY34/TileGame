import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Game extends Application {
    private static boolean isCompleted = false;
    private static File file;
    private static Scanner scanner;
    private static ArrayList<Object> objects = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {
        try {
            // starter menu
            StackPane root = new StackPane();

            // Text introText = new Text();
            // introText.setText("Welcome To Plumber Game");
            // introText.setFont(Font.font("Times New Roman",31));
            // introText.setTextAlignment(TextAlignment.CENTER);

            // Button playButton = new Button("", new ImageView(new
            // Image("./projectImages/playButton.png")));
            // playButton.setScaleX(0.05);
            // playButton.setScaleY(0.03);

            // root.getChildren().add(introText);
            // root.getChildren().add(playButton);

            Scene scene = new Scene(root, 911, 512);
            scene.setFill(new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, new Stop(0, Color.web("#99ffad")),
                    new Stop(1, Color.web("#0099e6"))));

            stage.setTitle("Plumber Game");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void level1() throws Exception {
        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level1.txt");
        scanner = new Scanner(file);
        inputReading();
        //constructing level1
        Level level1 = new Level(objects);
        BorderPane bp1 = new BorderPane();
		Button button1 = new Button("Next Level");
		button1.setDisable(true);
		Label score1 = new Label("Score : " + level1.getCounter());
		BorderPane.setCenter(level1.getLevel());
		bp1.setLeft(score1);
		bp1.setRight(button1);
		BorderPane.setAlignment(score1, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button1, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level1.getLevel(), new Insets(12));
		BorderPane.setMargin(score1, new Insets(12));
		BorderPane.setMargin(button1, new Insets(12));
        for (int i = 0; i < objects.size(); i++) {

        }
        if (isCompleted) {
            objects.clear();
            level2();
        }

    }

    public static void level2() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level2.txt");
        scanner = new Scanner(file);
        inputReading();
        Level level2 = new Level(objects);
        //constructing level2
        BorderPane bp2 = new BorderPane();
		Button button2 = new Button("Next Level");
		button2.setDisable(true);
		Label score2 = new Label("Score : " + level2.getCounter());
		bp2.setCenter(level2.getLevel());
		bp2.setLeft(score2);
		bp2.setRight(button2);
		BorderPane.setAlignment(score2, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button2, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level2.getLevel(), new Insets(12));
		BorderPane.setMargin(score2, new Insets(12));
		BorderPane.setMargin(button2, new Insets(12));

        if (isCompleted) { 
            objects.clear();
            level3();
        }
    }

    public static void level3() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level3.txt");
        scanner = new Scanner(file);
        inputReading();
        Level level3 = new Level(objects);
        //constructing level3
        BorderPane bp3 = new BorderPane();
		Button button3 = new Button("Next Level");
		button3.setDisable(true);
		Label score3 = new Label("Score : " + level3.getCounter());
		bp3.setCenter(level3.getLevel());
		bp3.setLeft(score3);
		bp3.setRight(button3);
		BorderPane.setAlignment(score3, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button3, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level3.getLevel(), new Insets(12));
		BorderPane.setMargin(score3, new Insets(12));
		BorderPane.setMargin(button3, new Insets(12));
        if (isCompleted) {
            objects.clear();
            level4();
        }
    }

    public static void level4() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level4.txt");
        scanner = new Scanner(file);
        inputReading();
        Level level4 = new Level(objects);
        //constructing level4
        BorderPane bp4 = new BorderPane();
		Button button4 = new Button("Next Level");
		button4.setDisable(true);
		Label score4 = new Label("Score : " + level4.getCounter());
		bp4.setCenter(level4.getLevel());
		bp4.setLeft(score4);
		bp4.setRight(button4);
		BorderPane.setAlignment(score4, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button4, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level4.getLevel(), new Insets(12));
		BorderPane.setMargin(score4, new Insets(12));
		BorderPane.setMargin(button4, new Insets(12));
        if (isCompleted) {
            objects.clear();
            level5();
        }
    }

    public static void level5() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level5.txt");
        scanner = new Scanner(file);
        inputReading();
        Level level5 = new Level(objects);
        //constructing level5
        BorderPane bp5 = new BorderPane();
		Button button5 = new Button("Next Level");
		button5.setDisable(true);
		Label score5 = new Label("Score : " + level5.getCounter());
		bp5.setCenter(level5.getLevel());
		bp5.setLeft(score5);
		bp5.setRight(button5);
		BorderPane.setAlignment(score5, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button5, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level5.getLevel(), new Insets(12));
		BorderPane.setMargin(score5, new Insets(12));
		BorderPane.setMargin(button5, new Insets(12));
        if (isCompleted) {
            objects.clear();
            level6();
        }
    }

    public static void level6() throws Exception {

        file = new File("./CSE1242_project_student/CSE1242_spring2022_project_level6.txt");
        scanner = new Scanner(file);
        inputReading();
        Level level6 = new Level(objects);
        //constructing level6
        BorderPane bp6 = new BorderPane();
		Button button6 = new Button("Next Level");
		button6.setDisable(true);
		Label score6 = new Label("Score : " + level6.getCounter());
		bp6.setCenter(level6.getLevel());
		bp6.setLeft(score6);
		bp6.setRight(button6);
		BorderPane.setAlignment(score6, Pos.CENTER_LEFT);
		BorderPane.setAlignment(button6, Pos.CENTER_RIGHT);
		BorderPane.setMargin(level6.getLevel(), new Insets(12));
		BorderPane.setMargin(score6, new Insets(12));
		BorderPane.setMargin(button6, new Insets(12));


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
                    objects.add(new Tile(Integer.parseInt(lines[0]), freeStatus));
                    break;
                case "Pipe":
                    objects.add(new Pipe(Integer.parseInt(lines[0]), false, lines[2]));
                    break;
                case "Starter":
                    objects.add(new Starter(Integer.parseInt(lines[0]), lines[2]));
                    break;
                case "End":
                    objects.add(new End(Integer.parseInt(lines[0]), lines[2]));
                    break;
                case "PipeStatic":
                    objects.add(new Pipe(Integer.parseInt(lines[0]), true, lines[2]));
                    break;
                default:
                    throw new Exception("Please check your txt file there may be missing spelling");
            }
        }
    }
}
