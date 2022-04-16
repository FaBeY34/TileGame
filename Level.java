import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;

public class Level {
    private GridPane level;
    private ArrayList<CellPane> cellList;
    private ArrayList<Object> objects;
    private ArrayList<ImageView> images;
    private CellPane draggingCell;
    private CellPane targetCell;
    private CellPane starterCell;
    private CellPane endCell;
    private CellPane currentCell;
    private CellPane cameFromCell;
    private CellPane temp;

    public Level(ArrayList<Object> objects) throws Exception {
        this.objects = objects;
        level = new GridPane();
        cellList = new ArrayList<CellPane>();
        image();
    }

    public ArrayList<Object> getObjects() {
        return this.objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public ArrayList<ImageView> getImages() {
        return this.images;
    }

    public void setImages(ArrayList<ImageView> images) {
        this.images = images;
    }

    public void image() throws Exception {
        for (Object object : objects) {
            // Tile
            if (object instanceof Tile) {
                if (((Tile) object).getFreeStatus()) {
                    images.add(new ImageView("./projectImages/EmptyFree.png"));
                } else {
                    images.add(new ImageView("./projectImages/EmptyNone.png"));
                }
            }
            // Starter
            else if (object instanceof Starter) {
                if (((Starter) object).getDirection().equals("Vertical")) {
                    images.add(new ImageView("./projectImages/StarterVertical.png"));
                } else if (((Starter) object).getDirection().equals("Horizontal")) {
                    images.add(new ImageView("./projectImages/StarterHorizontal.png"));
                }
            }
            // End
            else if (object instanceof End) {
                if (((End) object).getDirection().equals("Vertical")) {
                    images.add(new ImageView("./projectImages/EndVertical.png"));
                } else if (((End) object).getDirection().equals("Horizontal")) {
                    images.add(new ImageView("./projectImages/EndHorizontal.png"));
                }
            }
            // Pipe
            else if (object instanceof Pipe) {
                switch (((Pipe) object).getDirection()) {
                    case "00":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/Pipe00.png"));
                        }
                        break;
                    case "01":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/Pipe01.png"));
                        } else {
                            images.add(new ImageView("./projectImages/PipeStatic01.png"));
                        }
                        break;
                    case "10":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/Pipe10.png"));
                        }
                        break;
                    case "11":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/Pipe11.png"));
                        }
                        break;
                    case "Vertical":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/PipeVertical.png"));
                        } else {
                            images.add(new ImageView("./projectImages/PipeStaticVertical.png"));
                        }
                        break;
                    case "Horizontal":
                        if (!((Pipe) object).getStaticStatus()) {
                            images.add(new ImageView("./projectImages/PipeHorizontal.png"));
                        } else {
                            images.add(new ImageView("./projectImages/PipeStaticHorizontal.png"));
                        }
                        break;
                    default:
                        throw new Exception();
                }
            }
        }
    }
}