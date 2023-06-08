package lesson_19.dz3;

import java.util.ArrayList;
import java.util.List;
//  3
//        Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
//        Выкинь исключение в случае некорректных данных.
//
//        Подсказка: если что-то не то с колесами, то это не машина!
//        Сигнатуры не менять
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
          if (loadWheelNamesFromDB().length != 4){
              throw new Exception();
          }
                wheels = new ArrayList<>();
                for (String s : loadWheelNamesFromDB()) {
                    Wheel wheel = Wheel.valueOf(s);
                    wheels.add(wheel);
                }
        }


        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        for (Wheel wheel : car.wheels) {
            System.out.println(wheel);
            System.out.println(wheel);
        }

    }
}