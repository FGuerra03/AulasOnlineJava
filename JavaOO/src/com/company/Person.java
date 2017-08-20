package com.company;

public class Person implements IPerson{
    private String name;
    private Integer age;
    private String cpf;

    public Person(){}

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String walk(String msg) {
        return msg;
    }

    public String walk(String msg, Integer number){
        return msg + " " + number.toString();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    /*public void say(){
        System.out.println("I'm saying something...");
    }

    public static String walk(){
        return "I'm walking..";
    }*/
}
