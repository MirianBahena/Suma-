package Main;

public class Animal {
    private String specie;
    private String name;
    private  Integer age;
    private String diseases;
    private Boolean vaccinated;

    public String getSpecie() {
        return specie;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDiseases() {
        return diseases;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
