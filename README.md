# ColorToast
Color toast message for android to get more attractions towards notification.

[![](https://jitpack.io/v/com.queensherainfotech/ColorToast.svg)](https://jitpack.io/#com.queensherainfotech/ColorToast)

Project level gradle
------
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```


App level gradle
------
```
dependencies {
    ...
    implementation 'com.queensherainfotech:ColorToast:1.0.0'
}
```

Usage
-----
```java
new ColorToast.Builder(MainActivity.this)
        .text("Hello world")
        .stroke(2, Color.CYAN)
        .backgroundColor(Color.BLACK)
        .solidBackground()
        .textColor(Color.YELLOW)
        .textBold()
        .font(R.font.dancing)
        .iconStart(R.drawable.ic_chevron_left_black_24dp)
        .iconEnd(R.drawable.ic_chevron_right_black_24dp)
        .cornerRadius(12)
        .textSize(18)
        .show();
```
