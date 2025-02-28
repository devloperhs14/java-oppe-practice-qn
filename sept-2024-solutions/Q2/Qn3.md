## Problem Statement

A smartwatch is both a wearable gadget and a fitness tracker. Complete the Java program below to print specific messages depending on whether the input represents the smartwatch's role as a wearable gadget or a fitness tracker.

- Interface **WearableGadget** has the abstract method **showTime()**
- Interface **FitnessTracker** has the abstract method **trackSteps()**
- Class **SmartWatch** implements both a **WearableGadget** and a **FitnessTracker**, and has the following members:
  - Private instance variable **String name**, the name of the device.
  - A constructor to initialize the instance variable.
  - method **showTime()** that returns the string: **`<Name of the device>` shows the current time**
  - method **trackSteps()** that returns the string: **`<Name of the device>` plays media**
- Class **InterfaceTest** has the main method that does the following:
  - Accepts as input either **W** or **F** and names of 3 devices
  - If the first part is **W**, then invokes method **showTime()**, else if it is **F** invoke method **trackSteps()**
  - Print appropriate messages based on the invoked method

## What you have to do

- Define interface **WearableGadget**
- Define interface **FitnessTracker**
- Define class **SmartWatch**

# Test Cases
```
Input:
W
SmartWatch
F
FitBee
W
Noise
```
```
Output:
SmartWatch shows the current time
FitBee plays media
Noise shows the current time
```