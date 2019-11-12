package latihan2;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

// public final jika digunakan pada class maka class tersebut tidak bisa diturunkan dan 
// apabila digunakan pada method maka tidak bisa dilakukan overriding
public final class ArrayExists {
    public static void main(String[] args) {
        final Array<string> a = array("hello", "there","what", "day","is","it");
        final boolean b= a exists(s->)fromString(s).forall(isLowerCase));
         System.out.println(b); // true ("what" is the only value that qualifies; try removing it)
    }
}