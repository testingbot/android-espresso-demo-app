# android-espresso-demo-app

![TestingBot logo](https://testingbot.com/assets/logo.png)

This is a sample Android app, created by TestingBot, to demonstrate how to use [Espresso Testing](https://developer.android.com/training/testing/espresso) on [TestingBot](https://testingbot.com).
The app is a simple calculator, with buttons for each number and a couple of operation buttons (subtract, add, multiply, ...)

The project contains example Espresso Tests, these will test the calculator by pressing buttons and verifying if the calculations are correct.

## How to start

To get started, open the project in Android Studio and click *Run*
If you'd like to run the test through commandline, you can use 

```
xcodebuild -project xcuitest-sample.xcodeproj -scheme xcuitest-sample -destination 'platform=iOS Simulator,name=iPhone 13,OS=15.0' test
```


## More information

To learn more about Android Espresso Testing in the cloud, please see the [TestingBot Espresso documentation](https://testingbot.com/support/espresso)
