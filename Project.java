public class Project{
    //Atributes
    private String name;
    private String description;

    //Constructor
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Overload
    public Project(String name) {
        this.name = name;
        String defaulDescription = "defaultDescription";
        this.description = defaulDescription;
    }

    public Project() {
        String defaultName = "defaultName";
        this.name = defaultName;
        String defaulDescription = "defaultDescription";
        this.description = defaulDescription;
    }

    public void elevatorPitch() {
        System.out.format( " %s: %s. ", this.name, this.description );
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    //Setters
    public void setName( String name ){
        this.name = name;
    }

    public void setDescription( String description ){
        this.description = description;
    }



}