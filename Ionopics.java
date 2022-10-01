package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Image;
class Ionopics extends Form implements HandlesEventDispatching {
  private Image Image1;
  private Image Image2;
  private Image Image3;
  private Image Image4;
  private Image Image5;
  private Image Image6;
  private Image Image7;
  private Image Image8;
  protected void $define() {
    this.AppName("NASA_SPACE_APPS_2022");
    this.BackgroundImage("IMG_2372.jpg");
    this.Scrollable(true);
    this.Title("Ionopics");
    Image1 = new Image(this);
    Image1.Height(-1030);
    Image1.Width(LENGTH_FILL_PARENT);
    Image1.Picture("aurora-boreal.jpg");
    Image2 = new Image(this);
    Image2.Height(-1030);
    Image2.Width(-1050);
    Image2.Picture("northern-lights-lake-thingvellir-national-park-iceland.jpg");
    Image3 = new Image(this);
    Image3.Height(-1030);
    Image3.Width(-1080);
    Image3.Picture("firstmeasure.jpg");
    Image4 = new Image(this);
    Image4.Height(-1030);
    Image4.Width(-1100);
    Image4.Picture("igs_ionosphere.jpg");
    Image5 = new Image(this);
    Image5.Height(-1030);
    Image5.Width(-1100);
    Image5.Picture("Model-diagram-of-the-Earth-ionosphere-waveguide.png");
    Image6 = new Image(this);
    Image6.Height(-1040);
    Image6.Width(-1100);
    Image6.Picture("received_506635334267723.jpeg");
    Image7 = new Image(this);
    Image7.Width(-1080);
    Image7.Picture("15784484.jpg");
    Image8 = new Image(this);
    Image8.Height(-1050);
    Image8.Width(-1090);
    Image8.Picture("Ionosphere.gif");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}