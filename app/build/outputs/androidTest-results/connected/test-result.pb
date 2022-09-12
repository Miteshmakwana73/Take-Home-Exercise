
à
i
ListingViewModelTest"com.takehomeexcercise.ui.viewmodelinitializationError2Ù¸û˜ÀÜ®:Ù¸û˜€æ¿3ï
à
java.lang.RuntimeException: Failed to instantiate test runner class androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner


at androidx.test.ext.junit.runners.AndroidJUnit4.throwInitializationError(AndroidJUnit4.java:129)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:121)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:82)
at androidx.test.ext.junit.runners.AndroidJUnit4.<init>(AndroidJUnit4.java:56)
... 14 trimmed
Caused by: java.lang.reflect.InvocationTargetException
at java.lang.reflect.Constructor.newInstance0(Native Method)
at java.lang.reflect.Constructor.newInstance(Constructor.java:343)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:112)
... 17 more
Caused by: org.junit.runners.model.InvalidTestClassError: Invalid test class 'com.takehomeexcercise.ui.viewmodel.ListingViewModelTest':
1. Method setUp() should be public
at org.junit.runners.ParentRunner.validate(ParentRunner.java:525)
at org.junit.runners.ParentRunner.<init>(ParentRunner.java:92)
at org.junit.runners.BlockJUnit4ClassRunner.<init>(BlockJUnit4ClassRunner.java:74)
at androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner.<init>(AndroidJUnit4ClassRunner.java:43)
at androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner.<init>(AndroidJUnit4ClassRunner.java:48)
... 20 more¦java.lang.reflect.InvocationTargetException
at java.lang.reflect.Constructor.newInstance0(Native Method)
at java.lang.reflect.Constructor.newInstance(Constructor.javaà
java.lang.RuntimeException: Failed to instantiate test runner class androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner


at androidx.test.ext.junit.runners.AndroidJUnit4.throwInitializationError(AndroidJUnit4.java:129)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:121)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:82)
at androidx.test.ext.junit.runners.AndroidJUnit4.<init>(AndroidJUnit4.java:56)
... 14 trimmed
Caused by: java.lang.reflect.InvocationTargetException
at java.lang.reflect.Constructor.newInstance0(Native Method)
at java.lang.reflect.Constructor.newInstance(Constructor.java:343)
at androidx.test.ext.junit.runners.AndroidJUnit4.loadRunner(AndroidJUnit4.java:112)
... 17 more
Caused by: org.junit.runners.model.InvalidTestClassError: Invalid test class 'com.takehomeexcercise.ui.viewmodel.ListingViewModelTest':
1. Method setUp() should be public
at org.junit.runners.ParentRunner.validate(ParentRunner.java:525)
at org.junit.runners.ParentRunner.<init>(ParentRunner.java:92)
at org.junit.runners.BlockJUnit4ClassRunner.<init>(BlockJUnit4ClassRunner.java:74)
at androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner.<init>(AndroidJUnit4ClassRunner.java:43)
at androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner.<init>(AndroidJUnit4ClassRunner.java:48)
... 20 more"ï

logcatandroidÙ
Ö/home/tops/AndroidStudioProject/Take-Home-ExerciseNew/app/build/outputs/androidTest-results/connected/motorola one fusion+ - 11/logcat-com.takehomeexcercise.ui.viewmodel.ListingViewModelTest-initializationError.txt"¬

device-infoandroid‘
Ž/home/tops/AndroidStudioProject/Take-Home-ExerciseNew/app/build/outputs/androidTest-results/connected/motorola one fusion+ - 11/device-info.pb"­

device-info.meminfoandroidŠ
‡/home/tops/AndroidStudioProject/Take-Home-ExerciseNew/app/build/outputs/androidTest-results/connected/motorola one fusion+ - 11/meminfo"­

device-info.cpuinfoandroidŠ
‡/home/tops/AndroidStudioProject/Take-Home-ExerciseNew/app/build/outputs/androidTest-results/connected/motorola one fusion+ - 11/cpuinfo*‘
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriver›
˜/home/tops/AndroidStudioProject/Take-Home-ExerciseNew/app/build/outputs/androidTest-results/connected/motorola one fusion+ - 11/testlog/test-results.log 2
text/plain