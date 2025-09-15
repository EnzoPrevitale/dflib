import org.dflib.DataFrame;
import org.dflib.Printers;
import org.dflib.Series;

import java.util.stream.IntStream;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] nomes = {"Enzo", "André", "Antônio", "Alex", "Belai", "Samu", "Pedrão"};

        Series<String> series = Series.of(nomes);

        System.out.println(Printers.inline.print(series));

    }
}