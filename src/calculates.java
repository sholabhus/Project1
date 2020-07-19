public class calculates {
    public static void main(String[] args) {

        //pi
        double pi = 3.14; //declaring a variable pi

        //radius1
        int radius1 = 3;  //declaring radius
        double  area1 =Math.pow(radius1, 2) * pi; // calculate area of a circle
        double circum1 = 2 * pi *radius1; //calculate circumference of a  circle

        //radius2
        int radius2 = 100;//declaring radius
        double area2 = Math.pow(radius2,2) * pi; // calculate area of a circle
        double circum2 = 2 * pi *radius2; //calculate circumference of a  circle

        //radius3
        double radius3= 8.75;//declaring radius
        double area3 = Math.pow(radius3,2) * pi; // calculate area of a circle
        double circum3 = 2 * pi *radius3; //calculate circumference of a  circle

        System.out.println("A  circle with radius of " + " " + radius1 + " " + "has an area of" + " " + "" + area1 + " " + "" + "and circumference of" + "" + " " +  " " + circum1);//print output 1
        System.out.print( "\n" ); // leave a space
        System.out.println("A  circle with radius of " + " " + radius2 + " " + "has an area of" + " " + "" + area2 + " " + "" + "and circumference of" + "" + " " +  " " + circum2);// print output 2
        System.out.print( "\n" ); // leave a space
        System.out.println("A  circle with radius of " + " " + radius3 + " " + "has an area of" + " " + "" + area3 + " " + "" + "and circumference of" + "" + " " +  " " + circum3);// print output 3







    }
}