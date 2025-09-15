import org.dflib.DataFrame;
import org.dflib.Extractor;
import org.dflib.Printers;
import org.dflib.Series;
import org.dflib.builder.SeriesAppender;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        SeriesAppender<String, String> appender = Series.byElement(Extractor.<String>$col()).appender();

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            System.out.println("Digite um texto: ");
            String text = scanner.next();
            appender.append(text);
        }
        scanner.close();

        Series<String> series = appender.toSeries();

        System.out.println(Printers.inline.print(series));
    }
}