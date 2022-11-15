package semana9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DetectorCohPiah {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao detector automático de COH-PIAH");

        TextSignature baseSignature = readSignature(scan);
        List<Text> texts = readTexts(scan);
        Integer index = evaluateTexts(texts, baseSignature);

        System.out.println("O autor do texto " + index + " está infectado com COH-PIAH");

        scan.close();
        long stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTime) + "ms");

    }

    static TextSignature readSignature(Scanner scan) {

        System.out.println("Informe a assinatura típica de um aluno infectado:");
        TextSignature signature = new TextSignature();

        // System.out.print("\nEntre o tamanho médio de palavra: ");
        // assinatura.wal = Float.parseFloat(scan.nextLine());
        // System.out.print("\nEntre a relação Type-Token: ");
        // assinatura.ttr = Float.parseFloat(scan.nextLine());
        // System.out.print("\nEntre a Razão Hapax Legomana: ");
        // assinatura.hlr = Float.parseFloat(scan.nextLine());
        // System.out.print("\nEntre o tamanho médio de sentença: ");
        // assinatura.sal = Float.parseFloat(scan.nextLine());
        // System.out.print("\nEntre a complexidade média da sentença: ");
        // assinatura.sac = Float.parseFloat(scan.nextLine());
        // System.out.print("\nEntre o tamanho médio de frase: ");
        // assinatura.pal = Float.parseFloat(scan.nextLine());

        signature.wal = 4.51;
        signature.ttr = 0.693;
        signature.hlr = 0.55;
        signature.sal = 70.82;
        signature.sac = 1.82;
        signature.pal = 38.5;

        return signature;
    }

    static List<Text> readTexts(Scanner scan) {
        List<Text> texts = new ArrayList<>();

        texts.add(new Text(
                "Num fabulário ainda por encontrar será um dia lida esta fábula: A uma bordadora dum país longínquo foi encomendado pela sua rainha que bordasse, sobre seda ou cetim, entre folhas, uma rosa branca. A bordadora, como era muito jovem, foi procurar por toda a parte aquela rosa branca perfeitíssima, em cuja semelhança bordasse a sua. Mas sucedia que umas rosas eram menos belas do que lhe convinha, e que outras não eram brancas como deviam ser. Gastou dias sobre dias, chorosas horas, buscando a rosa que imitasse com seda, e, como nos países longínquos nunca deixa de haver pena de morte, ela sabia bem que, pelas leis dos contos como este, não podiam deixar de a matar se ela não bordasse a rosa branca. Por fim, não tendo melhor remédio, bordou de memória a rosa que lhe haviam exigido. Depois de a bordar foi compará-la com as rosas brancas que existem realmente nas roseiras. Sucedeu que todas as rosas brancas se pareciam exactamente com a rosa que ela bordara, que cada uma delas era exactamente aquela. Ela levou o trabalho ao palácio e é de supor que casasse com o príncipe. No fabulário, onde vem, esta fábula não traz moralidade. Mesmo porque, na idade de ouro, as fábulas não tinham moralidade nenhuma."));
        texts.add(new Text(
                "Voltei-me para ela; Capitu tinha os olhos no chão. Ergueu-os logo, devagar, e ficamos a olhar um para o outro... Confissão de crianças, tu valias bem duas ou três páginas, mas quero ser poupado. Em verdade, não falamos nada; o muro falou por nós. Não nos movemos, as mãos é que se estenderam pouco a pouco, todas quatro, pegando-se, apertando-se, fundindo-se. Não marquei a hora exata daquele gesto. Devia tê-la marcado; sinto a falta de uma nota escrita naquela mesma noite, e que eu poria aqui com os erros de ortografia que trouxesse, mas não traria nenhum, tal era a diferença entre o estudante e o adolescente. Conhecia as regras do escrever, sem suspeitar as do amar; tinha orgias de latim e era virgem de mulheres."));
        texts.add(new Text(
                "Senão quando, estando eu ocupado em preparar e apurar a minha invenção, recebi em cheio um golpe de ar; adoeci logo, e não me tratei. Tinha o emplasto no cérebro; trazia comigo a idéia fixa dos doidos e dos fortes. Via-me, ao longe, ascender do chão das turbas, e remontar ao Céu, como uma águia imortal, e não é diante de tão excelso espetáculo que um homem pode sentir a dor que o punge. No outro dia estava pior; tratei-me enfim, mas incompletamente, sem método, nem cuidado, nem persistência; tal foi a origem do mal que me trouxe à eternidade. Sabem já que morri numa sexta-feira, dia aziago, e creio haver provado que foi a minha invenção que me matou. Há demonstrações menos lúcidas e não menos triunfantes. Não era impossível, entretanto, que eu chegasse a galgar o cimo de um século, e a figurar nas folhas públicas, entre macróbios. Tinha saúde e robustez. Suponha-se que, em vez de estar lançando os alicerces de uma invenção farmacêutica, tratava de coligir os elementos de uma instituição política, ou de uma reforma religiosa. Vinha a corrente de ar, que vence em eficácia o cálculo humano, e lá se ia tudo. Assim corre a sorte dos homens."));
        texts.add(new Text(
                "Então resolveu ir brincar com a Máquina pra ser também imperador dos filhos da mandioca. Mas as três cunhas deram muitas risadas e falaram que isso de deuses era gorda mentira antiga, que não tinha deus não e que com a máquina ninguém não brinca porque ela mata. A máquina não era deus não, nem possuía os distintivos femininos de que o herói gostava tanto. Era feita pelos homens. Se mexia com eletricidade com fogo com água com vento com fumo, os homens aproveitando as forças da natureza. Porém jacaré acreditou? nem o herói! Se levantou na cama e com um gesto, esse sim! bem guaçu de desdém, tó! batendo o antebraço esquerdo dentro do outro dobrado, mexeu com energia a munheca direita pras três cunhas e partiu. Nesse instante, falam, ele inventou o gesto famanado de ofensa: a pacova."));

        // while (true) {
        // System.out.print("Digite o texto " + (texts.size() + 1) + " (aperte enter
        // para sair): ");
        // String text = scan.nextLine();
        // if (text == "")
        // break;
        // texts.add(new Text(text));
        // }

        return texts;
    }

    static Integer evaluateTexts(List<Text> texts, TextSignature baseSignature) {

        List<Double> similarities = new ArrayList<>();
        texts.forEach(t -> similarities.add(Text.compareSignature(t.getSignature(), baseSignature)));
        return similarities.indexOf(Collections.min(similarities)) + 1;
    }

}

