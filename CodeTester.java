import java.util.Scanner;

public class CodeTester {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter RNA strand:");
        String strand = scanner.nextLine().toUpperCase().trim();

        String maturemRNA = removeIntrons(strand);
        int totalCodons = maturemRNA.length() / 3;

        StringBuilder proteinSequence = new StringBuilder();

        for (int i = 0; i < totalCodons; i++) {
            int startIndex = i * 3;
            int endIndex = startIndex + 3;
            
            String codon = maturemRNA.substring(startIndex, endIndex);
            
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

            if (aminoAcid.equals("Stop codon")) {
                break;
            }

            if (proteinSequence.length() > 0) {
                proteinSequence.append("-");
            }
            
            proteinSequence.append(aminoAcid);
        }
        
        System.out.println(proteinSequence.length() == 0 ? "None" : proteinSequence.toString());
        scanner.close();
    }

    
    private static String removeIntrons(String rna) {
        int startIdx = rna.indexOf("AUG");
        if (startIdx == -1) {
            return "";
        }

        int endIdx = -1;
        
        for (int i = startIdx; i + 3 <= rna.length(); i += 3) {
            String currentCodon = rna.substring(i, i + 3);
            
            if (currentCodon.equals("UAA") || currentCodon.equals("UGA") || currentCodon.equals("UAG")) {
                endIdx = i; 
                break;
            }
        }

        if (endIdx == -1) {
            endIdx = rna.length();
        }
        
        return rna.substring(startIdx, endIdx);
    }
}