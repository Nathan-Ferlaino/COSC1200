public class Windows {
    private String WindowMaterial;
    private boolean isOpen;
    private double windowTint;

    public Windows(){
        this.setWindowMaterial("Glass");
        this.setOpen(true);
        this.setWindowTint(20.5);
    }

    public Windows(String WindowMaterial, boolean isOpen, double windowTint){
        this.WindowMaterial = WindowMaterial;
        this.isOpen = isOpen;
        this.windowTint = windowTint;
    }

    public String getWindowMaterial() {
        return WindowMaterial;
    }

    public void setWindowMaterial(String windowMaterial) {
        WindowMaterial = windowMaterial;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getWindowTint() {
        return windowTint;
    }

    public void setWindowTint(double windowTint) {
        this.windowTint = windowTint;
    }
}
