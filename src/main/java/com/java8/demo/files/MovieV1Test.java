
package com.java8.demo.files;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MovieV1Test {
    
    
    public static void main(String... args) throws Exception {
        
        Set<Movie> movies = new HashSet<>() ;
        
        Stream<String> lines = 
            Files.lines(
                Paths.get("files", "movies-mpaa.txt"), 
                Charset.forName("windows-1252")
            ) ;
        
        lines.forEach(
                (String line) -> {
                    String[] elements = line.split("/") ;
                    String title = elements[0].substring(0, elements[0].toString().lastIndexOf("(")).trim() ;
                    String releaseYear = elements[0].substring(elements[0].toString().lastIndexOf("(") + 1, elements[0].toString().lastIndexOf(")")) ;
            
                    if (releaseYear.contains(",")) {
                        // Movies with a coma in their title are discarded
                        return ;
                    }
            
                    Movie movie = new Movie(title, Integer.valueOf(releaseYear)) ;
            
                    for (int i = 1 ; i < elements.length ; i++) {
                        String [] name = elements[i].split(", ") ;
                        String lastName = name[0].trim() ;
                        String firstName = "" ;
                        if (name.length > 1) {
                            firstName = name[1].trim() ;
                        }

                        Actor actor = new Actor(lastName, firstName) ;
                        movie.addActor(actor) ;
                    }
            
                    movies.add(movie) ;
                }
        ) ;
        
        Set<Actor> actors =
                movies.stream()
                        .flatMap(movie -> movie.getActors().stream())
                        .collect(Collectors.toSet()) ;
        
        System.out.println("# actors = " + actors.size()) ;
        System.out.println("# movies = " + movies.size()) ;
        
        // number of release years
        int annees = 
        movies.stream()
                .map(movie -> movie.getReleaseYear())
                .collect(Collectors.toSet())
                .size() ;
        System.err.println("Number of release years = " + annees) ;
        
        // Min and max of release years
        IntSummaryStatistics stats = 
        movies.stream()
                .mapToInt(movie -> movie.getReleaseYear())
                .summaryStatistics() ;
        System.err.println("From " + stats.getMin() + " to " + stats.getMax()) ;
        
        // Movie in which the greatest number of actors have played
        Map.Entry<Integer, Long> entry1 = 
        movies.stream()
                .collect(
                        Collectors.groupingBy(
                                movie -> movie.getActors().size(), 
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get() ;
        System.out.println("Movie in which the greatest number of actors have played : " + entry1) ;
        
        // Year with the greatest number of movies released
        Map.Entry<Integer, Long> entry2 = 
        movies.stream()
                .collect(
                        Collectors.groupingBy(
                                movie -> movie.getReleaseYear(), 
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get() ;
        
        long debut = System.currentTimeMillis() ;
        System.out.println("Year with the greatest number of movies released : " + entry2) ;
        
        // Actor that played in the greatest number of movies
        Map.Entry<Actor, Long> entry3 = 
        actors.stream().parallel()
                .collect(
                        Collectors.toMap(
                                Function.identity(), 
                                actor -> movies.stream().filter(movie -> movie.getActors().contains(actor)).count()
                        )
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get() ;
        System.out.println("Actor that played in the greatest number of movies : " + entry3) ;
        
        // Actor that played in the greatest number of movies during a year
        Map.Entry<Actor, Map.Entry<Integer, Long>> entry4 = 
        actors.stream().parallel()
                .collect(
                        Collectors.toMap(
                                Function.identity(), 
                                actor -> movies.stream()
                                            .filter(movie -> movie.getActors().contains(actor))
                                            .collect(
                                                    Collectors.groupingBy(
                                                            Movie::getReleaseYear,
                                                            Collectors.counting()
                                                    )
                                            )
                                            .entrySet()
                                            .stream()
                                            .max(Map.Entry.comparingByValue())
                                            .get()
                        )
                )
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry -> entry.getValue().getValue()))
                .get() ;
        System.out.println("Actor that played in the greatest number of movies during a year : " + entry4) ;
        
        
        long fin = System.currentTimeMillis() ;
        System.err.println((fin - debut) + "ms");
    }
}
