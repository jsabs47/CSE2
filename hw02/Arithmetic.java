//Jake Sabatini
//February 7, 2016
//Calculating Costs of Shopping Trip
public class Arithmetic{

    public static void main(String[] args) {
    
        //inputs
    //Number of pants
    int pantsnum = 3;
    //Cost of pants
    double pantscost = 34.98;
    
    //Number of sweatshirts
    int shirtsum =2;
    //Cost of shirts
    double shirtcost = 24.99;
    
    //number of belts
    int beltnum = 1;
    //cost of belts
    double beltcost = 39.99;
    
    //tax rate
    double penntax = .06;

    
//total cost of pants and sales tax for pants
double totpantcost;
double pantstax;

totpantcost = (pantsnum * pantscost);
pantstax = (totpantcost * penntax);

//Converting to better looking number
pantstax = pantstax * 100;
int intpantstax = (int) pantstax;
double pantstax2 = (double) intpantstax;
pantstax2 = pantstax2/100;


//total cost of sweatshirts and sales tax for sweatshirts
double totshirtcost;
double shirttax;

totshirtcost = (shirtsum * shirtcost);
shirttax = totshirtcost * penntax;

//Converting decimals
shirttax = shirttax * 100;
int intshirttax = (int) shirttax;
double shirttax2 = (double) intshirttax;
shirttax2 = shirttax2/100;


//total cost of belts and sales tax of belts
double totbeltcost;
double belttax;

totbeltcost = (beltnum * beltcost);
belttax = totbeltcost * penntax;

//Converting decimals
belttax = belttax *100;
int intbelttax = (int) belttax;
double belttax2 = (double) intbelttax;
belttax2 = belttax2/100;

//Total cost of purchase and total sales tax
double tottax;
double totcost;

totcost = totpantcost + totshirtcost + totbeltcost;
tottax = pantstax2 + shirttax2 + belttax2;

//Converting decimals
tottax = tottax * 100;
int inttottax = (int) tottax;
double tottax2 = (double) inttottax;
tottax2 = tottax2/100;


//Total paid
double totpaid;

totpaid = totcost + tottax2;

//Converting decimals
totpaid = totpaid *100;
int inttotpaid = (int) totpaid;
double totpaid2 = (double) inttotpaid;
totpaid2 = totpaid2/100;

//Print costs

    System.out.println("Total Cost of Pants is " +totpantcost);
    System.out.println("Total Cost of Sweatshirts is " +totshirtcost);
    System.out.println("Total Cost of Belts is "+totbeltcost);
    System.out.println("Sales Tax of Pants is "+pantstax2);
    System.out.println("Sales Tax of Sweatshirts is "+shirttax2);
    System.out.println("Sales Tax of Belts is "+belttax2);
    System.out.println("Total Cost pretax is "+totcost);
    System.out.println("Total Cost of tax is "+tottax2);
    System.out.println("Total amount Paid is "+totpaid2);

    }
}



