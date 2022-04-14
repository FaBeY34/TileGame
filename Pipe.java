public class Pipe {
    private int tilePosition;
    private boolean staticStatus;
    private String direction;

    public Pipe(int tilePosition, boolean staticStatus, String direction) {
        this.tilePosition = tilePosition;
        this.staticStatus = staticStatus;
        this.direction = direction;
    }

    public int getTilePosition() {
        return this.tilePosition;
    }

    public void setTilePosition(int tilePosition) {
        this.tilePosition = tilePosition;
    }

    public boolean getStaticStatus() {
        return this.staticStatus;
    }

    public void setStaticStatus(boolean staticStatus) {
        this.staticStatus = staticStatus;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
