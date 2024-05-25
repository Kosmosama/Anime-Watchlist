package animelist.common.list_related;

public class Anime implements Comparable<Anime> {
    private int id;
    private String image; // change later
    private String name;
//    private List<String> genres;
    private String genre;
    private int episodes;
    private int year;
    private float score;

    /**
     * Constructs a new Anime object with the specified attributes.
     * @param image The image URL of the anime.
     * @param name The name of the anime.
     * @param genre The list of genres associated with the anime.
     * @param episodes The number of episodes of the anime.
     * @param year The release year of the anime.
     * @param score The score/rating of the anime.
     */
    public Anime(String image, String name, String genre, int episodes, int year, float score) { // List<String> genres
        this.image = image;
        this.name = name;
        this.genre = genre;
        this.episodes = episodes;
        this.year = year;
        this.score = score;
    }

    /**
     * Compares this Anime with another Anime based on their names.
     * @param other The Anime to compare to.
     * @return A negative integer, zero, or a positive integer as this Anime is less than, equal to, or greater than the specified Anime.
     */
    public int compareTo(Anime other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Returns a string representation of the Anime object.
     * @return A string representation of the Anime object.
     */
    @Override
    public String toString() {
        return "Anime{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", genres=" + genre +
                ", episodes=" + episodes +
                ", year=" + year +
                ", score=" + score +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
