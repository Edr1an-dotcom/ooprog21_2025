class DebugBox {
   public static void main(String[] args) {
      // Create an instance using the default constructor
      DebugBox box = new DebugBox(); 
      box.showData(); // Call showData() without printing its return value
   }

   private int width;
   private int length;
   private int height;

   // Default constructor with default values
   public DebugBox() {
      length = 1;
      width = 1;
      height = 1;
   }

   // Parameterized constructor for custom dimensions
   public DebugBox(int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
   }

   // Method to calculate volume
   public double getVolume() { 
      return length * width * height;
   }

   // Method to display box data
   public void showData() {
      System.out.println("Width: " + width + "  Length: " + length + 
                         "  Height: " + height + "  Volume: " + getVolume());
   }
}
