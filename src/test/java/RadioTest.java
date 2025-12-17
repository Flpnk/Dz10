import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class RadioTest{

     @Test
     public void test() {
         Radio radio = new Radio();
         radio.setCurretStation(6);

         radio.next();

         int expected = 7;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }


     @Test
     public void testCount() {
         Radio radio = new Radio(20);
         radio.setCurretStation(15);

         int expected = 15;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToMinStation() {
         Radio radio = new Radio();
         radio.setCurretStation(0);

         radio.next();

         int expected = 1;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToNegativeStation() {
         Radio radio = new Radio();
         radio.setCurretStation(9);

         radio.prev();

         int expected = 8;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToLowStation() {
         Radio radio = new Radio();
         radio.setCurretStation(1);

         radio.next();

         int expected = 2;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToMaxStation() {
         Radio radio = new Radio();
         radio.setCurretStation(9);

         radio.next();

         int expected = 0;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToNoneNextStation() {
         Radio radio = new Radio();
         radio.setCurretStation(0);

         radio.prev();

         int expected = 9;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldSetToHighStation() {
         Radio radio = new Radio();
         radio.setCurretStation(8);

         radio.next();

         int expected = 9;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryNegativeValues() {
         Radio radio = new Radio();
         radio.setCurretStation(-1);

         int expected = 0;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryMinValues() {
         Radio radio = new Radio();
         radio.setCurretStation(0);

         int expected = 0;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryPenultimateValues() {
         Radio radio = new Radio();
         radio.setCurretStation(1);

         int expected = 1;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryNonExistentValues() {
         Radio radio = new Radio();
         radio.setCurretStation(10);

         int expected = 0;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryMaxValues() {
         Radio radio = new Radio();
         radio.setCurretStation(9);

         int expected = 9;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void boundaryHighValues() {
         Radio radio = new Radio();
         radio.setCurretStation(8);

         int expected = 8;
         int actual = radio.getCurretStation();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldKeepVolume() {
         Radio radio = new Radio();
         radio.setCurrentVolume(0);

         radio.reduceVolume();

         int expected = 0;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void shouldKeepVolumeAtMaxWhenIncrease() {
         Radio radio = new Radio();
         radio.setCurrentVolume(100);

         radio.increaseVolume();

         int expected = 100;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldIncreaseVolume() {
         Radio radio = new Radio();
         radio.setCurrentVolume(0);

         radio.increaseVolume();

         int expected = 1;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldDecreaseVolume() {
         Radio radio = new Radio();
         radio.setCurrentVolume(100);

         radio.reduceVolume();

         int expected = 99;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldNotSetVolumeBelow() {
         Radio radio = new Radio();
         radio.setCurrentVolume(101);

         int expected = 0;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }

     @Test
     public void shouldNotSetVolumeAbove() {
         Radio radio = new Radio();
         radio.setCurrentVolume(-1);

         int expected = 0;
         int actual = radio.getCurrentVolume();
         Assertions.assertEquals(expected, actual);
     }
 }