package sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.scene.control.Label;


import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        int pivotX = 950;
        int pivotY = 500;

        //Плутон
        Circle pluton = new Circle(950, pivotY-487, 7);
        pluton.setFill(Color.DARKSLATEBLUE);
        pluton.setStroke(Color.ALICEBLUE);
        //орбита
        /*Circle plutonline = new Circle(pivotX,pivotY,487);
        plutonline.setStroke(Color.RED);
        plutonline.setFill(null);
        plutonline.setVisible(false);*/

        //Нептун
        Circle neptun = new Circle(950, pivotY-467, 13);
        neptun.setFill(Color.AZURE);
        neptun.setStroke(Color.AQUAMARINE);
        //орбита
        /*Circle neptunline = new Circle(pivotX,pivotY,467);
        neptunline.setStroke(Color.RED);
        neptunline.setFill(null);
        neptunline.setVisible(false);*/

        //triton
        Circle triton = new Circle(930, pivotY-457, 2);
        triton.setFill(Color.LIGHTYELLOW);
        triton.setStroke(Color.BLACK);

        //Уран
        Circle uran = new Circle(950, pivotY-409, 23);
        uran.setFill(Color.LAVENDER);
        uran.setStroke(Color.BLUEVIOLET);
        //орбита
        /*Circle uranline = new Circle(pivotX,pivotY,409);
        uranline.setStroke(Color.RED);
        uranline.setFill(null);
        uranline.setVisible(false);*/

        //oberon
        Circle oberon = new Circle(922, pivotY-409, 3);
        oberon.setFill(Color.PINK);
        oberon.setStroke(Color.BLACK);
        //ariel
        Circle ariel = new Circle(917, pivotY-409, 2);
        ariel.setFill(Color.DARKGREEN);
        ariel.setStroke(Color.BLACK);
        //umbriel
        Circle umbriel = new Circle(912, pivotY-409, 3);
        umbriel.setFill(Color.DARKMAGENTA);
        umbriel.setStroke(Color.BLACK);

        //Сатурн
        Circle saturn = new Circle(950, pivotY-345, 25);
        saturn.setFill(Color.BURLYWOOD);
        saturn.setStroke(Color.YELLOW);
        //орбита
        /*Circle saturnline = new Circle(pivotX,pivotY,345);
        saturnline.setStroke(Color.RED);
        saturnline.setFill(null);
        saturnline.setVisible(false);*/

        //titan
        Circle titan = new Circle(920, pivotY-345, 3);
        titan.setFill(Color.LIGHTYELLOW);
        titan.setStroke(Color.BLACK);

        //Юпитер
        Circle jupiter = new Circle(950, pivotY-270, 28);
        jupiter.setFill(Color.FIREBRICK);
        jupiter.setStroke(Color.ORANGE);
        //орбита
        /*Circle jupiterline = new Circle(pivotX,pivotY,270);
        jupiterline.setStroke(Color.RED);
        jupiterline.setFill(null);
        jupiterline.setVisible(false);*/

        //io
        Circle io = new Circle(918, pivotY-270, 3);
        io.setFill(Color.YELLOW);
        io.setStroke(Color.DARKGRAY);
        //ganimed
        Circle ganimed = new Circle(913, pivotY-270, 4);
        ganimed.setFill(Color.GRAY);
        ganimed.setStroke(Color.ORANGE);
        //callisto
        Circle callisto = new Circle(907, pivotY-270, 2);
        callisto.setFill(Color.BLUEVIOLET);
        callisto.setStroke(Color.LAVENDERBLUSH);

        //Марс
        Circle mars = new Circle(950, pivotY-197, 22);
        mars.setFill(Color.ROSYBROWN);
        mars.setStroke(Color.BLACK);
        //орбита
       /* Circle marsline = new Circle(pivotX,pivotY,197);
        marsline.setStroke(Color.RED);
        marsline.setFill(null);
        marsline.setVisible(false);*/

        //Земля
        Circle earth = new Circle(950, pivotY-135, 20);
        earth.setFill(Color.GREEN);
        earth.setStroke(Color.BLUE);
        //orbit
        /*Circle earthline = new Circle(pivotX,pivotY,135);
        earthline.setStroke(Color.RED);
        earthline.setFill(null);
        earthline.setVisible(false);*/



        // moon
        Circle moon = new Circle(970, pivotY-110, 4);
        moon.setFill(Color.WHITE);
        moon.setStroke(Color.BLACK);
        //Венера
        Circle venus = new Circle(950, pivotY-85, 13);
        venus.setFill(Color.YELLOWGREEN);
        venus.setStroke(Color.BLACK);
        //орбита
       /* Circle venusline = new Circle(pivotX,pivotY,85);
        venusline.setStroke(Color.RED);
        venusline.setFill(null);
        venusline.setVisible(false);*/

        //Меркурий
        Circle mercury = new Circle(950, pivotY-55, 8);
        mercury.setFill(Color.BEIGE);
        mercury.setStroke(Color.LAVENDER);
        //орбита
        Circle mercuryline = new Circle(pivotX,pivotY,55);
        mercuryline.setStroke(Color.RED);
        mercuryline.setFill(null);
        mercuryline.setVisible(true);

        Circle pivot = new Circle(pivotX, pivotY, 40);
        pivot.setFill(Color.ORANGE);

        Label labelinfo= new Label("Selected: Меркурий \n Спутников нет\n Удаленность от Солнца 58 млн км" +
                "\n Диаметр 4878 км \n Скорость вращения 47.9 км/с");


        Label labelmercury = new Label();
        labelmercury.setText("Меркурий");
        RadioButton rmercury = new RadioButton();
        rmercury.setText("Показать\n орбиту");
        rmercury.setSelected(true);
        RadioButton rmercury1= new RadioButton();
        rmercury1.setText("Инфо");
        rmercury1.setSelected(true);

        Label labelvenus = new Label();
        labelvenus.setText("Венера");
        RadioButton rvenus = new RadioButton();
        rvenus.setText("Показать\n орбиту");
        RadioButton rvenus1= new RadioButton();
        rvenus1.setText("Инфо");

        Label labelearth = new Label();
        labelearth.setText("Земля");
        RadioButton rearth = new RadioButton();
        rearth.setText("Показать\n орбиту");
        RadioButton rearth1= new RadioButton();
        rearth1.setText("Инфо");

        Label labelmars = new Label();
        labelmars.setText("Марс");
        RadioButton rmars = new RadioButton();
        rmars.setText("Показать\n орбиту");
        RadioButton rmars1= new RadioButton();
        rmars1.setText("Инфо");

        Label labeljupiter = new Label();
        labeljupiter.setText("Юпитер");
        RadioButton rjupiter = new RadioButton();
        rjupiter.setText("Показать\n орбиту");
        RadioButton rjupiter1= new RadioButton();
        rjupiter1.setText("Инфо");

        Label labelsaturn = new Label();
        labelsaturn.setText("Сатурн");
        RadioButton rsaturn = new RadioButton();
        rsaturn.setText("Показать\n орбиту");
        RadioButton rsaturn1= new RadioButton();
        rsaturn1.setText("Инфо");

        Label labeluran = new Label();
        labeluran.setText("Уран");
        RadioButton ruran = new RadioButton();
        ruran.setText("Показать \nорбиту");
        RadioButton ruran1= new RadioButton();
        ruran1.setText("Инфо");

        Label labelneptun = new Label();
        labelneptun.setText("Нептун");
        RadioButton rneptun = new RadioButton();
        rneptun.setText("Показать \nорбиту");
        RadioButton rneptun1= new RadioButton();
        rneptun1.setText("Инфо");

        Label labelpluton = new Label();
        labelpluton.setText("Плутон");
        RadioButton rpluton = new RadioButton();
        rpluton.setText("Показать\n орбиту");
        RadioButton rpluton1= new RadioButton();
        rpluton1.setText("Инфо");


    //Группа радиобаттон "показать орбиту"
        ToggleGroup groupradiobutton = new ToggleGroup();
        rmercury.setToggleGroup(groupradiobutton);
        rvenus.setToggleGroup(groupradiobutton);
        rearth.setToggleGroup(groupradiobutton);
        rmars.setToggleGroup(groupradiobutton);
        rjupiter.setToggleGroup(groupradiobutton);
        rsaturn.setToggleGroup(groupradiobutton);
        ruran.setToggleGroup(groupradiobutton);
        rneptun.setToggleGroup(groupradiobutton);
        rpluton.setToggleGroup(groupradiobutton);

        //Группа радиобаттон "инфо"
        ToggleGroup groupradiobutton1 = new ToggleGroup();
        rmercury1.setToggleGroup(groupradiobutton1);
        rvenus1.setToggleGroup(groupradiobutton1);
        rearth1.setToggleGroup(groupradiobutton1);
        rmars1.setToggleGroup(groupradiobutton1);
        rjupiter1.setToggleGroup(groupradiobutton1);
        rsaturn1.setToggleGroup(groupradiobutton1);
        ruran1.setToggleGroup(groupradiobutton1);
        rneptun1.setToggleGroup(groupradiobutton1);
        rpluton1.setToggleGroup(groupradiobutton1);

        //группы планет со спутниками
        Group sputnikuran = new Group(ariel, umbriel, oberon, uran);
        Group sputnikneptun=new Group(neptun, triton);
        Group sputniksaturn=new Group(saturn, titan);
        Group sputnikjupiter=new Group(jupiter,callisto,io,ganimed);
        Group sputnikearth=new Group(earth, moon);

        //вывод группы
        Group root = new Group(mercury, venus,  mars, sputnikjupiter, sputniksaturn, sputnikuran, sputnikneptun, pluton, sputnikearth, pivot, labelmercury,
                labelvenus, labelearth, labelmars, labeljupiter, labelsaturn, labeluran, labelneptun, labelpluton, mercuryline, labelinfo);
        //добавление радиобаттон на форму
        root.getChildren().addAll(rmercury, rvenus, rearth, rmars, rjupiter, rsaturn, ruran, rneptun, rpluton);
        root.getChildren().addAll(rmercury1, rvenus1, rearth1, rmars1, rjupiter1, rsaturn1, ruran1, rneptun1, rpluton1);
        Scene scene = new Scene(root, 1900, 1000);

        primaryStage.setTitle("SOLARsystem");
        primaryStage.setScene(scene);
        primaryStage.show();

        //label расположение
        labelmercury.setLayoutX(1500);
        labelmercury.setLayoutY(100);

        labelvenus.setLayoutX(1500);
        labelvenus.setLayoutY(200);

        labelearth.setLayoutX(1500);
        labelearth.setLayoutY(300);

        labelmars.setLayoutX(1500);
        labelmars.setLayoutY(400);

        labeljupiter.setLayoutX(1500);
        labeljupiter.setLayoutY(500);

        labelsaturn.setLayoutX(1500);
        labelsaturn.setLayoutY(600);

        labeluran.setLayoutX(1500);
        labeluran.setLayoutY(700);

        labelneptun.setLayoutX(1500);
        labelneptun.setLayoutY(800);

        labelpluton.setLayoutX(1500);
        labelpluton.setLayoutY(900);

        labelinfo.setLayoutX(50);
        labelinfo.setLayoutY(50);

        //radiobutton расположение и действия при выборе
        rmercury.setLayoutX(1600);
        rmercury.setLayoutY(100);
        rmercury.setOnAction(event -> mercuryline.setRadius(55));
        rmercury1.setLayoutX(1700);
        rmercury1.setLayoutY(100);
        rmercury1.setOnAction(event -> labelinfo.setText("Selected: Меркурий \n Спутников нет\n Удаленность от Солнца 58 млн км" +
                "\n Диаметр 4878 км \n Скорость вращения 47.9 км/с"));

        rvenus.setLayoutX(1600);
        rvenus.setLayoutY(200);
        rvenus.setOnAction(event -> mercuryline.setRadius(85));
        rvenus1.setLayoutX(1700);
        rvenus1.setLayoutY(200);
        rvenus1.setOnAction(event -> labelinfo.setText("Selected: Венера \n Спутников нет\n Удаленность от Солнца 108 млн " +
                "км\n Диаметр 12100 км \n Скорость вращения 35 км/с"));

        rearth.setLayoutX(1600);
        rearth.setLayoutY(300);
        rearth.setOnAction(event -> mercuryline.setRadius(135));
        rearth1.setLayoutX(1700);
        rearth1.setLayoutY(300);
        rearth1.setOnAction(event -> labelinfo.setText("Selected: Земля \n Спутники: Луна\n " +
                "Удаленность от Солнца 150 млн км\n Диаметр 12756 км\n Скорость вращения 29.8 км/с"));

        rmars.setLayoutX(1600);
        rmars.setLayoutY(400);
        rmars.setOnAction(event -> mercuryline.setRadius(197));
        rmars1.setLayoutX(1700);
        rmars1.setLayoutY(400);
        rmars1.setOnAction(event -> labelinfo.setText("Selected: Марс \n Спутников нет\n " +
                "Удаленность от Солнца 228 млн км\n Диаметр 6790 км\n Скорость вращения 24.1 км/с"));

        rjupiter.setLayoutX(1600);
        rjupiter.setLayoutY(500);
        rjupiter.setOnAction(event -> mercuryline.setRadius(270));
        rjupiter1.setLayoutX(1700);
        rjupiter1.setLayoutY(500);
        rjupiter1.setOnAction(event -> labelinfo.setText("Selected: Юпитер \n Спутники: Ио, Ганимед, Каллисто\n " +
                "Удаленность от Солнца 778 млн км\n Диаметр 142800 км\n Скорость вращения 13.1 км/с"));

        rsaturn.setLayoutX(1600);
        rsaturn.setLayoutY(600);
        rsaturn.setOnAction(event -> mercuryline.setRadius(345));
        rsaturn1.setLayoutX(1700);
        rsaturn1.setLayoutY(600);
        rsaturn1.setOnAction(event -> labelinfo.setText("Selected: Сатурн \n Спутники: Титан\n " +
                "Удаленность от Солнца 1427 млн км\n Диаметр 120000 км\n Скорость вращения 9.6 км/с"));

        ruran.setLayoutX(1600);
        ruran.setLayoutY(700);
        ruran.setOnAction(event -> mercuryline.setRadius(409));
        ruran1.setLayoutX(1700);
        ruran1.setLayoutY(700);
        ruran1.setOnAction(event -> labelinfo.setText("Selected: Уран \n Спутники: Ариэль, Умбрия, Оберон\n " +
                "Удаленность от Солнца 2886 млн км\n Диаметр 52400 км\n Скорость вращения 6.8 км/с"));

        rneptun.setLayoutX(1600);
        rneptun.setLayoutY(800);
        rneptun.setOnAction(event -> mercuryline.setRadius(467));
        rneptun1.setLayoutX(1700);
        rneptun1.setLayoutY(800);
        rneptun1.setOnAction(event -> labelinfo.setText("Selected: Нептун \n Спутники: Тритон\n " +
                "Удаленность от Солнца 4498 млн км\n Диаметр 50450 км\n Скорость вращения 5.4 км/с"));

        rpluton.setLayoutX(1600);
        rpluton.setLayoutY(900);
        rpluton.setOnAction(event -> mercuryline.setRadius(487));
        rpluton1.setLayoutX(1700);
        rpluton1.setLayoutY(900);
        rpluton1.setOnAction(event -> labelinfo.setText("Selected: Плутон \n Спутников нет\n " +
                "Удаленность от Солнца 5912 млн км\n Диаметр 2300 км\n Скорость вращения 4.7 км/с"));

        //перемещения
        //Плутон
        Rotate rotatepluton = new Rotate();
        rotatepluton.setPivotX(pivotX);
        rotatepluton.setPivotY(pivotY);
        //Нептун
        Rotate rotateneptun = new Rotate();
        rotateneptun.setPivotX(pivotX);
        rotateneptun.setPivotY(pivotY);
        //triton
        Rotate rotatetriton = new Rotate();

        //Уран
        Rotate rotateuran = new Rotate();
        rotateuran.setPivotX(pivotX);
        rotateuran.setPivotY(pivotY);
        //ariel
        Rotate rotateariel = new Rotate();
        //umbriel
        Rotate rotateumbriel = new Rotate();
        //oberon
        Rotate rotateoberon = new Rotate();


        //Сатурн
        Rotate rotatesaturn = new Rotate();
        rotatesaturn.setPivotX(pivotX);
        rotatesaturn.setPivotY(pivotY);

        //titan
        Rotate rotatetitan = new Rotate();

        //Юпитер
        Rotate rotatejupiter = new Rotate();
        rotatejupiter.setPivotX(pivotX);
        rotatejupiter.setPivotY(pivotY);

        //Марс
        Rotate rotatemars = new Rotate();
        rotatemars.setPivotX(pivotX);
        rotatemars.setPivotY(pivotY);

        //Земля
        //Rotate rotateearth = new Rotate();
        //rotateearth.setPivotX(pivotX);
        //rotateearth.setPivotY(pivotY);

        //moon
        Rotate rotatemoon = new Rotate();

        //io
        Rotate rotateio = new Rotate();

        //ganimed
        Rotate rotateganimed = new Rotate();

        //callisto
        Rotate rotatecallisto = new Rotate();

        //Венера
        Rotate rotatevenus = new Rotate();
        rotatevenus.setPivotX(pivotX);
        rotatevenus.setPivotY(pivotY);

        //Меркурий
        Rotate rotatemercury = new Rotate();
        rotatemercury.setPivotX(pivotX);
        rotatemercury.setPivotY(pivotY);

        //sputnikearth
        Rotate rotatesputnikearth = new Rotate();
        rotatesputnikearth.setPivotX(pivotX);
        rotatesputnikearth.setPivotY(pivotY);

        //sputnikjupiter
        Rotate rotatesputnikjupiter = new Rotate();
        rotatesputnikjupiter.setPivotX(pivotX);
        rotatesputnikjupiter.setPivotY(pivotY);

        //sputniksaturn
        Rotate rotatesputniksaturn = new Rotate();
        rotatesputniksaturn.setPivotX(pivotX);
        rotatesputniksaturn.setPivotY(pivotY);

        //sputnikneptun
        Rotate rotatesputnikneptun = new Rotate();
        rotatesputnikneptun.setPivotX(pivotX);
        rotatesputnikneptun.setPivotY(pivotY);

        //sputnikuran
        Rotate rotatesputnikuran = new Rotate();
        rotatesputnikuran.setPivotX(pivotX);
        rotatesputnikuran.setPivotY(pivotY);

        //таймер для постоянного перемещения
        java.util.Timer timer = new java.util.Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //Плутон
                int anglepluton = 2;//угол перемещения
                rotatepluton.setAngle(anglepluton);//перемещение в зависимости от угла


               //Нептун
                //int angleneptun = 2;
                //rotateneptun.setAngle(angleneptun);

                //sputnikneptun
                int anglesputnikneptun = 4;
                rotatesputnikneptun.setAngle(anglesputnikneptun);
                //triton
                int angletriton =3;
                rotatetriton.setAngle(angletriton);
                rotatetriton.setPivotX(950);
                rotatetriton.setPivotY(pivotY-467);

                //Уран
                int angleuran = 3;
                rotateuran.setAngle(angleuran);
                //sputnikuran
                int anglesputnikuran = 2;
                rotatesputnikuran.setAngle(anglesputnikuran);
                //ariel
                int angleariel =5;
                rotateariel.setAngle(angleariel);
                rotateariel.setPivotX(950);
                rotateariel.setPivotY(pivotY-409);
                //oberon
                int angleoberon =7;
                rotateoberon.setAngle(angleoberon);
                rotateoberon.setPivotX(950);
                rotateoberon.setPivotY(pivotY-409);
                //umbriel
                int angleumbriel =1;
                rotateumbriel.setAngle(angleumbriel);
                rotateumbriel.setPivotX(950);
                rotateumbriel.setPivotY(pivotY-409);



                //sputniksaturn
                int anglesputniksaturn = 4;
                rotatesputniksaturn.setAngle(anglesputniksaturn);

                //Сатурн
                //int anglesaturn = 4;
                //rotatesaturn.setAngle(anglesaturn);

                //titan
                int angletitan =5;
                rotatetitan.setAngle(angletitan);
                rotatetitan.setPivotX(950);
                rotatetitan.setPivotY(pivotY-345);

                //sputnikjupiter
                int anglesputnikjupiter = 5;
                rotatesputnikjupiter.setAngle(anglesputnikjupiter);
                //Юпитер
                //int anglejupiter = 5;
                //rotatejupiter.setAngle(anglejupiter);

                //io
                int angleio =3;
                rotateio.setAngle(angleio);
                rotateio.setPivotX(950);
                rotateio.setPivotY(pivotY-270);

                //callisto
                int anglecallisto =5;
                rotatecallisto.setAngle(anglecallisto);
                rotatecallisto.setPivotX(950);
                rotatecallisto.setPivotY(pivotY-270);

                //ganimed
                int angleganimed =4;
                rotateganimed.setAngle(angleganimed);
                rotateganimed.setPivotX(950);
                rotateganimed.setPivotY(pivotY-270);

                //Марс
                int anglemars = 6;
                rotatemars.setAngle(anglemars);


                //Земля
                //int angleearth = 7;
                //rotateearth.setAngle(angleearth);


                //moon
                //double earthX= earth.getLayoutX();
                //double earthY= earth.getLayoutY();
                int anglemoon =4;
                rotatemoon.setAngle(anglemoon);
                rotatemoon.setPivotX(950);
                rotatemoon.setPivotY(pivotY-135);


                //sputnikearth
                int anglesputnikearth = 6;
                rotatesputnikearth.setAngle(anglesputnikearth);

                //Венера
                int anglevenus = 8;
                rotatevenus.setAngle(anglevenus);


                //Меркурий
                int anglemercury = 9;
                rotatemercury.setAngle(anglemercury);


                // Кручение
               mercury.getTransforms().addAll(rotatemercury);
               venus.getTransforms().addAll(rotatevenus);
               mars.getTransforms().addAll(rotatemars);
               //jupiter.getTransforms().addAll(rotatejupiter);
               //saturn.getTransforms().addAll(rotatesaturn);
               //uran.getTransforms().addAll(rotateuran);
               //neptun.getTransforms().addAll(rotateneptun);
               pluton.getTransforms().addAll(rotatepluton);
               //спутники  и группы "планета-спутники"
               moon.getTransforms().addAll(rotatemoon);
               sputnikearth.getTransforms().addAll(rotatesputnikearth);
               callisto.getTransforms().addAll(rotatecallisto);
               io.getTransforms().addAll(rotateio);
               ganimed.getTransforms().addAll(rotateganimed);
               sputnikjupiter.getTransforms().addAll(rotatesputnikjupiter);
               titan.getTransforms().addAll(rotatetitan);
               sputniksaturn.getTransforms().addAll(rotatesputniksaturn);
               triton.getTransforms().addAll(rotatetriton);
               sputnikneptun.getTransforms().addAll(rotatesputnikneptun);
               umbriel.getTransforms().addAll(rotateumbriel);
               ariel.getTransforms().addAll(rotateariel);
               oberon.getTransforms().addAll(rotateoberon);
               sputnikuran.getTransforms().addAll(rotatesputnikuran);


            }

        };
        timer.schedule(timerTask, 0, 100);
    }
        public static void main (String[]args){
            launch(args);
        }
    }

