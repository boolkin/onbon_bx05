//package onbon.bx05.tutorial.client;

import onbon.bx05.Bx5GEnv;
import onbon.bx05.Bx5GScreenClient;

public class SimpleCommand {

    public static void main(String[] args) throws Exception {
        Bx5GEnv.initial();
		//Bx5GEnv.initial("log.properties",30000);
        Bx5GScreenClient screen = new Bx5GScreenClient("MyScreen");
        if (!screen.connect("192.168.100.1", 5005)) {
            System.out.println("connect failed");
            return;
        }

        
        screen.ping();
        screen.checkControllerStatus();
        /*
		screen.checkFirmware();
        screen.checkMemVolumes();
        screen.syncTime();
        screen.readControllerId();

        //
        screen.checkHealth();
        screen.turnOff();
        screen.turnOn();
        screen.lock();
        screen.unlock();
        */

        screen.disconnect();

    }
}
