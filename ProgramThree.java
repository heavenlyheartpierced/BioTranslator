import java.util.Scanner;

public class ProgramThree {
    public static String removeIntrons(String[] rna) {
        StringBuilder exonStrand = new StringBuilder(rna);
        while(true) {
            int startIndex = exonStrand.indexOf("AUG");
            if (startIndex == -1) break;

            int endIndex = exonStrand.indexOf("UGA", startIndex + 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount to translate: ");
        int translateTimes = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter an RNA strain.");
        String strain = scanner.nextLine().toUpperCase().trim();

        StringBuilder proteinSequence = new StringBuilder();

        for (int i = 0; i < translateTimes; i++) {

            int startIndex = i * 3;
            int endIndex = startIndex + 3;

            if (endIndex > strain.length()) {
                System.out.println(
                        "The end of the strand was reached with an invalid codon. \n the invalid codon was removed \n");
                break;
            }

            String codon = strain.substring(startIndex, endIndex);

            String aminoAcid = switch (codon) {
                case "AUG" -> "Methionine";
                case "UAA", "UGA", "UAG" -> "Stop codon";
                case "UUU", "UUC" -> "Phenylalanine";
                case "AAA", "AAG" -> "Lysine";
                case "GGG", "GGU", "GGC", "GGA" -> "Glycine";
                case "CCC", "CCU", "CCG", "CCA" -> "Proline";
                case "UUA", "UUG", "CUU", "CUC", "CUA", "CUG" -> "Leucine";
                case "UCU", "UCC", "UCG", "UCA", "AGU", "AGC" -> "Serine";
                case "UAU", "UAC" -> "Tyrosine";
                case "UGU", "UGC" -> "Cysteine";
                case "UGG" -> "Tryptophan";
                case "CAU", "CAC" -> "Histidine";
                case "CAA", "CAG" -> "Glutamine";
                case "CGU", "CGA", "CGC", "CGG", "AGA", "AGG" -> "Arginine";
                case "AUU", "AUC", "AUA" -> "Isoleucine";
                case "ACU", "ACA", "ACC", "ACG" -> "Threonine";
                case "AAU", "AAC" -> "Asparagine";
                case "GUU", "GUA", "GUC", "GUG" -> "Valine";
                case "GCU", "GCA", "GCG", "GCC" -> "Alanine";
                case "GAC", "GAU" -> "Aspartic acid";
                case "GAA", "GAG" -> "Glutamic acid";
                default -> "Unknown";
            };

            if (proteinSequence.length() > 0) {
                proteinSequence.append("-");
            }

            proteinSequence.append(aminoAcid);
        }
        System.out.println("Translated Protein: \n\n" + proteinSequence.toString());
        scanner.close();
    }

}
