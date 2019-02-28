package strategy;

import strategy.classes.FreeTimeActivity.Books;
import strategy.classes.FreeTimeActivity.Cook;
import strategy.classes.FreeTimeActivity.Gym;
import strategy.classes.conveyance.Bike;
import strategy.classes.conveyance.Car;
import strategy.classes.conveyance.PublicTransport;
import strategy.classes.work.Doctor;
import strategy.classes.work.PoliceOfficer;
import strategy.classes.work.Saleswoman;
import strategy.interfaces.Conveyance;
import strategy.interfaces.FreeTimeActivity;
import strategy.interfaces.Work;

public class Worker {
    private Conveyance conveyance;
    private FreeTimeActivity freeTimeActivity;
    private Work work;

    public void methods(){
        work.work();
        conveyance.modOfTransportation();
        freeTimeActivity.freeTimeActivity();
    }

    public Worker(String job){
        if(job.equalsIgnoreCase("Doctor")){
            work = new Doctor();
            conveyance = new Car();
            freeTimeActivity = new Books();
        } else if(job.equalsIgnoreCase("Policeman")){
            work = new PoliceOfficer();
            conveyance = new Bike();
            freeTimeActivity = new Gym();
        } else if(job.equalsIgnoreCase("Saleswoman")){
            work = new Saleswoman();
            conveyance = new PublicTransport();
            freeTimeActivity = new Cook();
        }


    }
}
