package exercicios2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Calendario {
	private Map<LocalDate, String> feriados;

    public Calendario() {
        feriados = new HashMap<>();
        int anoAtual = LocalDate.now().getYear();
        feriados.put(LocalDate.of(anoAtual, 1, 1), "Ano Novo");
        feriados.put(LocalDate.of(anoAtual, 4, 21), "Tiradentes");
        feriados.put(LocalDate.of(anoAtual, 5, 1), "Dia do Trabalho");
        feriados.put(LocalDate.of(anoAtual, 9, 7), "Independência do Brasil");
        feriados.put(LocalDate.of(anoAtual, 10, 12), "Nossa Senhora Aparecida");
        feriados.put(LocalDate.of(anoAtual, 11, 2), "Finados");
        feriados.put(LocalDate.of(anoAtual, 11, 15), "Proclamação da República");
        feriados.put(LocalDate.of(anoAtual, 12, 25), "Natal");
    }

    public void exibirCalendarioMes(int ano, int mes) {
        LocalDate data = LocalDate.of(ano, mes, 1);
        Month month = data.getMonth();
        int diasNoMes = month.length(data.isLeapYear());

        System.out.println(month.getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + ano);
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        int primeiroDiaSemana = data.getDayOfWeek().getValue() % 7;
        for (int i = 0; i < primeiroDiaSemana; i++) {
            System.out.print("    ");
        }

        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%3d ", dia);
            if ((dia + primeiroDiaSemana) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean isFeriado(LocalDate data) {
        return feriados.containsKey(data);
    }

    public String obterNomeFeriado(LocalDate data) {
        return feriados.getOrDefault(data, "Não é feriado");
    }

    public long calcularDiferencaDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }
}
