package TPs.TPMiniBlast;

public class MiniBLAST {

    double BLASTComparator(String referenceSequence, String querySequence){
        double ammountOfEqualValues = 0;
        for (int i = 0; i < referenceSequence.length(); i++) {
            if (referenceSequence.charAt(i) == querySequence.charAt(i)){
                ammountOfEqualValues++;
            }
        }
        return ammountOfEqualValues/referenceSequence.length();
    }
}
