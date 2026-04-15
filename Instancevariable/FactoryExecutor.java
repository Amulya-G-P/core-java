class FactoryExecutor
{
    public static void main(String[] args)
    {
        Factory f1 = new Factory();
        f1.factoryId = 1; 
		f1.factoryName = "ABC Factory";
		f1.location = "Bangalore";
		f1.numberOfWorkers = 50;

        Factory f2 = new Factory();
        f2.factoryId = 2;
		f2.factoryName = "XYZ Factory"; 
		f2.location = "Mysore";
		f2.numberOfWorkers = 40;

        Factory f3 = new Factory();
        f3.factoryId = 3;
		f3.factoryName = "PQR Factory"; 
		f3.location = "Chennai"; 
		f3.numberOfWorkers = 60;

        Factory f4 = new Factory();
        f4.factoryId = 4;
		f4.factoryName = "LMN Factory"; 
		f4.location = "Hyderabad"; 
		f4.numberOfWorkers = 45;

        Factory f5 = new Factory();
        f5.factoryId = 5; 
		f5.factoryName = "DEF Factory";
		f5.location = "Mumbai";
		f5.numberOfWorkers = 70;

        Factory f6 = new Factory();
        f6.factoryId = 6;
		f6.factoryName = "GHI Factory"; 
		f6.location = "Pune"; 
		f6.numberOfWorkers = 55;

        Factory f7 = new Factory();
        f7.factoryId = 7; 
		f7.factoryName = "JKL Factory"; 
		f7.location = "Delhi";
		f7.numberOfWorkers = 80;

        Factory f8 = new Factory();
        f8.factoryId = 8; 
		f8.factoryName = "MNO Factory";
		f8.location = "Kolkata"; 
		f8.numberOfWorkers = 65;

        Factory f9 = new Factory();
        f9.factoryId = 9; 
		f9.factoryName = "QRS Factory"; 
		f9.location = "Jaipur"; 
		f9.numberOfWorkers = 35;

        Factory f10 = new Factory();
        f10.factoryId = 10; 
		f10.factoryName = "TUV Factory";
		f10.location = "Goa"; 
		f10.numberOfWorkers = 25;

        Factory f11 = new Factory();
        f11.factoryId = 11; 
		f11.factoryName = "AAA Factory"; 
		f11.location = "Bangalore";
		f11.numberOfWorkers = 50;

        Factory f12 = new Factory();
        f12.factoryId = 12; 
		f12.factoryName = "BBB Factory";
		f12.location = "Mysore"; 
		f12.numberOfWorkers = 40;

        Factory f13 = new Factory();
        f13.factoryId = 13; 
		f13.factoryName = "CCC Factory";
		f13.location = "Chennai";
		f13.numberOfWorkers = 60;

        Factory f14 = new Factory();
        f14.factoryId = 14; 
		f14.factoryName = "DDD Factory";
		f14.location = "Hyderabad";
		f14.numberOfWorkers = 45;

        Factory f15 = new Factory();
        f15.factoryId = 15; 
		f15.factoryName = "EEE Factory"; 
		f15.location = "Mumbai";
		f15.numberOfWorkers = 70;

        Factory f16 = new Factory();
        f16.factoryId = 16;
		f16.factoryName = "FFF Factory"; 
		f16.location = "Pune"; 
		f16.numberOfWorkers = 55;

        Factory f17 = new Factory();
        f17.factoryId = 17; 
		f17.factoryName = "GGG Factory";
		f17.location = "Delhi"; 
		f17.numberOfWorkers = 80;

        Factory f18 = new Factory();
        f18.factoryId = 18; 
		f18.factoryName = "HHH Factory"; 
		f18.location = "Kolkata"; 
		f18.numberOfWorkers = 65;

        Factory f19 = new Factory();
        f19.factoryId = 19;
		f19.factoryName = "III Factory";
		f19.location = "Jaipur"; 
		f19.numberOfWorkers = 35;

        Factory f20 = new Factory();
        f20.factoryId = 20;
		f20.factoryName = "JJJ Factory"; 
		f20.location = "Goa"; 
		f20.numberOfWorkers = 25;


        Machine m1 = new Machine();
        m1.machineId = 101;
		m1.machineName = "Lathe"; 
		m1.machineType = "Cutting";
		m1.machineCapacity = 10;

        Machine m2 = new Machine();
        m2.machineId = 102; 
		m2.machineName = "Drill";
		m2.machineType = "Drilling"; 
		m2.machineCapacity = 8;

        Machine m3 = new Machine();
        m3.machineId = 103; 
		m3.machineName = "Milling";
		m3.machineType = "Milling";
		m3.machineCapacity = 12;

        Machine m4 = new Machine();
        m4.machineId = 104;
		m4.machineName = "Grinder"; 
		m4.machineType = "Grinding"; 
		m4.machineCapacity = 9;

        Machine m5 = new Machine();
        m5.machineId = 105; 
		m5.machineName = "CNC"; 
		m5.machineType = "Automatic"; 
		m5.machineCapacity = 15;

        Machine m6 = new Machine();
        m6.machineId = 106;
		m6.machineName = "Press";
		m6.machineType = "Pressing"; 
		m6.machineCapacity = 11;

        Machine m7 = new Machine();
        m7.machineId = 107;
		m7.machineName = "Welder";
		m7.machineType = "Welding";
		m7.machineCapacity = 7;

        Machine m8 = new Machine();
        m8.machineId = 108; 
		m8.machineName = "Laser";
		m8.machineType = "Cutting";
		m8.machineCapacity = 14;

        Machine m9 = new Machine();
        m9.machineId = 109;
		m9.machineName = "Router"; 
		m9.machineType = "Routing"; 
		m9.machineCapacity = 10;

        Machine m10 = new Machine();
        m10.machineId = 110;
		m10.machineName = "Mixer"; 
		m10.machineType = "Mixing";
		m10.machineCapacity = 6;

        Machine m11 = new Machine();
        m11.machineId = 111; 
		m11.machineName = "Lathe";
		m11.machineType = "Cutting";
		m11.machineCapacity = 10;

        Machine m12 = new Machine();
        m12.machineId = 112; 
		m12.machineName = "Drill";
		m12.machineType = "Drilling"; 
		m12.machineCapacity = 8;

        Machine m13 = new Machine();
        m13.machineId = 113;
		m13.machineName = "Milling";
		m13.machineType = "Milling";
		m13.machineCapacity = 12;

        Machine m14 = new Machine();
        m14.machineId = 114;
		m14.machineName = "Grinder";
		m14.machineType = "Grinding";
		m14.machineCapacity = 9;

        Machine m15 = new Machine();
        m15.machineId = 115; 
		m15.machineName = "CNC";
		m15.machineType = "Automatic"; 
		m15.machineCapacity = 15;

        Machine m16 = new Machine();
        m16.machineId = 116;
		m16.machineName = "Press";
		m16.machineType = "Pressing";
		m16.machineCapacity = 11;

        Machine m17 = new Machine();
        m17.machineId = 117;
		m17.machineName = "Welder";
		m17.machineType = "Welding";
		m17.machineCapacity = 7;

        Machine m18 = new Machine();
        m18.machineId = 118; 
		m18.machineName = "Laser";
		m18.machineType = "Cutting";
		m18.machineCapacity = 14;

        Machine m19 = new Machine();
        m19.machineId = 119; 
		m19.machineName = "Router";
		m19.machineType = "Routing";
		m19.machineCapacity = 10;

        Machine m20 = new Machine();
        m20.machineId = 120;
		m20.machineName = "Mixer";
		m20.machineType = "Mixing";
		m20.machineCapacity = 6;


        f1.machine = m1; 
		f1.getFactoryDetails();
        f2.machine = m2;
		f2.getFactoryDetails();
        f3.machine = m3;
		f3.getFactoryDetails();
        f4.machine = m4;
		f4.getFactoryDetails();
        f5.machine = m5;
		f5.getFactoryDetails();
        f6.machine = m6;
		f6.getFactoryDetails();
        f7.machine = m7;
		f7.getFactoryDetails();
        f8.machine = m8;
		f8.getFactoryDetails();
        f9.machine = m9;
		f9.getFactoryDetails();
        f10.machine = m10; 
		f10.getFactoryDetails();
        f11.machine = m11;
		f11.getFactoryDetails();
        f12.machine = m12;
		f12.getFactoryDetails();
        f13.machine = m13;
		f13.getFactoryDetails();
        f14.machine = m14;
		f14.getFactoryDetails();
        f15.machine = m15; 
		f15.getFactoryDetails();
        f16.machine = m16;
		f16.getFactoryDetails();
        f17.machine = m17;
		f17.getFactoryDetails();
        f18.machine = m18;
		f18.getFactoryDetails();
        f19.machine = m19; 
		f19.getFactoryDetails();
        f20.machine = m20;
		f20.getFactoryDetails();
    }
}