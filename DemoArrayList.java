//ArrayList in Java uses dynamic array for storing elements, no size limit, non synchronized. implements ListInterface and extends AbstractList class. Implemented add, get, size, currentcapacity, isEmpty methods.

class ArrayList<T>{
    Object arr[]; //created an object array of ArrayList class
    int s; //current size
    int cap=10; //capacity
    ArrayList(){ //initialization
        cap=10;
        s=0;
        arr = new Object[cap];
    }
    ArrayList(int c){
        cap = c;
        s=0;
        arr = new Object[cap];
    }
    void add(T item){
        if(s==cap){
            Object ar[]=new Object[s];
            for(int i=0; i<s; i++)
                ar[i]=arr[i];
            cap = cap*3/2 + 1;
            arr=new Object[cap];
            for(int i=0; i<s; i++) arr[i]=ar[i];
        }
        arr[s++]=item;
    }
    T get(int i){
        return (T)arr[i];
    }
    int size(){
        return s;
    }
    boolean isEmpty(){
        if(s==0){
            return true;
        }
        else{return false;}
    }
    int currentCapacity(){
        return cap;
    }
}
public class DemoArrayList{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.currentCapacity());
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(null);
        System.out.println(a.currentCapacity());
        for(int i=1; i<=10; i++)
              a.add(i);
        a.add(11);
        System.out.println(a.currentCapacity());
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}