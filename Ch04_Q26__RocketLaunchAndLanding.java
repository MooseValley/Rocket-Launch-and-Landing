/*
   Author: Mike O'Malley
   Description: Graph of Current in Circuit
   My solution Question 26 (Chapter 4, pp130-131).

   Structured Fortran 77 for Engineers and Scientists,
   D. M. Etter.
   (C) 1983.  ISBN: 0-8053-2520-4

My old QIT (Uni) textbook from my uni days 1983-1987 - VERY weather beaten and worn now (almost 30 years later).


Question 26 (Chapter 4, pp130-131):

A small test rocket is being designed for use in testing a retrorocket that is intended to permit "soft landings".
The designers have derived the following equations that they believe will predict the performance of the test rocket:

         acceleration = 4.25 -
                        (0.015 * t ^ 2.0)  +
                        (6.07  * t ^ 2.751) / 9995

         velocity     = 4.25 * t -
                        ((0.015 * t ^ 3.0)   / 3.0) +
                        (6.07  * t ^ 3.751) / (3.751 * 9995)

         height = launchPadHeight +
                             (4.25  * t ^ 2.0)   /  2.0) -
                             ((0.015 * t ^ 4.0)   / 12.0) +
                             (6.07  * t ^ 4.751) / (4.751 * 3.751 * 9995)

The launch pad is 90 feet above ground.

All units are in Imperial Units of Measure.  (feet, feet / sec^2, feet / sec).

Write a program that "test flies" the rocket, calculating and displaying the
height, acceleration, and velocity every 2 seconds throughout the flight until either 100 seconds has passed,
or the Rocket is at or below ground level.


*/

/*
Sample output:



Rocket Launch And Landing - by Mike O'Malley

   Time    Acceleration   Velocity    Height
   (sec)   (feet/sec^2)  (feet/sec)   (feet)
 --------  ------------  ----------  ----------
     0.00        0.00        0.00       90.00
     2.00        4.19        8.46       98.48
     4.00        4.04       16.71      123.70
     6.00        3.79       24.55      165.05
     8.00        3.48       31.84      221.55
    10.00        3.09       38.41      291.92
    12.00        2.66       44.17      374.65
    14.00        2.17       49.00      467.98
    16.00        1.66       52.84      570.00
    18.00        1.11       55.62      678.63
    20.00        0.55       57.29      791.72
    22.00       -0.01       57.83      907.02
    24.00       -0.58       57.23    1,022.27
    26.00       -1.15       55.49    1,135.17
    28.00       -1.70       52.65    1,243.49
    30.00       -2.22       48.73    1,345.04
    32.00       -2.71       43.79    1,437.72
    34.00       -3.17       37.90    1,519.55
    36.00       -3.58       31.14    1,588.72
    38.00       -3.94       23.61    1,643.58
    40.00       -4.24       15.42    1,682.71
    42.00       -4.47        6.70    1,704.91
    44.00       -4.63       -2.41    1,709.25
    46.00       -4.70      -11.76    1,695.11
    48.00       -4.69      -21.17    1,662.18
    50.00       -4.59      -30.47    1,610.50
    52.00       -4.38      -39.46    1,540.50
    54.00       -4.07      -47.94    1,452.99
    56.00       -3.65      -55.68    1,349.23
    58.00       -3.10      -62.44    1,230.93
    60.00       -2.42      -67.99    1,100.28
    62.00       -1.62      -72.05      959.97
    64.00       -0.67      -74.36      813.25
    66.00        0.42      -74.63      663.90
    68.00        1.67      -72.56      516.29
    70.00        3.07      -67.85      375.41
    72.00        4.64      -60.16      246.88
    74.00        6.38      -49.18      136.96
    76.00        8.29      -34.54       52.61
    78.00       10.39      -15.88        1.49
    78.05       10.44      -15.36        0.71

Array: 39


*** Height ***

          minValue= 0.0
          maxValue= 1709.2499063971718
     rangeOfValues= 1709.2499063971718
    maxLabelLength= 0
      maxBarLength= 78
      originOffset= 0.0
scaledOriginOffset= 0
|****
|*****
|*******
|**********
|*************
|*****************
|*********************
|**************************
|******************************
|************************************
|*****************************************
|**********************************************
|***************************************************
|********************************************************
|*************************************************************
|*****************************************************************
|*********************************************************************
|************************************************************************
|***************************************************************************
|****************************************************************************
|*****************************************************************************
|******************************************************************************
|*****************************************************************************
|***************************************************************************
|*************************************************************************
|**********************************************************************
|******************************************************************
|*************************************************************
|********************************************************
|**************************************************
|*******************************************
|*************************************
|******************************
|***********************
|*****************
|***********
|******
|**
|
|


*** Acceleration ***

          minValue= -4.704808259714291
          maxValue= 10.389817834068836
     rangeOfValues= 15.094626093783127
    maxLabelLength= 0
      maxBarLength= 78
      originOffset= 4.704808259714291
scaledOriginOffset= 24
                        |*********************
                        |********************
                        |*******************
                        |*****************
                        |***************
                        |*************
                        |***********
                        |********
                        |*****
                        |**
                        |
                     ***|
                   *****|
                ********|
             ***********|
          **************|
        ****************|
      ******************|
    ********************|
   *********************|
 ***********************|
 ***********************|
************************|
************************|
 ***********************|
  **********************|
   *********************|
      ******************|
        ****************|
            ************|
                ********|
                     ***|
                        |**
                        |********
                        |***************
                        |***********************
                        |********************************
                        |******************************************
                        |*****************************************************
                        |


*** Velocity ***

          minValue= -74.62898017426642
          maxValue= 57.826543045286
     rangeOfValues= 132.45552321955242
    maxLabelLength= 0
      maxBarLength= 78
      originOffset= 74.62898017426642
scaledOriginOffset= 43
                                           |****
                                           |*********
                                           |**************
                                           |******************
                                           |**********************
                                           |**************************
                                           |****************************
                                           |*******************************
                                           |********************************
                                           |*********************************
                                           |**********************************
                                           |*********************************
                                           |********************************
                                           |*******************************
                                           |****************************
                                           |*************************
                                           |**********************
                                           |******************
                                           |*************
                                           |*********
                                           |***
                                          *|
                                     ******|
                               ************|
                          *****************|
                    ***********************|
               ****************************|
           ********************************|
       ************************************|
   ****************************************|
 ******************************************|
*******************************************|
*******************************************|
 ******************************************|
    ***************************************|
        ***********************************|
               ****************************|
                       ********************|
                                  *********|
                                           |


*/
public class Ch04_Q26__RocketLaunchAndLanding
{
   private static final String outputFormat = "% ,9.2f"; // comma separator, leading space for positive values, and 2 decimal places.
   private static int arraySize = 40;

