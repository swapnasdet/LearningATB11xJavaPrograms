package ex_31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass(5);
        GenericClass<String> strObjRef= new GenericClass("Hello");

        System.out.println(intObjRef.getData());
        System.out.println(strObjRef.getData());
    }
}

// T is a place holder, it can be any datatype
    class GenericClass<T>{
        private T data;

        public GenericClass(T data){ // param const
            this.data = data;
        }

        public T getData(){
            return this.data;
        }
    }
