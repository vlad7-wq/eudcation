public enum Size {
    SMALL("S", 5, 8),
    MEDIUM("M", 9, 12),
    LARGE("L", 13, 16),
    EXTRA_LARGE("XL", 17, 20);

    private String shortName;
    private int width;
    private int length;


    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "S size: width=11 , length=40";
    }
}
