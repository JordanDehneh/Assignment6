
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseThree {

    public String hashingEx(String p1, String p2) {
    	if (p1 == p2)
            return "";
    	if (p2 == "")
            return p1;

        String returnValue = "";

        Set setp1 =new HashSet();
        for (int k=0; k<p1.length();k++){
            setp1.add(p1.charAt(k));
        }



        Set setp2 =new HashSet();
        for (int j=0;j<p2.length();j++){
            setp2.add(p2.charAt(j));
        }

        setp1.removeAll(setp2);

        Iterator iterator = setp1.iterator();

        while (iterator.hasNext()){
            returnValue+= iterator.next();
        }

        return returnValue;
    }
}