   public static void main (String [] args)
   {
      double acceleration      =   0.0;
      double velocity          =   0.0;
      double launchPadHeight   =  90.0;
      double heightAboveGround =   launchPadHeight;
      double startTimeSec      =   0.0;
      double currTimeSec       =   startTimeSec;
      double endTimeSec        = 100.0;
      double timeInc           =   2.0;
      double accelArray    []  = new double [arraySize];
      double heightArray   []  = new double [arraySize];
      double velocityArray []  = new double [arraySize];

      int k = 0;

      for (k = 0; k < heightArray.length; k++)
      {
         accelArray    [k] = 0.0;
         heightArray   [k] = 0.0;
         velocityArray [k] = 0.0;
      }


      System.out.println ();
      System.out.println ("Rocket Launch And Landing - by Mike O'Malley");
      System.out.println ();

      System.out.println ("   Time    Acceleration   Velocity    Height   ");
      System.out.println ("   (sec)   (feet/sec^2)  (feet/sec)   (feet)   ");
      System.out.println (" --------  ------------  ----------  ----------");

      k = 0;
      while ((startTimeSec < endTimeSec)  &&  (heightAboveGround > 0))
      {
         System.out.println (String.format (outputFormat, currTimeSec)  + "   " +
                             String.format (outputFormat, acceleration) + "   " +
                             String.format (outputFormat, velocity)     + "   " +
                             String.format (outputFormat, heightAboveGround));

         if (heightAboveGround < 50)
            timeInc = 0.05;


         currTimeSec = currTimeSec + timeInc;

         acceleration = 4.25 -
                        (0.015 * Math.pow (currTimeSec, 2.0))  +
                        (6.07  * Math.pow (currTimeSec, 2.751) / 9995);

         velocity     = 4.25 * currTimeSec -
                        (0.015 * Math.pow (currTimeSec, 3.0)   / 3.0) +
                        (6.07  * Math.pow (currTimeSec, 3.751) / (3.751 * 9995));

         heightAboveGround = launchPadHeight +
                             (4.25  * Math.pow (currTimeSec, 2.0)   /  2.0) -
                             (0.015 * Math.pow (currTimeSec, 4.0)   / 12.0) +
                             (6.07  * Math.pow (currTimeSec, 4.751) / (4.751 * 3.751 * 9995));

         if (timeInc > 1.0)
         {
            accelArray    [k] = acceleration;
            heightArray   [k] = heightAboveGround;
            velocityArray [k] = velocity;
            k++;
         }

      }


      System.out.println ("Array: " + k);

      System.out.println ();
      System.out.println ();
      System.out.println ("*** Height ***");
      System.out.println (BarGraph_Horizontal.BarGraph (heightArray, null,        ' ', false));

      System.out.println ();
      System.out.println ();
      System.out.println ("*** Acceleration ***");
      System.out.println (BarGraph_Horizontal.BarGraph (accelArray, null,        ' ', false));

      System.out.println ();
      System.out.println ();
      System.out.println ("*** Velocity ***");
      System.out.println (BarGraph_Horizontal.BarGraph (velocityArray, null,        ' ', false));
   }
}