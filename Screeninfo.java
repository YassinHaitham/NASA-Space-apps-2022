package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
class Screeninfo extends Form implements HandlesEventDispatching {
  private Button Button1;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("NASA_SPACE_APPS_2022");
    this.BackgroundImage("IMG_2372.jpg");
    this.Title("Screeninfo");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFF00FFFF);
    Button1.Height(-1010);
    Button1.Width(-1100);
    Button1.Text("Know NASA !");
    Button2 = new Button(this);
    Button2.BackgroundColor(0xFF00FFFF);
    Button2.Height(-1010);
    Button2.Width(-1100);
    Button2.Text("What is ionosphere ?");
    Button3 = new Button(this);
    Button3.BackgroundColor(0xFF00FFFF);
    Button3.Height(-1010);
    Button3.Width(-1100);
    Button3.Text("Photos of Ionosphere");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}