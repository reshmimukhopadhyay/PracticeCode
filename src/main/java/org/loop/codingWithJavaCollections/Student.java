package org.loop.codingWithJavaCollections;

public class Student implements Comparable<Student>{

    private Integer id;
    private String name;


    public Student(Integer id, String name){

        this.id=id;
        this.name=name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "id: "+id+ "  name: "+name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id,that.id);
    }
}
