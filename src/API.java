public class API {
    public void run(){
        Administration admin = new Administration();
        admin.printPassengerTransportforMin(45);
        admin.printRidingVechiles();
        admin.printAllvechle();

    }

    public void testrun(){
        Administration admin = new Administration();
        admin.addBus("32",60,2018,12,16);
        admin.addBus("33",48,2018,5,6);
        admin.addTrain("D5326",600,10,200,1999,7,16);
        admin.addboat("Peter",70,2017,6,4,"Park");
        admin.addTruck(10,7,2,3);
        admin.addContainship(999999,30);
        admin.printPassengerTransportforMin(100);
        //admin.printRidingVechiles();
        //admin.printAllvechle();
    }

    public static void main(String [] agrs){
        new API().testrun();
        //new API().run();
    }
}
