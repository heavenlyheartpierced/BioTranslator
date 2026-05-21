import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an mRNA codon.");
        String codon = scanner.nextLine().toUpperCase();

        String aminoAcid;

        switch (codon) {
            case "AUG":
                aminoAcid = "Methionine";
                break;

            case "UAA":
                aminoAcid = "Stop codon";
                break;

            case "UGA":
                aminoAcid = "Stop codon";
                break;

            case "UAG":
                aminoAcid = "Stop codon";
                break;

            case "UUU":
                aminoAcid = "Phenylalanine";
                break;

            case "AAA":
                aminoAcid = "Lysine";
                break;

            case "GGG":
                aminoAcid = "Glycine";
                break;

            case "CCC":
                aminoAcid = "Proline";
                break;

            case "UUC":
                aminoAcid = "Phenylalanine";
                break;

            case "UUA":
                aminoAcid = "Leucine";
                break;

            case "UUG":
                aminoAcid = "Leucine";
                break;

            case "UCU":
                aminoAcid = "Serine";
                break;

            case "UCC":
                aminoAcid = "Serine";
                break;

            case "UCG":
                aminoAcid = "Serine";
                break;

            case "UCA":
                aminoAcid = "Serine";
                break;

            case "UAU":
                aminoAcid = "Tyrosine";
                break;

            case "UAC":
                aminoAcid = "Tyrosine";
                break;

            case "UGU":
                aminoAcid = "Cysteine";
                break;

            case "UGC":
                aminoAcid = "Cysteine";
                break;

            case "UGG":
                aminoAcid = "Tryptophan";
                break;

            case "CUU":
                aminoAcid = "Leucine";
                break;

            case "CUC":
                aminoAcid = "Leucine";
                break;

            case "CUA":
                aminoAcid = "Leucine";
                break;

            case "CUG":
                aminoAcid = "Leucine";
                break;

            case "CCU":
                aminoAcid = "Proline";
                break;

            case "CCA":
                aminoAcid = "Proline";
                break;

            case "CCG":
                aminoAcid = "Proline";
                break;

            case "CAU":
                aminoAcid = "Histidine";
                break;

            case "CAC":
                aminoAcid = "Histidine";
                break;

            case "CAA":
                aminoAcid = "Glulamine";
                break;

            case "CAG":
                aminoAcid = "Glulamine";
                break;

            case "CGU":
                aminoAcid = "Arginine";
                break;

            case "CGA":
                aminoAcid = "Arginine";
                break;

            case "CGC":
                aminoAcid = "Arginine";
                break;

            case "CGG":
                aminoAcid = "Arginine";
                break;

            case "AUU":
                aminoAcid = "Isoleucine";
                break;

            case "AUC":
                aminoAcid = "Isoleucine";
                break;

            case "AUA":
                aminoAcid = "Isoleucine";
                break;

            case "ACU":
                aminoAcid = "Threonine";
                break;

            case "ACA":
                aminoAcid = "Threonine";
                break;

            case "ACC":
                aminoAcid = "Threonine";
                break;

            case "ACG":
                aminoAcid = "Threonine";
                break;

            case "AAU":
                aminoAcid = "Asparagine";
                break;

            case "AAC":
                aminoAcid = "Asparagine";
                break;

            case "AAG":
                aminoAcid = "Lysine";
                break;

            case "AGU":
                aminoAcid = "Serine";
                break;

            case "AGC":
                aminoAcid = "Serine";
                break;

            case "AGA":
                aminoAcid = "Arginine";
                break;

            case "AGG":
                aminoAcid = "Arginine";
                break;

            case "GUU":
                aminoAcid = "Valine";
                break;

            case "GUA":
                aminoAcid = "Valine";
                break;

            case "GUC":
                aminoAcid = "Valine";
                break;

            case "GUG":
                aminoAcid = "Valine";
                break;

            case "GCU":
                aminoAcid = "Alanine";
                break;

            case "GCA":
                aminoAcid = "Alanine";
                break;

            case "GCG":
                aminoAcid = "Alanine";
                break;

            case "GCC":
                aminoAcid = "Alanine";
                break;

            case "GAU":
                aminoAcid = "Aspartic acid";
                break;

            case "GAC":
                aminoAcid = "Aspartic acid";
                break;

            case "GAA":
                aminoAcid = "Glutemic acid";
                break;

            case "GAG":
                aminoAcid = "Glutemic acid";
                break;

            case "GGU":
                aminoAcid = "Glycine";
                break;

            case "GGA":
                aminoAcid = "Glycine";
                break;

            case "GGC":
                aminoAcid = "Glycine";
                break;

            default:
                aminoAcid = "Unknown codon.";
        }

        System.out.println("Amino acid: " + aminoAcid);

        scanner.close();
    }
}
