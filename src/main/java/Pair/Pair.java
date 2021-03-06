package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    private E first;
    private E second;

    public Pair(E element1, E element2){
        this.first = element1;
        this.second = element2;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min(){
        if(first.compareTo(second) < 0){
            return first;
        }else if(first.compareTo(second)>0){
            return second;
        }else{
            return null;
        }
    }

    public E max(){
        if(first.compareTo(second) < 0 ){
            return second;
        }else if(first.compareTo(second)>0){
            return first;
        }else{
            return null;
        }
    }
}
