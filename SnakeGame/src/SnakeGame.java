import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SnakeGame extends Application {

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    private Direction direction = Direction.RIGHT;
    private boolean moved = false;
    private boolean running = true;

    private List<Rectangle> snake;
    private Rectangle food;

    private Pane root = new Pane();

    private Timeline timeline = new Timeline();

    private void update() {
        if (!running) {
            return;
        }

        if (snake.size() > 1) {
            for (int i = snake.size() - 1; i > 0; i--) {
                snake.get(i).setX(snake.get(i - 1).getX());
                snake.get(i).setY(snake.get(i - 1).getY());
            }
        }

        switch (direction) {
            case UP:
                snake.get(0).setY(snake.get(0).getY() - 20);
                break;
            case DOWN:
                snake.get(0).setY(snake.get(0).getY() + 20);
                break;
            case LEFT:
                snake.get(0).setX(snake.get(0).getX() - 20);
                break;
            case RIGHT:
                snake.get(0).setX(snake.get(0).getX() + 20);
                break;
        }

        moved = true;

        if (snake.get(0).getX() < 0 || snake.get(0).getX() >= 800 || snake.get(0).getY() < 0 || snake.get(0).getY() >= 800) {
            running = false;
        }

        for (int i = 1; i < snake.size(); i++) {
            if (snake.get(0).getX() == snake.get(i).getX() && snake.get(0).getY() == snake.get(i).getY()) {
                running = false;
            }
        }

        if (snake.get(0).getX() == food.getX() && snake.get(0).getY() == food.getY()) {
            Rectangle newPart = new Rectangle(food.getX(), food.getY(), 20, 20);
            newPart.setFill(Color.GREEN);
            snake.add(newPart);
            root.getChildren().add(newPart);

            Random random = new Random();
            int x = random.nextInt(40) * 20;
            int y = random.nextInt(40) * 20;
            food.setX(x);
            food.setY(y);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        snake = new ArrayList<>();
        Rectangle head = new Rectangle(400, 400, 20, 20);
        head.setFill(Color.GREEN);
        snake.add(head);

        food = new Rectangle(200, 200, 20, 20);
        food.setFill(Color.RED);

        root.getChildren().addAll(head, food);

        Scene scene = new Scene(root, 800, 800);

        scene.setOnKeyPressed(event -> {
            if (!moved) {
                return;
            }
            
            switch (event.getCode()) {
                case W:
                    if (direction != Direction.DOWN) {
                        direction = Direction.UP;
                    }
                    break;
                case S:
                    if (direction != Direction.UP) {
                        direction = Direction.DOWN;
                    }
                    break;
                    		
                    case A:
                        if (direction != Direction.RIGHT) {
                            direction = Direction.LEFT;
                        }
                        break;
                    case D:
                        if (direction != Direction.LEFT) {
                            direction = Direction.RIGHT;
                        }
                        break;
                }

                moved = false;
            });

            timeline.getKeyFrames().add(new KeyFrame(Duration.millis(100), e -> update()));
            timeline.setCycleCount(Timeline.INDEFINITE);

            primaryStage.setTitle("Snake Game");
            primaryStage.setScene(scene);
            primaryStage.show();

            timeline.play();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }