
import AllDrivers.BusDriver;
import AllDrivers.CarDriver;
import AllDrivers.TruckDriver;
import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;
import AllTransport.*;

import java.util.*;


public class Main {

    public static void checkDiagnosis(Transport... transports) {
        for (Transport transport : transports)
            try {
                transport.getDiagnosisTransport ();
            } catch (CantDiagnosisException e) {
                System.out.println ( e.getMessage () );
            }
    }

    public static void main(String[] args) {


        Car car1 = new Car ( "Lada" , "Granta" , 1.7 , BodyType.SEDAN );
        Car car2 = new Car ( "Audi" , "A8 50 L TDI quattro" , 3.0 , BodyType.UNIVERSAL );
        Car car3 = new Car ( "BMW" , "Z8" , 3.0 , BodyType.COUPE );
        Car car4 = new Car ( "KIA" , "Sportage" , 2.4 , BodyType.CROSSOVER );


        Bus bus1 = new Bus ( "Volvo" , "B12" , 12.5 , Seats.EXTRA_SMALL );
        Bus bus2 = new Bus ( "Golden Dragon" , "XML6127" , 10.5 , Seats.BIG );
        Bus bus3 = new Bus ( "MAN" , "Lion's Coach" , 11.0 , Seats.EXTRA_BIG );
        Bus bus4 = new Bus ( "Scania" , "Irizar" , 10.6 , Seats.EXTRA_SMALL );

        Truck truck1 = new Truck ( "Mercedes-Benz" , "Actros" , 12.8 , Carrying.N2 );
        Truck truck2 = new Truck ( "Freightliner" , "FLD" , 14.0 , Carrying.N2 );
        Truck truck3 = new Truck ( "Daf" , "XF" , 13.2 , Carrying.N1 );
        Truck truck4 = new Truck ( "Volvo" , "FH" , 12.8 , Carrying.N3 );


        CarDriver<Car> Ivan = new CarDriver<> ( "Ivan Ivanovich Ivanov" , "B" , 5 );
        BusDriver<Bus> Oleg = new BusDriver<> ( "Oleg Petrovich Petrov" , "D" , 10 );
        TruckDriver<Truck> Semen = new TruckDriver<> ( "Semen Semenovich Semenov" , "C" , 20 );


//        Ivan.goDrive ( car1 );
//        Oleg.goDrive ( bus1 );
//        Semen.goDrive ( truck1 );
//        Semen.refuelTransport ();
//        Oleg.getStart ();
//        Ivan.getStop ();
//        car1.printType ();
//        car2.printType ();
//        truck1.printType ();
//        bus4.printType ();
//        bus1.printType ();
//        truck4.printType ();
//        car1.getStart ();
//        car2.getStop ();
//
//
//        checkDiagnosis ( car1 , car2 , car3 , car4 , bus1 , bus2 , bus3 , bus4 , truck1 , truck2 , truck3 , truck4 );

        Car car5 = new Car ( "Lada" , "Granta" , 1.7 , BodyType.SEDAN );
        Car car6 = new Car ( "Audi" , "A8 50 L TDI quattro" , 3.0 , BodyType.UNIVERSAL );
        Car car7 = new Car ( "BMW" , "Z8" , 3.0 , BodyType.COUPE );
        Car car8 = new Car ( "KIA" , "Sportage" , 2.4 , BodyType.CROSSOVER );

        Bus bus5 = new Bus ( "Volvo" , "B12" , 12.5 , Seats.EXTRA_SMALL );
        Bus bus6 = new Bus ( "Golden Dragon" , "XML6127" , 10.5 , Seats.BIG );
        Bus bus7 = new Bus ( "MAN" , "Lion's Coach" , 11.0 , Seats.EXTRA_BIG );
        Bus bus8 = new Bus ( "Scania" , "Irizar" , 10.6 , Seats.EXTRA_SMALL );

        Truck truck5 = new Truck ( "Mercedes-Benz" , "Actros" , 12.8 , Carrying.N2 );
        Truck truck6 = new Truck ( "Freightliner" , "FLD" , 14.0 , Carrying.N2 );
        Truck truck7 = new Truck ( "Daf" , "XF" , 13.2 , Carrying.N1 );
        Truck truck8 = new Truck ( "Volvo" , "FH" , 12.8 , Carrying.N3 );

        Mechanic mechanic1 = new Mechanic ( "Fedor" , "Fedorov" , "MegaCar" , VehicleRepairSpecification.SPECIFICATION_CAR );
        Mechanic mechanic2 = new Mechanic ( "Ivan" , "Ivanov" , "MegaTruck" , VehicleRepairSpecification.SPECIFICATION_TRUCK );
        Mechanic mechanic3 = new Mechanic ( "Sergei" , "Sergeev" , "MegaBus" , VehicleRepairSpecification.SPECIFICATION_BUS );
        Mechanic mechanic4 = new Mechanic ( "Andrew" , "Andreev" , "MegaAvto" , VehicleRepairSpecification.SPECIFICATION_UNIVERSAL );
        Mechanic mechanic5 = new Mechanic ( "Petr" , "Petrov" , "MegaCar" , VehicleRepairSpecification.SPECIFICATION_CAR );

        HashMap<Transport, Mechanic> racing = new HashMap<> ();
        racing.put ( car6 , mechanic1 );
        racing.put ( truck5 , mechanic2 );
        racing.put ( bus6 , mechanic3 );
        racing.put ( car7 , mechanic4 );
        racing.put ( car8 , mechanic1 );
        racing.put ( car5 , mechanic5 );


        checkDuplicateMap ( racing );
        System.out.println ( "Проверяем дублирование вывода!" );
        System.out.println ( "******************************" );
        checkDuplicateMap ( racing );

    }

    public static void checkDuplicateMap(HashMap<Transport, Mechanic> raceTeam) {

        for (Map.Entry entry : raceTeam.entrySet ()) {
            System.out.println ( entry.getKey () + " этот болит обслуживает механик - " + entry.getValue () );
        }
    }


}

