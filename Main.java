/*
 * Program Name: Main.java
 * Author: Julian Fuentes
 * Date Last Updated: 24 February 2024
 * Purpose: This programs changes the color of a GUI, using the mouse.
 */
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		StackPane stack = new StackPane();
		//This should create a new stack pane.
		
		Circle circle = new Circle(75);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		stack.getChildren().add(circle);
		//This should create the circle.
		
		stack.setOnMousePressed(e->
		{
			circle.setFill(Color.BLACK);
		});
		stack.setOnMouseReleased(e->
		{
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
		});
		//This should allow the color to be changed via mouse-click.
		
		Scene scene = new Scene(stack, 400, 150);
		primaryStage.setTitle("Change Color Using A Mouse");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} 
	
}
