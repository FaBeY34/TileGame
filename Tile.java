public class Tile {
    private int tilePosition;
    private boolean emptyStatus, freeStatus;

    public Tile(int tilePosition, boolean emptyStatus, boolean freeStatus) {
        this.tilePosition = tilePosition;
        this.emptyStatus = emptyStatus;
        this.freeStatus = freeStatus;
    }

    public int getTilePosition() {
        return this.tilePosition;
    }

    public void setTilePosition(int tilePosition) {
        this.tilePosition = tilePosition;
    }

    public boolean getEmptyStatus() {
        return this.emptyStatus;
    }

    public void setEmptyStatus(boolean emptyStatus) {
        this.emptyStatus = emptyStatus;
    }

    public boolean getFreeStatus() {
        return this.freeStatus;
    }

    public void setFreeStatus(boolean freeStatus) {
        this.freeStatus = freeStatus;
    }

}
