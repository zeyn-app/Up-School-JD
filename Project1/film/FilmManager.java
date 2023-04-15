package org.jd_bootcamp.project.film;

import java.util.*;

public class FilmManager {
    private final List<Film> films = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void add(Film film) {
        films.add(film);
    }

    public void newFilm() {
        System.out.println("\n\t\t****** Film Ekle ******");

        String actor;
        List<String> actors = new ArrayList<>();

        System.out.print("\t\tFilm Adı: ");
        String title = scanner.nextLine();
        System.out.print("\t\tYönetmen: ");
        String director = scanner.nextLine();

        System.out.print("\t\tOyuncu sayısını giriniz: ");
        int countOfActors = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < countOfActors; i++) {
            System.out.print("\t\t" + (i + 1) + ". oyuncu Adı: ");
            actor = scanner.nextLine();
            actors.add(actor);
        }

        System.out.print("\t\tYıl: ");
        String year = scanner.nextLine();
        System.out.print("\t\tAçıklama: ");
        String description = scanner.nextLine();
        System.out.print("\t\tType: (HISTORY, DRAMA, CRIME, ACTION, ADVENTURE, SCI_FI, BIOGRAPHY, WESTERN, OTHER)");
        String type = scanner.nextLine();
        FilmType fType = null;

        for (FilmType filmType : FilmType.values()) {
            if (type.equalsIgnoreCase(filmType.toString())) {
                fType = filmType;
                break;
            }
        }

        Film film = new Film(title, director, actors, year, description, fType);
        films.add(film);

        System.out.println("\t\t***********************\n");
    }

    public void listFilm() {
        if(films.isEmpty()) {
            System.out.println("\n\t\tHerhangi Bir Kayıt Bulunamadı.\n");
            return;
        }
        System.out.println("\n========================================================================= " +
                "FİLMLER " +
                "=========================================================================");
        for (Film film : films) {
            System.out.println(film.toString());
        }
        System.out.println("============================================================================" +
                "=====================================================================================\n");
    }

    public void remove() {
        System.out.print("Film id' sini giriniz: ");
        String id = scanner.nextLine();
        for (Film film : films) {
            if (film.getId().equals(id)) {
                films.remove(film);
                System.out.println("İşlem Başarılı");
                return;
            }
        }
        System.out.println("İşlem Başarısız");
    }

    public void searchFilmByName() {
        System.out.print("Film Adını Giriniz: ");
        String name = scanner.nextLine();
        for (Film film : films) {
            if (film.getTitle().contains(name)) {
                System.out.println("\n" + film + "\n");
                return;
            }
        }
        System.out.println("Aradığınız Film Bulunamadı\n");
    }

    public void searchFilmById() {
        System.out.print("Film Id Giriniz: ");
        String id = scanner.nextLine();
        for (Film film : films) {
            if (film.getId().equals(id)) {
                System.out.println("\n" + film + "\n");
                return;
            }
        }
        System.out.println("Aradığınız Film Bulunamadı\n");
    }

    public void initFilms() {
        List<String> actors1 = new ArrayList<>(Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler"));
        Film film1 = new Film("The Shawshank Redemption", "Frank Darabont", actors1, "1994", "Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.", FilmType.DRAMA);

        List<String> actors2 = new ArrayList<>(Arrays.asList("Al Pacino", "Marlon Brando", "James Caan", "Diane Keaton"));
        Film film2 = new Film("The Godfather", "Francis Ford Coppola", actors2, "1972", "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", FilmType.CRIME);

        List<String> actors3 = new ArrayList<>(Arrays.asList("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine"));
        Film film3 = new Film("The Dark Knight", "Christopher Nolan", actors3, "2008", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", FilmType.ACTION);


        List<String> actors4 = new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page", "Ken Watanabe"));
        Film film4 = new Film("Inception", "Christopher Nolan", actors4, "2010", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.", FilmType.SCI_FI);


        List<String> actors5 = new ArrayList<>(Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving"));
        Film film5 = new Film("Matrix", "Lana-Lilly Wachowsk", actors5, "1999", " When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.", FilmType.ACTION);

        List<String> actors6 = new ArrayList<>(Arrays.asList("Michael J. Fox", "Christopher Lloyd", "Lea Thompson", "Crispin Glover"));
        Film film6 = new Film("Back to the Future", "Robert Zemeckis", actors6, "1985", "Marty McFly, a 17-year-old high school student, is accidentally sent 30 years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.", FilmType.ADVENTURE);

        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);
        films.add(film6);
    }
}