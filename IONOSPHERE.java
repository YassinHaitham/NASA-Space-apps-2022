package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Image;
class IONOSPHERE extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Image Image1;
  private Label Label2;
  protected void $define() {
    this.AppName("NASA_SPACE_APPS_2022");
    this.BackgroundImage("IMG_2372.jpg");
    this.Scrollable(true);
    this.Title("IONOSPHERE");
    Label1 = new Label(this);
    Label1.FontSize(22);
    Label1.Height(-1050);
    Label1.Width(-1100);
    Label1.Text("The ionosphere is a very active part of the atmosphere, and it grows and shrinks depending on the energy it absorbs from the Sun. The name ionosphere comes from the fact that gases in these layers are excited by solar radiation to form ions, which have an electrical charge.");
    Label1.TextColor(0xFF00FFFF);
    Image1 = new Image(this);
    Image1.Height(-1050);
    Image1.Width(-1080);
    Image1.Picture("ionos.en.png");
    Label2 = new Label(this);
    Label2.FontSize(22);
    Label2.Height(-1100);
    Label2.Width(-1100);
    Label2.Text("An interesting layer called the ionosphere overlaps the mesosphere, thermosphere, and exosphere. It’s a very active part of the atmosphere, and it grows and shrinks depending on the energy it absorbs from the sun. Its name comes from the fact that gases in these layers are excited by solar radiation to form “ions,” which have an electrical charge.
    Parts of the ionosphere overlap with Earth’s magnetosphere. That’s the area around Earth where charged particles feel Earth’s magnetic field.
    In the ionosphere, charged particles are affected by the magnetic fields of both Earth and the sun. This is where auroras happen. Those are the bright, beautiful bands of light that you sometimes see near Earth’s poles. They’re caused by high-energy particles from the sun interacting with the atoms in this layer of our atmosphere.
    ");
    Label2.TextColor(0xFF00FFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}