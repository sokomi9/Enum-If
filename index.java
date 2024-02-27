enum Direction
{
    NORTH, SOUTH, EAST, WEST;
}
/**
 * index
 */
public class index {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Direction direction = Direction.NORTH;
        if (direction == Direction.NORTH) {
            System.out.println("We are heading NORTH");
        } 
        else if(direction == Direction.SOUTH){
            System.out.println("We are heading SOUTH");
        }
        else if(direction == Direction.EAST){
            System.out.println("We are heading EAST");
        }
        else
            System.out.println("We are heading WEST");
        }
    }
