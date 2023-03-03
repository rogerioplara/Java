public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Conceitos importantes
         * 
         * Data-[hora] local:
         * ano-mês-dia-[hora] sem fuso horário
         * [hora] opcional
         * 
         * Data hora global:
         * ano-mês-dia-hora com fuso horário
         * 
         * Duração:
         * tempo decorrido entre duas data-horas
         * 
         * Quando usar?
         * Data-[hora] local:
         * - quando o momento exato não interessa a pessoas de outro fuso horário;
         * - uso comum: sistemas de região única, Excel;
         * - Data de nascimento: "15/06/2001"
         * - Data-hora da venda
         * 
         * Data-hora global:
         * - Quando o momento exato interessa a pessoas de outro fuso horário;
         * - uso comum: sistemas multi-região, web;
         * quando será o sorteio?
         * quando o comentário foi postado?
         * quando foi realizada a venda?
         * inicio e fim do evento?
         * 
         * Timezone (fuso horário)
         * 
         * - GMT - Greenwich Mean Time
         * - horário de Londres;
         * - horário do padrão UTC - Coordinated Universal Time
         * - Também chamado de "Z" time, ou Zulu Time;
         * 
         * - outros fuso horários são relativos ao GMT/UTC:
         * são paulo: gmt-3
         * manaus: gmt-4
         * portugal: gmt+1
         * 
         * Muitas linguagems/tecnologias usam nomes para as timezones:
         * - "US/Pacific"
         * - "America/Sao_Paulo"
         * - etc.
         * 
         * Padrão ISO 8601
         * 
         * Data-[hora] local:
         * 2022-07-21
         * 2022-07-21T14:52
         * 2022-07-21T14:52:09
         * 2022-07-21T14:52:09.4073
         * 
         * Data-hora global:
         * 2022-07-23T14:52:09Z -> Z = horário de londres (gmt)
         * 2022-07-23T14:52:09.254935Z
         * 2022-07-23T14:52:09-03:00 -> -3horas
         * 
         * Operações importantes com data-hora
         * 
         * Instanciação:
         * - (agora) -> Data-hora
         * - Texto ISO 8601 -> Data-hora
         * - Texto formato customizado -> Data-hora
         * - dia, mês, ano, [horário] -> Data-hora local
         * 
         * Formatação:
         * - Data-hora -> Texto ISO 8601
         * - Data-hora -> texto formato customizado
         * 
         * Obter dados de uma data-hora local
         * - Data-hora local -> dia, mês, ano, horário
         * 
         * Converter data-hora global para local
         * - Data-hora global, timezone (sistema local) -> Data-hora local
         * 
         * Cálculos com data-hora
         * - Data-hora +/- tempo -> Data-hora
         * - Data-hora 1, Data-hora 2 -> Duração
         */
    }
}
