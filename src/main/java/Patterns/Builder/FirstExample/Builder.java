package Patterns.Builder.FirstExample;

public class Builder {
    private Person newPerson;

    public Builder() {
        newPerson = new Person();
    }

    public Builder withName(String name){
        newPerson.setName(name);
        return this;
    }

    public Builder withSurname(String surname){
        newPerson.setSurname(surname);
        return this;
    }

    public Builder withAge(int age){
        newPerson.setAge(age);
        return this;
    }

    public Builder withHeight(int height){
        newPerson.setHeight(height);
        return this;
    }

    public Builder withWeight(int weight){
        newPerson.setWeight(weight);
        return this;
    }

    public Person build(){
        return newPerson;
    }
}
