package app.soundmanager;
import app.soundmanager.Game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Main {
        public static void main (String[] args) {
               new LwjglApplication(new Game(), "Game", 640, 480, false);
        }
}