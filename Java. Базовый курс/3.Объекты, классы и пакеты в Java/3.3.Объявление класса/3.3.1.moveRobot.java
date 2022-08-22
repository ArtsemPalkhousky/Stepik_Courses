// На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами:
// X и Y. Ось X смотрит слева направо, ось Y — снизу вверх.
// В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх,
// вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
// Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
//
// public class Robot {
//
//    public Direction getDirection() {
//        // текущее направление взгляда
//    }
//
//    public int getX() {
//        // текущая координата X
//    }
//
//    public int getY() {
//        // текущая координата Y
//    }
//
//    public void turnLeft() {
//        // повернуться на 90 градусов против часовой стрелки
//    }
//
//    public void turnRight() {
//        // повернуться на 90 градусов по часовой стрелке
//    }
//
//    public void stepForward() {
//        // шаг в направлении взгляда
//        // за один шаг робот изменяет одну свою координату на единицу
//    }
// }
//
// public enum Direction {
//    UP,
//    DOWN,
//    LEFT,
//    RIGHT
// }


public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            }
            else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            }
            else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            }
            else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            }
            else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            }
            else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            }
            else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction dir = robot.getDirection();
        if(x < toX){
            turnTo(robot, Direction.RIGHT);
            while(x != toX){
                robot.stepForward();
                x = robot.getX();
            }
        }else if(x > toX){
            turnTo(robot, Direction.LEFT);
            while(x != toX){
                robot.stepForward();
                x = robot.getX();
            }
        }
        if(y < toY){
            turnTo(robot, Direction.UP);
            while(y != toY){
                robot.stepForward();
                y = robot.getY();
            }
        }else if(y > toY){
            turnTo(robot, Direction.DOWN);
            while(y != toY){
                robot.stepForward();
                y = robot.getY();
            }
        }
    }

    public static void turnTo(Robot robot, Direction dir){
        while(robot.getDirection() != dir)
            robot.turnRight();
    }

}