package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen1 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  protected void $define() {
    this.AppName("Ionosphere Temple");
    this.BackgroundImage("IMG_2372.jpg");
    this.Icon("20220930_104438.jpg");
    this.Title("Screen1");
    Label1 = new Label(this);
    Label1.FontSize(24);
    Label1.Width(-1100);
    Label1.Text("Hello!");
    Label1.TextColor(0xFF00FFFF);
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFF00FFFF);
    Button1.Height(-1010);
    Button1.Width(-1100);
    Button1.Text("Press Here for Information");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}