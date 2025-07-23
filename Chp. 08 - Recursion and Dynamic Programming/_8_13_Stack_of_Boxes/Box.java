<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _8_13_Stack_of_Boxes;

public class Box {
    int width;
    int height;
    int depth;

    Box(int w, int h, int d) {
        width  = w;
        height = h;
        depth  = d;
    }

    public boolean canBeAbove(Box other) {
        return (other == null) || (width < other.width && height < other.height && depth < other.depth);
    }

    @Override
    public String toString() {
        return "Box (" + width + "," + height + "," + depth + ")";
    }
}
