public class Main {

    public static void main(String[] args) {

        Movies moviesCatalog = new Movies();
        moviesCatalog.addMovie("Gladiator");
        moviesCatalog.addMovie("Alien");
        moviesCatalog.addMovie("Terminator");
        moviesCatalog.addMovie("Interstellar");
        moviesCatalog.addMovie("The Matrix");
        moviesCatalog.printAllMovies();
        moviesCatalog.searchMovie("Alien");
        moviesCatalog.removeMovie("Interstellar");

        TvSeries seriesCatalog = new TvSeries();
        seriesCatalog.addTvSeries("Friends");
        seriesCatalog.addTvSeries("Dexter");
        seriesCatalog.addTvSeries("Sherlock");
        seriesCatalog.addTvSeries("Vikings");
        seriesCatalog.addTvSeries("Fargo");
        seriesCatalog.searchTvSeries("Friends");
        seriesCatalog.removeTvSeries("Vikings");

        Cartoons cartoonCatalog = new Cartoons();
        cartoonCatalog.addCartoon(1940, "Tom and Jerry");
        cartoonCatalog.addCartoon(1960, "The Flintstones");
        cartoonCatalog.addCartoon(1997, "Daria");
        cartoonCatalog.addCartoon(1999, "Futurama");
        cartoonCatalog.addCartoon(2010, "Adventure Time");
        cartoonCatalog.printAllCartoons();
        cartoonCatalog.removeCartoon("Daria");

        Anime animeCatalog = new Anime();
        animeCatalog.addAnime("One Piece");
        animeCatalog.addAnime("Naruto");
        animeCatalog.addAnime("Bleach");
        animeCatalog.showAllAnime();
        animeCatalog.searchAnime("One Piece");
        animeCatalog.removeAnime("Bleach");
    }
}
