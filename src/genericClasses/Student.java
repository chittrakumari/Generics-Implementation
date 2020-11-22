package genericClasses;

public class Student<T,S> {
    private T rollNo;
    private S name;

    public void setRollNo(T roll)
    {
        this.rollNo=roll;
    }

    public void setName(S name){
        this.name=name;
    }

    public T getRollNo(){
        return rollNo;
    }
    public S getName(){
        return name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name=" + name +
                '}';
    }
}
