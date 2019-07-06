import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteinList = new ArrayList<>();
        String condonSequence;
        int condonSequenceLength=3;

        for (int i = 0; i < rnaSequence.length(); i += condonSequenceLength) {
            condonSequence = rnaSequence.substring(i, i + condonSequenceLength);
            if (condonSequence.equals("AUG"))
                proteinList.add("Methionine");
            else if (condonSequence.equals("UUU") || condonSequence.equals("UUC"))
                proteinList.add("Phenylalanine");
            else if (condonSequence.equals("UUA") || condonSequence.equals("UUG"))
                proteinList.add("Leucine");
            else if (condonSequence.equals("UCU") || condonSequence.equals("UCC") || condonSequence.equals("UCA") || condonSequence.equals("UCG"))
                proteinList.add("Serine");
            else if (condonSequence.equals("UAU") || condonSequence.equals("UAC"))
                proteinList.add("Tyrosine");
            else if (condonSequence.equals("UGU") || condonSequence.equals("UGC"))
                proteinList.add("Cysteine");
            else if (condonSequence.equals("UGG"))
                proteinList.add("Tryptophan");
            else if (condonSequence.equals("UAA") || condonSequence.equals("UAG") || condonSequence.equals("UGA"))
                break;
        }

        return proteinList;
    }
}