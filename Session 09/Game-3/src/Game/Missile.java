// Origin: https://zetcode.com/javagames/movingsprites/

package Game;

//Inherit some methods shared with class SpaceShip
public class Missile extends Sprite {

    private final int BOARD_WIDTH = 800;
    private final int MISSILE_SPEED = 2;

    public Missile(int x, int y) {
        super(x, y);
        
        initMissile();
        MissileThread myMissile = new MissileThread( this, 1, 0, 800, 800 );
        myMissile.start();
    }
    
    private void initMissile() {
        
        loadImage("src/resources/missile.png");  
        getImageDimensions();
    }

//    public void move() {
//       
//        x += MISSILE_SPEED;
//        
//        if (x > BOARD_WIDTH) {
//            visible = false;
//        }
//    }
}