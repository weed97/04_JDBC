package com.ohgiraffers.section3.abstraction;

public class Car {
    /* 2) 자동차 클래스
     *   - 속성 : 현재시속, 시동상태,
     *   - 행위 : 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
     * */

    private boolean isOn; // 기본 false : 시동이꺼짐
    private int speed; // 기본 0

    //이미 걸려있는 경우 다시 시동을 걸 수 없다.
    public void startUp() {

        if (isOn) {
            System.out.println("이미 시동이걸려있습니다.");

        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 준비가 되었습니다.");
        }

    }

    // 사동이 걸린상태일 경우, 자동차는 시속이 10km/h 증가하여 앞으로나간다.
    public void go() {
        if (isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    // 시동이 걸려있고, 달리는 상태일떄만 멈출 수 있다
    // 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다.
    public void stop() {
        if (isOn) {

            if (this.speed > 0) {

                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }


        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을먼저 걸어주세요.");
        }
    }

    // 자동차가 달리는 중이면 시동을 끌 수 없다. 시동이 꺼져있으면 끌 수 없다.
    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 우선 멈춰주세요");
            } else {
                this.isOn =false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을켜주세요.");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
        }
    }
}
