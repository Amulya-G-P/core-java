class WomenFashionsRunner 
{
    public static void main(String[] wr) 
	{
        WomenFashions w1=new WomenFashions();
		w1.id=1; w1.item="Saree"; w1.price=1200;
		
        WomenFashions w2=new WomenFashions();
		w2.id=2; w2.item="Kurti"; w2.price=800;
		
        WomenFashions w3=new WomenFashions();
		w3.id=3; w3.item="Lehenga"; w3.price=3000;
	
        WomenFashions w4=new WomenFashions(); 
		w4.id=4; w4.item="Jeans"; w4.price=1500;
		
        WomenFashions w5=new WomenFashions();
		w5.id=5; w5.item="Top"; w5.price=700;
		
        WomenFashions w6=new WomenFashions();
		w6.id=6; w6.item="Skirt"; w6.price=900;
		
        WomenFashions w7=new WomenFashions();
		w7.id=7; w7.item="Jacket"; w7.price=2000;
		
        WomenFashions w8=new WomenFashions(); 
		w8.id=8; w8.item="Salwar"; w8.price=1100;
		
        WomenFashions w9=new WomenFashions();
		w9.id=9; w9.item="Dress"; w9.price=1800;
		
        WomenFashions w10=new WomenFashions(); 
		w10.id=10; w10.item="Blazer"; w10.price=2500;
		
        WomenFashions w11=new WomenFashions();
		w11.id=11; w11.item="Palazzo"; w11.price=1000;
		
        WomenFashions w12=new WomenFashions(); 
		w12.id=12; w12.item="Shorts"; w12.price=600;
		
        WomenFashions w13=new WomenFashions();
		w13.id=13; w13.item="Dupatta"; w13.price=400;
		
        WomenFashions w14=new WomenFashions(); 
		w14.id=14; w14.item="Gown"; w14.price=3500;
		
        WomenFashions w15=new WomenFashions(); 
		w15.id=15; w15.item="Sweater"; w15.price=1700;

        WomenFashions fashions[] = {w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13,w14,w15};

        for(WomenFashions wf : fashions)
		{
            System.out.println(wf.id);
            System.out.println(wf.item);
            System.out.println(wf.price);
			
			
        }
    }
}