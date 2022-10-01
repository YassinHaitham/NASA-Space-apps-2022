package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
class KnowNASA extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Label Label2;
  protected void $define() {
    this.AppName("NASA_SPACE_APPS_2022");
    this.BackgroundImage("IMG_2372.jpg");
    this.Scrollable(true);
    this.Title("KnowNASA");
    Label1 = new Label(this);
    Label1.FontSize(22);
    Label1.Height(-1080);
    Label1.Width(-1100);
    Label1.Text("NASA stands for National Aeronautics and Space Administration. NASA is a U.S. government agency that is responsible for science and technology related to air and space. The Space Age started in 1957 with the launch of the Soviet satellite Sputnik.
    NASA opened for business on Oct. 1, 1958. The agency was created to oversee U.S. space exploration and aeronautics research.
    The administrator is in charge of NASA. The NASA administrator is nominated by the president and confirmed by a vote in the Senate.");
    Label1.TextColor(0xFF00FFFF);
    Label2 = new Label(this);
    Label2.FontSize(22);
    Label2.Height(-1060);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("What Does NASA Do?
    Many people know something about NASA’s work. But most probably have no idea about how many different things the agency does. Astronauts in orbit conduct scientific research. Satellites help scientists learn more about Earth. Space probes study the solar system and beyond. New developments improve air travel and other aspects of flight. NASA is also beginning a new program to send humans to explore the Moon and Mars. In addition to those major missions, NASA does many other things. The agency shares what it learns so that its information can make life better for people worldwide. For example, companies can use NASA discoveries to create new spinoff products.");
    Label2.TextColor(0xFF00FFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}