class TextSignature {
    Double wal = 0.0;
    Double ttr = 0.0;
    Double hlr = 0.0;
    Double sal = 0.0;
    Double sac = 0.0;
    Double pal = 0.0;

    @Override
    public String toString() {
        return ("[" + this.wal + ", " + this.ttr + ", " + this.hlr + ", " + this.sal + ", " + this.sac + ", " + this.pal
                + "]");
    }
}

class Text {

    private String text;
    private TextSignature signature;

    public Text(String text) {
        this.text = text;
        this.signature = calculateTextSignature(text);
    }

    public TextSignature getSignature() {
        return this.signature;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public static TextSignature calculateTextSignature(String texto) {
        List<String> sentences = splitTextInSentences(texto);
        List<String> phrases = new ArrayList<>();
        List<String> words = new ArrayList<>();

        sentences.forEach(s -> phrases.addAll(splitSentencesInPhrases(s)));
        phrases.forEach(p -> words.addAll(splitPhasesInWords(p.trim())));

        TextSignature signature = new TextSignature();

        // calculate wal
        words.forEach(w -> signature.wal += w.length());
        signature.wal /= words.size();

        // calculate ttr
        signature.ttr = Double.valueOf(qtyDifferentWords(words)) / words.size();

        // calculate hlr
        signature.hlr = Double.valueOf(qtyOneTimeWords(words)) / words.size();

        // calculate sal
        sentences.forEach(s -> signature.sal += s.length());
        signature.sal /= sentences.size();

        // calculate sac
        signature.sac = Double.valueOf(phrases.size()) / sentences.size();

        // calculate pal
        phrases.forEach(p -> signature.pal += p.length());
        signature.pal /= phrases.size();

        System.out.println(signature);
        return signature;
    }

    private static List<String> splitTextInSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        return Arrays.asList(sentences);

    }

    private static List<String> splitSentencesInPhrases(String sentence) {
        String[] phrases = sentence.split("[,:;]+");
        return Arrays.asList(phrases);
    }

    private static List<String> splitPhasesInWords(String phrase) {
        String[] words = phrase.split(" ");
        return Arrays.asList(words);
    }

    private static Integer qtyDifferentWords(List<String> words) {
        return words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList())
                .stream()
                .distinct()
                .collect(Collectors.toList())
                .size();
    }

    private static Integer qtyOneTimeWords(List<String> words) {

        Map<String, Long> freq = words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        return freq.keySet()
                .stream()
                .filter(k -> freq.get(k) == 1)
                .collect(Collectors.toList())
                .size();
    }

    public static Double compareSignature(TextSignature signature1, TextSignature signature2) {

        List<Double> differences = new ArrayList<>();
        differences.add(Math.abs(signature1.wal - signature2.wal));
        differences.add(Math.abs(signature1.ttr - signature2.ttr));
        differences.add(Math.abs(signature1.hlr - signature2.hlr));
        differences.add(Math.abs(signature1.sac - signature2.sac));
        differences.add(Math.abs(signature1.sal - signature2.sal));
        differences.add(Math.abs(signature1.pal - signature2.pal));

        Double sumAB = 0.0;
        for (Double difference : differences) {
            sumAB += difference;
        }
        sumAB /= 6;

        return sumAB;
    }

}
