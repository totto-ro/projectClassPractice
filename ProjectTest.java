public class ProjectTest {
    
    public static void main( String args[] ){

        Project cookies = new Project( "cookies", "recipe book" );
        Project iceCream = new Project( "iceCream" );
        Project pizza = new Project();

        cookies.elevatorPitch();
        iceCream.elevatorPitch();
        pizza.elevatorPitch();

        String wholeProject;
        wholeProject = cookies.getName() + " " + cookies.getDescription();
        System.out.println( "Important project: " + wholeProject );

        
        iceCream.setName( "cake" ); 
        iceCream.setDescription( "cake recipe book" );
        iceCream.elevatorPitch();

        String updatedProject;
        updatedProject = iceCream.getName() + " " + iceCream.getDescription();
        System.out.println( "Updated project: " + updatedProject );


    }



}
