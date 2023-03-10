public class Shirt {

    String model;
    String description;
    String color;
    String size;

    public Shirt(String s)
    {
        String[] words = s.split(",");
        this.model = words[0];

        this.description = words[1];

        this.color = words[2];

        this.size = words[3];
    }


    public static void main(String[] args)
    {
        String[] shirts;
        shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts1;
        shirts1 = new Shirt[11];
        for (int i =0; i<11; i++)
        {
            shirts1[i] = new Shirt(shirts[i]);
            System.out.println(shirts1[i].model + " " + shirts1[i].description + " " + shirts1[i].color + " " + shirts1[i].size);
        }
    }
}
