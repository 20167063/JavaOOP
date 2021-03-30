public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String tile) {
        this.title = tile;
    }

    public DigitalVideoDisc(String tile, String category, float cost) {
        this.title = tile;
        this.category = category;
        this.lenght = 0;
        this.cost = cost;
    }
    public DigitalVideoDisc(String tile, String category, String director, int lenght, float cost) {
        this.title = tile;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tile) {
        this.title = tile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void viewDVD(int i){
        System.out.println((i+1) + ".DVD-"+title+"-" + category + "-" + director + "-" + lenght + ":" + cost + "$");
    }
}