package be.ecam;

public class Main {

//     class Rectangle {
//         public int w;
//         public int h;

//     public Rectangle(int w, int h) {
//         this.w = w;
//         this.h = h;
//     }
// }

    public static void main(String[] args) {
        // Rectangle rectangle1 = new Rectangle(2, 3);
        // Rectangle rectangle2 = new Rectangle(4, 5);

    // List<Rectangle> rectangles = new ArrayList<>();
        // rectangles.add(rectangle1);
        // rectangles.add(rectangle2);
        String hello = "hello";
        String world = "world";
        System.out.println(hello + " "  +  world);

        StringBuilder builder = new StringBuilder();
        for( int i =0; i < 100 ; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());



    }
}
