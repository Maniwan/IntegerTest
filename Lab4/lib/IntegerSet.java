package lib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class IntegerSet{

    ArrayList<Integer> Numbers; //rep

public IntegerSet() {
    Numbers = new ArrayList<>();
}

private void CheckRep(){
    if(Numbers == null){
        throw new RuntimeException("Numbeers should not be null");
    }

    for(int i = 0; i < Numbers.size()-1; i++){
        if(Numbers.get(i) >= Numbers.get(1+1)) {
            throw new RuntimeException("Unnimplemented 'add");

        }
}
}
/**
 * เพิ่มจำนวนเต็มเข้าไปในเซต
 * หากค่าที่รับเข้ามาเป็น {@code null} เมธอดจะไม่ทำการเพิ่มข้อมูลใด ๆ และจบการทำงานทันที
 * @param n
 */
public void add(Integer n) {
    Numbers.add(n);
    if(n == null){
        return;
    }

    int index = Collections.binarySearch(Numbers,n);
    if (index < 0){
        Numbers.add(-index - 1, n);
    }
    CheckRep();
}
public void remove(Integer x){
    Numbers.remove(x);
    CheckRep();

}

public boolean contains(Integer x){
    return Numbers.contains(x);

}
public int size(){
    return Numbers.size();
}
}


